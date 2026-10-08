namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComDayCqSecurityACLSetupProperties =

  //#region ComDayCqSecurityACLSetupProperties

  [<CLIMutable>]
  type ComDayCqSecurityACLSetupProperties = {
    [<JsonProperty(PropertyName = "cq.aclsetup.rules")>]
    CqAclsetupRules : ConfigNodePropertyArray;
  }

  //#endregion
