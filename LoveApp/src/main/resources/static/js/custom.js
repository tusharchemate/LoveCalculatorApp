
$(document).ready(function() {

	$(".form").submit(function(e) {
		e.preventDefault();

		var form = this;
		$("#loadingProgressG").show();
		$("#result").hide();
		$(".container,.row").hide();
		setTimeout(function() {

			$("#loadingProgressG").hide();
			form.submit();
		}, 4000);

	});


	$('.container').hover(function() {
		$('#result').hide();
	});

});
