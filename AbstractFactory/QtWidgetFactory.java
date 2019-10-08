package AbstractFactory;

class QtWidgetFactory extends WidgetFactory
{
    public Botao criarBotao()  {
        return new BotaoQt();
    }
 }