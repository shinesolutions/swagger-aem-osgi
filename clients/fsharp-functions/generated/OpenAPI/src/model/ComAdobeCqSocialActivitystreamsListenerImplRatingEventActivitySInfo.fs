namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties

module ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo =

  //#region ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo

  [<CLIMutable>]
  type ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties;
  }

  //#endregion
