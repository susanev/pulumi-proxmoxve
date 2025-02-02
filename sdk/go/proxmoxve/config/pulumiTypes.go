// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package config

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type Ssh struct {
	Agent       *bool     `pulumi:"agent"`
	AgentSocket *string   `pulumi:"agentSocket"`
	Nodes       []SshNode `pulumi:"nodes"`
	Password    *string   `pulumi:"password"`
	Username    *string   `pulumi:"username"`
}

// SshInput is an input type that accepts SshArgs and SshOutput values.
// You can construct a concrete instance of `SshInput` via:
//
//	SshArgs{...}
type SshInput interface {
	pulumi.Input

	ToSshOutput() SshOutput
	ToSshOutputWithContext(context.Context) SshOutput
}

type SshArgs struct {
	Agent       pulumi.BoolPtrInput   `pulumi:"agent"`
	AgentSocket pulumi.StringPtrInput `pulumi:"agentSocket"`
	Nodes       SshNodeArrayInput     `pulumi:"nodes"`
	Password    pulumi.StringPtrInput `pulumi:"password"`
	Username    pulumi.StringPtrInput `pulumi:"username"`
}

func (SshArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*Ssh)(nil)).Elem()
}

func (i SshArgs) ToSshOutput() SshOutput {
	return i.ToSshOutputWithContext(context.Background())
}

func (i SshArgs) ToSshOutputWithContext(ctx context.Context) SshOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SshOutput)
}

type SshOutput struct{ *pulumi.OutputState }

func (SshOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Ssh)(nil)).Elem()
}

func (o SshOutput) ToSshOutput() SshOutput {
	return o
}

func (o SshOutput) ToSshOutputWithContext(ctx context.Context) SshOutput {
	return o
}

func (o SshOutput) Agent() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v Ssh) *bool { return v.Agent }).(pulumi.BoolPtrOutput)
}

func (o SshOutput) AgentSocket() pulumi.StringPtrOutput {
	return o.ApplyT(func(v Ssh) *string { return v.AgentSocket }).(pulumi.StringPtrOutput)
}

func (o SshOutput) Nodes() SshNodeArrayOutput {
	return o.ApplyT(func(v Ssh) []SshNode { return v.Nodes }).(SshNodeArrayOutput)
}

func (o SshOutput) Password() pulumi.StringPtrOutput {
	return o.ApplyT(func(v Ssh) *string { return v.Password }).(pulumi.StringPtrOutput)
}

func (o SshOutput) Username() pulumi.StringPtrOutput {
	return o.ApplyT(func(v Ssh) *string { return v.Username }).(pulumi.StringPtrOutput)
}

type SshNode struct {
	Address string `pulumi:"address"`
	Name    string `pulumi:"name"`
}

// SshNodeInput is an input type that accepts SshNodeArgs and SshNodeOutput values.
// You can construct a concrete instance of `SshNodeInput` via:
//
//	SshNodeArgs{...}
type SshNodeInput interface {
	pulumi.Input

	ToSshNodeOutput() SshNodeOutput
	ToSshNodeOutputWithContext(context.Context) SshNodeOutput
}

type SshNodeArgs struct {
	Address pulumi.StringInput `pulumi:"address"`
	Name    pulumi.StringInput `pulumi:"name"`
}

func (SshNodeArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*SshNode)(nil)).Elem()
}

func (i SshNodeArgs) ToSshNodeOutput() SshNodeOutput {
	return i.ToSshNodeOutputWithContext(context.Background())
}

func (i SshNodeArgs) ToSshNodeOutputWithContext(ctx context.Context) SshNodeOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SshNodeOutput)
}

// SshNodeArrayInput is an input type that accepts SshNodeArray and SshNodeArrayOutput values.
// You can construct a concrete instance of `SshNodeArrayInput` via:
//
//	SshNodeArray{ SshNodeArgs{...} }
type SshNodeArrayInput interface {
	pulumi.Input

	ToSshNodeArrayOutput() SshNodeArrayOutput
	ToSshNodeArrayOutputWithContext(context.Context) SshNodeArrayOutput
}

type SshNodeArray []SshNodeInput

