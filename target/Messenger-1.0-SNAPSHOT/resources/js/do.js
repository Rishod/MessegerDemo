window.onload = function() {
	document.getElementsByClassName('button--login')[0].onclick = function() {
		document.getElementsByClassName('registry-form-holder')[0].style.display = 'none';
		document.getElementsByClassName('login-form-holder')[0].style.display = 'block';
	}
	
	document.getElementsByClassName('button--registry')[0].onclick = function() {
		document.getElementsByClassName('login-form-holder')[0].style.display = 'none';
		document.getElementsByClassName('registry-form-holder')[0].style.display = 'block';
	}
	
	function hideHolders(){
		var tmp = document.getElementsByTagName('input');
		for(var i = 0; i < tmp.length; i++)
			{
				tmp[i].addEventListener('focus',function(){
					this.removeAttribute('placeholder');
				},false)
			}
	}
	
	function showHolders(){
		var tmp = document.getElementsByTagName('input');
		for(var i = 0; i < tmp.length; i++)
		{
			tmp[i].addEventListener('blur',function(){
				if(this.getAttribute('name') == "login")
					this.setAttribute('placeholder','Enter login');
				if(this.getAttribute('name') == 'password')
					this.setAttribute('placeholder','Enter password');
				if(this.getAttribute('name') == 'email')
					this.setAttribute('placeholder','Enter e-mail');
			},false)
		}
	}
	
	hideHolders();
	showHolders();
	

	
	
}