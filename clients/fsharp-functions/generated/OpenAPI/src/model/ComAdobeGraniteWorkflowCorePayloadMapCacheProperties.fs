namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteWorkflowCorePayloadMapCacheProperties =

  //#region ComAdobeGraniteWorkflowCorePayloadMapCacheProperties

  [<CLIMutable>]
  type ComAdobeGraniteWorkflowCorePayloadMapCacheProperties = {
    [<JsonProperty(PropertyName = "getSystemWorkflowModels")>]
    GetSystemWorkflowModels : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "getPackageRootPath")>]
    GetPackageRootPath : ConfigNodePropertyString;
  }

  //#endregion
