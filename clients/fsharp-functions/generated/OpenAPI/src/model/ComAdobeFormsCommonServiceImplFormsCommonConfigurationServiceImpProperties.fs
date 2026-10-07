namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyDropDown

module ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties =

  //#region ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties

  [<CLIMutable>]
  type ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties = {
    [<JsonProperty(PropertyName = "tempStorageConfig")>]
    TempStorageConfig : ConfigNodePropertyDropDown;
  }

  //#endregion
