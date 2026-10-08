namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteRestImplServletDefaultGETServletProperties

module ComAdobeGraniteRestImplServletDefaultGETServletInfo =

  //#region ComAdobeGraniteRestImplServletDefaultGETServletInfo

  [<CLIMutable>]
  type ComAdobeGraniteRestImplServletDefaultGETServletInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteRestImplServletDefaultGETServletProperties;
  }

  //#endregion
