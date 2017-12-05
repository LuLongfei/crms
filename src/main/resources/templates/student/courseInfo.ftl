<#import "*/infoFrame.ftl" as frame/>
<@frame.page title="学生成绩">
<link rel="stylesheet" href="/css/content.css">
<div class="content">
    <div class="contentBlock">
        <div class="title">课程信息</div>
        <div class="line"/>
        <div class="main_box_right_content">
            <h3 class="classtitle"><span id="course">J2EE</span>
                <button>退选课程</button>
            </h3>
            <div class="divideline"></div>
            <div class="classinfo">
                <table class="table">
                    <tr>
                        <td class="tabletext">班级：<span id="name">周三一二节</span></td>
                        <td class="tabletext" id="site">课程地点：XXX</td>
                    </tr>
                    <tr>
                        <td class="tabletext" id="teacher">教师：邱明</td>
                        <td class="tabletext"></td>
                    </tr>
                </table>
            </div>
        </div>
    </div>
</div>
<div class="clear"></div>
</@frame.page>