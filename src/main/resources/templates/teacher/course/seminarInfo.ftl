<#import "*/frame.ftl" as frame/>
<@frame.page title="讨论课信息">
<link rel="stylesheet" href="/css/content.css">
<div class="content">
    <div class="contentBlock" style="height:60%">
        <div class="title">讨论课1</div>
        <div class="returnButton" >返回上一页</div>
        <div class="line"></div>
        <div class="itemBody">
            <div class="item">
                <label class="itemName">讨论课名称：</label>
                <label class="itemName">讨论课1</label>
            </div>
            <div class="item">
                <label class="itemName">讨论课说明:</label>
                <label class="itemName">xxx</label>
            </div>
            <div class="item">
                <label class="itemName">分组方式:</label>
                <label class="itemName">固定分组</label>
            </div>
            <div class="item">
                <label class="itemName">开始时间</label>
                <label class="itemName">11/10/2017</label>
            </div>
            <div class="item">
                <label class="itemName">结束时间</label>
                <label class="itemName">14/10/2017</label>
            </div>
            <div class="item">
                <button class="leftButton">评分</button>
                <button class="middleButton">修改</button>
                <button class="rightButton">删除讨论课</button>
                <div class="clear"></div>
            </div>
        </div>
    </div>
    <div class="seminarInfo">
        <div class="title">Topic</div>
        <div class="line"></div>
        <div class="blockBody">
            <div class="block">
                <div class="blockFont">A</div>
            </div>
            <div class="block">
                <div class="blockFont">B</div>
            </div>
            <div class="block">
                <img class="addImg" src="/image/add.png" alt="添加">
            </div>
        </div>
    </div>
</div>
</@frame.page>