package com.csys.template.Entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAction is a Querydsl query type for Action
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAction extends EntityPathBase<Action> {

    private static final long serialVersionUID = 92067876L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAction action = new QAction("action");

    protected QExamenMedical examenMedical;

    public final NumberPath<Integer> idaction = createNumber("idaction", Integer.class);

    public final StringPath resultat = createString("resultat");

    public final StringPath type = createString("type");

    public QAction(String variable) {
        this(Action.class, forVariable(variable), INITS);
    }

    public QAction(Path<? extends Action> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAction(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAction(PathMetadata metadata, PathInits inits) {
        this(Action.class, metadata, inits);
    }

    public QAction(Class<? extends Action> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.examenMedical = inits.isInitialized("examenMedical") ? new QExamenMedical(forProperty("examenMedical"), inits.get("examenMedical")) : null;
    }

    public QExamenMedical examenMedical() {
        if (examenMedical == null) {
            examenMedical = new QExamenMedical(forProperty("examenMedical"));
        }
        return examenMedical;
    }

}

