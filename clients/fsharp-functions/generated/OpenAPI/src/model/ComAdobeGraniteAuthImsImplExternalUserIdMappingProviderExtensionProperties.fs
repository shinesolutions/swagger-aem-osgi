namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties =

  //#region ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties

  [<CLIMutable>]
  type ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties = {
    [<JsonProperty(PropertyName = "oauth.provider.id")>]
    OauthProviderId : ConfigNodePropertyString;
  }

  //#endregion
