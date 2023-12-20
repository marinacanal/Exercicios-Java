programa {
  funcao inicio() {
    inteiro numero, limite, soma

    numero = 1
    soma = 0

    escreva("Quer contar até quanto? ")
    leia(limite)

    enquanto (numero <= limite) {
      escreva ("\n" + numero) 
      numero = numero + 1
    
      soma = soma + numero - 1
    }

    escreva("\n\nA soma desses valores é igual a: " + soma)

    }
  }