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
    'ContainerCloneArgs',
    'ContainerConsoleArgs',
    'ContainerCpuArgs',
    'ContainerDiskArgs',
    'ContainerFeaturesArgs',
    'ContainerInitializationArgs',
    'ContainerInitializationDnsArgs',
    'ContainerInitializationIpConfigArgs',
    'ContainerInitializationIpConfigIpv4Args',
    'ContainerInitializationIpConfigIpv6Args',
    'ContainerInitializationUserAccountArgs',
    'ContainerMemoryArgs',
    'ContainerNetworkInterfaceArgs',
    'ContainerOperatingSystemArgs',
]

@pulumi.input_type
class ContainerCloneArgs:
    def __init__(__self__, *,
                 vm_id: pulumi.Input[int],
                 datastore_id: Optional[pulumi.Input[str]] = None,
                 node_name: Optional[pulumi.Input[str]] = None):
        pulumi.set(__self__, "vm_id", vm_id)
        if datastore_id is not None:
            pulumi.set(__self__, "datastore_id", datastore_id)
        if node_name is not None:
            pulumi.set(__self__, "node_name", node_name)

    @property
    @pulumi.getter(name="vmId")
    def vm_id(self) -> pulumi.Input[int]:
        return pulumi.get(self, "vm_id")

    @vm_id.setter
    def vm_id(self, value: pulumi.Input[int]):
        pulumi.set(self, "vm_id", value)

    @property
    @pulumi.getter(name="datastoreId")
    def datastore_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "datastore_id")

    @datastore_id.setter
    def datastore_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "datastore_id", value)

    @property
    @pulumi.getter(name="nodeName")
    def node_name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "node_name")

    @node_name.setter
    def node_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "node_name", value)


