namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties =

  //#region ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties

  [<CLIMutable>]
  type ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties = {
    [<JsonProperty(PropertyName = "oauth.configmanager.ims.configid")>]
    OauthConfigmanagerImsConfigid : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "ims.owningEntity")>]
    ImsOwningEntity : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "aem.instanceId")>]
    AemInstanceId : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "ims.serviceCode")>]
    ImsServiceCode : ConfigNodePropertyString;
  }

  //#endregion
