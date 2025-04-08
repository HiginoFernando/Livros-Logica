# 📚 Biblioteca SENAI

Projeto de uma API simples para gerenciar informações de livros.

## 🔥 Tecnologias

- Java 17+
- Spring Boot
- JPA (Jakarta Persistence API)

## 🚀 Funcionalidades

- Buscar informações de um livro pelo ID.
- Atualizar dados de um livro existente.
- Inserir novos livros.

## 📦 Estrutura

```
src/
├── controllers/
│   └── BibliotecaController.java
├── model/
│   └── Livro.java
├── service/
│   └── Biblioteca.java
```

## 🛠️ Como rodar

1. Clone o projeto:

```bash
git clone https://github.com/HiginoFernando/Livros-Logica.git
```

2. Abra o projeto em sua IDE (IntelliJ, Eclipse, VS Code...).

3. Instale as dependências e rode a aplicação Spring Boot.

4. Teste os endpoints com Postman ou Insomnia!

## 📄 Exemplo de Requisições

- **GET** `/livro/{id}`  
  Retorna informações de um livro pelo ID.

- **PUT** `/livro`  
  Atualiza ou adiciona um livro.  
  Exemplo de body:

```json
{
  "id": 4,
  "titulo": "Senhora",
  "autor": "José de Alencar",
  "ano": 1875
}
```

## ✨ Autor

Projeto feito por Luiz Fernando 💻

---

