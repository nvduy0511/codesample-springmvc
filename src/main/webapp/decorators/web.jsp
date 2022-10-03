<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/common/taglib.jsp" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title><dec:title default="Trang chủ" /></title>

    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css"/>
    <link rel="stylesheet" href="<c:url value='/resources/css/site.css' />" />

    <dec:head />
</head>
    <body>
        <div id="root">
            <header>
                <nav class="navbar navbar-expand-sm navbar-toggleable-sm navbar-light bg-white border-bottom box-shadow">
                    <div class="container">
                        <a class="navbar-brand" href="<c:url  value="/"/>" >CodeSampleWeb</a>
                        <div class="navbar-collapse collapse d-sm-inline-flex justify-content-between">
                            <ul class="navbar-nav flex-grow-1">
                                <li class="nav-item">
                                    <a class="nav-link text-dark" href="<c:url value="/list-exercise"/>">Luyện tập</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link text-dark" href="<c:url value="/lythuyet"/>">Lý thuyết</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link text-dark" href="<c:url value="#"/>">Về chúng tôi</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link text-dark" href="<c:url value="/feed-back"/>">Góp ý</a>
                                </li>
                            </ul>
                        </div>
                        <div class="container-right">
                            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target=".navbar-collapse" aria-controls="navbarSupportedContent"
                                    aria-expanded="false" aria-label="Toggle navigation">
                                <span class="navbar-toggler-icon"></span>
                            </button>
                            <div class="nav-user">
                                <img id="button-avatar" src="https://www.easy-profile.com/support.html?controller=attachment&task=download&tmpl=component&id=2883" />
                            </div>
                        </div>
                    </div>
                </nav>
            </header>
            <div class="body-container">
                <main role="main">
                    <dec:body/>
                </main>
            </div>

            <div class="Footer">
                <div class="Logo_Footer">
                    <img src="<c:url value='/resources/images/logo_CodeSample.png' />" alt="Logo" />
                    <ul class="SocialNetwork">
                        <li>
                            <a href="/learning" aria-label="Trang facebook">
                                <img className="Facebook-logo" src="<c:url value='/resources/images/facebook.png' />" alt="Facebook" />
                            </a>
                        </li>


                        <li>
                            <a href="/" aria-label="Trang instagram">
                                <img className="Instagram-Logo" src="<c:url value='/resources/images/instagram.png' />" alt="Instagram" />
                            </a>
                        </li>

                        <li>
                            <a href="/" aria-label="Trang Twitter">
                                <img className="Twitter-Logo" src="<c:url value='/resources/images/twitter.png' />" alt="Twitter" />
                            </a>
                        </li>

                        <li>
                            <a href="/" aria-label="Trang youtube">
                                <img className="Youtube-Logo" src="<c:url value='/resources/images/youtube.png' />" alt="Youtube" />
                            </a>
                        </li>
                    </ul>
                </div>

                <div class="Right_footer">
                    <div className="Links">
                        <h3>Liên kết</h3>
                        <ul class="List">
                            <li><NavLink to="/learning">Học tập</NavLink></li>
                            <li><a href="index.js">Luyện tập</a></li>
                            <li><a href="index.js">Cuộc thi</a></li>
                            <li><a href="index.js">Trò chơi</a></li>
                        </ul>
                    </div>

                    <div className="Information">
                        <h3>Thông tin</h3>
                        <ul class="List">
                            <li><a href="index.js">Chia sẻ</a></li>
                            <li><a href="index.js">về chúng tôi</a></li>
                            <li><a href="index.js">Điều khoản sử dụng</a></li>
                        </ul>
                    </div>

                    <div className="Help">
                        <h3>Trợ giúp</h3>
                        <ul class="List">
                            <li><a href="index.js">Hỗ trợ</a></li>
                            <li><a href="index.js">Thảo luận</a></li>
                            <li><a href="index.js">Liên hệ với chúng tôi</a></li>
                        </ul>
                    </div>
                </div>
            </div>

        </div>

        <!-- Bootstrap core JavaScript -->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
                integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
                crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js"
                integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
                crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js"
                integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
                crossorigin="anonymous"></script>
        <script src="https://unpkg.com/@popperjs/core@2"></script>
        <script src="https://unpkg.com/tippy.js@6"></script>
        <script>

            tippy('#button-avatar', {
                content:
                    `<div class= 'userNavItems'>
                <a class='item_userNav' href="/User/Profile">
                    <i class="fas fa-user item-icon"></i>
                    <p>Thông tin cá nhân</p>
                </a>

                <a class='item_userNav' href="/Account/Logout">
                    <i class="fas fa-power-off item-icon"></i>
                    <p>Đăng xuất</p>
                </a>
            </div>`,
                allowHTML: true,
                trigger: 'click',
                placement: 'bottom',
                arrow: false,
                theme: 'dark',
                interactive: true,
            });
        </script>
    </body>
</html>