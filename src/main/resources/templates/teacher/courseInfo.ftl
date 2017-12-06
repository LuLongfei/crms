<#import "*/teacherFrame.ftl" as frame/>
<@frame.page title="学生成绩">
<link rel="stylesheet" href="/css/content.css">
<link rel="stylesheet" href="/css/student/content.css">
<div class="content">
    <div class="contentBlock">
        <div class="title">课程信息</div>
        <div class="line"></div>
        <div>
            <#list data as courses>
                <div class="main_box_right_content" id="${courses.name}">
                    <h3 class="classtitle"><span id="course" onclick="javascript:course('${courses.name}')">${courses.name}</span>
                        <button class="main_box_right_content_button" onclick="deleteCourse('${courses.name}')">删除课程</button>
                        <button class="main_box_right_content_button">修改课程</button>
                    </h3>
                    <div class="divideline"></div>
                    <div class="classinfo" style="margin: 0 auto;text-align:justify">
                        <div class="item">
                            <label class="itemName">班级数:</label>
                            <label class="itemName">${courses.numClass}</label>
                            <label class="itemName" style="margin-left: 30%;">学生人数：</label>
                            <label class="itemName">${courses.numStudent}</label>
                        </div>
                        <div class="item">
                            <label class="itemName">开始时间:</label>
                            <label class="itemName">${courses.startTime}</label>
                            <label class="itemName" style="margin-left: 30%;">结束时间：</label>
                            <label class="itemName">${courses.endTime}</label>
                        </div>
                    </div>
                </div>
            </#list>
        </div>
    </div>
</div>
<div class="clear"></div>
<script src="/js/teacher/courseInfo.js"></script>
</@frame.page>