namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties =

  //#region ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties

  [<CLIMutable>]
  type ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties = {
    [<JsonProperty(PropertyName = "brightedge.url")>]
    BrightedgeUrl : ConfigNodePropertyString;
  }

  //#endregion
