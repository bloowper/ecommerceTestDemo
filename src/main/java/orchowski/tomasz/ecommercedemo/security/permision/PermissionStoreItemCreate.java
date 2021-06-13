package orchowski.tomasz.ecommercedemo.security.permision;

import org.springframework.security.access.prepost.PreAuthorize;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@PreAuthorize("hasAuthority('store.item.create')")
public @interface PermissionStoreItemCreate {
}
