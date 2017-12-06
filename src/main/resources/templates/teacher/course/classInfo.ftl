<#import "*/frame.ftl" as frame/>
<@frame.page title="班级信息">
<link rel="stylesheet" href="/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/content.css">
<div class="content">
    <div class="contentBlock">
        <div class="title">周三1-2节</div>
        <div class="returnButton" id="returnButton">返回上一页</div>
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
            <div style="width: 80%;margin: 0 auto;">
                <table class="table table-striped" style="width: 80%;margin: 0 auto;">
                    <thead class="tableTitle">
                    <tr>
                        <th>分数</th>
                        <th>班级占比(%)</th>
                    </tr>
                    </thead>
                    <tbody class="tableContent">
                    <tr>
                        <td>5</td>
                        <td>30%</td>
                    </tr>
                    <tr>
                        <td>4</td>
                        <td>60%</td>
                    </tr>
                    <tr>
                        <td>3</td>
                        <td>10%</td>
                    </tr>
                    </tbody>
                </table>
            </div>
            <div class="item">
                <label class="itemName">学生名单:</label>
            </div>
            <div style="width: 80%;margin: 0 auto;">
                <table class="table table-striped" style="width: 80%;margin: 0 auto;">
                    <thead class="tableTitle">
                    <tr>
                        <th>学号</th>
                        <th>姓名</th>
                    </tr>
                    </thead>
                    <tbody class="tableContent">
                    <tr>
                        <td>24320152202000</td>
                        <td>sss</td>
                    </tr>
                    <tr>
                        <td>24320152202001</td>
                        <td>sss</td>
                    </tr>
                    <tr>
                        <td>24320152202002</td>
                        <td>xxx</td>
                    </tr>
                    </tbody>
                </table>
            </div>
            <div class="item">
                <button class="submit">修改</button>
                <button class="reset">删除班级</button>
                <div class="clear"></div>
            </div>
        </div>
    </div>
</div>
<script>
    $("#returnButton").click(function(){
        window.location.href = "/teacher/course/homePage/OOAD";
    })
</script>
</@frame.page>