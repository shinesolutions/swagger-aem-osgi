namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties

module ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo =

  //#region ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo

  [<CLIMutable>]
  type ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties;
  }

  //#endregion
