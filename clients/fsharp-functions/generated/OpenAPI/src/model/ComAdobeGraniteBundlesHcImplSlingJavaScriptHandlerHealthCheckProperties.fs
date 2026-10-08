namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties =

  //#region ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties

  [<CLIMutable>]
  type ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties = {
    [<JsonProperty(PropertyName = "hc.tags")>]
    HcTags : ConfigNodePropertyArray;
  }

  //#endregion
