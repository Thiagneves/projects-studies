programa {
  funcao inicio() 
  {
    real prova1, prova2, trabalho, media

    escreva("Nota prova 1: ")
    leia(prova1)

    escreva("Nota prova 2: ")
    leia(prova2)

    escreva("Nota trabalho: ")
    leia(trabalho)

    media = (prova1*2 + prova2*3 + trabalho*4) / (2+3+4)
    escreva("Média Final: ", media)
  }
}
