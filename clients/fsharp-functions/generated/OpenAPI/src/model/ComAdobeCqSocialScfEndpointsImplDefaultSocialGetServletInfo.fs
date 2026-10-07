namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties

module ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo =

  //#region ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo

  [<CLIMutable>]
  type ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties;
  }

  //#endregion
