<#import "*/frame.ftl" as frame/>
<@frame.page title="讨论课信息">
<link rel="stylesheet" href="/css/content.css">
<link rel="stylesheet" href="/css/student/content.css">
<div class="content">
    <div>
        <div class="title">讨论课x</div>
        <div class="returnButton">返回上一页</div>
        <div class="line"></div>
        <div class="itemBody">
            <div class="item">
                <label class="itemName" style="width:100%">本节讨论课的主要内容针对第一二章</label>
                <div class="lightline"></div>
            </div>
            <div class="item">
                <label class="itemName">分组方式：</label>
                <label class="itemName">固定分组</label>
            </div>
            <div class="item">
                <label class="itemName">开始时间：</label>
                <label class="itemName">11/10/2017</label>
                <label class="itemName">结束时间：</label>
                <label class="itemName">11/10/2017</label>
            </div>
        </div>
    </div>
    <div class="classInfo">
        <div class="title">话题</div>
        <div class="line"></div>
        <div class="blockBody">
            <div class="block">
                <div class="blockFont">话题A</div>
            </div>
            <div class="block">
                <div class="blockFont">话题B</div>
            </div>
        </div>
        <div class="item">
            <button class="uploadbutton">上传报告</button>
        </div>
        <div class="item">
            <button class="viewscorebutton">查看分数</button>
            <div class="clear"></div>
        </div>
    </div>
</div>
</@frame.page>