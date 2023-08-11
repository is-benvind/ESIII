public class AlunoTest {
    
    @Test
    public void testGetNome() {
        Aluno aluno = new Aluno("Israel", 0441);
        assertEquals("Israel", aluno.getNome());
    }
    
    @Test
    public void testGetMatricula() {
        Aluno aluno = new Aluno("Francisco", 8231);
        assertEquals(8231, aluno.getMatricula());
    }
}