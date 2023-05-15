package com.csys.template.Entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEmploye is a Querydsl query type for Employe
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEmploye extends EntityPathBase<Employe> {

    private static final long serialVersionUID = -1903128471L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QEmploye employe = new QEmploye("employe");

    public final StringPath adresse = createString("adresse");

    public final DateTimePath<java.util.Date> dateNaissance = createDateTime("dateNaissance", java.util.Date.class);

    public final DateTimePath<java.util.Date> dateRecrutement = createDateTime("dateRecrutement", java.util.Date.class);

    public final StringPath delivree = createString("delivree");

    public final StringPath diplomes = createString("diplomes");

    public final StringPath matricule = createString("matricule");

    public final NumberPath<Integer> nAffectationCnss = createNumber("nAffectationCnss", Integer.class);

    public final NumberPath<Integer> nCin = createNumber("nCin", Integer.class);

    public final NumberPath<Integer> nDossier = createNumber("nDossier", Integer.class);

    public final StringPath niveauEtudes = createString("niveauEtudes");

    public final StringPath nom = createString("nom");

    public final StringPath prenom = createString("prenom");

    public final StringPath sexe = createString("sexe");

    public final StringPath situationFamille = createString("situationFamille");

    public final StringPath situationmilitaire = createString("situationmilitaire");

    protected QSociete societe;

    public final NumberPath<Integer> telephone = createNumber("telephone", Integer.class);

    public QEmploye(String variable) {
        this(Employe.class, forVariable(variable), INITS);
    }

    public QEmploye(Path<? extends Employe> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QEmploye(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QEmploye(PathMetadata metadata, PathInits inits) {
        this(Employe.class, metadata, inits);
    }

    public QEmploye(Class<? extends Employe> type, PathMetadata metadata, PathInits inits) {
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

