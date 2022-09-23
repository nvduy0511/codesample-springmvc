const signUpButton = document.getElementById('signUp');
const signInButton = document.getElementById('signIn');
const container = document.getElementById('container');
const btn_sigup = document.getElementById('btn-sigup');

signUpButton.addEventListener('click', () => {
	container.classList.add("right-panel-active");
	console.log("SigUp");
});

signInButton.addEventListener('click', () => {
	container.classList.remove("right-panel-active");
});

btn_sigup.addEventListener('click', () => {
	window.scrollTo(0,document.body.scrollHeight);
});
