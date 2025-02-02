// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.Permission
{
    public static class GetGroups
    {
        public static Task<GetGroupsResult> InvokeAsync(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetGroupsResult>("proxmoxve:Permission/getGroups:getGroups", InvokeArgs.Empty, options.WithDefaults());
    }


    [OutputType]
    public sealed class GetGroupsResult
    {
        public readonly ImmutableArray<string> Comments;
        public readonly ImmutableArray<string> GroupIds;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetGroupsResult(
            ImmutableArray<string> comments,

            ImmutableArray<string> groupIds,

            string id)
        {
            Comments = comments;
            GroupIds = groupIds;
            Id = id;
        }
    }
}
