package me.coordi.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMailing is a Querydsl query type for Mailing
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMailing extends EntityPathBase<Mailing> {

    private static final long serialVersionUID = 1820571845L;

    public static final QMailing mailing = new QMailing("mailing");

    public final QBaseTimeEntity _super = new QBaseTimeEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath email = createString("email");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath ipAddress = createString("ipAddress");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedAt = _super.modifiedAt;

    public QMailing(String variable) {
        super(Mailing.class, forVariable(variable));
    }

    public QMailing(Path<? extends Mailing> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMailing(PathMetadata metadata) {
        super(Mailing.class, metadata);
    }

}

