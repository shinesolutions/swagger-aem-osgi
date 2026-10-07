namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteFragsImplRandomFeatureProperties =

  //#region ComAdobeGraniteFragsImplRandomFeatureProperties

  [<CLIMutable>]
  type ComAdobeGraniteFragsImplRandomFeatureProperties = {
    [<JsonProperty(PropertyName = "feature.name")>]
    FeatureName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "feature.description")>]
    FeatureDescription : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "active.percentage")>]
    ActivePercentage : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "cookie.name")>]
    CookieName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "cookie.maxAge")>]
    CookieMaxAge : ConfigNodePropertyInteger;
  }

  //#endregion