func (SshNodeArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]SshNode)(nil)).Elem()
}

func (i SshNodeArray) ToSshNodeArrayOutput() SshNodeArrayOutput {
	return i.ToSshNodeArrayOutputWithContext(context.Background())
}

func (i SshNodeArray) ToSshNodeArrayOutputWithContext(ctx context.Context) SshNodeArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SshNodeArrayOutput)
}

type SshNodeOutput struct{ *pulumi.OutputState }

func (SshNodeOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*SshNode)(nil)).Elem()
}

func (o SshNodeOutput) ToSshNodeOutput() SshNodeOutput {
	return o
}

func (o SshNodeOutput) ToSshNodeOutputWithContext(ctx context.Context) SshNodeOutput {
	return o
}

func (o SshNodeOutput) Address() pulumi.StringOutput {
	return o.ApplyT(func(v SshNode) string { return v.Address }).(pulumi.StringOutput)
}

func (o SshNodeOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v SshNode) string { return v.Name }).(pulumi.StringOutput)
}

type SshNodeArrayOutput struct{ *pulumi.OutputState }

func (SshNodeArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]SshNode)(nil)).Elem()
}

func (o SshNodeArrayOutput) ToSshNodeArrayOutput() SshNodeArrayOutput {
	return o
}

func (o SshNodeArrayOutput) ToSshNodeArrayOutputWithContext(ctx context.Context) SshNodeArrayOutput {
	return o
}

func (o SshNodeArrayOutput) Index(i pulumi.IntInput) SshNodeOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) SshNode {
		return vs[0].([]SshNode)[vs[1].(int)]
	}).(SshNodeOutput)
}

type VirtualEnvironment struct {
	ApiToken *string                `pulumi:"apiToken"`
	Endpoint *string                `pulumi:"endpoint"`
	Insecure *bool                  `pulumi:"insecure"`
	Otp      *string                `pulumi:"otp"`
	Password *string                `pulumi:"password"`
	Ssh      *VirtualEnvironmentSsh `pulumi:"ssh"`
	Username *string                `pulumi:"username"`
}

// VirtualEnvironmentInput is an input type that accepts VirtualEnvironmentArgs and VirtualEnvironmentOutput values.
// You can construct a concrete instance of `VirtualEnvironmentInput` via:
//
//	VirtualEnvironmentArgs{...}
type VirtualEnvironmentInput interface {
	pulumi.Input

	ToVirtualEnvironmentOutput() VirtualEnvironmentOutput
	ToVirtualEnvironmentOutputWithContext(context.Context) VirtualEnvironmentOutput
}

type VirtualEnvironmentArgs struct {
	ApiToken pulumi.StringPtrInput         `pulumi:"apiToken"`
	Endpoint pulumi.StringPtrInput         `pulumi:"endpoint"`
	Insecure pulumi.BoolPtrInput           `pulumi:"insecure"`
	Otp      pulumi.StringPtrInput         `pulumi:"otp"`
	Password pulumi.StringPtrInput         `pulumi:"password"`
	Ssh      VirtualEnvironmentSshPtrInput `pulumi:"ssh"`
	Username pulumi.StringPtrInput         `pulumi:"username"`
}

func (VirtualEnvironmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*VirtualEnvironment)(nil)).Elem()
}

func (i VirtualEnvironmentArgs) ToVirtualEnvironmentOutput() VirtualEnvironmentOutput {
	return i.ToVirtualEnvironmentOutputWithContext(context.Background())
}

func (i VirtualEnvironmentArgs) ToVirtualEnvironmentOutputWithContext(ctx context.Context) VirtualEnvironmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VirtualEnvironmentOutput)
}

type VirtualEnvironmentOutput struct{ *pulumi.OutputState }

func (VirtualEnvironmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*VirtualEnvironment)(nil)).Elem()
}

func (o VirtualEnvironmentOutput) ToVirtualEnvironmentOutput() VirtualEnvironmentOutput {
	return o
}

func (o VirtualEnvironmentOutput) ToVirtualEnvironmentOutputWithContext(ctx context.Context) VirtualEnvironmentOutput {
	return o
}

