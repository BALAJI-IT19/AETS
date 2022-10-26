var date = new.Date();
var year = date.getFullYear();
var month = date.getMonth()+1;
var todayDate = String(date.getDate()).padStart(2,'0');
var datePattern = year + '-'+month+'-'+todayDate;
document.getElementById("date-picker").value=datePattern;
document.write(datePattern);

$(function() {

	$("#start").change(function() {

		if ($(this).val() == "sother") {

			$("#startTxtOther").removeAttr("disabled");

			$("#startTxtOther").focus();

		} else {

			$("#startTxtOther").attr("disabled", "disabled");

		}

	});

});

$(function() {

	$("#end").change(function() {

		if ($(this).val() == "eother") {

			$("#endTxtOther").removeAttr("disabled");

			$("#endTxtOther").focus();

		} else {

			$("#endTxtOther").attr("disabled", "disabled");

		}

	});

});