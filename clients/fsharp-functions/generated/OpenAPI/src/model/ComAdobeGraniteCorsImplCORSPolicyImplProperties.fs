namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger

module ComAdobeGraniteCorsImplCORSPolicyImplProperties =

  //#region ComAdobeGraniteCorsImplCORSPolicyImplProperties

  [<CLIMutable>]
  type ComAdobeGraniteCorsImplCORSPolicyImplProperties = {
    [<JsonProperty(PropertyName = "alloworigin")>]
    Alloworigin : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "alloworiginregexp")>]
    Alloworiginregexp : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "allowedpaths")>]
    Allowedpaths : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "exposedheaders")>]
    Exposedheaders : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "maxage")>]
    Maxage : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "supportedheaders")>]
    Supportedheaders : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "supportedmethods")>]
    Supportedmethods : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "supportscredentials")>]
    Supportscredentials : ConfigNodePropertyBoolean;
  }

  //#endregion
