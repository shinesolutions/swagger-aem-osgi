namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqSocialScoringImplScoringEventListenerProperties =

  //#region ComAdobeCqSocialScoringImplScoringEventListenerProperties

  [<CLIMutable>]
  type ComAdobeCqSocialScoringImplScoringEventListenerProperties = {
    [<JsonProperty(PropertyName = "event.topics")>]
    EventTopics : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "event.filter")>]
    EventFilter : ConfigNodePropertyString;
  }

  //#endregion
