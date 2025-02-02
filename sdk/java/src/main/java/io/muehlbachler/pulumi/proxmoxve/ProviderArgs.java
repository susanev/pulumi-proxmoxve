// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import io.muehlbachler.pulumi.proxmoxve.inputs.ProviderSshArgs;
import io.muehlbachler.pulumi.proxmoxve.inputs.ProviderVirtualEnvironmentArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProviderArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProviderArgs Empty = new ProviderArgs();

    /**
     * The API token for the Proxmox Virtual Environment API
     * 
     */
    @Import(name="apiToken")
    private @Nullable Output<String> apiToken;

    /**
     * @return The API token for the Proxmox Virtual Environment API
     * 
     */
    public Optional<Output<String>> apiToken() {
        return Optional.ofNullable(this.apiToken);
    }

    /**
     * The endpoint for the Proxmox Virtual Environment API
     * 
     */
    @Import(name="endpoint")
    private @Nullable Output<String> endpoint;

    /**
     * @return The endpoint for the Proxmox Virtual Environment API
     * 
     */
    public Optional<Output<String>> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }

    /**
     * Whether to skip the TLS verification step
     * 
     */
    @Import(name="insecure", json=true)
    private @Nullable Output<Boolean> insecure;

    /**
     * @return Whether to skip the TLS verification step
     * 
     */
    public Optional<Output<Boolean>> insecure() {
        return Optional.ofNullable(this.insecure);
    }

    /**
     * The one-time password for the Proxmox Virtual Environment API
     * 
     */
    @Import(name="otp")
    private @Nullable Output<String> otp;

    /**
     * @return The one-time password for the Proxmox Virtual Environment API
     * 
     */
    public Optional<Output<String>> otp() {
        return Optional.ofNullable(this.otp);
    }

    /**
     * The password for the Proxmox Virtual Environment API
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return The password for the Proxmox Virtual Environment API
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The SSH connection configuration to a Proxmox node
     * 
     */
    @Import(name="ssh", json=true)
    private @Nullable Output<ProviderSshArgs> ssh;

    /**
     * @return The SSH connection configuration to a Proxmox node
     * 
     */
    public Optional<Output<ProviderSshArgs>> ssh() {
        return Optional.ofNullable(this.ssh);
    }

    /**
     * The username for the Proxmox Virtual Environment API
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return The username for the Proxmox Virtual Environment API
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    /**
     * @deprecated
     * Move attributes out of virtual_environment block
     * 
     */
    @Deprecated /* Move attributes out of virtual_environment block */
    @Import(name="virtualEnvironment", json=true)
    private @Nullable Output<ProviderVirtualEnvironmentArgs> virtualEnvironment;

    /**
     * @deprecated
     * Move attributes out of virtual_environment block
     * 
     */
    @Deprecated /* Move attributes out of virtual_environment block */
    public Optional<Output<ProviderVirtualEnvironmentArgs>> virtualEnvironment() {
        return Optional.ofNullable(this.virtualEnvironment);
    }

    private ProviderArgs() {}

    private ProviderArgs(ProviderArgs $) {
        this.apiToken = $.apiToken;
        this.endpoint = $.endpoint;
        this.insecure = $.insecure;
        this.otp = $.otp;
        this.password = $.password;
        this.ssh = $.ssh;
        this.username = $.username;
        this.virtualEnvironment = $.virtualEnvironment;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProviderArgs $;

        public Builder() {
            $ = new ProviderArgs();
        }

        public Builder(ProviderArgs defaults) {
            $ = new ProviderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiToken The API token for the Proxmox Virtual Environment API
         * 
         * @return builder
         * 
         */
        public Builder apiToken(@Nullable Output<String> apiToken) {
            $.apiToken = apiToken;
            return this;
        }

        /**
         * @param apiToken The API token for the Proxmox Virtual Environment API
         * 
         * @return builder
         * 
         */
        public Builder apiToken(String apiToken) {
            return apiToken(Output.of(apiToken));
        }

        /**
         * @param endpoint The endpoint for the Proxmox Virtual Environment API
         * 
         * @return builder
         * 
         */
        public Builder endpoint(@Nullable Output<String> endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        /**
         * @param endpoint The endpoint for the Proxmox Virtual Environment API
         * 
         * @return builder
         * 
         */
        public Builder endpoint(String endpoint) {
            return endpoint(Output.of(endpoint));
        }

        /**
         * @param insecure Whether to skip the TLS verification step
         * 
         * @return builder
         * 
         */
        public Builder insecure(@Nullable Output<Boolean> insecure) {
            $.insecure = insecure;
            return this;
        }

        /**
         * @param insecure Whether to skip the TLS verification step
         * 
         * @return builder
         * 
         */
        public Builder insecure(Boolean insecure) {
            return insecure(Output.of(insecure));
        }

        /**
         * @param otp The one-time password for the Proxmox Virtual Environment API
         * 
         * @return builder
         * 
         */
        public Builder otp(@Nullable Output<String> otp) {
            $.otp = otp;
            return this;
        }

        /**
         * @param otp The one-time password for the Proxmox Virtual Environment API
         * 
         * @return builder
         * 
         */
        public Builder otp(String otp) {
            return otp(Output.of(otp));
        }

        /**
         * @param password The password for the Proxmox Virtual Environment API
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The password for the Proxmox Virtual Environment API
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param ssh The SSH connection configuration to a Proxmox node
         * 
         * @return builder
         * 
         */
        public Builder ssh(@Nullable Output<ProviderSshArgs> ssh) {
            $.ssh = ssh;
            return this;
        }

        /**
         * @param ssh The SSH connection configuration to a Proxmox node
         * 
         * @return builder
         * 
         */
        public Builder ssh(ProviderSshArgs ssh) {
            return ssh(Output.of(ssh));
        }

        /**
         * @param username The username for the Proxmox Virtual Environment API
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username The username for the Proxmox Virtual Environment API
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Move attributes out of virtual_environment block
         * 
         */
        @Deprecated /* Move attributes out of virtual_environment block */
        public Builder virtualEnvironment(@Nullable Output<ProviderVirtualEnvironmentArgs> virtualEnvironment) {
            $.virtualEnvironment = virtualEnvironment;
            return this;
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Move attributes out of virtual_environment block
         * 
         */
        @Deprecated /* Move attributes out of virtual_environment block */
        public Builder virtualEnvironment(ProviderVirtualEnvironmentArgs virtualEnvironment) {
            return virtualEnvironment(Output.of(virtualEnvironment));
        }

        public ProviderArgs build() {
            return $;
        }
    }

}
