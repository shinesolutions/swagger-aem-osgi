namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteCorsImplCORSPolicyImplProperties

module ComAdobeGraniteCorsImplCORSPolicyImplInfo =

  //#region ComAdobeGraniteCorsImplCORSPolicyImplInfo

  [<CLIMutable>]
  type ComAdobeGraniteCorsImplCORSPolicyImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteCorsImplCORSPolicyImplProperties;
  }

  //#endregion
