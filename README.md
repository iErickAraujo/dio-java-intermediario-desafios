﻿# dio-java-intermediario-desafios
 
[Desafio Orientação a Objetos e UML: Diagramação de Classes do iPhone] - Projeto desenvolvido como parte do desafio com base no vídeo de lançamento do iPhone, concepção de análise de negócios, requisitos, conceitos da programação orientada a objetos e modelagem UML.

[Observações] - Projeto para fins de aprendizado.

```mermaid
classDiagram
  class iPhone {
    + tocarMusica()
    + fazerChamada()
    + navegarInternet()
  }
  class interface ReprodutorMusical {
    + tocar()
    + pausar()
    + parar()
  }
  class interface AparelhoTelefonico {
    + discar(numero: string)
    + atender()
    + desligar()
  }
  class interface NavegadorWeb {
    + carregarPagina(URL: string)
    + navegarParaTras()
    + navegarParaFrente()
  }
  iPhone --|> ReprodutorMusical
  iPhone --|> AparelhoTelefônico
  iPhone --|> NavegadorWeb
```
