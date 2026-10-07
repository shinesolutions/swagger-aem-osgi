namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties =

  //#region ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties

  [<CLIMutable>]
  type ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties = {
    [<JsonProperty(PropertyName = "name")>]
    Name : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "username")>]
    Username : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "encryptedPassword")>]
    EncryptedPassword : ConfigNodePropertyString;
  }

  //#endregion
