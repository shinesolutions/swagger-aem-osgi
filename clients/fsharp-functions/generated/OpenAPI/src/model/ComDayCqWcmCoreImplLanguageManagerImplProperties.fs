namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqWcmCoreImplLanguageManagerImplProperties =

  //#region ComDayCqWcmCoreImplLanguageManagerImplProperties

  [<CLIMutable>]
  type ComDayCqWcmCoreImplLanguageManagerImplProperties = {
    [<JsonProperty(PropertyName = "langmgr.list.path")>]
    LangmgrListPath : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "langmgr.country.default")>]
    LangmgrCountryDefault : ConfigNodePropertyArray;
  }

  //#endregion
