# AL0338 - ANÁLISE E PROJETOS DE ALGORITMOS
## Trabalho Prático 2 - Programação Dinâmica

O HackerRank é uma plataforma online que oferece uma variedade de desafios de
programação e ciência da computação para ajudar pessoas a desenvolver suas habilidades
técnicas. É amplamente utilizado por programadores, estudantes e profissionais de tecnologia
para praticar programação, algoritmos, estruturas de dados, e outras habilidades relacionadas.
A plataforma oferece desafios em várias linguagens de programação, desde linguagens
populares como Python, Java e C++ até linguagens menos comuns. Os desafios variam em
dificuldade, desde questões introdutórias até problemas complexos que envolvem algoritmos
avançados.
Os usuários podem resolver esses desafios online, receber feedback imediato sobre sua
solução e comparar suas respostas com outros usuários para ver como estão se saindo em
relação a uma comunidade global de programadores. Além disso, o HackerRank também é
usado por empresas para recrutar talentos em tecnologia, oferecendo testes personalizados
como parte de seus processos de seleção. Portanto, o HackerRank é uma plataforma valiosa
tanto para aprendizado quanto para avaliação de habilidades técnicas em programação.

___

### Dependências
Java >= 8

___

### Problema

Fibonacci Modified

Serão recebidos três inteiros, onde os dois primeiros se referem aos primeiros termos do Fibonacci, o terceiro termo se refere a posição do termo que se deseja obter. Contudo não é um Fibonacci comum, onde o próximo termo é obtido a partir dos dois antecessores, nesse problema o próximo termo é obtido a partir do quadrado do termo antecessor somado com seu antecessor.

___

Descrição da função

A função candies tem os seguintes parâmetros:

int n: o número de crianças na turma
int arr[n]: as notas de cada aluno

Retorna

int: o número mínimo de doces que Alice deve comprar
Formato de entrada

A primeira linha contém um inteiro, n, o tamanho de arr.
Cada uma das próximas linhas contém um inteiro indicando a nota do aluno na posição i.

___

Restrições

0 <= t1, t2 <= 2
3 <= n <= 20
tn pode exceder o limite de um inteiro de 64 bits.


## Exemplo de comando para executar código

### Exemplo 1

Exemplo de Input 1

0 1 6

Exemplo de Output 1

27

Explicação Input 1

O primeiro número se refere ao primeiro termo, o segundo número se refere ao segundo termo, e o terceiro número se refere a posição do termo que se deseja obter.

Explicação Output 1

O sexto termo da sequência é 27.

### Exemplo 2

Exemplo de Input 2

0 1 10

Exemplo de Output 2

84266613096281243382112

Explicação Input 1

O primeiro número se refere ao primeiro termo, o segundo número se refere ao segundo termo, e o terceiro número se refere a posição do termo que se deseja obter.

Explicação Output 1

O décimo termo da sequência é 84266613096281243382112.


Fonte: [HackerRank](https://www.hackerrank.com/challenges/candies/problem)