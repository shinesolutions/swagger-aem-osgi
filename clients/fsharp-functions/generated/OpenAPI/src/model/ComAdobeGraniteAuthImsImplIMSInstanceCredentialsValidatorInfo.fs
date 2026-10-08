namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties

module ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo =

  //#region ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo

  [<CLIMutable>]
  type ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties;
  }

  //#endregion
