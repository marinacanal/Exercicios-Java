programa {
  funcao inicio() {

    inteiro numero, soma, contador
    
    contador = 1
    soma = 0

    enquanto (contador <= 5) {
      escreva ("Digite o valor " + contador + ": ")
      leia(numero)
      contador = contador + 1
      soma = soma + numero
    }

    escreva("A soma desses valores é igual a: " + soma)

  }
}