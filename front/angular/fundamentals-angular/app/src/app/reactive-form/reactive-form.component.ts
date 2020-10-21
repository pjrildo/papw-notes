import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators, AbstractControl } from '@angular/forms';

@Component({
  selector: 'app-reactive-form',
  templateUrl: './reactive-form.component.html',
  styleUrls: ['./reactive-form.component.css']
})

export class ReactiveFormComponent implements OnInit {

  formCadastro : FormGroup

  constructor() {
  }

  ngOnInit() {
    this.formCadastro = new FormGroup({
      nome: new FormControl('', [Validators.required, Validators.minLength(5), Validators.maxLength(150)]),
      cpf: new FormControl('', [Validators.pattern(/^([0-9]{3}\.?[0-9]{3}\.?[0-9]{3}\-?[0-9]{2}|[0-9]{2}\.?[0-9]{3}\.?[0-9]{3}\/?[0-9]{4}\-?[0-9]{2})$/), Validators.required]),
      idade: new FormControl('', [Validators.min(18), Validators.required]),
      telefone: new FormControl('', Validators.required),
      email: new FormControl('', [Validators.email, Validators.required]),
      senha: new FormControl('', [Validators.minLength(8), Validators.required]),
    confirmaSenha: new FormControl('', [Validators.minLength(8), Validators.required/*, validaSenha*/])
    });
  }

  enviar(){
    let dados = `
      Nome: ${this.formCadastro.value.nome}
      CPF: ${this.formCadastro.value.cpf}
      Idade: ${this.formCadastro.value.idade}
      Telefone: ${this.formCadastro.value.telefone}
      Email: ${this.formCadastro.value.email}
      Senha: ${this.formCadastro.value.senha}
      ConfirmaSenha: ${this.formCadastro.value.confirmaSenha}
    `;

    console.log(dados);
  }
}

/*function validaSenha(control: AbstractControl) {
  if(control.value !== control.parent.controls['senha'].value){
    return {'senhaInvalida': true}
  }
  return null;
}*/