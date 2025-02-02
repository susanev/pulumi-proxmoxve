// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.config.inputs;

import com.pulumi.core.annotations.CustomType;
import io.muehlbachler.pulumi.proxmoxve.config.outputs.VirtualEnvironmentSsh;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualEnvironment {
    private @Nullable String apiToken;
    private @Nullable String endpoint;
    private @Nullable Boolean insecure;
    private @Nullable String otp;
    private @Nullable String password;
    private @Nullable VirtualEnvironmentSsh ssh;
    private @Nullable String username;

    private VirtualEnvironment() {}
    public Optional<String> apiToken() {
        return Optional.ofNullable(this.apiToken);
    }
    public Optional<String> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }
    public Optional<Boolean> insecure() {
        return Optional.ofNullable(this.insecure);
    }
    public Optional<String> otp() {
        return Optional.ofNullable(this.otp);
    }
    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }
    public Optional<VirtualEnvironmentSsh> ssh() {
        return Optional.ofNullable(this.ssh);
    }
    public Optional<String> username() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualEnvironment defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String apiToken;
        private @Nullable String endpoint;
        private @Nullable Boolean insecure;
        private @Nullable String otp;
        private @Nullable String password;
        private @Nullable VirtualEnvironmentSsh ssh;
        private @Nullable String username;
        public Builder() {}
        public Builder(VirtualEnvironment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiToken = defaults.apiToken;
    	      this.endpoint = defaults.endpoint;
    	      this.insecure = defaults.insecure;
    	      this.otp = defaults.otp;
    	      this.password = defaults.password;
    	      this.ssh = defaults.ssh;
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder apiToken(@Nullable String apiToken) {
            this.apiToken = apiToken;
            return this;
        }
        @CustomType.Setter
        public Builder endpoint(@Nullable String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        @CustomType.Setter
        public Builder insecure(@Nullable Boolean insecure) {
            this.insecure = insecure;
            return this;
        }
        @CustomType.Setter
        public Builder otp(@Nullable String otp) {
            this.otp = otp;
            return this;
        }
        @CustomType.Setter
        public Builder password(@Nullable String password) {
            this.password = password;
            return this;
        }
        @CustomType.Setter
        public Builder ssh(@Nullable VirtualEnvironmentSsh ssh) {
            this.ssh = ssh;
            return this;
        }
        @CustomType.Setter
        public Builder username(@Nullable String username) {
            this.username = username;
            return this;
        }
        public VirtualEnvironment build() {
            final var o = new VirtualEnvironment();
            o.apiToken = apiToken;
            o.endpoint = endpoint;
            o.insecure = insecure;
            o.otp = otp;
            o.password = password;
            o.ssh = ssh;
            o.username = username;
            return o;
        }
    }
}
