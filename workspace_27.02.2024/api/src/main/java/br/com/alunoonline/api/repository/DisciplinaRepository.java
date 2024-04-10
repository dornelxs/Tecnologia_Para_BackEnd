package br.com.alunoonline.api.repository;

import br.com.alunoonline.api.model.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseStatus;

@Repository
public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {
}
