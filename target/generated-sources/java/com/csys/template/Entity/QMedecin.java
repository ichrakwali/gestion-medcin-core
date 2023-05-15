package com.csys.template.Entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMedecin is a Querydsl query type for Medecin
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMedecin extends EntityPathBase<Medecin> {

    private static final long serialVersionUID = 661597665L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMedecin medecin = new QMedecin("medecin");

<<<<<<< HEAD
    public final StringPath adresse = createString("adresse");

    public final NumberPath<Integer> codemed = createNumber("codemed", Integer.class);

    public final StringPath emailmed = createString("emailmed");

    public final StringPath emplacement = createString("emplacement");

=======
    public final StringPath adresseEmailmed = createString("adresseEmailmed");

    public final NumberPath<Integer> codemed = createNumber("codemed", Integer.class);

>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d
    public final StringPath nommed = createString("nommed");

    public final StringPath prenommed = createString("prenommed");

    protected QSociete societe;

    public final NumberPath<Integer> telmed = createNumber("telmed", Integer.class);

    public QMedecin(String variable) {
        this(Medecin.class, forVariable(variable), INITS);
    }

    public QMedecin(Path<? extends Medecin> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMedecin(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMedecin(PathMetadata metadata, PathInits inits) {
        this(Medecin.class, metadata, inits);
    }

    public QMedecin(Class<? extends Medecin> type, PathMetadata metadata, PathInits inits) {
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

