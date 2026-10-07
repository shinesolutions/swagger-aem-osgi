namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyInteger

module ComAdobeGraniteLoggingImplLogAnalyserImplProperties =

  //#region ComAdobeGraniteLoggingImplLogAnalyserImplProperties

  [<CLIMutable>]
  type ComAdobeGraniteLoggingImplLogAnalyserImplProperties = {
    [<JsonProperty(PropertyName = "messages.queue.size")>]
    MessagesQueueSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "logger.config")>]
    LoggerConfig : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "messages.size")>]
    MessagesSize : ConfigNodePropertyInteger;
  }

  //#endregion
