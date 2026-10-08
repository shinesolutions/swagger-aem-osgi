namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties

module ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo =

  //#region ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo

  [<CLIMutable>]
  type ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties;
  }

  //#endregion
