# 1 Objetivo
# 2 URL Base
# 3 Endpoints
# 4 Quais Recursos

from flask import Flask, jsonify, request

app = Flask(__name__)

livros = [
    {
        'id': 1,
        'titulo': 'Receitas da Vovó',
        'autor': 'Vovó'
    },
    {
        'id': 2,
        'titulo': 'Massas Italianas',
        'autor': 'Itália'
    },
    {
        'id': 3,
        'titulo': 'Poesias',
        'autor': 'Desconhecido'
    }
]

# Consultar(todos)
@app.route('/livros',methods=['GET'])
def obter_livros():
    return jsonify(livros)


#Consultar por id
@app.route('/livros/<int:id>',methods=['GET'])
def obter_livro_id(id):
    for livro in livros:
        if livro.get('id') == id:
            return jsonify(livro)

#incluir
@app.route('/livros',methods=['POST'])
def Inserir_livro():
    novo_livro = request.get_json()
    livros.append(novo_livro)

    return jsonify(livros)

#Editar
@app.route('/livros/<int:id>',methods=['PUT'])
def editar_livro(id):
    livro_alterdo = request.get_json()
    for indice,livro in enumerate(livros):
        if livro.get('id') == id:
            livros[indice].update(livro_alterdo)
            return jsonify(livros[indice])

#Excluir
@app.route('/livros/<int:id>',methods=['DELETE'])
def excluir_livro(id):
    for indice,livro in enumerate(livros):
        if livro.get('id') == id:
            del livros[indice]

    return jsonify(livros)

app.run(port=5000, host='localhost', debug=True)