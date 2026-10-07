namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties =

  //#region ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties

  [<CLIMutable>]
  type ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties = {
    [<JsonProperty(PropertyName = "event.topics")>]
    EventTopics : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "event.filter")>]
    EventFilter : ConfigNodePropertyString;
  }

  //#endregion
