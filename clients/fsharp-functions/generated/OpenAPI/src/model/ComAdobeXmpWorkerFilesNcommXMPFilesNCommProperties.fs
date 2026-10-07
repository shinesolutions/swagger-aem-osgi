namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties =

  //#region ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties

  [<CLIMutable>]
  type ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties = {
    [<JsonProperty(PropertyName = "maxConnections")>]
    MaxConnections : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "maxRequests")>]
    MaxRequests : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "requestTimeout")>]
    RequestTimeout : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "logDir")>]
    LogDir : ConfigNodePropertyString;
  }

  //#endregion
