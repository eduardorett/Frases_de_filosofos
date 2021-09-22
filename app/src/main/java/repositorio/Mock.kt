package repositorio

import Ifra.Motivationconstants
import java.util.*
import kotlin.random.Random as Random1

data class  Phrase (val descripition:String, val category:Int)


fun Int.random(): Int {
    return Random().nextInt(this)
}

class Mock {



    private val ALL = Motivationconstants.FRASEFILTER.ALL
    private val NIETCHZE = Motivationconstants.FRASEFILTER.NIETCHZE
    private val PLATAO = Motivationconstants.FRASEFILTER.PLATAO
    private val MONTAIGNE = Motivationconstants.FRASEFILTER.MONTAIGNE
    private val SPINOZA = Motivationconstants.FRASEFILTER.SPINOZA

    private val mListPhrases: List<Phrase> = listOf(
        Phrase("As convicções são inimigas mais perigosas da verdade do que as mentiras.\n"+
"\n"+
                "Friedrich Nietzsche", NIETCHZE),
        Phrase(" A vantagem de ter péssima memória é divertir-se muitas vezes com as mesmas coisas boas como se fosse a primeira vez.\n" +
                "\n" +
                "Friedrich Nietzsche", NIETCHZE),
        Phrase("Certos pavões escondem de todos os olhos a sua cauda - chamando a isso o seu orgulho.\n" +
                "\n" +
                "Friedrich Nietzsche", NIETCHZE),
        Phrase("Logo que, numa inovação, nos mostram alguma coisa de antigo, ficamos sossegados.\n" +
                "\n" +
                "Friedrich Nietzsche", NIETCHZE),
        Phrase("A vontade de superar um afeto não é, em última análise, senão vontade de um outro ou de vários outros afetos.\n" +
                "\n" +
                "Friedrich Nietzsche", NIETCHZE),
        Phrase("Temos a arte para não morrer da verdade.\n" +
                "\n" +
                "Friedrich Nietzsche", NIETCHZE),
        Phrase("De todos os animais selvagens, o homem jovem é o mais difícil de domar.\n" +
                "\n" +
                "Platão", PLATAO),
        Phrase("Deve-se temer a velhice, porque ela nunca vem só. Bengalas são provas de idade e não de prudência.\n" +
                "\n" +
                "Platão", PLATAO),
        Phrase("Tente mover o mundo – o primeiro passo será mover a si mesmo.\n" +
                "\n" +
                "Platão",PLATAO),
        Phrase("São muitos os que usam a régua, mas poucos os inspirados.\n" +
                "\n" +
                "Platão", PLATAO),
        Phrase("Não há ninguém, mesmo sem cultura, que não se torne poeta quando o amor toma conta dele.\n" +
                "\n" +
                "Platão", PLATAO),
        Phrase("Muitos odeiam a tirania apenas para que possam estabelecer a sua.\n" +
                "\n" +
                "Platão", PLATAO),
        Phrase("Os homens não desejam aquilo que fazem, mas os objetivos que os levam a fazer aquilo que fazem.\n" +
                "\n" +
                "Platão", PLATAO),
        Phrase("Proibir algo é despertar o desejo.\n"+
            "\n"+
                "Michel de Montaigne ", MONTAIGNE),
    Phrase("A felicidade está em usufruir e não apenas em possuir.\n" +
            "\n" +
            "Michel de Montaigne ", MONTAIGNE),
    Phrase("Os hábitos são a vitória do tempo sobre a vontade.\n" +
            "\n" +
            "Michel de Montaigne", MONTAIGNE),
    Phrase("Aquele que castiga quando está irritado, não corrige, vinga-se.\n" +
            "\n" +
            "Michel de Montaigne", MONTAIGNE),
    Phrase("A mais honrosa das ocupações é servir o público e ser útil ao maior número de pessoas.\n" +
            "\n" +
            "Michel de Montaigne", MONTAIGNE),
    Phrase("Odeio esse acidental arrependimento que vem com a idade.\n" +
            "\n" +
            "Michel de Montaigne", MONTAIGNE),
    Phrase("Odeio esse acidental arrependimento que vem com a idade.\n" +
            "\n" +
            "Michel de Montaigne", SPINOZA),
    Phrase("Deus é a própia Natureza.\n" +
            "\n" +
            "Baruch Spinoza", SPINOZA),
    Phrase("Tenho esforçado a não rir das acções humanas, nem odiá-las, nem chorar por elas, mais sim compreende-las.\n" +
            "\n" +
            "Baruch Spinoza",SPINOZA),
    Phrase("Não Chore. Não se revolte, Compreenda.\n" +
            "\n" +
            "Baruch Spinoza", SPINOZA),
    Phrase("Se a mente do homem fosse tão controlada quanto a sua lingua, todo rei estaria seguro em seu trono.\n" +
            "\n" +
            "Baruch Spinoza", SPINOZA),
    Phrase("SA mente humana é parte do intelecto infinito de Deus.\n" +
            "\n" +
            "Baruch Spinoza", SPINOZA),
    Phrase("Nós não desejamos as coisas porque elas nos dão prazer, mas elas nos dão prazer porque as desejamos.\n" +
            "\n" +
            "Baruch Spinoza", SPINOZA)
    )

    /**
     * Obtém frase aleatória de acordo com o filtro
     * */

    fun getPhrase(value: Int): String {

        val filtered = mListPhrases.filter { (it.category == value || value == ALL) }

        // Número aleatório de 0 ao tamanho da lista retornada do filtro
        val rand = (filtered.size).random()

        // Retorna string
        return filtered[rand].descripition

}
}