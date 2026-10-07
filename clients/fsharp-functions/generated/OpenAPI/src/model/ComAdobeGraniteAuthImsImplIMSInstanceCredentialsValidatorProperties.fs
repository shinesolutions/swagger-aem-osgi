namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties =

  //#region ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties

  [<CLIMutable>]
  type ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties = {
    [<JsonProperty(PropertyName = "oauth.provider.id")>]
    OauthProviderId : ConfigNodePropertyString;
  }

  //#endregion
