public class ProfessorTest {
    
    @Test
    public void testGetNome() {
        Professor professor = new Professor("Ely", "P.O.O.");
        assertEquals("Ely", professor.getNome());
    }
    
    @Test
    public void testGetMateria() {
        Professor professor = new Professor("Ricardo", "S.O.");
        assertEquals("S.O.", professor.getMateria());
    }
    
    @Test
    public void testAdicionarAluno() {
        Professor professor = new Professor("Carlos", "História");
        Aluno aluno = new Aluno("Ana", 1234);
        
        professor.adicionarAluno(aluno);
        assertTrue(professor.alunos.contains(aluno));
    }
    
    @Test
    public void testExcluirAluno() {
        Professor professor = new Professor("Fernanda", "Biologia");
        Aluno aluno = new Aluno("Pedro", 4561);
        
        professor.adicionarAluno(aluno);
        professor.excluirAluno(aluno);
        assertFalse(professor.alunos.contains(aluno));
    }
}