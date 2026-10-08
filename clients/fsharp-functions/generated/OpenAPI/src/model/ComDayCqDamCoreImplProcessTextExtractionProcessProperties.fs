namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyInteger

module ComDayCqDamCoreImplProcessTextExtractionProcessProperties =

  //#region ComDayCqDamCoreImplProcessTextExtractionProcessProperties

  [<CLIMutable>]
  type ComDayCqDamCoreImplProcessTextExtractionProcessProperties = {
    [<JsonProperty(PropertyName = "mimeTypes")>]
    MimeTypes : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "maxExtract")>]
    MaxExtract : ConfigNodePropertyInteger;
  }

  //#endregion
