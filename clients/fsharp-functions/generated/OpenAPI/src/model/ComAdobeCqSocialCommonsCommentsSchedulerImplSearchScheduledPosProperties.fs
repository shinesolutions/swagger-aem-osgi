namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger

module ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties =

  //#region ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties

  [<CLIMutable>]
  type ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties = {
    [<JsonProperty(PropertyName = "enableScheduledPostsSearch")>]
    EnableScheduledPostsSearch : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "numberOfMinutes")>]
    NumberOfMinutes : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "maxSearchLimit")>]
    MaxSearchLimit : ConfigNodePropertyInteger;
  }

  //#endregion
