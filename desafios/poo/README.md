# 📱 UML - Modelagem do Componente iPhone  

Este projeto foi desenvolvido como parte de um **desafio proposto pelo Bootcamp da DIO**. O objetivo é modelar, utilizando **UML (Unified Modeling Language)**, um **componente de um iPhone** contendo três funcionalidades principais:  

## 🎯 Funcionalidades  

### 🎵 Reprodutor Musical (`MusicPlayer`)  
O **reprodutor musical** permite que o usuário controle a reprodução de músicas no iPhone.  
- `play()`: Inicia a reprodução da música.  
- `pause()`: Pausa a reprodução atual.  
- `selectMusic(String music)`: Permite selecionar uma música específica para tocar.  

### 📞 Aparelho Telefônico (`Phone`)  
O **aparelho telefônico** implementa as funções básicas de um telefone.  
- `call(String number)`: Realiza uma chamada para o número informado.  
- `answer()`: Atende uma chamada recebida.  
- `startVoicemail()`: Inicia o correio de voz.  

### 🌍 Navegador na Internet (`WebBrowser`)  
O **navegador** permite acessar páginas da web e gerenciar abas.  
- `showPage(String url)`: Exibe a página da web correspondente ao URL informado.  
- `addNewTab()`: Abre uma nova aba no navegador.  
- `refreshPage()`: Atualiza a página atual.  

---

## 🛠 Modelagem UML  

O projeto foi modelado através de um **diagrama de classes UML**, utilizando **Mermaid.js**, para representar as relações entre as interfaces e a classe `IPhone`.  

```mermaid
classDiagram
direction TB

    class MusicPlayer {
        +play()
        +pause()
        +selectMusic(String music)
    }

    class Phone {
        +call(String number)
        +answer()
        +startVoicemail()
    }

    class WebBrowser {
        +showPage(String url)
        +addNewTab()
        +refreshPage()
    }

    class Iphone {
    }

    <<Interface>> MusicPlayer
    <<Interface>> Phone
    <<Interface>> WebBrowser

    Iphone --> MusicPlayer
    Iphone --> Phone
    Iphone --> WebBrowser
