package AbstractFactory;

abstract class WidgetFactory
{
    public static WidgetFactory obterFactory()
    {
        
        if( Configuracao.obterInterfaceGraficaAtual() == Configuracao.MotifWidget )
        {
            return new MotifWidgetFactory();
        }
        else
        {
            return new QtWidgetFactory();
        }
   }

   public abstract Botao criarBotao();
}
