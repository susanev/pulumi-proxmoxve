// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.Permission.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPoolPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPoolPlainArgs Empty = new GetPoolPlainArgs();

    @Import(name="poolId", required=true)
    private String poolId;

    public String poolId() {
        return this.poolId;
    }

    private GetPoolPlainArgs() {}

    private GetPoolPlainArgs(GetPoolPlainArgs $) {
        this.poolId = $.poolId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPoolPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPoolPlainArgs $;

        public Builder() {
            $ = new GetPoolPlainArgs();
        }

        public Builder(GetPoolPlainArgs defaults) {
            $ = new GetPoolPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder poolId(String poolId) {
            $.poolId = poolId;
            return this;
        }

        public GetPoolPlainArgs build() {
            $.poolId = Objects.requireNonNull($.poolId, "expected parameter 'poolId' to be non-null");
            return $;
        }
    }

}
