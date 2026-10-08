namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComAdobeAemTransactionCoreImplTransactionRecorderProperties =

  //#region ComAdobeAemTransactionCoreImplTransactionRecorderProperties

  [<CLIMutable>]
  type ComAdobeAemTransactionCoreImplTransactionRecorderProperties = {
    [<JsonProperty(PropertyName = "isTransactionRecordingEnabled")>]
    IsTransactionRecordingEnabled : ConfigNodePropertyBoolean;
  }

  //#endregion
