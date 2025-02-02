// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.Permission;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import io.muehlbachler.pulumi.proxmoxve.Permission.inputs.UserAclArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserArgs Empty = new UserArgs();

    /**
     * The access control list
     * 
     */
    @Import(name="acls")
    private @Nullable Output<List<UserAclArgs>> acls;

    /**
     * @return The access control list
     * 
     */
    public Optional<Output<List<UserAclArgs>>> acls() {
        return Optional.ofNullable(this.acls);
    }

    /**
     * The user comment
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return The user comment
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * The user&#39;s email address
     * 
     */
    @Import(name="email")
    private @Nullable Output<String> email;

    /**
     * @return The user&#39;s email address
     * 
     */
    public Optional<Output<String>> email() {
        return Optional.ofNullable(this.email);
    }

    /**
     * Whether the user account is enabled
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether the user account is enabled
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The user account&#39;s expiration date
     * 
     */
    @Import(name="expirationDate")
    private @Nullable Output<String> expirationDate;

    /**
     * @return The user account&#39;s expiration date
     * 
     */
    public Optional<Output<String>> expirationDate() {
        return Optional.ofNullable(this.expirationDate);
    }

    /**
     * The user&#39;s first name
     * 
     */
    @Import(name="firstName")
    private @Nullable Output<String> firstName;

    /**
     * @return The user&#39;s first name
     * 
     */
    public Optional<Output<String>> firstName() {
        return Optional.ofNullable(this.firstName);
    }

    /**
     * The user&#39;s groups
     * 
     */
    @Import(name="groups")
    private @Nullable Output<List<String>> groups;

    /**
     * @return The user&#39;s groups
     * 
     */
    public Optional<Output<List<String>>> groups() {
        return Optional.ofNullable(this.groups);
    }

    /**
     * The user&#39;s keys
     * 
     */
    @Import(name="keys")
    private @Nullable Output<String> keys;

    /**
     * @return The user&#39;s keys
     * 
     */
    public Optional<Output<String>> keys() {
        return Optional.ofNullable(this.keys);
    }

    /**
     * The user&#39;s last name
     * 
     */
    @Import(name="lastName")
    private @Nullable Output<String> lastName;

    /**
     * @return The user&#39;s last name
     * 
     */
    public Optional<Output<String>> lastName() {
        return Optional.ofNullable(this.lastName);
    }

    /**
     * The user&#39;s password
     * 
     */
    @Import(name="password", required=true)
    private Output<String> password;

    /**
     * @return The user&#39;s password
     * 
     */
    public Output<String> password() {
        return this.password;
    }

    /**
     * The user id
     * 
     */
    @Import(name="userId", required=true)
    private Output<String> userId;

    /**
     * @return The user id
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }

    private UserArgs() {}

    private UserArgs(UserArgs $) {
        this.acls = $.acls;
        this.comment = $.comment;
        this.email = $.email;
        this.enabled = $.enabled;
        this.expirationDate = $.expirationDate;
        this.firstName = $.firstName;
        this.groups = $.groups;
        this.keys = $.keys;
        this.lastName = $.lastName;
        this.password = $.password;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserArgs $;

        public Builder() {
            $ = new UserArgs();
        }

        public Builder(UserArgs defaults) {
            $ = new UserArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param acls The access control list
         * 
         * @return builder
         * 
         */
        public Builder acls(@Nullable Output<List<UserAclArgs>> acls) {
            $.acls = acls;
            return this;
        }

        /**
         * @param acls The access control list
         * 
         * @return builder
         * 
         */
        public Builder acls(List<UserAclArgs> acls) {
            return acls(Output.of(acls));
        }

        /**
         * @param acls The access control list
         * 
         * @return builder
         * 
         */
        public Builder acls(UserAclArgs... acls) {
            return acls(List.of(acls));
        }

        /**
         * @param comment The user comment
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment The user comment
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param email The user&#39;s email address
         * 
         * @return builder
         * 
         */
        public Builder email(@Nullable Output<String> email) {
            $.email = email;
            return this;
        }

        /**
         * @param email The user&#39;s email address
         * 
         * @return builder
         * 
         */
        public Builder email(String email) {
            return email(Output.of(email));
        }

        /**
         * @param enabled Whether the user account is enabled
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether the user account is enabled
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param expirationDate The user account&#39;s expiration date
         * 
         * @return builder
         * 
         */
        public Builder expirationDate(@Nullable Output<String> expirationDate) {
            $.expirationDate = expirationDate;
            return this;
        }

        /**
         * @param expirationDate The user account&#39;s expiration date
         * 
         * @return builder
         * 
         */
        public Builder expirationDate(String expirationDate) {
            return expirationDate(Output.of(expirationDate));
        }

        /**
         * @param firstName The user&#39;s first name
         * 
         * @return builder
         * 
         */
        public Builder firstName(@Nullable Output<String> firstName) {
            $.firstName = firstName;
            return this;
        }

        /**
         * @param firstName The user&#39;s first name
         * 
         * @return builder
         * 
         */
        public Builder firstName(String firstName) {
            return firstName(Output.of(firstName));
        }

        /**
         * @param groups The user&#39;s groups
         * 
         * @return builder
         * 
         */
        public Builder groups(@Nullable Output<List<String>> groups) {
            $.groups = groups;
            return this;
        }

        /**
         * @param groups The user&#39;s groups
         * 
         * @return builder
         * 
         */
        public Builder groups(List<String> groups) {
            return groups(Output.of(groups));
        }

        /**
         * @param groups The user&#39;s groups
         * 
         * @return builder
         * 
         */
        public Builder groups(String... groups) {
            return groups(List.of(groups));
        }

        /**
         * @param keys The user&#39;s keys
         * 
         * @return builder
         * 
         */
        public Builder keys(@Nullable Output<String> keys) {
            $.keys = keys;
            return this;
        }

        /**
         * @param keys The user&#39;s keys
         * 
         * @return builder
         * 
         */
        public Builder keys(String keys) {
            return keys(Output.of(keys));
        }

        /**
         * @param lastName The user&#39;s last name
         * 
         * @return builder
         * 
         */
        public Builder lastName(@Nullable Output<String> lastName) {
            $.lastName = lastName;
            return this;
        }

        /**
         * @param lastName The user&#39;s last name
         * 
         * @return builder
         * 
         */
        public Builder lastName(String lastName) {
            return lastName(Output.of(lastName));
        }

        /**
         * @param password The user&#39;s password
         * 
         * @return builder
         * 
         */
        public Builder password(Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The user&#39;s password
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param userId The user id
         * 
         * @return builder
         * 
         */
        public Builder userId(Output<String> userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userId The user id
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        public UserArgs build() {
            $.password = Objects.requireNonNull($.password, "expected parameter 'password' to be non-null");
            $.userId = Objects.requireNonNull($.userId, "expected parameter 'userId' to be non-null");
            return $;
        }
    }

}
