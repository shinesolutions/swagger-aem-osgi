namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties =

  //#region OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties

  [<CLIMutable>]
  type OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties = {
    [<JsonProperty(PropertyName = "path")>]
    Path : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "checkpath.prefix")>]
    CheckpathPrefix : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "jcrPath")>]
    JcrPath : ConfigNodePropertyString;
  }

  //#endregion
