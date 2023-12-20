programa {
  funcao inicio() {
    real reais, dolares
    inteiro limite, contador

    contador = 1

    escreva("Quantas vezes você quer fazer a conversão? ")
    leia(limite)

    enquanto (contador <= limite) {

      escreva("Qual o valor em reais?: ")
      leia(reais)

      dolares = reais / 4.87

      escreva("Esse valor em dolares fica: " + dolares + "\n")

      contador = contador + 1

    }
  }
}
