programa {
  funcao inicio() {
    cadeia nome, maior_nome
    inteiro limite, contador, nota, maior_nota

    contador = 1
    maior_nota = 0

    escreva("Quantas alunos a turma têm? ")
    leia(limite)

    enquanto (contador <= limite) {

      escreva("Aluno " + contador)
      escreva("\nQual o nome dele? ")
      leia(nome)
      escreva("Qual a nota de " + nome + "? ")
      leia(nota)

      contador = contador + 1

      se (nota == maior_nota) {
        maior_nota = nota
        maior_nome = "Mais de um aluno é o melhor"
      }

      se (nota > maior_nota) {
        maior_nota = nota
        maior_nome = nome + " é o(a) melhor aluno(a)"
      }
    }
    
    escreva(maior_nome + ", com nota: " + maior_nota)
    
  }
}