namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties

module ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo =

  //#region ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo

  [<CLIMutable>]
  type ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties;
  }

  //#endregion
