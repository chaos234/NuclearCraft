package nc.itemblock.machine;

import nc.itemblock.ItemBlockNC;
import net.minecraft.block.Block;

public class ItemBlockRecycler extends ItemBlockNC {

	public ItemBlockRecycler(Block block) {
		super(block, "Uses RF to extract materials from depleted cells,", "and can accept speed and efficiency upgrades.");
	}
}
