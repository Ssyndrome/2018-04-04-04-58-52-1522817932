package practice1;

import com.google.common.collect.ImmutableList;

public class Security {

    private SecurityChecker securityChecker;

    public Security(SecurityChecker checker) {
        this.securityChecker = checker;
    }

    public boolean hasAccess(User user, Permission permission, ImmutableList<Permission> permissions) {
//
//        boolean isAccess = false;
////        if (user == null || permission == null || permissions.size() == 0) {
////            return isAccess;
////        }
//
//        if (securityChecker.isAdmin() || securityChecker.checkPermission(user, permission) || permissions.contains(permission)) {
//            isAccess = true;
//        }
        return securityChecker.isAdmin() || securityChecker.checkPermission(user, permission) || permissions.contains(permission);
    }
}
