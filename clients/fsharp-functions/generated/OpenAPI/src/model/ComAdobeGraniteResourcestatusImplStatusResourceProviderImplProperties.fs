namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties =

  //#region ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties

  [<CLIMutable>]
  type ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties = {
    [<JsonProperty(PropertyName = "provider.root")>]
    ProviderRoot : ConfigNodePropertyString;
  }

  //#endregion
