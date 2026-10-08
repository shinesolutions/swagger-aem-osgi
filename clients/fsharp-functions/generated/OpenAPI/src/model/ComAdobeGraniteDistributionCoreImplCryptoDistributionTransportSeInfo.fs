namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties

module ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo =

  //#region ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo

  [<CLIMutable>]
  type ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties;
  }

  //#endregion
