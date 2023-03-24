package com.example.customfontsample

import kotlinx.coroutines.flow.flowOf

class Repository {

    private val rawData = listOf("苍万壑", "向前","一步","神色", "间", "兀自", "充斥着", "浓浓的", "不可置信", "虽然", "这个", "年轻", "男子", "的",
        "气质", "卓绝", "不凡", "让", "他", "这个", "帝皇", "都有", "轻微的", "心悸之感", "但", "他", "依然", "不敢", "相信", "堂堂的", "神凰", "皇子", "竟然",
        "会", "亲自", "来到", "他", "苍风国", "他", "犹豫着", "问题：", "你", "真的", "是", "神凰", "帝国", "皇子"
    )
    val data = flowOf(rawData)
}