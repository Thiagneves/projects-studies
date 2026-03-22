programa {
  funcao inicio() 
  {
    real soma, sub, mult, div
    real n1, n2
    real op 

    escreva("informe a operação desejada: \n")
    escreva("DIGITE:  \n")
    escreva("1 para SOMAR \n")
    escreva("2 para SUBTRAIR \n")
    escreva("3 para MULTIPLICAR \n")
    escreva("4 para DIVIDIR \n")
    leia(op)

    limpa()

    escreva("Informe o 1° valor: ")
    leia(n1)
    escreva("Informw o 2° valor: ")
    leia(n2)

    se(op == 1){
      soma = n1+n2
      escreva("Resultado: ",soma)

    }
    senao se(op == 2){
      sub = n1-n2
      escreva("Resultado: ",sub)

    }
    senao se(op == 3){
      mult = n1*n2
      escreva("Resultado: ",mult)

    }
    senao se(op == 4){
      div = n1/n2
      escreva("Resultado: ",div)

    }
    senao{
      escreva("Operação Invalida")
    }

  }
}
