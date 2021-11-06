package indg.com.cover2protect.model.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u0004\u0018\u00010\u0004J\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\r\u0010\f\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\rR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\t\u00a8\u0006\u0010"}, d2 = {"Lindg/com/cover2protect/model/login/LoginResponse;", "Ljava/io/Serializable;", "()V", "data", "Lindg/com/cover2protect/model/login/LoginResponse$Datas;", "message", "", "success", "", "Ljava/lang/Boolean;", "getData", "getMessage", "getStatus", "()Ljava/lang/Boolean;", "Datas", "User", "app_DevDebug"})
public final class LoginResponse implements java.io.Serializable {
    private java.lang.Boolean success;
    private java.lang.String message;
    private indg.com.cover2protect.model.login.LoginResponse.Datas data;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final indg.com.cover2protect.model.login.LoginResponse.Datas getData() {
        return null;
    }
    
    public LoginResponse() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\r\u0010\n\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u0004\u0018\u00010\u0007J\b\u0010\r\u001a\u0004\u0018\u00010\tR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lindg/com/cover2protect/model/login/LoginResponse$Datas;", "", "()V", "showProfile", "", "Ljava/lang/Boolean;", "token", "", "user", "Lindg/com/cover2protect/model/login/LoginResponse$User;", "getShowProfile", "()Ljava/lang/Boolean;", "getToken", "getUser", "app_DevDebug"})
    public static final class Datas {
        private java.lang.String token;
        private indg.com.cover2protect.model.login.LoginResponse.User user;
        private java.lang.Boolean showProfile;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getToken() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final indg.com.cover2protect.model.login.LoginResponse.User getUser() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getShowProfile() {
            return null;
        }
        
        public Datas() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004J\b\u0010\b\u001a\u0004\u0018\u00010\u0004J\b\u0010\t\u001a\u0004\u0018\u00010\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lindg/com/cover2protect/model/login/LoginResponse$User;", "", "()V", "email", "", "mobile_no", "name", "getEmail", "getMobileNumber", "getName", "app_DevDebug"})
    public static final class User {
        private java.lang.String name;
        private java.lang.String email;
        private java.lang.String mobile_no;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getName() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getEmail() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getMobileNumber() {
            return null;
        }
        
        public User() {
            super();
        }
    }
}