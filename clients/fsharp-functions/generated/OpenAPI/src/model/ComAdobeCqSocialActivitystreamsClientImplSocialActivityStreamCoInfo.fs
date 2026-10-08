namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties

module ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo =

  //#region ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo

  [<CLIMutable>]
  type ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties;
  }

  //#endregion
