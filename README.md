# hu3piler
Compiler for my Compilers' class experimental language.

# Language definition:

## 1. Tipos de variáveis
### 1.1. Numérico
Todo número representado nesta linguagem é um **número real** (ponto flutuante).

A palavra reservada para declarar uma variável do tipo numérico é `numero`.
### 1.2. String
O tipo string é uma sequência de caracteres de qualquer tamanho que esteja delimitado pelo caractere _aspas duplas_.

A palavra reservada para declarar uma variável do tipo string é `string`.
## 2. Nomes de variáveis
Os nomes das variáveis declaradas ou utilizadas em _qualquer_ parte do código, são iniciadas por "\_" (underline) seguido de letras e números. O _segundo caractere_ (primeiro caractere após o "\_") é **obrigatoriamente** uma letra. O tamanho dos nomes das variáveis devem ser _maior ou igual à 2_.

Exemplo:  
`_var`, `_idade`, `_a1cad` e `_b`.
## 3. Declaração de variáveis
As declarações de variáveis podem ser feitas em qualquer parte, estrutura, do código. Declarações de variáveis são terminadas pelo caractere `;` (ponto e vírgula).

Exemplos de declaração:

    numero _a, _b;  
    numero _var;
    string _nome, _sobrenome, _b2;
    string _ab;
## 4. Atribuição
A atribuição de _números_, _strings_ e _expressões_ à variáveis, são feitas pelo caractere `=`. O comando de atribuição será terminado pelo caractere `;` (ponto e vírgula).

Exemplo:

    _idade = 18;
    _nome = "Joao";
Há um caso especial na atribuição onde pode-se colocar várias variáveis no lado esquerdo do caractere de atribuição e do lado direito a lista de expressões nas quais serão atribuídas as suas respectivas variáveis.

Exemplo:

    _a, _b = 2, _x+1;
Este exemplo, é equivalente a: `_a = 2; _b = _x+1`.

>Obs.: Não é possível fazer a atribuição junto com declaração de variável.

## 5. Comando de exibição de dados
O comando para a exibição de dados é feito através da palavra-chave `exibe`. O comando de exibição de dados é terminado pelo caractere `;` (ponto e vírgula).  

Este comando mistura _variáveis_ e _strings_. Não é aceito _expressões_.

Exemplo:

    exibe _a;
    exibe _a, _b, _id;
    exibe "saldo: ", _a, ". \n++ Fim ++";

## 6. Comando de entrada de dados
O comando para a entrada de dados é feito através da palavra-chave `leia`. O comando de entrada de dados é terminado pelo caractere `;` (ponto e vírgula).  

Este comando mistura _variáveis_, nas quais irão armazenar o valor informado pelo usuário, e _mensagens de texto_ para a devida informação sobre a entrada.

Exemplo:

    leia _a, _b, _x;
    leia "Digite o seu nome: ", _nome, "\nDigite sua idade: ", _idade;

## 7. Expressões
_Expressões_ são caracterizadas pelo uso de _operadores_, pelos tipos dos _operandos_ e pelos tipos de resultados que produzem. _Operadores_ designam o tipo de operação a ser realizada.  

Nesta linguagem temos os seguintes operadores listados abaixo em ordem de precedência, sendo o 1º operador o de maior precedência:

1º) Parênteses - `(` e `)`  
2º) Operador Lógico - `nao` (letra minúscula)   
3º) Potenciação - `^`  
4º) Multiplicativos - `*` e `/`  
5º) Aditivos - `+` e `-`  
6º) Operadores Relacionais - `>`, `<`, `>=`, `<=`, `==` e `!=`  
7º) Operador Lógico - `e` (letra minúscula)  
8º) Operador Lógico - `ou` (letra minúscula) e `OU` (letra maiúscula)

Quando se usa os _operadores relacionais_, o resultado das relações retornam **0** (zero) para falso ou **1** (um) para verdadeiro.  

Quando se usa os _operadores lógicos_, as expressões no lado direito e esquerdo, para o caso dos _operadores lógicos_ `e` e `ou`, e a expressão no lado direito para o caso do _operador_ `nao`, qualquer valor diferente de **0** (zero) são interpretados como _verdadeiro_ e o valor **0** (zero) é interpretado como _falso_. O resultado da operação lógica é **0** (zero) para _falso_ e **1** (um) para _verdadeiro_.

