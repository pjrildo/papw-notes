function numeros_pares(a, b){
    while(a <= b){
        if(a % 2 == 0){
            console.log(a);
        }
        a++;
    }
}

function verifica_maioridade_sexo(idade, sexo){
    if(idade >= 18 && sexo == 'M'){
        console.log("Entra e paga taxa");
    }else if (idade >= 18 && sexo == 'F'){
        console.log("Entra e não paga taxa");
    }else{
		console.log("Entrada não permitida");
	}
}

function verifica_ano_atual(ano){
    if(ano == new Date().getFullYear()){
        console.log("Ano atual");
    }else{
        console.log("Não é o ano atual");
    }
}

function verifica_marca(marca){
    switch(marca){
        case 'Fujioka' : return "Marca certa";
        case 'Xingling' : return "Outra marca";
        default: return "Marca desconhecida";
    }
}