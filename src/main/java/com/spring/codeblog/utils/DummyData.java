package com.spring.codeblog.utils;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.CodeblogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class DummyData {

    @Autowired
    CodeblogRepository codeblogRepository;

    //@PostConstruct
    public void savePosts(){
        List<Post> postList = new ArrayList<>();
        Post post1=new Post();
        post1.setAutor("Pedro Santos");
        post1.setData(LocalDate.now());
        post1.setTitulo("Teste");
        post1.setTexto("Teste de texto no blog com spring boot");

        Post post2=new Post();
        post1.setAutor("Pedro H.");
        post1.setData(LocalDate.now());
        post1.setTitulo("Iniciando com PowerPlatform");
        post1.setTexto("Mais do que nunca, empresas têm abraçado o valor de usar dados para gerir os resultados de seus negócios. Elas adotaram a nuvem para armazenar grandes quantidades de dados e se tornarem mais eficientes em utilizar dados e sinais vindos de inúmeras fontes como tráfego web, redes sociais e sistemas de gestão empresarial como CRM ou ERP. Mas assim que elas implementaram essa infraestrutura para coletar e armazenar esse material, como podem trabalhá-lo de forma mais eficiente? As organizações precisam adicionar algo que permita que todos os funcionários, independentemente de suas habilidades técnicas, consigam fazer com que essas informações gerem um impacto empresarial.");


        postList.add(post1);
        postList.add(post2);

        for(Post post: postList){
            Post postSaved = codeblogRepository.save(post);
            System.out.println(postSaved.getId());
        }
    }
}
