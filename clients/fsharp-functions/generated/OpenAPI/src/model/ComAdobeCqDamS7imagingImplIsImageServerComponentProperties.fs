namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqDamS7imagingImplIsImageServerComponentProperties =

  //#region ComAdobeCqDamS7imagingImplIsImageServerComponentProperties

  [<CLIMutable>]
  type ComAdobeCqDamS7imagingImplIsImageServerComponentProperties = {
    [<JsonProperty(PropertyName = "TcpPort")>]
    TcpPort : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "AllowRemoteAccess")>]
    AllowRemoteAccess : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "MaxRenderRgnPixels")>]
    MaxRenderRgnPixels : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "MaxMessageSize")>]
    MaxMessageSize : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "RandomAccessUrlTimeout")>]
    RandomAccessUrlTimeout : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "WorkerThreads")>]
    WorkerThreads : ConfigNodePropertyInteger;
  }

  //#endregion
