namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties =

  //#region OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties

  [<CLIMutable>]
  type OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties = {
    [<JsonProperty(PropertyName = "sling.name")>]
    SlingName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "sling.description")>]
    SlingDescription : ConfigNodePropertyString;
  }

  //#endregion
