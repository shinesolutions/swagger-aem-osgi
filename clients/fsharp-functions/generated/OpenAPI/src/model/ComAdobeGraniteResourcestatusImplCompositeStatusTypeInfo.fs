namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties

module ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo =

  //#region ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo

  [<CLIMutable>]
  type ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties;
  }

  //#endregion