## 8. Curto circuito no operador lógico `ou`
O operador lógico `ou` possui curto circuito, ou seja, caso a expressão do lado esquerdo desse operador seja verdadeira, a expressão do lado direito do operador não será analisada. Por este motivo, caso o programador queira forçar que a expressão do lado direito do operador `ou` seja analisada, há disponível o operador `OU` (com letras maiúsculas), que é o operador `ou`, sem curto circuito.

## 9. Concatenação de strings
Há a possibilidade de se ter a concatenação de strings nas expressões usando o operador sobrecarregado `+`.

Exemplo:

    "João " + "de barro"
    "Meu nome " + "é " + "Maria"

Tomar cuidado para não misturar tipo string com o tipo numérico. O exemplo descrito abaixo não é válido.

Exemplo:

    "Arroz tipo " + 2

## 10. Estruturas de controle de fluxo
Os comandos de controle de fluxo são a essência de qualquer linguagem, porque governam o fluxo da execução do programa.

> Nota: As palavras chaves `expressao` descritas nas estruturas de controle de fluxo abaixo são apenas para informar que deve-se substituir pela expressão apropriada do programa, com variáveis, números, strings e operadores, a depender da situação. Não deve ser escrito "expressao" na estrutura de controle de fluxo.

### 10.1. se
    se ( expressao )
      (Bloco de comandos 1)
    senaoSe ( expressao )
      (Bloco de comandos 2)
    senao
      (Bloco de comandos 3)
    fimSe
O comando `se` irá analisar se a _expressão_ é **verdadeira** (qualquer valor _diferente de zero_). Se for, o _bloco de comandos 1_ será executado. Se for **falso** (expressão _igual a zero_), a estrutura de controle irá analisar a _expressão_ descrita na palavra-chave `senaoSe`. Se a expressão for **verdadeira**, o _bloco de comandos 2_ será executado. Se for **falso**, caso haja mais `senaoSe`, as suas devidas expressões serão analisadas. Caso não se encaixe em nenhuma das situações descritas nas expressões, o _bloco de comandos 3_ será executado caso a palavra-chave `senao` tenha sido usada pelo programador.  

Para esta estrutura de controle de fluxo, o `se` e o `fimSe` são **obrigatórios** para delimitação de início e fim da estrutura, respectivamente. Os _parênteses_ delimitando as expressões também são obrigatórias. A palavra-chave `senaoSe` só pode ser usada dentro da estrutura `se` e pode haver quantos forem necessários, inclusive nenhum, para a aplicação, com suas respectivas expressões obrigatórias delimitadas pelos parênteses, também obrigatório. A palavra-chave `senao` é **opcional** e pode aparecer no **máximo** uma vez para cada estrutura `se` usada no código.  

>OBS.: Não há qualquer caractere, como o `;` (ponto e vírgula), dizendo o fim do comando `se`, `senaoSe`, `senao` e `fimSe`, como por exemplo para o comando `exibe`.

### 10.2. escolha-caso
    escolha ( expressaoAAnalisar )
      caso ( expressaoAComparar )
        (Bloco de comandos)
      outros
        (Bloco de comandos)
    fimEscolha
O comando `escolha` irá analisar a expressão e verificar se enquadra em um determinado `caso`. Caso a expressão a ser analisada seja satisfeita com alguma expressão à comparar, dentre vários casos especificados, a estrutura de controle `escolha` irá executar o _bloco de comandos_ definido ali. Caso a expressão a ser analisada não se encaixe em nenhum caso, a estrutura irá executar o _bloco de comandos_ especificado abaixo da palavra-chave `outros`.

Para esta estrutura de controle, o `escolha` e o `fimEscolha` são **obrigatórios** para delimitação de início e fim da estrutura, respectivamente. Os parênteses delimitando as expressões também são **obrigatórios**. A palavra-chave `caso` só pode ser usada dentro da estrutura `escolha` e tem que haver no _mínimo_ 1 (um) caso especificado, com sua expressão delimitada pelos parênteses, que é obrigatório. A palavra-chave `outros` é **opcional** e pode aparecer no _máximo_ uma vez para cada estrutura `escolha` usada no código.  

