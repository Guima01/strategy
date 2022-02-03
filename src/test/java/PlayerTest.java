import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void deveRetornarDanoGolpeForte() {
        Player player = new Player();
        player.danoGolpeForte(30.0f, 20.0f);
        assertEquals(80.0f, player.getDano());
    }

    @Test
    void deveRetornarDanoGolpeRapido() {
        Player player = new Player();
        player.danoGolpeRapido(10.0f, 40.0f);
        assertEquals(90.0f, player.getDano());
    }

    @Test
    void deveRetornarDanoGolpeAereo() {
        Player player = new Player();
        player.danoGolpeAereo(25.0f, 15.0f);
        assertEquals(57.0f, player.getDano());
    }

    @Test
    void deveRetornarDanoGolpeGiratorio() {
        Player player = new Player();
        player.danoGolpeGiratorio(20.0f, 20.0f);
        assertEquals(60.0f, player.getDano());
    }

}