@pulumi.input_type
class ContainerConsoleArgs:
    def __init__(__self__, *,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 tty_count: Optional[pulumi.Input[int]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if tty_count is not None:
            pulumi.set(__self__, "tty_count", tty_count)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter(name="ttyCount")
    def tty_count(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "tty_count")

    @tty_count.setter
    def tty_count(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "tty_count", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


@pulumi.input_type
class ContainerCpuArgs:
    def __init__(__self__, *,
                 architecture: Optional[pulumi.Input[str]] = None,
                 cores: Optional[pulumi.Input[int]] = None,
                 units: Optional[pulumi.Input[int]] = None):
        if architecture is not None:
            pulumi.set(__self__, "architecture", architecture)
        if cores is not None:
            pulumi.set(__self__, "cores", cores)
        if units is not None:
            pulumi.set(__self__, "units", units)

    @property
    @pulumi.getter
    def architecture(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "architecture")

    @architecture.setter
    def architecture(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "architecture", value)

    @property
    @pulumi.getter
    def cores(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "cores")

    @cores.setter
    def cores(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "cores", value)

    @property
    @pulumi.getter
    def units(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "units")

    @units.setter
    def units(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "units", value)


@pulumi.input_type
class ContainerDiskArgs:
    def __init__(__self__, *,
                 datastore_id: Optional[pulumi.Input[str]] = None,
                 size: Optional[pulumi.Input[int]] = None):
        if datastore_id is not None:
            pulumi.set(__self__, "datastore_id", datastore_id)
        if size is not None:
            pulumi.set(__self__, "size", size)

    @property
    @pulumi.getter(name="datastoreId")
    def datastore_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "datastore_id")

    @datastore_id.setter
    def datastore_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "datastore_id", value)

    @property
    @pulumi.getter
    def size(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "size")

    @size.setter
    def size(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "size", value)


@pulumi.input_type
class ContainerFeaturesArgs:
    def __init__(__self__, *,
                 nesting: Optional[pulumi.Input[bool]] = None):
        if nesting is not None:
            pulumi.set(__self__, "nesting", nesting)

    @property
    @pulumi.getter
    def nesting(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "nesting")

    @nesting.setter
    def nesting(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "nesting", value)


@pulumi.input_type
class ContainerInitializationArgs:
    def __init__(__self__, *,
                 dns: Optional[pulumi.Input['ContainerInitializationDnsArgs']] = None,
                 hostname: Optional[pulumi.Input[str]] = None,
                 ip_configs: Optional[pulumi.Input[Sequence[pulumi.Input['ContainerInitializationIpConfigArgs']]]] = None,
                 user_account: Optional[pulumi.Input['ContainerInitializationUserAccountArgs']] = None):
        if dns is not None:
            pulumi.set(__self__, "dns", dns)
        if hostname is not None:
            pulumi.set(__self__, "hostname", hostname)
        if ip_configs is not None:
            pulumi.set(__self__, "ip_configs", ip_configs)
        if user_account is not None:
            pulumi.set(__self__, "user_account", user_account)

    @property
    @pulumi.getter
    def dns(self) -> Optional[pulumi.Input['ContainerInitializationDnsArgs']]:
        return pulumi.get(self, "dns")

    @dns.setter
    def dns(self, value: Optional[pulumi.Input['ContainerInitializationDnsArgs']]):
        pulumi.set(self, "dns", value)

    @property
    @pulumi.getter
    def hostname(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "hostname")

    @hostname.setter
    def hostname(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "hostname", value)

    @property
    @pulumi.getter(name="ipConfigs")
    def ip_configs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ContainerInitializationIpConfigArgs']]]]:
        return pulumi.get(self, "ip_configs")

    @ip_configs.setter
    def ip_configs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ContainerInitializationIpConfigArgs']]]]):
        pulumi.set(self, "ip_configs", value)

    @property
    @pulumi.getter(name="userAccount")
    def user_account(self) -> Optional[pulumi.Input['ContainerInitializationUserAccountArgs']]:
        return pulumi.get(self, "user_account")

    @user_account.setter
    def user_account(self, value: Optional[pulumi.Input['ContainerInitializationUserAccountArgs']]):
        pulumi.set(self, "user_account", value)


@pulumi.input_type
class ContainerInitializationDnsArgs:
    def __init__(__self__, *,
                 domain: Optional[pulumi.Input[str]] = None,
                 server: Optional[pulumi.Input[str]] = None):
        if domain is not None:
            pulumi.set(__self__, "domain", domain)
        if server is not None:
            pulumi.set(__self__, "server", server)

    @property
    @pulumi.getter
    def domain(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "domain")

    @domain.setter
    def domain(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "domain", value)

    @property
    @pulumi.getter
    def server(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "server")

    @server.setter
    def server(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "server", value)


@pulumi.input_type
class ContainerInitializationIpConfigArgs:
    def __init__(__self__, *,
                 ipv4: Optional[pulumi.Input['ContainerInitializationIpConfigIpv4Args']] = None,
                 ipv6: Optional[pulumi.Input['ContainerInitializationIpConfigIpv6Args']] = None):
        if ipv4 is not None:
            pulumi.set(__self__, "ipv4", ipv4)
        if ipv6 is not None:
            pulumi.set(__self__, "ipv6", ipv6)

    @property
    @pulumi.getter
    def ipv4(self) -> Optional[pulumi.Input['ContainerInitializationIpConfigIpv4Args']]:
        return pulumi.get(self, "ipv4")

    @ipv4.setter
    def ipv4(self, value: Optional[pulumi.Input['ContainerInitializationIpConfigIpv4Args']]):
        pulumi.set(self, "ipv4", value)

    @property
    @pulumi.getter
    def ipv6(self) -> Optional[pulumi.Input['ContainerInitializationIpConfigIpv6Args']]:
        return pulumi.get(self, "ipv6")

    @ipv6.setter
    def ipv6(self, value: Optional[pulumi.Input['ContainerInitializationIpConfigIpv6Args']]):
        pulumi.set(self, "ipv6", value)


@pulumi.input_type
class ContainerInitializationIpConfigIpv4Args:
    def __init__(__self__, *,
                 address: Optional[pulumi.Input[str]] = None,
                 gateway: Optional[pulumi.Input[str]] = None):
        if address is not None:
            pulumi.set(__self__, "address", address)
        if gateway is not None:
            pulumi.set(__self__, "gateway", gateway)

    @property
    @pulumi.getter
    def address(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "address")

    @address.setter
    def address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "address", value)

    @property
    @pulumi.getter
    def gateway(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "gateway")

    @gateway.setter
    def gateway(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "gateway", value)


