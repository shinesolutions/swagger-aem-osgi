namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyInteger

module OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties =

  //#region OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties

  [<CLIMutable>]
  type OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties = {
    [<JsonProperty(PropertyName = "service.ranking")>]
    ServiceRanking : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "user.mapping")>]
    UserMapping : ConfigNodePropertyArray;
  }

  //#endregion
