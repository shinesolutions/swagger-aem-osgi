namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties

module ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo =

  //#region ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo

  [<CLIMutable>]
  type ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties;
  }

  //#endregion
