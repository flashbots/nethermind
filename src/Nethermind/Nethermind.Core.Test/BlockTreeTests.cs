﻿/*
 * Copyright (c) 2018 Demerzel Solutions Limited
 * This file is part of the Nethermind library.
 *
 * The Nethermind library is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * The Nethermind library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with the Nethermind. If not, see <http://www.gnu.org/licenses/>.
 */

using System;
using System.Numerics;
using Nethermind.Blockchain;
using Nethermind.Core.Test.Builders;
using NUnit.Framework;

namespace Nethermind.Core.Test
{
    [TestFixture]
    public class BlockTreeTests
    {
        [Test]
        public void Add_and_find_branch()
        {
            BlockTree blockStore = new BlockTree();
            Block block = Build.A.Block.TestObject;
            blockStore.AddBlock(block);
            Block found = blockStore.FindBlock(block.Hash, false);
            Assert.AreSame(block, found);
        }

        [Test]
        public void Add_on_branch_move_find()
        {
            BlockTree blockStore = new BlockTree();
            Block block = Build.A.Block.TestObject;
            blockStore.AddBlock(block);
            blockStore.MoveToMain(block.Hash);
            Block found = blockStore.FindBlock(block.Hash, true);
            Assert.AreSame(block, found);
        }
        
        [Test]
        public void Add_on_main_move_find()
        {
            BlockTree blockStore = new BlockTree();
            Block block = Build.A.Block.TestObject;
            blockStore.AddBlock(block);
            blockStore.MoveToMain(block.Hash);
            blockStore.MoveToBranch(block.Hash);
            Block found = blockStore.FindBlock(block.Hash, false);
            Assert.AreSame(block, found);
        }
        
        [Test]
        public void Add_on_branch_and_not_find_on_main()
        {
            BlockTree blockStore = new BlockTree();
            Block block = Build.A.Block.TestObject;
            blockStore.AddBlock(block);
            Block found = blockStore.FindBlock(block.Hash, true);
            Assert.IsNull(found);
        }
        
        [Test]
        public void Find_by_number_basic()
        {
            BlockTree blockStore = new BlockTree();
            AddToMain(blockStore, 0);
            AddToMain(blockStore, 1);
            Block expected = AddToMain(blockStore, 2);
            AddToMain(blockStore, 3);
            
            Block found = blockStore.FindBlock(2);
            Assert.AreSame(expected, found);
        }
        
        [Test]
        public void Find_by_number_missing()
        {
            BlockTree blockStore = new BlockTree();
            AddToMain(blockStore, 0);
            AddToMain(blockStore, 1);
            AddToMain(blockStore, 2);
            AddToMain(blockStore, 3);
            
            Block found = blockStore.FindBlock(5);
            Assert.IsNull(found);
        }
        
        [Test]
        public void Find_by_number_negative()
        {
            BlockTree blockStore = new BlockTree();
            AddToMain(blockStore, 0);
            AddToMain(blockStore, 1);
            AddToMain(blockStore, 2);
            AddToMain(blockStore, 3);
            
            Assert.Throws<ArgumentException>(() => blockStore.FindBlock(-1));
        }
        
        [Test]
        public void Find_sequence_basic()
        {
            BlockTree blockStore = new BlockTree();
            AddToMain(blockStore, 0);
            Block block = AddToMain(blockStore, 1);
            AddToMain(blockStore, 2);
            Block lastBlock = AddToMain(blockStore, 3);
            
            Block[] blocks = blockStore.FindBlocks(block.Hash, 3, 0, false);
            Assert.AreEqual(3, blocks.Length);
            Assert.AreSame(block, blocks[0]);
            Assert.AreSame(lastBlock, blocks[2]);
        }
        
        [Test]
        public void Find_sequence_reverse()
        {
            BlockTree blockStore = new BlockTree();
            Block lastBlock = AddToMain(blockStore, 0);
            AddToMain(blockStore, 1);
            Block block = AddToMain(blockStore, 2);
            AddToMain(blockStore, 3);
            
            Block[] blocks = blockStore.FindBlocks(block.Hash, 3, 0, true);
            Assert.AreEqual(3, blocks.Length);
            Assert.AreSame(block, blocks[0]);
            Assert.AreSame(lastBlock, blocks[2]);
        }
        
        [Test]
        public void Find_sequence_zero_blocks()
        {
            BlockTree blockStore = new BlockTree();
            AddToMain(blockStore, 0);
            Block block = AddToMain(blockStore, 1);
            AddToMain(blockStore, 2);
            AddToMain(blockStore, 3);
            
            Block[] blocks = blockStore.FindBlocks(block.Hash, 0, 0, false);
            Assert.AreEqual(0, blocks.Length);
        }
        
        [Test]
        public void Find_sequence_basic_skip()
        {
            BlockTree blockStore = new BlockTree();
            AddToMain(blockStore, 0);
            Block block = AddToMain(blockStore, 1);
            AddToMain(blockStore, 2);
            AddToMain(blockStore, 3);
            AddToMain(blockStore, 4);
            
            Block[] blocks = blockStore.FindBlocks(block.Hash, 3, 1, false);
            Assert.AreEqual(3, blocks.Length);
        }
        
        [Test]
        public void Find_sequence_some_empty()
        {
            BlockTree blockStore = new BlockTree();
            AddToMain(blockStore, 0);
            Block block = AddToMain(blockStore, 1);
            AddToMain(blockStore, 2);
            
            AddToMain(blockStore, 4);
            
            Block[] blocks = blockStore.FindBlocks(block.Hash, 3, 0, false);
            Assert.AreEqual(3, blocks.Length);
            Assert.IsNull(blocks[2]);
        }

        private static Block AddToMain(BlockTree blockStore, BigInteger number)
        {
            Block block = Build.A.Block.WithNumber(number).TestObject;
            blockStore.AddBlock(block);
            blockStore.MoveToMain(block.Hash);
            return block;
        }
    }
}