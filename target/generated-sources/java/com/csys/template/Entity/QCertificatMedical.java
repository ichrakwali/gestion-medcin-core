package com.csys.template.Entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCertificatMedical is a Querydsl query type for CertificatMedical
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCertificatMedical extends EntityPathBase<CertificatMedical> {

    private static final long serialVersionUID = -475624587L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCertificatMedical certificatMedical = new QCertificatMedical("certificatMedical");

    public final StringPath dateExamen = createString("dateExamen");

    protected QEmploye employe;

    public final NumberPath<Integer> idcertificat = createNumber("idcertificat", Integer.class);

    public final StringPath natureActivite = createString("natureActivite");

    public final NumberPath<Integer> ncss = createNumber("ncss", Integer.class);

    public final StringPath RaisonSocial = createString("RaisonSocial");

    public final StringPath raisonSocial = createString("raisonSocial");

    public QCertificatMedical(String variable) {
        this(CertificatMedical.class, forVariable(variable), INITS);
    }

    public QCertificatMedical(Path<? extends CertificatMedical> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCertificatMedical(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCertificatMedical(PathMetadata metadata, PathInits inits) {
        this(CertificatMedical.class, metadata, inits);
    }

    public QCertificatMedical(Class<? extends CertificatMedical> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.employe = inits.isInitialized("employe") ? new QEmploye(forProperty("employe"), inits.get("employe")) : null;
    }

    public QEmploye employe() {
        if (employe == null) {
            employe = new QEmploye(forProperty("employe"));
        }
        return employe;
    }

}