>OBS.: Não há qualquer caractere, como o `;` (ponto e vírgula), dizendo o fim do comando `escolha`, `caso`, `outros` e `fimEscolha`, como por exemplo para o comando `exibe`.

### 10.3. Laços
#### 10.3.1. enquanto
    enquanto ( expressao )
      (Bloco de comandos)
    fimEnquanto
O comando `enquanto` irá analisar a _expressão_ e enquanto ela for **verdadeira** (_qualquer valor diferente de zero_), o _bloco de comandos_ será executado. Quando a expressão for **falsa** (_valor igual à zero_), _ou_ se tornar **falsa**, o _bloco de comandos_ não será executado.

Para esta estrutura de controle, o `enquanto` e o `fimEnquanto` são obrigatórios para delimitação de início e fim da estrutura, respectivamente. Os parênteses delimitando a expressão também é obrigatório.

>OBS.: Não há qualquer caractere, como o `;` (ponto e vírgula), dizendo o fim do comando `enquanto` e `fimEnquanto`, como por exemplo para o comando `exibe`.

#### 10.3.2. para
    para ( _var expressaoInicio ate expressaoFim [passo expressaoPasso] )
      (Bloco de comandos)
    fimPara
>OBS.: `_var` é uma variável numérica e pode apresentar qualquer nome, sendo utilizado `_var` aqui apenas para representação.

O bloco de comandos será executado _n_ vezes com a variável `_var` tendo o valor da _expressão inicial_ até o valor da _expressão final_ sendo acrescido ou decrescido de 1 em 1 valor. Quando `_var` ultrapassar o valor da expressão final o bloco de comandos não será mais executado. A _expressão inicial_ pode ser **maior** ou **menor** do que a _expressão final_.

Há um opcional neste comando e está descrito entre colchetes (os colchetes não fazem parte da escrita do comando e estão aqui apenas para representar a parte que é opcional). Quando a palavra-chave `passo` é utilizada, o comando `para` irá dar passos de _x_ em _x_ valores descrito em `expressaoPasso`. Caso não seja utilizado, o comando `para` irá dar passos de 1 em 1 valor.

Para esta estrutura de controle, o `para` e o `fimPara` são **obrigatórios** para delimitação de início e fim da estrutura, respectivamente. Os parênteses delimitando as expressões e variável do comando `para` são **obrigatórios**. A variável a ser controlada no laço, `_var`, é **obrigatória** e já deve ter sido declarada em algum momento antes. A palavra-chave `ate` é **obrigatória** e deve ter expressões de inicio e de fim ao seu lado esquerdo e direito. A palavra-chave `passo` é **opcional** e quando presente, obrigatoriamente tem de haver uma `expressaoPasso` descrita.

>OBS.: Não há qualquer caractere, como o `;` (ponto e vírgula), dizendo o fim do comando `para` e `fimPara`, como por exemplo para o comando `exibe`, e nem dentro dos parênteses delimitadores.

#### 10.3.3. para múltiplo 
    para ( _i, _j, _k expressaoInicio ate expressaoFim )
      (Bloco de comandos)
    fimPara
Comando `para` especial. Este comando será substituido por x comandos `para` simples. O valor de x depende de quantas variáveis foram utilizadas, neste caso, foram utilizadas 3. Pode-se haver quantas variáveis forem necessárias neste comando especial.

O comando exemplo acima será traduzido para a seguinte sequência mostrada abaixo:

    para ( _i expressaoInicio ate expressaoFim )
      para ( _j expressaoInicio ate expressaoFim )
        para ( _k expressaoInicio ate expressaoFim )
          (Bloco de comandos)
        fimPara
      fimPara
    fimPara

>OBS.: Não há qualquer caractere, como o `;` (ponto e vírgula), dizendo o fim do comando `para` e `fimPara`, como por exemplo para o comando `exibe`, no entanto, existe o caractere `,` (vírgula) separando as variáveis utilizadas neste comando especial.

## 11. Comentários
Os comentários serão feitos da mesma forma que as linguagem C e Java.

A sequência de caractere especial `//` comenta apenas uma linha.
A sequência de caractere especial `/*` comenta várias linhas de uma só vez finalizando o comentário quando encontrar a sequência de caractere especial `*/`.
