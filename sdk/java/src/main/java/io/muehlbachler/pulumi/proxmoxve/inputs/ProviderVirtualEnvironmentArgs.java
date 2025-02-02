// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import io.muehlbachler.pulumi.proxmoxve.inputs.ProviderVirtualEnvironmentSshArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProviderVirtualEnvironmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProviderVirtualEnvironmentArgs Empty = new ProviderVirtualEnvironmentArgs();

    @Import(name="apiToken")
    private @Nullable Output<String> apiToken;

    public Optional<Output<String>> apiToken() {
        return Optional.ofNullable(this.apiToken);
    }

    @Import(name="endpoint")
    private @Nullable Output<String> endpoint;

    public Optional<Output<String>> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }

    @Import(name="insecure")
    private @Nullable Output<Boolean> insecure;

    public Optional<Output<Boolean>> insecure() {
        return Optional.ofNullable(this.insecure);
    }

    @Import(name="otp")
    private @Nullable Output<String> otp;

    public Optional<Output<String>> otp() {
        return Optional.ofNullable(this.otp);
    }

    @Import(name="password")
    private @Nullable Output<String> password;

    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    @Import(name="ssh")
    private @Nullable Output<ProviderVirtualEnvironmentSshArgs> ssh;

    public Optional<Output<ProviderVirtualEnvironmentSshArgs>> ssh() {
        return Optional.ofNullable(this.ssh);
    }

    @Import(name="username")
    private @Nullable Output<String> username;

    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    private ProviderVirtualEnvironmentArgs() {}

    private ProviderVirtualEnvironmentArgs(ProviderVirtualEnvironmentArgs $) {
        this.apiToken = $.apiToken;
        this.endpoint = $.endpoint;
        this.insecure = $.insecure;
        this.otp = $.otp;
        this.password = $.password;
        this.ssh = $.ssh;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProviderVirtualEnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProviderVirtualEnvironmentArgs $;

        public Builder() {
            $ = new ProviderVirtualEnvironmentArgs();
        }

        public Builder(ProviderVirtualEnvironmentArgs defaults) {
            $ = new ProviderVirtualEnvironmentArgs(Objects.requireNonNull(defaults));
        }

        public Builder apiToken(@Nullable Output<String> apiToken) {
            $.apiToken = apiToken;
            return this;
        }

        public Builder apiToken(String apiToken) {
            return apiToken(Output.of(apiToken));
        }

        public Builder endpoint(@Nullable Output<String> endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        public Builder endpoint(String endpoint) {
            return endpoint(Output.of(endpoint));
        }

        public Builder insecure(@Nullable Output<Boolean> insecure) {
            $.insecure = insecure;
            return this;
        }

        public Builder insecure(Boolean insecure) {
            return insecure(Output.of(insecure));
        }

        public Builder otp(@Nullable Output<String> otp) {
            $.otp = otp;
            return this;
        }

        public Builder otp(String otp) {
            return otp(Output.of(otp));
        }

        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        public Builder password(String password) {
            return password(Output.of(password));
        }

        public Builder ssh(@Nullable Output<ProviderVirtualEnvironmentSshArgs> ssh) {
            $.ssh = ssh;
            return this;
        }

        public Builder ssh(ProviderVirtualEnvironmentSshArgs ssh) {
            return ssh(Output.of(ssh));
        }

        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        public Builder username(String username) {
            return username(Output.of(username));
        }

        public ProviderVirtualEnvironmentArgs build() {
            return $;
        }
    }

}
