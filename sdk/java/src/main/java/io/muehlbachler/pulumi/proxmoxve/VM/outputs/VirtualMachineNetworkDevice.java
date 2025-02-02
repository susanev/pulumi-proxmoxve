// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.VM.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualMachineNetworkDevice {
    private @Nullable String bridge;
    private @Nullable Boolean enabled;
    private @Nullable Boolean firewall;
    private @Nullable String macAddress;
    private @Nullable String model;
    private @Nullable Integer mtu;
    private @Nullable Double rateLimit;
    private @Nullable Integer vlanId;

    private VirtualMachineNetworkDevice() {}
    public Optional<String> bridge() {
        return Optional.ofNullable(this.bridge);
    }
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    public Optional<Boolean> firewall() {
        return Optional.ofNullable(this.firewall);
    }
    public Optional<String> macAddress() {
        return Optional.ofNullable(this.macAddress);
    }
    public Optional<String> model() {
        return Optional.ofNullable(this.model);
    }
    public Optional<Integer> mtu() {
        return Optional.ofNullable(this.mtu);
    }
    public Optional<Double> rateLimit() {
        return Optional.ofNullable(this.rateLimit);
    }
    public Optional<Integer> vlanId() {
        return Optional.ofNullable(this.vlanId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineNetworkDevice defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String bridge;
        private @Nullable Boolean enabled;
        private @Nullable Boolean firewall;
        private @Nullable String macAddress;
        private @Nullable String model;
        private @Nullable Integer mtu;
        private @Nullable Double rateLimit;
        private @Nullable Integer vlanId;
        public Builder() {}
        public Builder(VirtualMachineNetworkDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bridge = defaults.bridge;
    	      this.enabled = defaults.enabled;
    	      this.firewall = defaults.firewall;
    	      this.macAddress = defaults.macAddress;
    	      this.model = defaults.model;
    	      this.mtu = defaults.mtu;
    	      this.rateLimit = defaults.rateLimit;
    	      this.vlanId = defaults.vlanId;
        }

        @CustomType.Setter
        public Builder bridge(@Nullable String bridge) {
            this.bridge = bridge;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder firewall(@Nullable Boolean firewall) {
            this.firewall = firewall;
            return this;
        }
        @CustomType.Setter
        public Builder macAddress(@Nullable String macAddress) {
            this.macAddress = macAddress;
            return this;
        }
        @CustomType.Setter
        public Builder model(@Nullable String model) {
            this.model = model;
            return this;
        }
        @CustomType.Setter
        public Builder mtu(@Nullable Integer mtu) {
            this.mtu = mtu;
            return this;
        }
        @CustomType.Setter
        public Builder rateLimit(@Nullable Double rateLimit) {
            this.rateLimit = rateLimit;
            return this;
        }
        @CustomType.Setter
        public Builder vlanId(@Nullable Integer vlanId) {
            this.vlanId = vlanId;
            return this;
        }
        public VirtualMachineNetworkDevice build() {
            final var o = new VirtualMachineNetworkDevice();
            o.bridge = bridge;
            o.enabled = enabled;
            o.firewall = firewall;
            o.macAddress = macAddress;
            o.model = model;
            o.mtu = mtu;
            o.rateLimit = rateLimit;
            o.vlanId = vlanId;
            return o;
        }
    }
}
