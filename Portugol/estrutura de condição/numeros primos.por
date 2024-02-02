programa {
  funcao inicio() {
    inteiro numero

    escreva("Digite um número: ")
    leia(numero)

    se(numero == 2 ou numero != 2 e numero % 2 != 0) {
      escreva("Esse número é primo")
    }
    senao {
      escreva("Esse número não é primo")  
    }
  }
}