func (o VirtualEnvironmentOutput) ApiToken() pulumi.StringPtrOutput {
	return o.ApplyT(func(v VirtualEnvironment) *string { return v.ApiToken }).(pulumi.StringPtrOutput)
}

func (o VirtualEnvironmentOutput) Endpoint() pulumi.StringPtrOutput {
	return o.ApplyT(func(v VirtualEnvironment) *string { return v.Endpoint }).(pulumi.StringPtrOutput)
}

func (o VirtualEnvironmentOutput) Insecure() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v VirtualEnvironment) *bool { return v.Insecure }).(pulumi.BoolPtrOutput)
}

func (o VirtualEnvironmentOutput) Otp() pulumi.StringPtrOutput {
	return o.ApplyT(func(v VirtualEnvironment) *string { return v.Otp }).(pulumi.StringPtrOutput)
}

func (o VirtualEnvironmentOutput) Password() pulumi.StringPtrOutput {
	return o.ApplyT(func(v VirtualEnvironment) *string { return v.Password }).(pulumi.StringPtrOutput)
}

func (o VirtualEnvironmentOutput) Ssh() VirtualEnvironmentSshPtrOutput {
	return o.ApplyT(func(v VirtualEnvironment) *VirtualEnvironmentSsh { return v.Ssh }).(VirtualEnvironmentSshPtrOutput)
}

func (o VirtualEnvironmentOutput) Username() pulumi.StringPtrOutput {
	return o.ApplyT(func(v VirtualEnvironment) *string { return v.Username }).(pulumi.StringPtrOutput)
}

type VirtualEnvironmentSsh struct {
	Agent       *bool                       `pulumi:"agent"`
	AgentSocket *string                     `pulumi:"agentSocket"`
	Nodes       []VirtualEnvironmentSshNode `pulumi:"nodes"`
	Password    *string                     `pulumi:"password"`
	Username    *string                     `pulumi:"username"`
}

// VirtualEnvironmentSshInput is an input type that accepts VirtualEnvironmentSshArgs and VirtualEnvironmentSshOutput values.
// You can construct a concrete instance of `VirtualEnvironmentSshInput` via:
//
//	VirtualEnvironmentSshArgs{...}
type VirtualEnvironmentSshInput interface {
	pulumi.Input

	ToVirtualEnvironmentSshOutput() VirtualEnvironmentSshOutput
	ToVirtualEnvironmentSshOutputWithContext(context.Context) VirtualEnvironmentSshOutput
}

type VirtualEnvironmentSshArgs struct {
	Agent       pulumi.BoolPtrInput                 `pulumi:"agent"`
	AgentSocket pulumi.StringPtrInput               `pulumi:"agentSocket"`
	Nodes       VirtualEnvironmentSshNodeArrayInput `pulumi:"nodes"`
	Password    pulumi.StringPtrInput               `pulumi:"password"`
	Username    pulumi.StringPtrInput               `pulumi:"username"`
}

func (VirtualEnvironmentSshArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*VirtualEnvironmentSsh)(nil)).Elem()
}

func (i VirtualEnvironmentSshArgs) ToVirtualEnvironmentSshOutput() VirtualEnvironmentSshOutput {
	return i.ToVirtualEnvironmentSshOutputWithContext(context.Background())
}

func (i VirtualEnvironmentSshArgs) ToVirtualEnvironmentSshOutputWithContext(ctx context.Context) VirtualEnvironmentSshOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VirtualEnvironmentSshOutput)
}

func (i VirtualEnvironmentSshArgs) ToVirtualEnvironmentSshPtrOutput() VirtualEnvironmentSshPtrOutput {
	return i.ToVirtualEnvironmentSshPtrOutputWithContext(context.Background())
}

func (i VirtualEnvironmentSshArgs) ToVirtualEnvironmentSshPtrOutputWithContext(ctx context.Context) VirtualEnvironmentSshPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VirtualEnvironmentSshOutput).ToVirtualEnvironmentSshPtrOutputWithContext(ctx)
}

