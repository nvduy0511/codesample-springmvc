const showMenu = (toggleId, navbarId, bodyId) => {
    const toggle = document.getElementById(toggleId),
        navbar = document.getElementById(navbarId),
        bodypandding = document.getElementById(bodyId)
    if (toggle && navbar) {
        toggle.addEventListener('click', () => {
            navbar.classList.toggle('show')
            toggle.classList.toggle('rotate')
            bodypandding.classList.toggle('expander')
        })
    }
}
showMenu('nav_toggle', 'navbar', 'body')
const linkColor = document.querySelectorAll('.nav_link')
function colorLink() {
    linkColor.forEach(l => l.classList.remove('active'))
    this.classList.add('active')
}
linkColor.forEach(l => l.addEventListener('click', colorLink))