package com.csys.template.Entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSociete is a Querydsl query type for Societe
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSociete extends EntityPathBase<Societe> {

    private static final long serialVersionUID = 1977141862L;

    public static final QSociete societe = new QSociete("societe");

    public final NumberPath<Integer> codesoc = createNumber("codesoc", Integer.class);

    public final StringPath emailsociete = createString("emailsociete");

    public final ListPath<Employe, QEmploye> employes = this.<Employe, QEmploye>createList("employes", Employe.class, QEmploye.class, PathInits.DIRECT2);

    public final StringPath nomsociete = createString("nomsociete");

    public final StringPath notes = createString("notes");

    public final StringPath secteurActivite = createString("secteurActivite");

    public final NumberPath<Integer> telsociete = createNumber("telsociete", Integer.class);

    public QSociete(String variable) {
        super(Societe.class, forVariable(variable));
    }

    public QSociete(Path<? extends Societe> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSociete(PathMetadata metadata) {
        super(Societe.class, metadata);
    }

}

