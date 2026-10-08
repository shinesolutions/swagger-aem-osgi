namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties

module ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo =

  //#region ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo

  [<CLIMutable>]
  type ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties;
  }

  //#endregion
