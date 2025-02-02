# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetVirtualMachineResult',
    'AwaitableGetVirtualMachineResult',
    'get_virtual_machine',
    'get_virtual_machine_output',
]

@pulumi.output_type
class GetVirtualMachineResult:
    """
    A collection of values returned by getVirtualMachine.
    """
    def __init__(__self__, id=None, name=None, node_name=None, tags=None, vm_id=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if node_name and not isinstance(node_name, str):
            raise TypeError("Expected argument 'node_name' to be a str")
        pulumi.set(__self__, "node_name", node_name)
        if tags and not isinstance(tags, list):
            raise TypeError("Expected argument 'tags' to be a list")
        pulumi.set(__self__, "tags", tags)
        if vm_id and not isinstance(vm_id, int):
            raise TypeError("Expected argument 'vm_id' to be a int")
        pulumi.set(__self__, "vm_id", vm_id)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="nodeName")
    def node_name(self) -> str:
        return pulumi.get(self, "node_name")

    @property
    @pulumi.getter
    def tags(self) -> Sequence[str]:
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="vmId")
    def vm_id(self) -> int:
        return pulumi.get(self, "vm_id")


class AwaitableGetVirtualMachineResult(GetVirtualMachineResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetVirtualMachineResult(
            id=self.id,
            name=self.name,
            node_name=self.node_name,
            tags=self.tags,
            vm_id=self.vm_id)


def get_virtual_machine(node_name: Optional[str] = None,
                        vm_id: Optional[int] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetVirtualMachineResult:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['nodeName'] = node_name
    __args__['vmId'] = vm_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('proxmoxve:VM/getVirtualMachine:getVirtualMachine', __args__, opts=opts, typ=GetVirtualMachineResult).value

    return AwaitableGetVirtualMachineResult(
        id=__ret__.id,
        name=__ret__.name,
        node_name=__ret__.node_name,
        tags=__ret__.tags,
        vm_id=__ret__.vm_id)


@_utilities.lift_output_func(get_virtual_machine)
def get_virtual_machine_output(node_name: Optional[pulumi.Input[str]] = None,
                               vm_id: Optional[pulumi.Input[int]] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetVirtualMachineResult]:
    """
    Use this data source to access information about an existing resource.
    """
    ...
