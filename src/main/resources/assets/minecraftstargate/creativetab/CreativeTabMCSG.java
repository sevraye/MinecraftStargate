package assets.minecraftstargate.creativetab;

import com.sevraye.minecraftstargate.init.ModItems;
import com.sevraye.minecraftstargate.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabMCSG
{
    public static final CreativeTabs MCSG_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.stargateMilkyWayChevron;
        }

    };
}
