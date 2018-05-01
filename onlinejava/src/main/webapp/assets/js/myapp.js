$(function() {
	
	//solving the active menu
	switch(menu) {
		case 'About' :
			$('#about').addClass('active');
			break;
			
		case 'Contact' :
			$('#contact').addClass('active');
			break;
			
		case 'Products' :
			$('#listproduct').addClass('active');
			break;
			
		default:
			$('#listproduct').addClass('active');
			$('#a_'+menu).addClass('active');
			break;
	}
	
		
			
	
});