namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties

module ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo =

  //#region ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo

  [<CLIMutable>]
  type ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties;
  }

  //#endregion
