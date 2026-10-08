namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean

module OrgApacheSlingSecurityImplReferrerFilterProperties =

  //#region OrgApacheSlingSecurityImplReferrerFilterProperties

  [<CLIMutable>]
  type OrgApacheSlingSecurityImplReferrerFilterProperties = {
    [<JsonProperty(PropertyName = "allow.empty")>]
    AllowEmpty : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "allow.hosts")>]
    AllowHosts : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "allow.hosts.regexp")>]
    AllowHostsRegexp : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "filter.methods")>]
    FilterMethods : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "exclude.agents.regexp")>]
    ExcludeAgentsRegexp : ConfigNodePropertyArray;
  }

  //#endregion
