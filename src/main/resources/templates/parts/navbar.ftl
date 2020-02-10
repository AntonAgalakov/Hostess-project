<#include "security.ftl">
<#import "login.ftl" as l>

<nav class="navbar navbar-expand-lg navbar-light" style="background-color: black">
    <a class="navbar-brand" href="/" style="color:#b7a064; font-family: Futura, Helvetica,Arial,sans-serif; font-size: 34px;">Hostess</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item">
                <a id="nava" href="/">Home</a>
            </li>
            <li class="nav-item">
                <a id="nava" href="/main">Reservation</a>
            </li>
            <#if isAdmin>
                <li class="nav-item">
                    <a id="nava" href="/user">Restaurants list</a>
                </li>
            </#if>
        </ul>

        <div >${name}</div>
        <@l.logout />
    </div>
</nav>