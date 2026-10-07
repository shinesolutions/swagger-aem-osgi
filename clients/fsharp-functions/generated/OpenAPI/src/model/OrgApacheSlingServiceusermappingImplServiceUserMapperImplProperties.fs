namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties =

  //#region OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties

  [<CLIMutable>]
  type OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties = {
    [<JsonProperty(PropertyName = "user.mapping")>]
    UserMapping : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "user.default")>]
    UserDefault : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "user.enable.default.mapping")>]
    UserEnableDefaultMapping : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "require.validation")>]
    RequireValidation : ConfigNodePropertyBoolean;
  }

  //#endregion
