namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingXssImplXSSFilterImplProperties =

  //#region OrgApacheSlingXssImplXSSFilterImplProperties

  [<CLIMutable>]
  type OrgApacheSlingXssImplXSSFilterImplProperties = {
    [<JsonProperty(PropertyName = "policyPath")>]
    PolicyPath : ConfigNodePropertyString;
  }

  //#endregion
