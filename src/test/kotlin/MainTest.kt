import org.junit.jupiter.api.*

class MainTest {

    @Test
    @DisplayName("Teste de IFELSE")
    fun testeifelse(){
        Assertions.assertTrue(ifelse(29))
    }

    @Test
    @DisplayName(" Testo método xxoo")
    fun testsCountxo(){
        //tue ou false
        // Assertions.assertFalse(countXO("xxoo"))
        //Assertions.assertTrue(countXO("xxoo"))

        // Uitlizando o assertAll consigo ignorar nos testes os valores que não passam
        Assertions.assertAll(
            {Assertions.assertTrue(countXO("xxoo"))},
            {Assertions.assertTrue(countXO("xxoO"))},

        )
    }

    @Test
    @Disabled
    @DisplayName("Falta implementar")
    fun naoImplementado(){

    }

    @Test
    fun vaiFalhar(){
        fail("Não posso termininar os testes sem esse método")
    }

    @Test
    fun abc(){
        Assumptions.assumeTrue(countXO("xxoo"))

    }

    @Test
    fun exception(){
       assertThrows<NullPointerException> { abcd() }
    }
}