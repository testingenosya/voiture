<%@ include file="common/header.jspf"%>

            <!-- Team Start -->
            <div class="team">
                <div class="container">
                    <div class="section-header text-center">
                        <p>${ user }</p>
                        <h2>check out our new cars collection for you</h2>
                    </div>
                    <div class="row">
                       <c:forEach items="${cars}" var="car">
                        <div class="col-lg-3 col-md-6 wow fadeInUp" data-wow-delay="0.1s">
                            <div class="team-item">
                                <div class="team-img">
                                    <img src="img/car/${ car.getImage() }" alt="Team Image">
                                </div>
                                <div class="team-text">
                                    <h2>${ car.getName() }</h2>
                                	${ srv2.getCommentButton(car.getIdCar()) }
                                </div>
                                <div class="team-social">

                                </div>
                            </div>
                        </div>
                       </c:forEach>
                    </div>
                </div>
            </div>
            <!-- Team End -->

<%@ include file="common/footer.jspf"%>
