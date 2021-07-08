package me.coordi.domain.user;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUser is a Querydsl query type for User
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUser extends EntityPathBase<User> {

    private static final long serialVersionUID = 106476488L;

    public static final QUser user = new QUser("user");

    public final me.coordi.domain.QBaseTimeEntity _super = new me.coordi.domain.QBaseTimeEntity(this);

    public final EnumPath<AuthClient> authClient = createEnum("authClient", AuthClient.class);

    public final StringPath authUid = createString("authUid");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath email = createString("email");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath imageUrl = createString("imageUrl");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedAt = _super.modifiedAt;

    public final StringPath name = createString("name");

    public final EnumPath<me.coordi.domain.Role> role = createEnum("role", me.coordi.domain.Role.class);

    public final ListPath<me.coordi.domain.ticket.Ticket, me.coordi.domain.ticket.QTicket> tickets = this.<me.coordi.domain.ticket.Ticket, me.coordi.domain.ticket.QTicket>createList("tickets", me.coordi.domain.ticket.Ticket.class, me.coordi.domain.ticket.QTicket.class, PathInits.DIRECT2);

    public QUser(String variable) {
        super(User.class, forVariable(variable));
    }

    public QUser(Path<? extends User> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUser(PathMetadata metadata) {
        super(User.class, metadata);
    }

}

