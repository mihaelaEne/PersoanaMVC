import controller.PersoanaController;
import model.Persoana;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PersoanaControllerTest {
@Test
    public void testFindByCNP(){
    ArrayList<Persoana>persoane=new ArrayList();
    Persoana p1=new Persoana("nume1", 01,10,"adresa1", "tara1", "limba1");
    persoane.add(p1);
    Persoana p2=new Persoana("nume2", 02,20,"adresa2", "tara2", "limba2");
    persoane.add(p2);
    Persoana p3=new Persoana("nume3", 03,30,"adresa3", "tara3", "limba3");
    persoane.add(p3);
    Persoana p4=new Persoana("nume4", 04,40,"adresa4", "tara4", "limba4");
    persoane.add(p4);

    PersoanaController persoanaController=new PersoanaController(persoane);
    assertEquals("nume1", persoanaController.findByCNP(01).getNume());

}

@Test
public void testFindWithoutCNP(){
    ArrayList<Persoana>persoane=new ArrayList();
    Persoana p1=new Persoana("nume1", 01,10,"adresa1", "tara1", "limba1");
    persoane.add(p1);
    Persoana p2=new Persoana("nume2", 02,20,"adresa2", "tara2", "limba2");
    persoane.add(p2);
    Persoana p3=new Persoana("nume3", 03,30,"adresa3", "tara3", "limba3");
    persoane.add(p3);
    Persoana p4=new Persoana("nume4", 04,40,"adresa4", "tara4", "limba4");
    persoane.add(p4);

    PersoanaController persoanaController=new PersoanaController(persoane);
    assertNull(persoanaController.findByCNP(100));
}


@Test
    public void testFindByName(){
    ArrayList<Persoana>persoane=new ArrayList();
    Persoana p1=new Persoana("nume1", 01,10,"adresa1", "tara1", "limba1");
    persoane.add(p1);
    Persoana p2=new Persoana("nume2", 02,20,"adresa2", "tara2", "limba2");
    persoane.add(p2);
    Persoana p3=new Persoana("nume3", 03,30,"adresa3", "tara3", "limba3");
    persoane.add(p3);
    Persoana p4=new Persoana("nume4", 04,40,"adresa4", "tara4", "limba4");
    persoane.add(p4);
    PersoanaController persoanaController=new PersoanaController(persoane);
    assertEquals("nume1", persoanaController.findByNume("nume1").getNume());
}

    @Test
    public void testFindWithoutName(){
        ArrayList<Persoana>persoane=new ArrayList();
        Persoana p1=new Persoana("nume1", 01,10,"adresa1", "tara1", "limba1");
        persoane.add(p1);
        Persoana p2=new Persoana("nume2", 02,20,"adresa2", "tara2", "limba2");
        persoane.add(p2);
        Persoana p3=new Persoana("nume3", 03,30,"adresa3", "tara3", "limba3");
        persoane.add(p3);
        Persoana p4=new Persoana("nume4", 04,40,"adresa4", "tara4", "limba4");
        persoane.add(p4);

        PersoanaController persoanaController=new PersoanaController(persoane);
        assertNull(persoanaController.findByNume("ionel"));
    }

    @Test
    public void testUpdate(){
        ArrayList<Persoana>persoane=new ArrayList();
        Persoana p1=new Persoana("nume1", 01,10,"adresa1", "tara1", "limba1");
        persoane.add(p1);
        Persoana p2=new Persoana("nume2", 02,20,"adresa2", "tara2", "limba2");
        persoane.add(p2);
        Persoana p3=new Persoana("nume3", 03,30,"adresa3", "tara3", "limba3");
        persoane.add(p3);
        Persoana p4=new Persoana("nume4", 04,40,"adresa4", "tara4", "limba4");
        persoane.add(p4);

        PersoanaController persoanaController=new PersoanaController(persoane);
        Persoana pNou=new Persoana("numeNou", 01, 10,"adresaNoua","tara1", "limbaNoua");

        persoanaController.update(pNou);
        assertEquals("numeNou",persoanaController.findByCNP(01).getNume() );
        assertEquals("adresaNoua",persoanaController.findByCNP(01).getAdresa() );
        assertEquals("limbaNoua",persoanaController.findByCNP(01).getLimba() );

    }

    @Test
    public void testAdd(){
        ArrayList<Persoana>persoane=new ArrayList();
        Persoana p1=new Persoana("nume1", 01,10,"adresa1", "tara1", "limba1");
        persoane.add(p1);
        Persoana p2=new Persoana("nume2", 02,20,"adresa2", "tara2", "limba2");
        persoane.add(p2);
        Persoana p3=new Persoana("nume3", 03,30,"adresa3", "tara3", "limba3");
        persoane.add(p3);
        Persoana p4=new Persoana("nume4", 04,40,"adresa4", "tara4", "limba4");

        PersoanaController persoanaController=new PersoanaController(persoane);
      persoanaController.addPersoana(p4);
      assertNotNull(persoanaController.findByNume("nume4"));

    }

    @Test
    public void testRemove(){
        ArrayList<Persoana>persoane=new ArrayList();
        Persoana p1=new Persoana("nume1", 01,10,"adresa1", "tara1", "limba1");
        persoane.add(p1);
        Persoana p2=new Persoana("nume2", 02,20,"adresa2", "tara2", "limba2");
        persoane.add(p2);
        Persoana p3=new Persoana("nume3", 03,30,"adresa3", "tara3", "limba3");
        persoane.add(p3);
        Persoana p4=new Persoana("nume4", 04,40,"adresa4", "tara4", "limba4");
        persoane.add(p4);

        PersoanaController persoanaController=new PersoanaController(persoane);
        persoanaController.removePersoana(p4);
        assertEquals(null, persoanaController.findByCNP(04));
}



}

