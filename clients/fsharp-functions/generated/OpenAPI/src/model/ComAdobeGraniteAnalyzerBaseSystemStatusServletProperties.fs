namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties =

  //#region ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties

  [<CLIMutable>]
  type ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties = {
    [<JsonProperty(PropertyName = "disabled")>]
    Disabled : ConfigNodePropertyBoolean;
  }

  //#endregion
