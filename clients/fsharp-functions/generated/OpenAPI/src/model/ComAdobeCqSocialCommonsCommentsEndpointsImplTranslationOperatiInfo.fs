namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties

module ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo =

  //#region ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo

  [<CLIMutable>]
  type ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties;
  }

  //#endregion
