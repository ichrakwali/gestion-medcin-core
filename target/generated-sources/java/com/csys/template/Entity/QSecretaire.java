package com.csys.template.Entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSecretaire is a Querydsl query type for Secretaire
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSecretaire extends EntityPathBase<Secretaire> {

    private static final long serialVersionUID = 143972857L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSecretaire secretaire = new QSecretaire("secretaire");

    public final StringPath adresseEmailsec = createString("adresseEmailsec");

    public final NumberPath<Integer> ncin = createNumber("ncin", Integer.class);

    public final StringPath nomsec = createString("nomsec");

    public final StringPath prenomsec = createString("prenomsec");

    protected QSociete societe;

    public final NumberPath<Integer> telsec = createNumber("telsec", Integer.class);

    public QSecretaire(String variable) {
        this(Secretaire.class, forVariable(variable), INITS);
    }

    public QSecretaire(Path<? extends Secretaire> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSecretaire(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSecretaire(PathMetadata metadata, PathInits inits) {
        this(Secretaire.class, metadata, inits);
    }

    public QSecretaire(Class<? extends Secretaire> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.societe = inits.isInitialized("societe") ? new QSociete(forProperty("societe")) : null;
    }

    public QSociete societe() {
        if (societe == null) {
            societe = new QSociete(forProperty("societe"));
        }
        return societe;
    }

}

