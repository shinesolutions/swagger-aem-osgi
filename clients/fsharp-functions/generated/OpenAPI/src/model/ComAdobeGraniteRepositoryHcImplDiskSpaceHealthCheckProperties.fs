namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyInteger

module ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties =

  //#region ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties

  [<CLIMutable>]
  type ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties = {
    [<JsonProperty(PropertyName = "hc.tags")>]
    HcTags : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "disk.space.warn.threshold")>]
    DiskSpaceWarnThreshold : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "disk.space.error.threshold")>]
    DiskSpaceErrorThreshold : ConfigNodePropertyInteger;
  }

  //#endregion
