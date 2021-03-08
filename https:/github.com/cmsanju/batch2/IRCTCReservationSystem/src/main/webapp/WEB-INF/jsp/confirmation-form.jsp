<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html>
<html>
<body>
<p id="msg">Your reservation is confirmed successfully. Please, re-check the details.</p>
First Name : ${reservation.firstName} <br><br>
Last Name : ${reservation.lastName} <br><br>
Gender: ${reservation.gender}<br><br>
Meals: 
<ul>
<c:forEach var="meal" items="${reservation.food}">
<li>${meal}</li>
</c:forEach>
</ul><br>
Leaving From : ${reservation.cityFrom} <br><br>
Going To : ${reservation.cityTo}<br><br>
Journey Date : ${reservation.jDate}<br><br>
Seat No :
<ul>
<c:forEach var = "seats" items = "${reservation.seat}"> 
<li>${seats}</li>
<c:if test="seatVal">
</c:if>
</c:forEach>
</ul><br><br><br>	

<a href = "bookingForm">Book here </a>

</body>
</html>
