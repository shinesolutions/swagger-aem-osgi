namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties =

  //#region ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties

  [<CLIMutable>]
  type ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties = {
    [<JsonProperty(PropertyName = "hc.tags")>]
    HcTags : ConfigNodePropertyArray;
  }

  //#endregion