@pulumi.input_type
class ContainerInitializationIpConfigIpv6Args:
    def __init__(__self__, *,
                 address: Optional[pulumi.Input[str]] = None,
                 gateway: Optional[pulumi.Input[str]] = None):
        if address is not None:
            pulumi.set(__self__, "address", address)
        if gateway is not None:
            pulumi.set(__self__, "gateway", gateway)

    @property
    @pulumi.getter
    def address(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "address")

    @address.setter
    def address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "address", value)

    @property
    @pulumi.getter
    def gateway(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "gateway")

    @gateway.setter
    def gateway(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "gateway", value)


@pulumi.input_type
class ContainerInitializationUserAccountArgs:
    def __init__(__self__, *,
                 keys: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 password: Optional[pulumi.Input[str]] = None):
        if keys is not None:
            pulumi.set(__self__, "keys", keys)
        if password is not None:
            pulumi.set(__self__, "password", password)

    @property
    @pulumi.getter
    def keys(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        return pulumi.get(self, "keys")

    @keys.setter
    def keys(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "keys", value)

    @property
    @pulumi.getter
    def password(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "password")

    @password.setter
    def password(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "password", value)


@pulumi.input_type
class ContainerMemoryArgs:
    def __init__(__self__, *,
                 dedicated: Optional[pulumi.Input[int]] = None,
                 swap: Optional[pulumi.Input[int]] = None):
        if dedicated is not None:
            pulumi.set(__self__, "dedicated", dedicated)
        if swap is not None:
            pulumi.set(__self__, "swap", swap)

    @property
    @pulumi.getter
    def dedicated(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "dedicated")

    @dedicated.setter
    def dedicated(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "dedicated", value)

    @property
    @pulumi.getter
    def swap(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "swap")

    @swap.setter
    def swap(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "swap", value)


@pulumi.input_type
class ContainerNetworkInterfaceArgs:
    def __init__(__self__, *,
                 name: pulumi.Input[str],
                 bridge: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 firewall: Optional[pulumi.Input[bool]] = None,
                 mac_address: Optional[pulumi.Input[str]] = None,
                 mtu: Optional[pulumi.Input[int]] = None,
                 rate_limit: Optional[pulumi.Input[float]] = None,
                 vlan_id: Optional[pulumi.Input[int]] = None):
        pulumi.set(__self__, "name", name)
        if bridge is not None:
            pulumi.set(__self__, "bridge", bridge)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if firewall is not None:
            pulumi.set(__self__, "firewall", firewall)
        if mac_address is not None:
            pulumi.set(__self__, "mac_address", mac_address)
        if mtu is not None:
            pulumi.set(__self__, "mtu", mtu)
        if rate_limit is not None:
            pulumi.set(__self__, "rate_limit", rate_limit)
        if vlan_id is not None:
            pulumi.set(__self__, "vlan_id", vlan_id)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def bridge(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "bridge")

    @bridge.setter
    def bridge(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "bridge", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def firewall(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "firewall")

    @firewall.setter
    def firewall(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "firewall", value)

    @property
    @pulumi.getter(name="macAddress")
    def mac_address(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "mac_address")

    @mac_address.setter
    def mac_address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "mac_address", value)

    @property
    @pulumi.getter
    def mtu(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "mtu")

    @mtu.setter
    def mtu(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "mtu", value)

    @property
    @pulumi.getter(name="rateLimit")
    def rate_limit(self) -> Optional[pulumi.Input[float]]:
        return pulumi.get(self, "rate_limit")

    @rate_limit.setter
    def rate_limit(self, value: Optional[pulumi.Input[float]]):
        pulumi.set(self, "rate_limit", value)

    @property
    @pulumi.getter(name="vlanId")
    def vlan_id(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "vlan_id")

    @vlan_id.setter
    def vlan_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "vlan_id", value)


@pulumi.input_type
class ContainerOperatingSystemArgs:
    def __init__(__self__, *,
                 template_file_id: pulumi.Input[str],
                 type: Optional[pulumi.Input[str]] = None):
        pulumi.set(__self__, "template_file_id", template_file_id)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="templateFileId")
    def template_file_id(self) -> pulumi.Input[str]:
        return pulumi.get(self, "template_file_id")

    @template_file_id.setter
    def template_file_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "template_file_id", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