// VirtualEnvironmentSshPtrInput is an input type that accepts VirtualEnvironmentSshArgs, VirtualEnvironmentSshPtr and VirtualEnvironmentSshPtrOutput values.
// You can construct a concrete instance of `VirtualEnvironmentSshPtrInput` via:
//
//	        VirtualEnvironmentSshArgs{...}
//
//	or:
//
//	        nil
type VirtualEnvironmentSshPtrInput interface {
	pulumi.Input

	ToVirtualEnvironmentSshPtrOutput() VirtualEnvironmentSshPtrOutput
	ToVirtualEnvironmentSshPtrOutputWithContext(context.Context) VirtualEnvironmentSshPtrOutput
}

type virtualEnvironmentSshPtrType VirtualEnvironmentSshArgs

func VirtualEnvironmentSshPtr(v *VirtualEnvironmentSshArgs) VirtualEnvironmentSshPtrInput {
	return (*virtualEnvironmentSshPtrType)(v)
}

func (*virtualEnvironmentSshPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**VirtualEnvironmentSsh)(nil)).Elem()
}

func (i *virtualEnvironmentSshPtrType) ToVirtualEnvironmentSshPtrOutput() VirtualEnvironmentSshPtrOutput {
	return i.ToVirtualEnvironmentSshPtrOutputWithContext(context.Background())
}

func (i *virtualEnvironmentSshPtrType) ToVirtualEnvironmentSshPtrOutputWithContext(ctx context.Context) VirtualEnvironmentSshPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VirtualEnvironmentSshPtrOutput)
}

type VirtualEnvironmentSshOutput struct{ *pulumi.OutputState }

func (VirtualEnvironmentSshOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*VirtualEnvironmentSsh)(nil)).Elem()
}

func (o VirtualEnvironmentSshOutput) ToVirtualEnvironmentSshOutput() VirtualEnvironmentSshOutput {
	return o
}

func (o VirtualEnvironmentSshOutput) ToVirtualEnvironmentSshOutputWithContext(ctx context.Context) VirtualEnvironmentSshOutput {
	return o
}

func (o VirtualEnvironmentSshOutput) ToVirtualEnvironmentSshPtrOutput() VirtualEnvironmentSshPtrOutput {
	return o.ToVirtualEnvironmentSshPtrOutputWithContext(context.Background())
}

func (o VirtualEnvironmentSshOutput) ToVirtualEnvironmentSshPtrOutputWithContext(ctx context.Context) VirtualEnvironmentSshPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v VirtualEnvironmentSsh) *VirtualEnvironmentSsh {
		return &v
	}).(VirtualEnvironmentSshPtrOutput)
}

func (o VirtualEnvironmentSshOutput) Agent() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v VirtualEnvironmentSsh) *bool { return v.Agent }).(pulumi.BoolPtrOutput)
}

func (o VirtualEnvironmentSshOutput) AgentSocket() pulumi.StringPtrOutput {
	return o.ApplyT(func(v VirtualEnvironmentSsh) *string { return v.AgentSocket }).(pulumi.StringPtrOutput)
}

func (o VirtualEnvironmentSshOutput) Nodes() VirtualEnvironmentSshNodeArrayOutput {
	return o.ApplyT(func(v VirtualEnvironmentSsh) []VirtualEnvironmentSshNode { return v.Nodes }).(VirtualEnvironmentSshNodeArrayOutput)
}

func (o VirtualEnvironmentSshOutput) Password() pulumi.StringPtrOutput {
	return o.ApplyT(func(v VirtualEnvironmentSsh) *string { return v.Password }).(pulumi.StringPtrOutput)
}

func (o VirtualEnvironmentSshOutput) Username() pulumi.StringPtrOutput {
	return o.ApplyT(func(v VirtualEnvironmentSsh) *string { return v.Username }).(pulumi.StringPtrOutput)
}

type VirtualEnvironmentSshPtrOutput struct{ *pulumi.OutputState }

func (VirtualEnvironmentSshPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**VirtualEnvironmentSsh)(nil)).Elem()
}

func (o VirtualEnvironmentSshPtrOutput) ToVirtualEnvironmentSshPtrOutput() VirtualEnvironmentSshPtrOutput {
	return o
}

