package me.coordi.domain.user;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QUserDelete is a Querydsl query type for UserDelete
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUserDelete extends EntityPathBase<UserDelete> {

    private static final long serialVersionUID = -1385156717L;

    public static final QUserDelete userDelete = new QUserDelete("userDelete");

    public final me.coordi.domain.QBaseTimeEntity _super = new me.coordi.domain.QBaseTimeEntity(this);

    public final EnumPath<AuthClient> authClient = createEnum("authClient", AuthClient.class);

    public final StringPath authUid = createString("authUid");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath email = createString("email");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath message = createString("message");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedAt = _super.modifiedAt;

    public final StringPath name = createString("name");

    public final StringPath reasons = createString("reasons");

    public QUserDelete(String variable) {
        super(UserDelete.class, forVariable(variable));
    }

    public QUserDelete(Path<? extends UserDelete> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUserDelete(PathMetadata metadata) {
        super(UserDelete.class, metadata);
    }

}

