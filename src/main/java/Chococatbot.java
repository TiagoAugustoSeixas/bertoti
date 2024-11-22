import et.telebof.BotClient;

public class Chococatbot {
    static final String TOKEN = "7275057125:AAF8txA-4TGXMPxF1i9pidiKapZ5coBUy7E";

    public static void main(String[] args) {
        final BotClient bot = new BotClient(TOKEN);

        // Listening for /start command
        bot.onMessage(filter -> filter.commands("start"), (context, message) -> {
            context.reply("Oiie").exec();
        });
        // Listening for /start command
        bot.onMessage(filter -> filter.commands("hw"), (context, message) -> {
            context.reply("Hello World!").exec();
        });

        // Listening for any text
        bot.onMessage(filter -> filter.text(), (context, message) -> {
            context.reply(message.text).exec();
        });

        bot.run(); // finally run the bot
    }
}