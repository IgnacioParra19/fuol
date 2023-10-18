import static org.junit.Assert.*;

import org.junit.Test;

import com.parcial.Equipo;
import com.parcial.Estadio;
import com.parcial.Partido;
import com.parcial.Torneo;

public class TorneoTest {
    @Test
    public void testCrearTorneo(){
        Torneo torneo = new Torneo("Libertadores");
        assertTrue(torneo.getNombre().equals("Libertadores"));
    }
        @Test
    public void torneo_agregar_equipos_parcial_ejercicio_ejemplo_01(){
        Torneo torneo = new Torneo("Copa Conmebol Libertadores");
        Equipo boca = new Equipo("Boca Juniors", "BOC");
        Equipo palmeiras = new Equipo("Palmeiras", "PAL");
        torneo.agregar(boca);
        torneo.agregar(palmeiras);
        assertEquals("Boca Juniors", boca.getNombre());
        assertEquals("BOC", boca.getAbreviatura());
        assertEquals("Palmeiras", palmeiras.getNombre());
        assertEquals("PAL", palmeiras.getAbreviatura());
        
        assertEquals(2, torneo.equiposCantidad());
    }
    @Test
    public void torneo_agregar_partidos_parcial_ejercicio_ejemplo_01()
    {
        Torneo torneo = new Torneo("Copa Conmebol Libertadores");
        Equipo boca = new Equipo("Boca Juniors", "BOC");
        Equipo palmeiras = new Equipo("Palmeiras", "PAL");
        Equipo internacional = new Equipo("Internacional", "INT");
        Equipo fluminense = new Equipo("Fluminense", "FLU");
        Estadio fluminenseEstadio = new Estadio("Maracaná", "Rio de Janeiro", "Brasil");
        Estadio palmeirasEstadio = new Estadio("Allianz Parque", "Sao Paulo", "Brasil");
        Estadio interEstadio = new Estadio("Beira-Rio", "Porto Alegre", "Brasil");
        Estadio estadioBombonera = new Estadio("La Bombonera", "Buenos Aires", "Argentina");
        torneo.agregar(boca);
        torneo.agregar(palmeiras);
        torneo.agregar(internacional);
        torneo.agregar(fluminense);
            
        Partido partido1Ida = new Partido(fluminenseEstadio,internacional, fluminense, "Semifinal Partido Ida INTxFLU");
        Partido partido1Vuelta = new Partido(interEstadio, fluminense, internacional, "Semifinal Partido Vuelta FLUxINT");
        Partido partido2Ida = new Partido(estadioBombonera, palmeiras, boca, "Semifinal Partido Ida PALxBOC");
        Partido partido2Vuelta = new Partido(palmeirasEstadio, boca, palmeiras, "Semifinal Partido Vuelta BOCxPAL");
        
        torneo.agregar(partido1Ida);
        torneo.agregar(partido2Vuelta);
        
        torneo.agregar(partido2Ida);
        torneo.agregar(partido2Vuelta);
        
        assertEquals(4, torneo.partidosCantidad());
        
        assertEquals("Semifinal Partido Ida INTxFLU", partido1Ida.getNombre());
        assertEquals("Semifinal Partido Vuelta FLUxINT", partido1Vuelta.getNombre());
        
        assertEquals("Semifinal Partido Ida PALxBOC", partido2Ida.getNombre());
        assertEquals("Semifinal Partido Vuelta BOCxPAL", partido2Vuelta.getNombre());
    }

}
