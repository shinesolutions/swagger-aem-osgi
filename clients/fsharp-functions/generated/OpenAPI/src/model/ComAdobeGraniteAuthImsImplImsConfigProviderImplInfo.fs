namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties

module ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo =

  //#region ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo

  [<CLIMutable>]
  type ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties;
  }

  //#endregion
