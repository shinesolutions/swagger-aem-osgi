namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties =

  //#region OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties

  [<CLIMutable>]
  type OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties = {
    [<JsonProperty(PropertyName = "name")>]
    Name : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "jcrPrivilege")>]
    JcrPrivilege : ConfigNodePropertyString;
  }

  //#endregion
