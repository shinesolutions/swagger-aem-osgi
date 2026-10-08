namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties =

  //#region ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties

  [<CLIMutable>]
  type ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties = {
    [<JsonProperty(PropertyName = "page.info.provider.property.regex.default")>]
    PageInfoProviderPropertyRegexDefault : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "page.info.provider.property.name")>]
    PageInfoProviderPropertyName : ConfigNodePropertyString;
  }

  //#endregion
