namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties

module ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo =

  //#region ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo

  [<CLIMutable>]
  type ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties;
  }

  //#endregion
