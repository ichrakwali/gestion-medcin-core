package com.csys.template.Entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAccidentTravail is a Querydsl query type for AccidentTravail
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAccidentTravail extends EntityPathBase<AccidentTravail> {

    private static final long serialVersionUID = -809505292L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAccidentTravail accidentTravail = new QAccidentTravail("accidentTravail");

    public final StringPath cause = createString("cause");

    public final DateTimePath<java.util.Date> date = createDateTime("date", java.util.Date.class);

    public final DateTimePath<java.util.Date> dureeArret = createDateTime("dureeArret", java.util.Date.class);

    protected QEmploye employe;

    public final NumberPath<Long> idAcc = createNumber("idAcc", Long.class);

    public final NumberPath<Integer> ipp = createNumber("ipp", Integer.class);

    public final StringPath naturelLesion = createString("naturelLesion");

    public final StringPath siegeLesion = createString("siegeLesion");

    public QAccidentTravail(String variable) {
        this(AccidentTravail.class, forVariable(variable), INITS);
    }

    public QAccidentTravail(Path<? extends AccidentTravail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAccidentTravail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAccidentTravail(PathMetadata metadata, PathInits inits) {
        this(AccidentTravail.class, metadata, inits);
    }

    public QAccidentTravail(Class<? extends AccidentTravail> type, PathMetadata metadata, PathInits inits) {
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

