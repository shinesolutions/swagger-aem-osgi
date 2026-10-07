namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties =

  //#region ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties

  [<CLIMutable>]
  type ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties = {
    [<JsonProperty(PropertyName = "feature.name")>]
    FeatureName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "feature.description")>]
    FeatureDescription : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "http.header.name")>]
    HttpHeaderName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "http.header.valuepattern")>]
    HttpHeaderValuepattern : ConfigNodePropertyString;
  }

  //#endregion
