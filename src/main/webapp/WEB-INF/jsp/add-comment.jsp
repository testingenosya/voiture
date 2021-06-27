<%@ include file="common/header.jspf"%>
	<form:form modelAttribute="comment" method="post">
		<input type="hidden" path="idUser" value="1" />
		<input type="hidden" path="idCar" value="${ idCar }" />
        <div class="col-sm-6 col-xs-3">
           <form:textarea type="text" path="Comment" class="form-control" placeholder="col-sm-6 col-xs-3"></form:textarea>
        </div>
		<input type="submit" value="send" />
    </form:form>
<%@ include file="common/footer.jspf"%>