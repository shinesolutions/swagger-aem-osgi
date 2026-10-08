namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger

module ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties =

  //#region ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties

  [<CLIMutable>]
  type ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties = {
    [<JsonProperty(PropertyName = "ranking")>]
    Ranking : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "enable")>]
    Enable : ConfigNodePropertyBoolean;
  }

  //#endregion
