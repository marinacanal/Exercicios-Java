programa {
  funcao inicio() {
    inteiro numero, contador, fatorial
    cadeia resposta

    enquanto(resposta != "N") {

    escreva("Você quer a fatorial de qual número? ")
    leia(numero)
    
    fatorial = numero
    contador = numero

    enquanto (contador > 1) {
      contador = contador - 1
      fatorial = fatorial * contador 
    }

    escreva("O valor da fatorial de " + numero + " é igual a: " + fatorial)
    escreva("\n\nQuer continuar? (S/N) ")
    leia(resposta)
    }
  }
}