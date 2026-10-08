namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties =

  //#region ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties

  [<CLIMutable>]
  type ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties = {
    [<JsonProperty(PropertyName = "path")>]
    Path : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "service.ranking")>]
    ServiceRanking : ConfigNodePropertyInteger;
  }

  //#endregion
