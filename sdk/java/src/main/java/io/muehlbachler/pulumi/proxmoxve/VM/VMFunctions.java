// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.VM;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import io.muehlbachler.pulumi.proxmoxve.Utilities;
import io.muehlbachler.pulumi.proxmoxve.VM.inputs.GetVirtualMachineArgs;
import io.muehlbachler.pulumi.proxmoxve.VM.inputs.GetVirtualMachinePlainArgs;
import io.muehlbachler.pulumi.proxmoxve.VM.inputs.GetVirtualMachinesArgs;
import io.muehlbachler.pulumi.proxmoxve.VM.inputs.GetVirtualMachinesPlainArgs;
import io.muehlbachler.pulumi.proxmoxve.VM.outputs.GetVirtualMachineResult;
import io.muehlbachler.pulumi.proxmoxve.VM.outputs.GetVirtualMachinesResult;
import java.util.concurrent.CompletableFuture;

public final class VMFunctions {
    public static Output<GetVirtualMachineResult> getVirtualMachine(GetVirtualMachineArgs args) {
        return getVirtualMachine(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetVirtualMachineResult> getVirtualMachinePlain(GetVirtualMachinePlainArgs args) {
        return getVirtualMachinePlain(args, InvokeOptions.Empty);
    }
    public static Output<GetVirtualMachineResult> getVirtualMachine(GetVirtualMachineArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("proxmoxve:VM/getVirtualMachine:getVirtualMachine", TypeShape.of(GetVirtualMachineResult.class), args, Utilities.withVersion(options));
    }
    public static CompletableFuture<GetVirtualMachineResult> getVirtualMachinePlain(GetVirtualMachinePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("proxmoxve:VM/getVirtualMachine:getVirtualMachine", TypeShape.of(GetVirtualMachineResult.class), args, Utilities.withVersion(options));
    }
    public static Output<GetVirtualMachinesResult> getVirtualMachines() {
        return getVirtualMachines(GetVirtualMachinesArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetVirtualMachinesResult> getVirtualMachinesPlain() {
        return getVirtualMachinesPlain(GetVirtualMachinesPlainArgs.Empty, InvokeOptions.Empty);
    }
    public static Output<GetVirtualMachinesResult> getVirtualMachines(GetVirtualMachinesArgs args) {
        return getVirtualMachines(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetVirtualMachinesResult> getVirtualMachinesPlain(GetVirtualMachinesPlainArgs args) {
        return getVirtualMachinesPlain(args, InvokeOptions.Empty);
    }
    public static Output<GetVirtualMachinesResult> getVirtualMachines(GetVirtualMachinesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("proxmoxve:VM/getVirtualMachines:getVirtualMachines", TypeShape.of(GetVirtualMachinesResult.class), args, Utilities.withVersion(options));
    }
    public static CompletableFuture<GetVirtualMachinesResult> getVirtualMachinesPlain(GetVirtualMachinesPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("proxmoxve:VM/getVirtualMachines:getVirtualMachines", TypeShape.of(GetVirtualMachinesResult.class), args, Utilities.withVersion(options));
    }
}
