// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE
{
    public static class GetVersion
    {
        public static Task<GetVersionResult> InvokeAsync(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetVersionResult>("proxmoxve:index/getVersion:getVersion", InvokeArgs.Empty, options.WithDefaults());
    }


    [OutputType]
    public sealed class GetVersionResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string KeyboardLayout;
        public readonly string Release;
        public readonly string RepositoryId;
        public readonly string Version;

        [OutputConstructor]
        private GetVersionResult(
            string id,

            string keyboardLayout,

            string release,

            string repositoryId,

            string version)
        {
            Id = id;
            KeyboardLayout = keyboardLayout;
            Release = release;
            RepositoryId = repositoryId;
            Version = version;
        }
    }
}
