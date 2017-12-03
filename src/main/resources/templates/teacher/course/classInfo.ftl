<#import "*/frame.ftl" as frame/>
<@frame.page title="班级信息">
<link rel="stylesheet" href="/css/content.css">
<div class="content">
    <div class="contentBlock">
        <div class="title">周三1-2节</div>
        <div class="returnButton" >返回上一页</div>
        <div class="line"></div>
        <div class="itemBody">
            <div class="item">
                <label class="itemName">班级名称:</label>
                <label class="itemName">周三1-2节</label>
            </div>
            <div class="item">
                <label class="itemName">上课地点:</label>
                <label class="itemName">海韵212</label>
            </div>
            <div class="item">
                <label class="itemName">上课时间:</label>
                <label class="itemName">单周周一12节 </label>
                <label class="itemName"> 周三12节</label>
            </div>
            <div class="item">
                <label class="itemName">评分规则:</label>
                <label class="itemName">讨论课分数占比</label>
                <label class="itemName">60% </label>
                <label class="itemName"> 报告分数占比</label>
                <label class="itemName">40%</label>
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
                <button class="submit">修改</button>
                <button class="reset">删除班级</button>
                <div class="clear"></div>
            </div>
        </div>
    </div>
</div>
</@frame.page>