namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingResourcemergerPickerOverridingProperties =

  //#region OrgApacheSlingResourcemergerPickerOverridingProperties

  [<CLIMutable>]
  type OrgApacheSlingResourcemergerPickerOverridingProperties = {
    [<JsonProperty(PropertyName = "merge.root")>]
    MergeRoot : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "merge.readOnly")>]
    MergeReadOnly : ConfigNodePropertyBoolean;
  }

  //#endregion
