Descrição do projeto:

O projeto é um app desenvolvido usando Kotlin com o Jetpack Compose e a navegação é feita pela
Navigation Component. O app possui 4 telas gerenciadas pelo navHost.

Objetivo da prova:
A prova tem como objetivo avaliar a nossa capacidade em evoluir um projeto já iniciado, aplicando
conceitos de navegação entre telas no Android utilizando o Jetpack Compose Navigation, com foco na
passagem de pârametros

Explicação:
1. Passagem de parâmetros obrigatórios na tela de Perfil:
   MainActivity.kt
   A rota "perfil" foi atualizada para "perfil/{nome}", adicionando o parâmetro "nome" diretamente
   em sua URL. Também foi adicionada a extração desse argumento com
   it.arguments?.getString("nome", "Usuario Genérico") e ele é passado para a PerfilScreen.

MenuScreen.kt
O botão "Perfil" tinha o onClick navegando apenas para "perfil", e foi alterado para navegar para
"perfil/Fulano de Tal", passando o "Fulano de tal" como parametro para o perfil do caminho da
rota.

PerfilScreen.kt
A tela PerfilScreen recebeu um novo parâmetro nome: String. O texto exibido na tela mudou de  
para "PERFIL - $nome", mostrando o nome passado.

2. Passagem de parâmetros opcionais na tela de Pedidos

MainActivity.kt
A rota "pedidos" foi atualizada para "pedidos?cliente={cliente}", adicionando "cliente" como query
parameter opcional. Foi configurado o navArgument("cliente") com defaultValue =
"Cliente Genérico" para quando nenhum valor for passado. O PedidosScreen agora recebe
it.arguments?.getString("cliente") como parametro.

PedidosScreen.kt
A função PedidosScreen recebeu o novo parâmetro cliente: String? na assinatura. O texto exibido
mudou de "PEDIDOS" para "PEDIDOS - $cliente", mostrando o cliente passado pela navegação.

3. Inserindo valor ao parâmetro opcional na tela de Pedidos
   Antes, a navegação ia para a tela PedidosScreen sem passar nenhum valor, ou seja a tela usaria o
   defaultValue. Agora, ela passa explicitamente "Cliente XPTO" como query
   parameter

    4. Passagem de múltiplos parâmetros
       MainActivity.kt
       A rota "perfil/{nome}" foi atualizada para "perfil/{nome}/{idade}", adicionando idade como segundo
       parâmetro obrigatório. Com isso foi configurado o navArgument("idade") do tipo int

   MenuScreen.kt
   O onClick do botão "Perfil" foi atualizado para "perfil/Fulano de Tal/27", passando agora também
   a idade na URL.

   PerfilScreen.kt
   A tela recebeu o novo parâmetro "idade". O texto exibido mudou para "PERFIL -
   $nome tem $idade anos", exibindo as duas informações na tela.