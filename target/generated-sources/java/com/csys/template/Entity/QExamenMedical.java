package com.csys.template.Entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QExamenMedical is a Querydsl query type for ExamenMedical
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QExamenMedical extends EntityPathBase<ExamenMedical> {

    private static final long serialVersionUID = -1594556741L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QExamenMedical examenMedical = new QExamenMedical("examenMedical");

    public final StringPath conclusion = createString("conclusion");

    public final StringPath date = createString("date");

    protected QEmploye employe;

    public final NumberPath<Integer> idExamen = createNumber("idExamen", Integer.class);

    protected QMedecin medecin;

    public final StringPath Motif = createString("Motif");

    public final StringPath motif = createString("motif");

    protected QSecretaire secretaire;

    public QExamenMedical(String variable) {
        this(ExamenMedical.class, forVariable(variable), INITS);
    }

    public QExamenMedical(Path<? extends ExamenMedical> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QExamenMedical(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QExamenMedical(PathMetadata metadata, PathInits inits) {
        this(ExamenMedical.class, metadata, inits);
    }

    public QExamenMedical(Class<? extends ExamenMedical> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.employe = inits.isInitialized("employe") ? new QEmploye(forProperty("employe"), inits.get("employe")) : null;
        this.medecin = inits.isInitialized("medecin") ? new QMedecin(forProperty("medecin"), inits.get("medecin")) : null;
        this.secretaire = inits.isInitialized("secretaire") ? new QSecretaire(forProperty("secretaire"), inits.get("secretaire")) : null;
    }

    public QEmploye employe() {
        if (employe == null) {
            employe = new QEmploye(forProperty("employe"));
        }
        return employe;
    }

    public QMedecin medecin() {
        if (medecin == null) {
            medecin = new QMedecin(forProperty("medecin"));
        }
        return medecin;
    }

    public QSecretaire secretaire() {
        if (secretaire == null) {
            secretaire = new QSecretaire(forProperty("secretaire"));
        }
        return secretaire;
    }

}

