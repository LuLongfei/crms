<#import "*/frame.ftl" as frame/>
<@frame.page title="教师评分">
<link rel="stylesheet" href="/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/content.css">
<div class="content">
    <div class="contentBlock">
        <div class="title">分组信息</div>
        <div class="returnButton" id="returnButton">返回上一页</div>
        <div class="line"></div>
        <div class="itemBody">
            <table class="table table-striped">
                <thead class="tableTitle">

                <tr>
                    <th>角色</th>
                    <th>学号</th>
                    <th>姓名</th>
                </tr>
                </thead>
                <tbody class="tableContent">
                <tr>
                    <td>队长</td>
                    <td>${group.leader.number}</td>
                    <td>${group.leader.name}</td>
                </tr>
                    <#list group.members as member>
                    <tr>
                        <td>队员</td>
                        <td>${member.number}</td>
                        <td>${member.name}</td>
                    </tr>
                    </#list>
                </tbody>
            </table>
            <div class="item">
                <button class="modifyButton">修改</button>
            </div>
        </div>
    </div>
</div>
<script>
    $("#returnButton").click(function(){
        window.location.href = "/student/course/home/OOAD";
    })
</script>
</@frame.page>