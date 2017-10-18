<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Meu Perfil</title>
<meta charset="utf-8">
<meta name="format-detection" content="telephone=no">
<link rel="icon" href="images/favicon.ico">
<link rel="shortcut icon" href="images/favicon.ico">
<link rel="stylesheet" href="css/stuck.css">
<link rel="stylesheet" href="css/style2.css">
<link rel="stylesheet" href="css/ihover.css">
<script src="js/jquery.js"></script>
<script src="js/jquery-migrate-1.1.1.js"></script>
<script src="js/script.js"></script>
<script src="js/superfish.js"></script>
<script src="js/jquery.equalheights.js"></script>
<script src="js/jquery.mobilemenu.js"></script>
<script src="js/jquery.easing.1.3.js"></script>
<script src="js/tmStickUp.js"></script>
<script src="js/jquery.ui.totop.js"></script>
<script>
 $(document).ready(function(){
  $().UItoTop({ easingType: 'easeOutQuart' });
  $('#stuck_container').tmStickUp({});
  });
</script>
<!--[if lt IE 9]>
 <div style=' clear: both; text-align:center; position: relative;'>
   <a href="http://windows.microsoft.com/en-US/internet-explorer/products/ie/home?ocid=ie6_countdown_bannercode">
     <img src="http://storage.ie6countdown.com/assets/100/images/banners/warning_bar_0000_us.jpg" border="0" height="42" width="820" alt="You are using an outdated browser. For a faster, safer browsing experience, upgrade for free today." />
   </a>
</div>
<script src="js/html5shiv.js"></script>
<link rel="stylesheet" media="screen" href="css/ie.css">
<![endif]-->
<!--[if lt IE 10]>
<link rel="stylesheet" media="screen" href="css/ie1.css">
<![endif]-->
</head>
<body class="page1" id="top">
<!--==============================
              header
=================================-->
<header>
<!--==============================
            Stuck menu
=================================-->
  <section id="stuck_container">
    <div class="container">
      <div class="row">
        <div class="grid_12">
        <h1>
          <a href="index.jsp">
            <img src="images/logo.png" alt="Logo alt">
          </a>
        </h1>
          <div class="navigation ">
            <nav>
              <ul class="sf-menu">
               <a href="index.jsp">
                 <img src="images/Sua_pag.png" alt="" height="50">
          	  <a href="login.jsp.html">
          		<img src="images/logout.png" alt="" height="50">
             </ul>
            </nav>
            <div class="clear"></div>
          </div>
        </div>
      </div>
    </div>
  </section>
</header>
<!--=====================
          Content
======================-->
<section class="content"><div class="ic">More Website Templates @ TemplateMonster.com - June 16, 2014!</div>
  <div class="container">
    <div class="row">
      <div class="grid_12">
		<% UsuariosDAO dao = new UsuariosDAO(); 
		dao.getTrilha(${usuarioLogado}); %>
        <div class="ta__center">
        FOTO DE PERFIL DA PESSOA
        <%dao.buscaFoto(${usuarioLogado});%>
               <img src="images/perfil.jpg" alt="" width=200>
         BIO DA PESSOA
         
        <div class="bio">
 
                At vero eos et accusamus et iusto odio dignissimos ducimus qui 
                blanditiis praesentium voluptatum deleniti atque corrupti quos 
                dolores et quas molestias excepturi sint occaecati cupiditate non 
                provident.
            </div>
            API SPOTIFY
          <div class="banners">        
          FOTOS DA PESSOA
            <a href="#" class="banner2">
              <img src="images/quadradomais.jpg" alt="">
            </a>
            <a href="#" class="banner2">
              <img src="images/quadrado.jpg" alt="">
            </a>
            <a href="#" class="banner2">
              <img src="images/quadrado.jpg" alt="">
            </a>
            <a href="#" class="banner2">
              <img src="images/quadrado.jpg" alt="">
            </a>
            <a href="#" class="banner2">
              <img src="images/quadrado.jpg" alt="">
            </a>
            <a href="#" class="banner2">
              <img src="images/quadrado.jpg" alt="">
            </a>
            <a href="#" class="banner2">
              <img src="images/quadrado.jpg" alt="">
            </a>
            <a href="#" class="banner2">
              <img src="images/quadrado.jpg" alt="">
            </a>
          </div>
      </div>
    </div>
  </div>
</section>
</body>
</html>