package me.coordi.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QCoordinator is a Querydsl query type for Coordinator
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCoordinator extends EntityPathBase<Coordinator> {

    private static final long serialVersionUID = 37733418L;

    public static final QCoordinator coordinator = new QCoordinator("coordinator");

    public final QBaseTimeEntity _super = new QBaseTimeEntity(this);

    public final StringPath careers = createString("careers");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedAt = _super.modifiedAt;

    public final StringPath name = createString("name");

    public final StringPath profileImage = createString("profileImage");

    public final StringPath tags = createString("tags");

    public final StringPath title = createString("title");

    public QCoordinator(String variable) {
        super(Coordinator.class, forVariable(variable));
    }

    public QCoordinator(Path<? extends Coordinator> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCoordinator(PathMetadata metadata) {
        super(Coordinator.class, metadata);
    }

}

