package AbstractFactory;

class MotifWidgetFactory extends WidgetFactory
{
    public Botao criarBotao()  {
        return new BotaoMotif();
    }
}
