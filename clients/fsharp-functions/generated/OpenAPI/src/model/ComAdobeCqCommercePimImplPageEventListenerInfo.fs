namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqCommercePimImplPageEventListenerProperties

module ComAdobeCqCommercePimImplPageEventListenerInfo =

  //#region ComAdobeCqCommercePimImplPageEventListenerInfo

  [<CLIMutable>]
  type ComAdobeCqCommercePimImplPageEventListenerInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqCommercePimImplPageEventListenerProperties;
  }

  //#endregion