func (o VirtualEnvironmentSshPtrOutput) ToVirtualEnvironmentSshPtrOutputWithContext(ctx context.Context) VirtualEnvironmentSshPtrOutput {
	return o
}

func (o VirtualEnvironmentSshPtrOutput) Elem() VirtualEnvironmentSshOutput {
	return o.ApplyT(func(v *VirtualEnvironmentSsh) VirtualEnvironmentSsh {
		if v != nil {
			return *v
		}
		var ret VirtualEnvironmentSsh
		return ret
	}).(VirtualEnvironmentSshOutput)
}

func (o VirtualEnvironmentSshPtrOutput) Agent() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *VirtualEnvironmentSsh) *bool {
		if v == nil {
			return nil
		}
		return v.Agent
	}).(pulumi.BoolPtrOutput)
}

func (o VirtualEnvironmentSshPtrOutput) AgentSocket() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *VirtualEnvironmentSsh) *string {
		if v == nil {
			return nil
		}
		return v.AgentSocket
	}).(pulumi.StringPtrOutput)
}

func (o VirtualEnvironmentSshPtrOutput) Nodes() VirtualEnvironmentSshNodeArrayOutput {
	return o.ApplyT(func(v *VirtualEnvironmentSsh) []VirtualEnvironmentSshNode {
		if v == nil {
			return nil
		}
		return v.Nodes
	}).(VirtualEnvironmentSshNodeArrayOutput)
}

func (o VirtualEnvironmentSshPtrOutput) Password() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *VirtualEnvironmentSsh) *string {
		if v == nil {
			return nil
		}
		return v.Password
	}).(pulumi.StringPtrOutput)
}

func (o VirtualEnvironmentSshPtrOutput) Username() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *VirtualEnvironmentSsh) *string {
		if v == nil {
			return nil
		}
		return v.Username
	}).(pulumi.StringPtrOutput)
}

type VirtualEnvironmentSshNode struct {
	Address string `pulumi:"address"`
	Name    string `pulumi:"name"`
}

// VirtualEnvironmentSshNodeInput is an input type that accepts VirtualEnvironmentSshNodeArgs and VirtualEnvironmentSshNodeOutput values.
// You can construct a concrete instance of `VirtualEnvironmentSshNodeInput` via:
//
//	VirtualEnvironmentSshNodeArgs{...}
type VirtualEnvironmentSshNodeInput interface {
	pulumi.Input

	ToVirtualEnvironmentSshNodeOutput() VirtualEnvironmentSshNodeOutput
	ToVirtualEnvironmentSshNodeOutputWithContext(context.Context) VirtualEnvironmentSshNodeOutput
}

type VirtualEnvironmentSshNodeArgs struct {
	Address pulumi.StringInput `pulumi:"address"`
	Name    pulumi.StringInput `pulumi:"name"`
}

func (VirtualEnvironmentSshNodeArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*VirtualEnvironmentSshNode)(nil)).Elem()
}

func (i VirtualEnvironmentSshNodeArgs) ToVirtualEnvironmentSshNodeOutput() VirtualEnvironmentSshNodeOutput {
	return i.ToVirtualEnvironmentSshNodeOutputWithContext(context.Background())
}

func (i VirtualEnvironmentSshNodeArgs) ToVirtualEnvironmentSshNodeOutputWithContext(ctx context.Context) VirtualEnvironmentSshNodeOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VirtualEnvironmentSshNodeOutput)
}

// VirtualEnvironmentSshNodeArrayInput is an input type that accepts VirtualEnvironmentSshNodeArray and VirtualEnvironmentSshNodeArrayOutput values.
// You can construct a concrete instance of `VirtualEnvironmentSshNodeArrayInput` via:
//
//	VirtualEnvironmentSshNodeArray{ VirtualEnvironmentSshNodeArgs{...} }
type VirtualEnvironmentSshNodeArrayInput interface {
	pulumi.Input

	ToVirtualEnvironmentSshNodeArrayOutput() VirtualEnvironmentSshNodeArrayOutput
	ToVirtualEnvironmentSshNodeArrayOutputWithContext(context.Context) VirtualEnvironmentSshNodeArrayOutput
}

