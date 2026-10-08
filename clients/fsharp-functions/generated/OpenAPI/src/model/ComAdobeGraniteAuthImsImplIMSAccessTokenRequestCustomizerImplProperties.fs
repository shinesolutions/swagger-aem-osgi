namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties =

  //#region ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties

  [<CLIMutable>]
  type ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties = {
    [<JsonProperty(PropertyName = "auth.ims.client.secret")>]
    AuthImsClientSecret : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "customizer.type")>]
    CustomizerType : ConfigNodePropertyString;
  }

  //#endregion
