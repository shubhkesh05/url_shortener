function shorten() {
    let url = document.getElementById("longUrl").value;

    fetch("/shorten?url=" + encodeURIComponent(url), {
        method: "POST"
    })
    .then(res => res.text())
    .then(data => {
        document.getElementById("result").innerHTML =
            `<a href="${data}" target="_blank">${data}</a>`;
    });
}
