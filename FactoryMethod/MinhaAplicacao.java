package FactoryMethod;

/**
* Esta classe concreta cont�m a implementa��o
* de uma aplica��o capaz de manipular documentos
* do tipo MeuDocumento.
*/
  class MinhaAplicacao extends Aplicacao {

 	/**
 	 * Uma implementa��o do Factory Method. Este m�todo �
 	 * especializado na cria��o de documentos do tipo MeuDocumento
 	 */
 	Documento criaDocumento() {
            return new MeuDocumento();
 	}
  }
