package com.latmod.yabba;

import com.feed_the_beast.ftbl.lib.LangKey;

/**
 * @author LatvianModder
 */
public interface YabbaLang
{
	LangKey TIER = LangKey.of("lang.yabba.tier", String.class);
	LangKey MODEL = LangKey.of("lang.yabba.model", String.class);
	LangKey SKIN = LangKey.of("lang.yabba.skin", String.class);
	LangKey UPGRADES = LangKey.of("lang.yabba.upgrades");

	LangKey ITEM = LangKey.of("lang.yabba.item", String.class);
	LangKey ITEM_COUNT = LangKey.of("lang.yabba.item_count", Integer.class, Integer.class);
	LangKey ITEM_COUNT_INF = LangKey.of("lang.yabba.item_count_inf", Integer.class);
	LangKey ITEM_COUNT_MAX = LangKey.of("lang.yabba.item_count_max", Integer.class);
}