type VirtualEnvironmentSshNodeArray []VirtualEnvironmentSshNodeInput

func (VirtualEnvironmentSshNodeArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]VirtualEnvironmentSshNode)(nil)).Elem()
}

func (i VirtualEnvironmentSshNodeArray) ToVirtualEnvironmentSshNodeArrayOutput() VirtualEnvironmentSshNodeArrayOutput {
	return i.ToVirtualEnvironmentSshNodeArrayOutputWithContext(context.Background())
}

func (i VirtualEnvironmentSshNodeArray) ToVirtualEnvironmentSshNodeArrayOutputWithContext(ctx context.Context) VirtualEnvironmentSshNodeArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VirtualEnvironmentSshNodeArrayOutput)
}

type VirtualEnvironmentSshNodeOutput struct{ *pulumi.OutputState }

func (VirtualEnvironmentSshNodeOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*VirtualEnvironmentSshNode)(nil)).Elem()
}

func (o VirtualEnvironmentSshNodeOutput) ToVirtualEnvironmentSshNodeOutput() VirtualEnvironmentSshNodeOutput {
	return o
}

func (o VirtualEnvironmentSshNodeOutput) ToVirtualEnvironmentSshNodeOutputWithContext(ctx context.Context) VirtualEnvironmentSshNodeOutput {
	return o
}

func (o VirtualEnvironmentSshNodeOutput) Address() pulumi.StringOutput {
	return o.ApplyT(func(v VirtualEnvironmentSshNode) string { return v.Address }).(pulumi.StringOutput)
}

func (o VirtualEnvironmentSshNodeOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v VirtualEnvironmentSshNode) string { return v.Name }).(pulumi.StringOutput)
}

type VirtualEnvironmentSshNodeArrayOutput struct{ *pulumi.OutputState }

func (VirtualEnvironmentSshNodeArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]VirtualEnvironmentSshNode)(nil)).Elem()
}

func (o VirtualEnvironmentSshNodeArrayOutput) ToVirtualEnvironmentSshNodeArrayOutput() VirtualEnvironmentSshNodeArrayOutput {
	return o
}

func (o VirtualEnvironmentSshNodeArrayOutput) ToVirtualEnvironmentSshNodeArrayOutputWithContext(ctx context.Context) VirtualEnvironmentSshNodeArrayOutput {
	return o
}

func (o VirtualEnvironmentSshNodeArrayOutput) Index(i pulumi.IntInput) VirtualEnvironmentSshNodeOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) VirtualEnvironmentSshNode {
		return vs[0].([]VirtualEnvironmentSshNode)[vs[1].(int)]
	}).(VirtualEnvironmentSshNodeOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SshInput)(nil)).Elem(), SshArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*SshNodeInput)(nil)).Elem(), SshNodeArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*SshNodeArrayInput)(nil)).Elem(), SshNodeArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*VirtualEnvironmentInput)(nil)).Elem(), VirtualEnvironmentArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*VirtualEnvironmentSshInput)(nil)).Elem(), VirtualEnvironmentSshArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*VirtualEnvironmentSshPtrInput)(nil)).Elem(), VirtualEnvironmentSshArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*VirtualEnvironmentSshNodeInput)(nil)).Elem(), VirtualEnvironmentSshNodeArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*VirtualEnvironmentSshNodeArrayInput)(nil)).Elem(), VirtualEnvironmentSshNodeArray{})
	pulumi.RegisterOutputType(SshOutput{})
	pulumi.RegisterOutputType(SshNodeOutput{})
	pulumi.RegisterOutputType(SshNodeArrayOutput{})
	pulumi.RegisterOutputType(VirtualEnvironmentOutput{})
	pulumi.RegisterOutputType(VirtualEnvironmentSshOutput{})
	pulumi.RegisterOutputType(VirtualEnvironmentSshPtrOutput{})
	pulumi.RegisterOutputType(VirtualEnvironmentSshNodeOutput{})
	pulumi.RegisterOutputType(VirtualEnvironmentSshNodeArrayOutput{})
}
