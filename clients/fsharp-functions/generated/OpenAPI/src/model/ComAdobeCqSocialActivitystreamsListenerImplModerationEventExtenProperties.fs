namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger

module ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties =

  //#region ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties

  [<CLIMutable>]
  type ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties = {
    [<JsonProperty(PropertyName = "accepted")>]
    Accepted : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "ranked")>]
    Ranked : ConfigNodePropertyInteger;
  }

  //#endregion
