namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties

module ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo =

  //#region ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo

  [<CLIMutable>]
  type ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties;
  }

  //#endregion
