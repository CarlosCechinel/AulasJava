function autenticar(evento) {
    evento.preventDefault(); // cancela o envio do formulario

    //variavel em javascript se declara com let (variavel local)
    let user = document.getElementById("txtUser").value
    let senha = document.getElementById("txtSenha").value


    // tem que corresponder o que o backend espera encontrar
    let usuario = {
        email: user,
        racf: user,
        senha: senha // a esquerda nesse caso é o nome do campo e a direta a informacao

    }
    //mensagem com os dados para o backend
    let msg = {
        method: "POST",
        body: JSON.stringify(usuario), // transformando informacoes do usuario para string
        headers: { // padrao para transmissao de dados em http
            'Content-type': 'application/json'
        }
    }
    // para enviar a msg para o backend(usando get nao precisa do complemento ", msg" pois nao teria corpo)
    fetch("http://localhost:8080/usuarios/login", msg) //chamada assincrona
        .then(res => tratarResposta(res)) //utilizar o .then para aguardar a resposta, da para encadear
    // param => metodo - quando é um só no javascript pode utilizar essa linha de codigo

    //duncao anonima e criada para a execucao e nao para ser chamada

}
function tratarResposta(resposta) {
    if (resposta.status != 200) {
        document.getElementById("msgError").innerHTML = "Usuário/Senha invalido(a)"
    } else {
        resposta.json().then(res => fazerLogin(res))
    }
    function fazerLogin(usuario) {

    }
    function fazerLogin(user) {
        localStorage.setItem("userlogged", JSON.stringify(user))
        window.location = "dashmenu.html"
    }

}