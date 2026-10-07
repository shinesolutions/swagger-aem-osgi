namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties

module ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo =

  //#region ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo

  [<CLIMutable>]
  type ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties;
  }

  //#endregion
