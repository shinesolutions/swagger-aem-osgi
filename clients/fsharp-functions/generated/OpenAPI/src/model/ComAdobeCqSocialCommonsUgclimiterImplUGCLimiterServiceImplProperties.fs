namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties =

  //#region ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties

  [<CLIMutable>]
  type ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties = {
    [<JsonProperty(PropertyName = "event.topics")>]
    EventTopics : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "event.filter")>]
    EventFilter : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "verbs")>]
    Verbs : ConfigNodePropertyArray;
  }

  //#endregion
