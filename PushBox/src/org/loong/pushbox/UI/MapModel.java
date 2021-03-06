package org.loong.pushbox.UI;

//地图数据类
public class MapModel {
	//地图关卡模版，第一维是地图关卡编号，后面两维是地图数据
	//预设数据值：
	//1:障碍，2:队友盒子，3:目标埋葬点，4:玩家自己
	//运行时数据值：
	//7:玩家和目标埋葬点重合，5:盒子与目标埋葬点重合
	public final static int[][][] map_model = {
	{
		{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
		{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
		{ 1, 1, 1, 0, 0, 0, 1, 0, 0, 1, 1, 0, 1, 0, 3, 1 },
		{ 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 3, 1 },
		{ 1, 0, 1, 0, 4, 0, 1, 0, 0, 2, 1, 1, 0, 0, 3, 1 },
		{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1 },
		{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1, 0, 0, 0, 0, 1 },
		{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1 },
		{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 1 },
		{ 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1 },
		{ 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
		{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }
	}
	,
	{
		{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
		{ 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1 },
		{ 1, 1, 1, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
		{ 1, 1, 1, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1 },
		{ 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1, 1, 0, 0, 1 },
		{ 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1 },
		{ 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1 },
		{ 1, 0, 1, 0, 3, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1 },
		{ 1, 0, 0, 0, 3, 1, 0, 0, 0, 2, 0, 0, 0, 4, 0, 1 },
		{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 0, 0, 0, 0, 1 },
		{ 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
		{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }
	}
	,
	{
		{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
		{ 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
		{ 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 1 },
		{ 1, 0, 3, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 0, 0, 1 },
		{ 1, 3, 3, 1, 1, 0, 1, 0, 2, 2, 0, 0, 0, 1, 0, 1 },
		{ 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 4, 1, 0, 1 },
		{ 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1 },
		{ 1, 1, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 1 },
		{ 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 2, 0, 1, 0, 0, 1 },
		{ 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1 },
		{ 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1 },
		{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }
	}
	,
	{
		{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
		{ 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1 },
		{ 1, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 3, 3, 1 },
		{ 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 3, 3, 1 },
		{ 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1 },
		{ 1, 0, 0, 1, 0, 0, 1, 0, 0, 2, 0, 1, 0, 1, 1, 1 },
		{ 1, 0, 0, 1, 1, 0, 1, 0, 2, 2, 2, 1, 0, 0, 0, 1 },
		{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1 },
		{ 1, 0, 0, 0, 1, 1, 0, 1, 4, 0, 0, 1, 1, 0, 0, 1 },
		{ 1, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1 },
		{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
		{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }
	}
	,
	{
		{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
		{ 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1 },
		{ 1, 0, 0, 3, 3, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1 },
		{ 1, 0, 0, 3, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1 },
		{ 1, 0, 0, 3, 0, 0, 1, 0, 0, 2, 1, 0, 0, 0, 0, 1 },
		{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 1, 0, 1 },
		{ 1, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1 },
		{ 1, 0, 0, 2, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1 },
		{ 1, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1 },
		{ 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
		{ 1, 0, 0, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1 },
		{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
	}
	,
	{
		{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
		{ 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 1 },
		{ 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 3, 1, 1, 0, 0, 1 },
		{ 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1 },
		{ 1, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1 },
		{ 1, 0, 1, 0, 2, 2, 0, 0, 0, 1, 1, 1, 3, 0, 3, 1 },
		{ 1, 0, 0, 4, 0, 2, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1 },
		{ 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1 },
		{ 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 3, 0, 0, 1, 0, 1 },
		{ 1, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1 },
		{ 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1 },
		{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
	}
	,
	{
		{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
		{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1 },
		{ 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 3, 1 },
		{ 1, 1, 3, 0, 0, 0, 4, 0, 1, 0, 0, 1, 0, 0, 0, 1 },
		{ 1, 0, 1, 1, 1, 0, 0, 0, 0, 2, 0, 1, 1, 1, 0, 1 },
		{ 1, 0, 0, 0, 0, 0, 0, 2, 2, 1, 0, 1, 0, 0, 0, 1 },
		{ 1, 0, 0, 1, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 1 },
		{ 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1 },
		{ 1, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1 },
		{ 1, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 3, 1, 0, 0, 1 },
		{ 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1 },
		{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
	}
	,
	{
		{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
		{ 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 1, 1, 1 },
		{ 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 3, 1 },
		{ 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 3, 1 },
		{ 1, 0, 1, 1, 4, 0, 0, 1, 0, 2, 1, 0, 0, 1, 3, 1 },
		{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 1 },
		{ 1, 0, 0, 1, 0, 0, 1, 1, 0, 2, 1, 0, 0, 0, 0, 1 },
		{ 1, 0, 0, 0, 0, 1, 0, 0, 0, 2, 0, 0, 1, 1, 1, 1 },
		{ 1, 0, 0, 0, 0, 0, 1, 0, 2, 1, 0, 0, 1, 3, 1, 1 },
		{ 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 3, 1, 1 },
		{ 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
		{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
	}
	,
	{
		{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
		{ 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1 },
		{ 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 3, 1, 0, 1, 1 },
		{ 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 3, 1 },
		{ 1, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1 },
		{ 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1 },
		{ 1, 0, 2, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
		{ 1, 0, 0, 2, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1 },
		{ 1, 0, 2, 0, 2, 0, 0, 1, 0, 0, 0, 0, 1, 3, 1, 1 },
		{ 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 3, 1, 1 },
		{ 1, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 3, 1 },
		{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
	}
	,
	{
		{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
		{ 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1 },
		{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 3, 1 },
		{ 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 3, 1 },
		{ 1, 1, 0, 1, 4, 0, 0, 0, 0, 2, 0, 1, 0, 0, 3, 1 },
		{ 1, 0, 0, 0, 0, 0, 1, 1, 0, 2, 1, 0, 0, 0, 0, 1 },
		{ 1, 0, 0, 0, 0, 0, 1, 0, 0, 2, 0, 0, 0, 1, 0, 1 },
		{ 1, 3, 1, 0, 0, 0, 0, 0, 0, 2, 2, 0, 1, 0, 0, 1 },
		{ 1, 3, 1, 0, 0, 1, 0, 0, 0, 0, 2, 0, 0, 0, 0, 1 },
		{ 1, 3, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1 },
		{ 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1 },
		{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
	}
	};
}
