namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties =

  //#region ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties

  [<CLIMutable>]
  type ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties = {
    [<JsonProperty(PropertyName = "streamPath")>]
    StreamPath : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "streamName")>]
    StreamName : ConfigNodePropertyString;
  }

  //#endregion
