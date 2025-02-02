// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.VM.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualMachineAgentArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualMachineAgentArgs Empty = new VirtualMachineAgentArgs();

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="timeout")
    private @Nullable Output<String> timeout;

    public Optional<Output<String>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    @Import(name="trim")
    private @Nullable Output<Boolean> trim;

    public Optional<Output<Boolean>> trim() {
        return Optional.ofNullable(this.trim);
    }

    @Import(name="type")
    private @Nullable Output<String> type;

    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private VirtualMachineAgentArgs() {}

    private VirtualMachineAgentArgs(VirtualMachineAgentArgs $) {
        this.enabled = $.enabled;
        this.timeout = $.timeout;
        this.trim = $.trim;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualMachineAgentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualMachineAgentArgs $;

        public Builder() {
            $ = new VirtualMachineAgentArgs();
        }

        public Builder(VirtualMachineAgentArgs defaults) {
            $ = new VirtualMachineAgentArgs(Objects.requireNonNull(defaults));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder timeout(@Nullable Output<String> timeout) {
            $.timeout = timeout;
            return this;
        }

        public Builder timeout(String timeout) {
            return timeout(Output.of(timeout));
        }

        public Builder trim(@Nullable Output<Boolean> trim) {
            $.trim = trim;
            return this;
        }

        public Builder trim(Boolean trim) {
            return trim(Output.of(trim));
        }

        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public VirtualMachineAgentArgs build() {
            return $;
        }
    }

}
