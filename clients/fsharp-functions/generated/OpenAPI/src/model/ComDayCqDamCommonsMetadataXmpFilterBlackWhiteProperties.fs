namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties =

  //#region ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties

  [<CLIMutable>]
  type ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties = {
    [<JsonProperty(PropertyName = "xmp.filter.apply_whitelist")>]
    XmpFilterApplyWhitelist : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "xmp.filter.whitelist")>]
    XmpFilterWhitelist : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "xmp.filter.apply_blacklist")>]
    XmpFilterApplyBlacklist : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "xmp.filter.blacklist")>]
    XmpFilterBlacklist : ConfigNodePropertyArray;
  }

  //#endregion
