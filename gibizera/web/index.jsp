<%-- 
    Document   : index
    Created on : 14/05/2019, 09:47:51
    Author     : Flavio Prado
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <title>Gibizeraaaaaaaaaaa!</title>
        <meta content="width=device-width, initial-scale=1.0" name="viewport">
        <meta content="" name="keywords">
        <meta content="" name="description">

        <!-- Favicons -->
        <link href="img/favicon.png" rel="icon">
        <!--<link href="img/apple-touch-icon.png" rel="apple-touch-icon">-->

        <!-- Google Fonts -->
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,700,700i|Raleway:300,400,500,700,800" rel="stylesheet">

        <!-- Bootstrap CSS File -->
        <link href="lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- Libraries CSS Files -->
        <link href="lib/font-awesome/css/font-awesome.min.css" rel="stylesheet">
        <link href="lib/animate/animate.min.css" rel="stylesheet">
        <link href="lib/venobox/venobox.css" rel="stylesheet">
        <link href="lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">

        <!-- Main Stylesheet File -->
        <link href="css/style.css" rel="stylesheet">

        <script>
            $(document).ready(function(e) {
                $('h6').on('click', function() {
                    $('.social').stop().slideToggle();
                });
            })
        </script>
    </head>

    <body>

        <!--==========================
          Header
        ============================-->
        <header id="header">
            <div class="container">

                <div id="logo" class="pull-left">
                    <!-- Uncomment below if you prefer to use a text logo -->
                    <!-- <h1><a href="#main">C<span>o</span>nf</a></h1>-->
                    <a href="#intro" class="scrollto"><img src="img/logo.png" alt="" title=""></a>
                </div>

                <nav id="nav-menu-container">
                    <ul class="nav-menu">
                        <li class="menu-active"><a href="#intro">Home</a></li>
                        <li><a href="#about">Sobre</a></li>
                        <li><a href="#Gibi">HQs</a></li>
                        <li><a href="gibi.jsp">Gibi</a></li>
                        <li><a href="#venue">Curiosidades</a></li>
                        <li><a href="#gallery">WallPapers</a></li>
                        <li><a href="#supporters">Colaboradores</a></li>
                        <li><a href="#contact">Contato</a></li>
                        <li><a href="Admininastrô/index.jsp">Admin</a></li>
                        <li class="buy-tickets"><a href="" class="btn" data-toggle="modal" data-target="#Logar" data-ticket-type="standard-access">Logar/Cadastrar</a></li>
                        <!--<li><a href="Usuario/index.jsp">Perfil</a></li>-->
                        <!--<a href="#buy-tickets">Logar/Cadastrar</a>-->
                    </ul>
                </nav><!-- #nav-menu-container -->
            </div>
        </header><!-- #header -->

        <!--==========================
          Intro Section
        ============================-->
        <section id="intro">
            <div class="intro-container wow fadeIn">
                <h1 class="mb-4 pb-0">Venha conhecer<br><span>Um Universo</span> de heróis</h1>
                <a href="https://www.youtube.com/watch?v=jDDaplaOz7Q" class="venobox play-btn mb-4" data-vbtype="video" data-autoplay="true"></a>
            </div>
        </section>

    <main id="main">

        <!--==========================
        Buy Ticket Section
      ============================-->
        <section id="Gibi" class="section-with-bg wow fadeInUp">
            <div class="container">

                <div class="section-header">
                    <h2>Meu universo, seu universo!</h2>
                    <p>Velit consequatur consequatur inventore iste fugit unde omnis eum aut.</p>
                </div>

                <div class="row">
                    <div class="col-lg-4">
                        <div class="card1 mb-5 mb-lg-0">
                            <div class="card1-body">
                                <h5 class="card1-title text-muted text-uppercase text-center">DC Universe</h5>
                                <h6 class="card1-price text-center">Batman</h6>
                                <hr>
                                <div id="espaco"></div>    
                                <div class="text-center">
                                    <button type="button" class="btn" data-toggle="modal" data-target="#Gibi-modal" data-ticket-type="standard-access">Detalhes</button>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="col-lg-4">
                        <div class="card2 mb-5 mb-lg-0">
                            <div class="card2-body">
                                <h5 class="card2-title text-muted text-uppercase text-center">MARVEL COMICS</h5>
                                <h6 class="card2-price text-center">Iron Man</h6>
                                <hr>
                                <div id="espaco1"></div>    
                                <div class="text-center">
                                    <button type="button" class="btn" data-toggle="modal" data-target="#Gibi-modal" data-ticket-type="pro-access">Detalhes</button>
                                </div>
                            </div>
                        </div>
                    </div>

                    <!-- Pro Tier -->
                    <div class="col-lg-4">
                        <div class="card3">
                            <div class="card3-body">
                                <h5 class="card3-title text-muted text-uppercase text-center">DC Universe</h5>
                                <h6 class="card3-price text-center">Flash</h6>
                                <hr>
                                <div id="espaco2"></div>    
                                <div class="text-center">
                                    <button type="button" class="btn" data-toggle="modal" data-target="#Gibi-modal" data-ticket-type="premium-access">Detalhes</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>    
            </div>

            <!-- Modal Order Form -->
            <div id="Gibi-modal" class="modal fade">
                <div class="modal-dialog" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h4 class="modal-title">Buy Tickets</h4>
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button>
                        </div>
                        <div class="modal-body">
                            <form method="POST" action="#">
                                <div class="form-group">
                                    <input type="text" class="form-control" name="your-name" placeholder="Your Name">
                                </div>
                                <div class="form-group">
                                    <input type="text" class="form-control" name="your-email" placeholder="Your Email">
                                </div>
                                <div class="form-group">
                                    <select id="ticket-type" name="ticket-type" class="form-control" >
                                        <option value="">-- Select Your Ticket Type --</option>
                                        <option value="standard-access">Standard Access</option>
                                        <option value="pro-access">Pro Access</option>
                                        <option value="premium-access">Premium Access</option>
                                    </select>
                                </div>
                                <div class="text-center">
                                    <button type="submit" class="btn">Buy Now</button>
                                </div>
                            </form>
                        </div>
                    </div><!-- /.modal-content -->
                </div><!-- /.modal-dialog -->
            </div><!-- /.modal -->

            <!-- Modal Order Form -->
            <div id="Logar" class="modal fade">
                <div class="modal-dialog" role="document">
                    <div class="modal-logar">
                        <div id="LogarModal">
                            <form>
                                <h1><span>.</span> .</h1>
                                <input placeholder="Usuário" type="text"/>
                                <input placeholder="Senha" type="password"/>
                                <button class="btn">Logar</button>
                                <h6>Redes Sociais</h6>
                                <div class="social">
                                    <button class="tw btn">Twitter</button>
                                    <button class="fb btn">Facebook</button>
                                    <button class="google fb btn">Google+</button>
                                </div>
                            </form>
                        </div>
                    </div><!-- /.modal-content -->
                </div><!-- /.modal-dialog -->
            </div><!-- /.modal -->

        </section>

        <!--==========================
          About Section
        ============================-->
        <section id="about">
            <div class="container">
                <div class="row">
                    <div class="col-lg-6">
                        <h2>Sobre Gibizeraaa!</h2>
                        <p>Gibizera é um site fodido de TOPPEr pra você meu caro que não sai de casa pra comprar um gibizão,
                            que fica o tempo todo na frente de um PC, agora você pode socializar com as outras pessoas iguais a você
                            sem precisar ver Posts de feministas gordas no Facebook ou alguém implicar contigo, e quem sabe arrumar uma
                            WEBNAMORADA.</p>
                    </div>
                    <div class="col-lg-3">
                        <h3>Where</h3>
                        <p>Downtown Conference Center, New York</p>
                    </div>
                    <div class="col-lg-3">
                        <h3>When</h3>
                        <p>Monday to Wednesday<br>10-12 December</p>
                    </div>
                </div>
            </div>
        </section>

        <!--==========================
          Speakers Section
        ============================-->
        <section id="speakers" class="wow fadeInUp">
            <div class="container">
                <div class="section-header">
                    <h2>Event Speakers</h2>
                    <p>Here are some of our speakers</p>
                </div>

                <div class="row">
                    <div class="col-lg-4 col-md-6">
                        <div class="speaker">
                            <img src="img/speakers/1.jpg" alt="Speaker 1" class="img-fluid">
                            <div class="details">
                                <h3><a href="speaker-details.jsp">Brenden Legros</a></h3>
                                <p>Quas alias incidunt</p>
                                <div class="social">
                                    <a href=""><i class="fa fa-twitter"></i></a>
                                    <a href=""><i class="fa fa-facebook"></i></a>
                                    <a href=""><i class="fa fa-google-plus"></i></a>
                                    <a href=""><i class="fa fa-linkedin"></i></a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-6">
                        <div class="speaker">
                            <img src="img/speakers/2.jpg" alt="Speaker 2" class="img-fluid">
                            <div class="details">
                                <h3><a href="speaker-details.jsp">Hubert Hirthe</a></h3>
                                <p>Consequuntur odio aut</p>
                                <div class="social">
                                    <a href=""><i class="fa fa-twitter"></i></a>
                                    <a href=""><i class="fa fa-facebook"></i></a>
                                    <a href=""><i class="fa fa-google-plus"></i></a>
                                    <a href=""><i class="fa fa-linkedin"></i></a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-6">
                        <div class="speaker">
                            <img src="img/speakers/3.jpg" alt="Speaker 3" class="img-fluid">
                            <div class="details">
                                <h3><a href="speaker-details.jsp">Cole Emmerich</a></h3>
                                <p>Fugiat laborum et</p>
                                <div class="social">
                                    <a href=""><i class="fa fa-twitter"></i></a>
                                    <a href=""><i class="fa fa-facebook"></i></a>
                                    <a href=""><i class="fa fa-google-plus"></i></a>
                                    <a href=""><i class="fa fa-linkedin"></i></a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-6">
                        <div class="speaker">
                            <img src="img/speakers/4.jpg" alt="Speaker 4" class="img-fluid">
                            <div class="details">
                                <h3><a href="speaker-details.jsp">Jack Christiansen</a></h3>
                                <p>Debitis iure vero</p>
                                <div class="social">
                                    <a href=""><i class="fa fa-twitter"></i></a>
                                    <a href=""><i class="fa fa-facebook"></i></a>
                                    <a href=""><i class="fa fa-google-plus"></i></a>
                                    <a href=""><i class="fa fa-linkedin"></i></a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-6">
                        <div class="speaker">
                            <img src="img/speakers/5.jpg" alt="Speaker 5" class="img-fluid">
                            <div class="details">
                                <h3><a href="speaker-details.jsp">Alejandrin Littel</a></h3>
                                <p>Qui molestiae natus</p>
                                <div class="social">
                                    <a href=""><i class="fa fa-twitter"></i></a>
                                    <a href=""><i class="fa fa-facebook"></i></a>
                                    <a href=""><i class="fa fa-google-plus"></i></a>
                                    <a href=""><i class="fa fa-linkedin"></i></a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-6">
                        <div class="speaker">
                            <img src="img/speakers/6.jpg" alt="Speaker 6" class="img-fluid">
                            <div class="details">
                                <h3><a href="speaker-details.jsp">Willow Trantow</a></h3>
                                <p>Non autem dicta</p>
                                <div class="social">
                                    <a href=""><i class="fa fa-twitter"></i></a>
                                    <a href=""><i class="fa fa-facebook"></i></a>
                                    <a href=""><i class="fa fa-google-plus"></i></a>
                                    <a href=""><i class="fa fa-linkedin"></i></a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

        </section>

        <!--==========================
          Venue Section
        ============================-->
        <section id="venue" class="wow fadeInUp">

            <div class="container-fluid">

                <div class="section-header">
                    <h2>Comic Con Experience 19</h2>
                    <p>Porque, afinal, o épico não se escreve. O épico se vive.</p>
                </div>

                <div class="row no-gutters">
                    <div class="col-lg-6 venue-map">
                        <iframe src="https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d12097.433213460943!2d-74.0062269!3d40.7101282!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0xb89d1fe6bc499443!2sDowntown+Conference+Center!5e0!3m2!1smk!2sbg!4v1539943755621" frameborder="0" style="border:0" allowfullscreen></iframe>
                    </div>

                    <div class="col-lg-6 venue-info">
                        <div class="row justify-content-center">
                            <div class="col-11 col-lg-8">
                                <h3>Então vamos falar do nosso mundo: a CCXP.</h3>
                                <p>No nosso mundo, os grandes estúdios e as grandes franquias trazem em primeira mão trailers especiais, cenas exclusivas e os principais astros do momento. Estamos falando de Disney, Warner, Netflix, FOX, Sony e muitos outros.</p>

                                <p>No nosso mundo você não apenas vive a saga, você fica frente a frente com os criadores delas. No Artists’ Alley, mais de 1700 ilustradores, roteiristas, coloristas e artistas gráficos já comercializaram seus trabalhos, distribuíram autógrafos e interagiram com os fãs.</p>
                            </div>
                        </div>
                    </div>
                </div>

            </div>

            <div class="container-fluid venue-gallery-container">
                <div class="row no-gutters">

                    <div class="col-lg-3 col-md-4">
                        <div class="venue-gallery">
                            <a href="img/venue-gallery/1.jpg" class="venobox" data-gall="venue-gallery">
                                <img src="img/venue-gallery/1.jpg" alt="" class="img-fluid">
                            </a>
                        </div>
                    </div>

                    <div class="col-lg-3 col-md-4">
                        <div class="venue-gallery">
                            <a href="img/venue-gallery/2.jpg" class="venobox" data-gall="venue-gallery">
                                <img src="img/venue-gallery/2.jpg" alt="" class="img-fluid">
                            </a>
                        </div>
                    </div>

                    <div class="col-lg-3 col-md-4">
                        <div class="venue-gallery">
                            <a href="img/venue-gallery/3.jpg" class="venobox" data-gall="venue-gallery">
                                <img src="img/venue-gallery/3.jpg" alt="" class="img-fluid">
                            </a>
                        </div>
                    </div>

                    <div class="col-lg-3 col-md-4">
                        <div class="venue-gallery">
                            <a href="img/venue-gallery/4.jpg" class="venobox" data-gall="venue-gallery">
                                <img src="img/venue-gallery/4.jpg" alt="" class="img-fluid">
                            </a>
                        </div>
                    </div>

                    <div class="col-lg-3 col-md-4">
                        <div class="venue-gallery">
                            <a href="img/venue-gallery/5.jpg" class="venobox" data-gall="venue-gallery">
                                <img src="img/venue-gallery/5.jpg" alt="" class="img-fluid">
                            </a>
                        </div>
                    </div>

                    <div class="col-lg-3 col-md-4">
                        <div class="venue-gallery">
                            <a href="img/venue-gallery/6.jpg" class="venobox" data-gall="venue-gallery">
                                <img src="img/venue-gallery/6.jpg" alt="" class="img-fluid">
                            </a>
                        </div>
                    </div>

                    <div class="col-lg-3 col-md-4">
                        <div class="venue-gallery">
                            <a href="img/venue-gallery/7.jpg" class="venobox" data-gall="venue-gallery">
                                <img src="img/venue-gallery/7.jpg" alt="" class="img-fluid">
                            </a>
                        </div>
                    </div>

                    <div class="col-lg-3 col-md-4">
                        <div class="venue-gallery">
                            <a href="img/venue-gallery/8.jpg" class="venobox" data-gall="venue-gallery">
                                <img src="img/venue-gallery/8.jpg" alt="" class="img-fluid">
                            </a>
                        </div>
                    </div>

                </div>
            </div>

        </section>

        <!--==========================
          Gallery Section
        ============================-->
        <section id="gallery" class="wow fadeInUp">

            <div class="container">
                <div class="section-header">
                    <h2>Wallpapers</h2>
                    <p>Pega um ai pra buta no seu goku</p>
                </div>
            </div>

            <div class="owl-carousel gallery-carousel">
                <a href="img/gallery/1.jpg" class="venobox" data-gall="gallery-carousel"><img src="img/gallery/1.jpg" alt=""></a>
                <a href="img/gallery/2.jpg" class="venobox" data-gall="gallery-carousel"><img src="img/gallery/2.jpg" alt=""></a>
                <a href="img/gallery/3.jpg" class="venobox" data-gall="gallery-carousel"><img src="img/gallery/3.jpg" alt=""></a>
                <a href="img/gallery/4.jpg" class="venobox" data-gall="gallery-carousel"><img src="img/gallery/4.jpg" alt=""></a>
                <a href="img/gallery/5.jpg" class="venobox" data-gall="gallery-carousel"><img src="img/gallery/5.jpg" alt=""></a>
                <a href="img/gallery/6.jpg" class="venobox" data-gall="gallery-carousel"><img src="img/gallery/6.jpg" alt=""></a>
                <a href="img/gallery/7.jpg" class="venobox" data-gall="gallery-carousel"><img src="img/gallery/7.jpg" alt=""></a>
                <a href="img/gallery/8.jpg" class="venobox" data-gall="gallery-carousel"><img src="img/gallery/8.jpg" alt=""></a>
            </div>

        </section>

        <!--==========================
          Sponsors Section
        ============================-->
        <section id="supporters" class="section-with-bg wow fadeInUp">

            <div class="container">
                <div class="section-header">
                    <h2>Sponsors</h2>
                </div>

                <div class="row no-gutters supporters-wrap clearfix">

                    <div class="col-lg-3 col-md-4 col-xs-6">
                        <div class="supporter-logo">
                            <img src="img/supporters/1.png" class="img-fluid" alt="">
                        </div>
                    </div>

                    <div class="col-lg-3 col-md-4 col-xs-6">
                        <div class="supporter-logo">
                            <img src="img/supporters/2.png" class="img-fluid" alt="">
                        </div>
                    </div>

                    <div class="col-lg-3 col-md-4 col-xs-6">
                        <div class="supporter-logo">
                            <img src="img/supporters/3.png" class="img-fluid" alt="">
                        </div>
                    </div>

                    <div class="col-lg-3 col-md-4 col-xs-6">
                        <div class="supporter-logo">
                            <img src="img/supporters/4.png" class="img-fluid" alt="">
                        </div>
                    </div>

                    <div class="col-lg-3 col-md-4 col-xs-6">
                        <div class="supporter-logo">
                            <img src="img/supporters/5.png" class="img-fluid" alt="">
                        </div>
                    </div>

                    <div class="col-lg-3 col-md-4 col-xs-6">
                        <div class="supporter-logo">
                            <img src="img/supporters/6.png" class="img-fluid" alt="">
                        </div>
                    </div>

                    <div class="col-lg-3 col-md-4 col-xs-6">
                        <div class="supporter-logo">
                            <img src="img/supporters/7.png" class="img-fluid" alt="">
                        </div>
                    </div>

                    <div class="col-lg-3 col-md-4 col-xs-6">
                        <div class="supporter-logo">
                            <img src="img/supporters/8.png" class="img-fluid" alt="">
                        </div>
                    </div>

                </div>

            </div>

        </section>

        <!--==========================
          Subscribe Section
        ============================-->
        <section id="subscribe">
            <div class="container wow fadeInUp">
                <div class="section-header">
                    <h2>Notícias</h2>
                    <p>Receba notícias sobre o nosso mundo.</p>
                </div>

                <form method="POST" action="#">
                    <div class="form-row justify-content-center">
                        <div class="col-auto">
                            <input type="text" class="form-control" placeholder="Enter your Email">
                        </div>
                        <div class="col-auto">
                            <button type="submit">Enviar</button>
                        </div>
                    </div>
                </form>

            </div>
        </section>

        <!--==========================
          Contact Section
        ============================-->
        <section id="contact" class="section-bg wow fadeInUp">

            <div class="container">

                <div class="section-header">
                    <h2>Chama a gente!</h2>
                    <p>Manda mensagem ai, no tempo vago a gente responde.</p>
                </div>

                <div class="row contact-info">

                    <div class="col-md-4">
                        <div class="contact-address">
                            <i class="ion-ios-location-outline"></i>
                            <h3>VemK</h3>
                            <address>Rua São Paulo, Fernandópolis - SP, BRAZIL</address>
                        </div>
                    </div>

                    <div class="col-md-4">
                        <div class="contact-phone">
                            <i class="ion-ios-telephone-outline"></i>
                            <h3>Manda um ZAP!</h3>
                            <p><a href="tel:+5517996455355">17 996455355</a></p>
                        </div>
                    </div>

                    <div class="col-md-4">
                        <div class="contact-email">
                            <i class="ion-ios-email-outline"></i>
                            <h3>Email</h3>
                            <p><a href="mailto:Alessandro.Perez@etec.sp.gov.br">Gibizera@comics.com</a></p>
                        </div>
                    </div>

                </div>

                <div class="form">
                    <div id="sendmessage">Your message has been sent. Thank you!</div>
                    <div id="errormessage"></div>
                    <form action="" method="post" role="form" class="contactForm">
                        <div class="form-row">
                            <div class="form-group col-md-6">
                                <input type="text" name="name" class="form-control" id="name" placeholder="Your Name" data-rule="minlen:4" data-msg="Please enter at least 4 chars" />
                                <div class="validation"></div>
                            </div>
                            <div class="form-group col-md-6">
                                <input type="email" class="form-control" name="email" id="email" placeholder="Your Email" data-rule="email" data-msg="Please enter a valid email" />
                                <div class="validation"></div>
                            </div>
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-control" name="subject" id="subject" placeholder="Subject" data-rule="minlen:4" data-msg="Please enter at least 8 chars of subject" />
                            <div class="validation"></div>
                        </div>
                        <div class="form-group">
                            <textarea class="form-control" name="message" rows="5" data-rule="required" data-msg="Please write something for us" placeholder="Message"></textarea>
                            <div class="validation"></div>
                        </div>
                        <div class="text-center"><button type="submit">Send Message</button></div>
                    </form>
                </div>

            </div>
        </section><!-- #contact -->

    </main>


    <!--==========================
      Footer
    ============================-->
    <footer id="footer">
        <div class="footer-top">
            <div class="container">
                <div class="row">

                    <div class="col-lg-3 col-md-6 footer-info">
                        <img src="img/logo.png" alt="TheEvenet">
                        <p>In alias aperiam. Placeat tempore facere. Officiis voluptate ipsam vel eveniet est dolor et totam porro. Perspiciatis ad omnis fugit molestiae recusandae possimus. Aut consectetur id quis. In inventore consequatur ad voluptate cupiditate debitis accusamus repellat cumque.</p>
                    </div>

                    <div class="col-lg-3 col-md-6 footer-links">
                        <h4>Useful Links</h4>
                        <ul>
                            <li><i class="fa fa-angle-right"></i> <a href="#">Início</a></li>
                            <li><i class="fa fa-angle-right"></i> <a href="#">About us</a></li>
                            <li><i class="fa fa-angle-right"></i> <a href="#">Services</a></li>
                            <li><i class="fa fa-angle-right"></i> <a href="#">Terms of service</a></li>
                            <li><i class="fa fa-angle-right"></i> <a href="#">Privacy policy</a></li>
                        </ul>
                    </div>

                    <div class="col-lg-3 col-md-6 footer-links">
                        <h4>Useful Links</h4>
                        <ul>
                            <li><i class="fa fa-angle-right"></i> <a href="#">Home</a></li>
                            <li><i class="fa fa-angle-right"></i> <a href="#">About us</a></li>
                            <li><i class="fa fa-angle-right"></i> <a href="#">Services</a></li>
                            <li><i class="fa fa-angle-right"></i> <a href="#">Terms of service</a></li>
                            <li><i class="fa fa-angle-right"></i> <a href="#">Privacy policy</a></li>
                        </ul>
                    </div>

                    <div class="col-lg-3 col-md-6 footer-contact">
                        <h4>Contact Us</h4>
                        <p>
                            A108 Adam Street <br>
                            New York, NY 535022<br>
                            United States <br>
                            <strong>Phone:</strong> +1 5589 55488 55<br>
                            <strong>Email:</strong> info@example.com<br>
                        </p>

                        <div class="social-links">
                            <a href="#" class="twitter"><i class="fa fa-twitter"></i></a>
                            <a href="#" class="facebook"><i class="fa fa-facebook"></i></a>
                            <a href="#" class="instagram"><i class="fa fa-instagram"></i></a>
                            <a href="#" class="google-plus"><i class="fa fa-google-plus"></i></a>
                            <a href="#" class="linkedin"><i class="fa fa-linkedin"></i></a>
                        </div>

                    </div>

                </div>
            </div>
        </div>

        <div class="container">
            <div class="copyright">
                &copy; Copyright <strong>Gibizeraaa!</strong>. All Rights Reserved
            </div>
        </div>
    </footer><!-- #footer -->

    <a href="#" class="back-to-top"><i class="fa fa-angle-up"></i></a>

    <!-- JavaScript Libraries -->
    <script src="lib/jquery/jquery.min.js"></script>
    <script src="lib/jquery/jquery-migrate.min.js"></script>
    <script src="lib/bootstrap/js/bootstrap.bundle.min.js"></script>
    <script src="lib/easing/easing.min.js"></script>
    <script src="lib/superfish/hoverIntent.js"></script>
    <script src="lib/superfish/superfish.min.js"></script>
    <script src="lib/wow/wow.min.js"></script>
    <script src="lib/venobox/venobox.min.js"></script>
    <script src="lib/owlcarousel/owl.carousel.min.js"></script>

    <!-- Contact Form JavaScript File -->
    <script src="contactform/contactform.js"></script>

    <!-- Template Main Javascript File -->
    <script src="js/main.js"></script>
</body>

</html>

