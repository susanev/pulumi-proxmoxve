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


public final class VirtualMachineCdromArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualMachineCdromArgs Empty = new VirtualMachineCdromArgs();

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="fileId")
    private @Nullable Output<String> fileId;

    public Optional<Output<String>> fileId() {
        return Optional.ofNullable(this.fileId);
    }

    private VirtualMachineCdromArgs() {}

    private VirtualMachineCdromArgs(VirtualMachineCdromArgs $) {
        this.enabled = $.enabled;
        this.fileId = $.fileId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualMachineCdromArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualMachineCdromArgs $;

        public Builder() {
            $ = new VirtualMachineCdromArgs();
        }

        public Builder(VirtualMachineCdromArgs defaults) {
            $ = new VirtualMachineCdromArgs(Objects.requireNonNull(defaults));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder fileId(@Nullable Output<String> fileId) {
            $.fileId = fileId;
            return this;
        }

        public Builder fileId(String fileId) {
            return fileId(Output.of(fileId));
        }

        public VirtualMachineCdromArgs build() {
            return $;
        }
    }

}
