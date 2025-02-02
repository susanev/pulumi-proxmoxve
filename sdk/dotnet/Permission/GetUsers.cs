// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.Permission
{
    public static class GetUsers
    {
        public static Task<GetUsersResult> InvokeAsync(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetUsersResult>("proxmoxve:Permission/getUsers:getUsers", InvokeArgs.Empty, options.WithDefaults());
    }


    [OutputType]
    public sealed class GetUsersResult
    {
        public readonly ImmutableArray<string> Comments;
        public readonly ImmutableArray<string> Emails;
        public readonly ImmutableArray<bool> Enableds;
        public readonly ImmutableArray<string> ExpirationDates;
        public readonly ImmutableArray<string> FirstNames;
        public readonly ImmutableArray<ImmutableArray<string>> Groups;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Keys;
        public readonly ImmutableArray<string> LastNames;
        public readonly ImmutableArray<string> UserIds;

        [OutputConstructor]
        private GetUsersResult(
            ImmutableArray<string> comments,

            ImmutableArray<string> emails,

            ImmutableArray<bool> enableds,

            ImmutableArray<string> expirationDates,

            ImmutableArray<string> firstNames,

            ImmutableArray<ImmutableArray<string>> groups,

            string id,

            ImmutableArray<string> keys,

            ImmutableArray<string> lastNames,

            ImmutableArray<string> userIds)
        {
            Comments = comments;
            Emails = emails;
            Enableds = enableds;
            ExpirationDates = expirationDates;
            FirstNames = firstNames;
            Groups = groups;
            Id = id;
            Keys = keys;
            LastNames = lastNames;
            UserIds = userIds;
        }
    }
}
