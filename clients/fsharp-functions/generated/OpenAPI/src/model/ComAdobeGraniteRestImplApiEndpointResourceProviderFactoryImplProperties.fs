namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties =

  //#region ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties

  [<CLIMutable>]
  type ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties = {
    [<JsonProperty(PropertyName = "provider.roots")>]
    ProviderRoots : ConfigNodePropertyString;
  }

  //#endregion
