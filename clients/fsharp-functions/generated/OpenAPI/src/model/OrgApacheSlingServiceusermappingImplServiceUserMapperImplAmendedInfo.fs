namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties

module OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo =

  //#region OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo

  [<CLIMutable>]
  type OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties;
  }

  //#endregion
