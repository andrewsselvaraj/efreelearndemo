<%
String contextPath=request.getContextPath();
%>
<nav class="main-nav" role="navigation">
            <div class="container">
                <div class="navbar-header">
                    <button class="navbar-toggle" type="button" data-toggle="collapse" data-target="#navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button><!--//nav-toggle-->
                </div><!--//navbar-header-->            
                <div class="navbar-collapse collapse" id="navbar-collapse">
                    <ul class="nav navbar-nav">
                        <li class="active nav-item"><a href=<%= contextPath %>"/index.php">Home</a></li>
                        <li class="nav-item"><a href="<%= contextPath %>"/onlinetest.php">Online Test</a></li>                        
			<li class="nav-item"><a href="<%= contextPath %>"/registerOrganisation.php">Register as Organisation</a></li>
			<li class="nav-item"><a href="<%= contextPath %>"/registerUser.php">Register as User</a></li>

			<li class="nav-item"><a href="<%= contextPath %>"/loginUser.php">Log in as User </a></li>
			<li class="nav-item"><a href="<%= contextPath %>"/loginOrganisation.php">Log in as Organisation</a></li>
			<li class="nav-item"><a href="<%= contextPath %>"/loginOrganisation.php">Log in as Portal Admin</a></li>
			<li class="nav-item"><a href="<%= contextPath %>"/reports.php">Reports </a></li>
                        <li class="nav-item"><a href="<%= contextPath %>"/contact.php">Contact us</a></li>



                    </ul><!--//nav-->
                </div><!--//navabr-collapse-->
            </div><!--//container-->
        </nav>