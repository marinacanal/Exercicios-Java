programa {
  funcao inicio() {

    inteiro n1, n2

    n1 = 1
    n2 = 1

    escreva("Digite o número inicial da contagem: ")
    leia(n1)
    escreva("Digite o número final da contagem: ")
    leia(n2)

    enquanto (n1 > n2) {
      escreva("\n" + n1)
      n1 = n1 - 1
    }

    enquanto (n2 > n1) {
      escreva("\n" + n2)
      n2 = n2 - 1
    }

    se (n1 == n2)  {
      escreva("\n" + n1)
    }
  }
}
