<#import "*/frame.ftl" as frame/>
<@frame.page title="创建班级">
<link rel="stylesheet" href="/css/content.css">
<div class="content">
    <div class="contentBlock">
        <div class="title">创建班级</div>
        <div class="returnButton" >返回上一页</div>
        <div class="line"></div>
        <div class="itemBody">
            <div class="item">
                <label class="itemName">班级名称:</label>
                <input class="bigInput">
            </div>
            <div class="item">
                <label class="itemName">上课地点:</label>
                <input class="bigInput">
            </div>
            <div class="item">
                <label class="itemName">上课时间:</label>
                <select class="bigSelect"></select>
                <select class="smallSelect"></select>
                <select class="smallSelect"></select>
                <button class="addButton">添加</button>
            </div>
            <div class="item">
                <label class="itemName">评分规则:</label>
                <label class="itemName">讨论课分数占比</label>
                <input class="smallInput">
                <label class="itemName"> 报告分数占比</label>
                <input class="smallInput">
            </div>
            <div class="item" style="margin-left: 25%">
                <label class="smallItemName">5分占比</label>
                <input type="text" name="seminarGrade" class="smallInput">
                <label class="smallItemName">4分占比</label>
                <input type="text" name="seminarGrade" class="smallInput">
                <label class="smallItemName">3分占比</label>
                <input type="text" name="seminarGrade" class="smallInput">
            </div>
            <div class="item">
                <label class="itemName">导入学生名单:</label>
                <button class="selectFile">下载文件</button>
            </div>
            <div class="item">
                <button class="submit">提交</button>
                <button class="reset">重置</button>
                <div class="clear"></div>
            </div>
        </div>
    </div>
</div>
</@frame.page>