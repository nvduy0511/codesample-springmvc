const upload = document.getElementById('uploadImage');
const image = document.getElementById('avatar-image');
const openChange = document.getElementById('change-pass');
const modal = document.querySelector('.modal-change-pass')
const backdrop = document.querySelector('.backdrop');

upload.addEventListener("change", function () {
    const file = this.files[0];
    const reader = new FileReader()
    reader.onload = function () {
        const result = reader.result;
        // console.log(result);
        image.src = result;
    }
    reader.readAsDataURL(file);
    // console.log(file);
})

// console.log(openChange)

openChange.addEventListener("click", function () {
    // console.log("Runnn");
    backdrop.classList.add("show-backdrop");
    modal.classList.add("show-modal-change-pass");

    //modal.classList.toggle("show-modal-change-pass");
})

function closeChangePass() {
    backdrop.classList.remove("show-backdrop");
    modal.classList.remove("show-modal-change-pass");

}

// console.log("Runnn file");