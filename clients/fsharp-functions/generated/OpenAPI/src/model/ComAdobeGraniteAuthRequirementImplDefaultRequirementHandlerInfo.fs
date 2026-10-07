namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties

module ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo =

  //#region ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo

  [<CLIMutable>]
  type ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties;
  }

  //#endregion
