// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package proxmoxve

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The provider type for the proxmoxve package. By default, resources use package-wide configuration
// settings, however an explicit `Provider` instance may be created and passed during resource
// construction to achieve fine-grained programmatic control over provider settings. See the
// [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
type Provider struct {
	pulumi.ProviderResourceState

	// The API token for the Proxmox Virtual Environment API
	ApiToken pulumi.StringPtrOutput `pulumi:"apiToken"`
	// The endpoint for the Proxmox Virtual Environment API
	Endpoint pulumi.StringPtrOutput `pulumi:"endpoint"`
	// The one-time password for the Proxmox Virtual Environment API
	Otp pulumi.StringPtrOutput `pulumi:"otp"`
	// The password for the Proxmox Virtual Environment API
	Password pulumi.StringPtrOutput `pulumi:"password"`
	// The username for the Proxmox Virtual Environment API
	Username pulumi.StringPtrOutput `pulumi:"username"`
}

// NewProvider registers a new resource with the given unique name, arguments, and options.
func NewProvider(ctx *pulumi.Context,
	name string, args *ProviderArgs, opts ...pulumi.ResourceOption) (*Provider, error) {
	if args == nil {
		args = &ProviderArgs{}
	}

	if args.ApiToken != nil {
		args.ApiToken = pulumi.ToSecret(args.ApiToken).(pulumi.StringPtrInput)
	}
	if args.Password != nil {
		args.Password = pulumi.ToSecret(args.Password).(pulumi.StringPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"apiToken",
		"password",
	})
	opts = append(opts, secrets)
	opts = pkgResourceDefaultOpts(opts)
	var resource Provider
	err := ctx.RegisterResource("pulumi:providers:proxmoxve", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

type providerArgs struct {
	// The API token for the Proxmox Virtual Environment API
	ApiToken *string `pulumi:"apiToken"`
	// The endpoint for the Proxmox Virtual Environment API
	Endpoint *string `pulumi:"endpoint"`
	// Whether to skip the TLS verification step
	Insecure *bool `pulumi:"insecure"`
	// The one-time password for the Proxmox Virtual Environment API
	Otp *string `pulumi:"otp"`
	// The password for the Proxmox Virtual Environment API
	Password *string `pulumi:"password"`
	// The SSH connection configuration to a Proxmox node
	Ssh *ProviderSsh `pulumi:"ssh"`
	// The username for the Proxmox Virtual Environment API
	Username *string `pulumi:"username"`
	// Deprecated: Move attributes out of virtual_environment block
	VirtualEnvironment *ProviderVirtualEnvironment `pulumi:"virtualEnvironment"`
}

// The set of arguments for constructing a Provider resource.
type ProviderArgs struct {
	// The API token for the Proxmox Virtual Environment API
	ApiToken pulumi.StringPtrInput
	// The endpoint for the Proxmox Virtual Environment API
	Endpoint pulumi.StringPtrInput
	// Whether to skip the TLS verification step
	Insecure pulumi.BoolPtrInput
	// The one-time password for the Proxmox Virtual Environment API
	Otp pulumi.StringPtrInput
	// The password for the Proxmox Virtual Environment API
	Password pulumi.StringPtrInput
	// The SSH connection configuration to a Proxmox node
	Ssh ProviderSshPtrInput
	// The username for the Proxmox Virtual Environment API
	Username pulumi.StringPtrInput
	// Deprecated: Move attributes out of virtual_environment block
	VirtualEnvironment ProviderVirtualEnvironmentPtrInput
}

func (ProviderArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*providerArgs)(nil)).Elem()
}

type ProviderInput interface {
	pulumi.Input

	ToProviderOutput() ProviderOutput
	ToProviderOutputWithContext(ctx context.Context) ProviderOutput
}

func (*Provider) ElementType() reflect.Type {
	return reflect.TypeOf((**Provider)(nil)).Elem()
}

func (i *Provider) ToProviderOutput() ProviderOutput {
	return i.ToProviderOutputWithContext(context.Background())
}

func (i *Provider) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderOutput)
}

type ProviderOutput struct{ *pulumi.OutputState }

func (ProviderOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Provider)(nil)).Elem()
}

func (o ProviderOutput) ToProviderOutput() ProviderOutput {
	return o
}

func (o ProviderOutput) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return o
}

// The API token for the Proxmox Virtual Environment API
func (o ProviderOutput) ApiToken() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.ApiToken }).(pulumi.StringPtrOutput)
}

// The endpoint for the Proxmox Virtual Environment API
func (o ProviderOutput) Endpoint() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.Endpoint }).(pulumi.StringPtrOutput)
}

// The one-time password for the Proxmox Virtual Environment API
func (o ProviderOutput) Otp() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.Otp }).(pulumi.StringPtrOutput)
}

// The password for the Proxmox Virtual Environment API
func (o ProviderOutput) Password() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.Password }).(pulumi.StringPtrOutput)
}

// The username for the Proxmox Virtual Environment API
func (o ProviderOutput) Username() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.Username }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProviderInput)(nil)).Elem(), &Provider{})
	pulumi.RegisterOutputType(ProviderOutput{})
}
