namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties

module ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo =

  //#region ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo

  [<CLIMutable>]
  type ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties;
  }

  //#endregion
