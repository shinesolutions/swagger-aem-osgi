namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties

module ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo =

  //#region ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo

  [<CLIMutable>]
  type ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties;
  }

  //#endregion
