programa {
  funcao inicio() {
    inteiro numero, contador, divisivel

    contador = 1
    divisivel = 0

    escreva("Digite um número: ")
    leia(numero)

    enquanto(contador <= numero) {
      escreva(contador)

      se(numero % contador == 0) {
        divisivel = divisivel + 1
      }
      
      contador = contador + 1
    }

    escreva("\nEsse número é divisível por " + divisivel + " número(s)\n")
    
    se(divisivel == 2){
        escreva("Esse é um número primo")
      } senao {
        escreva("Esse não é um número primo")
      }
  }
}
