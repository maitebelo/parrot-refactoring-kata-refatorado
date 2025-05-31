# Parrot Refactoring Kata

## Projeto original
O projeto simula diferentes tipos de papagaios com comportamentos próprios. 
- Europeu: velocidade fixa
- Africano: velocidade reduzida por número de cocos
- Norueguês Azul: velocidade varia com voltagem e se está preso

### Problemas do código original 
- Tudo em uma única classe Parrot
- Código repetido
- Muitas responsabilidades misturadas
- Difícil de entender e modificar

## Melhorias 

### 1. Estrutura de classes
- Parrot virou uma classe abstrata
- Cada tipo de papagaio virou uma classe separada
- Uso de métodos de fábrica para criação

### 2. Organização de Código
- Criação do ParrotSounds com sons centralizados
- Métodos menores e nomes mais claros
- Responsabilidades bem divididas

### 3. Encapsulamento
- Atributos privados
- Cálculos extraídos para métodos auxiliares
- Melhor controle dos dados

### 4. Testes
- Cobertura de testes mantida
- Testes adaptados à nova estrutura
- Casos de borda incluídos

## Justificativas Técnicas 
- Herança facilita adicionar novos tipos
- Fábricas escondem detalhes da criação
- Constantes centralizadas evitam repetição
- Métodos pequenos tornam o código mais legível e testável
 