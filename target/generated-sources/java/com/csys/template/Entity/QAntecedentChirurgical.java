package com.csys.template.Entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAntecedentChirurgical is a Querydsl query type for AntecedentChirurgical
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAntecedentChirurgical extends EntityPathBase<AntecedentChirurgical> {

    private static final long serialVersionUID = 922293932L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAntecedentChirurgical antecedentChirurgical = new QAntecedentChirurgical("antecedentChirurgical");

    public final DateTimePath<java.util.Date> date = createDateTime("date", java.util.Date.class);

    public final StringPath description = createString("description");

    protected QEmploye employe;

    public final NumberPath<Long> idch = createNumber("idch", Long.class);

    public final StringPath nomclinique = createString("nomclinique");

    public QAntecedentChirurgical(String variable) {
        this(AntecedentChirurgical.class, forVariable(variable), INITS);
    }

    public QAntecedentChirurgical(Path<? extends AntecedentChirurgical> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAntecedentChirurgical(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAntecedentChirurgical(PathMetadata metadata, PathInits inits) {
        this(AntecedentChirurgical.class, metadata, inits);
    }

    public QAntecedentChirurgical(Class<? extends AntecedentChirurgical> type, PathMetadata metadata, PathInits inits) {
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

