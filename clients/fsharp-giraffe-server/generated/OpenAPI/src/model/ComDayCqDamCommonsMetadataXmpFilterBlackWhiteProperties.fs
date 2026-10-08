namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties =

  //#region ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties


  type comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties = {
    XmpFilterApplyWhitelist : ConfigNodePropertyBoolean;
    XmpFilterWhitelist : ConfigNodePropertyArray;
    XmpFilterApplyBlacklist : ConfigNodePropertyBoolean;
    XmpFilterBlacklist : ConfigNodePropertyArray;
  }
  //#endregion
