namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger

module OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties =

  //#region OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties

  [<CLIMutable>]
  type OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties = {
    [<JsonProperty(PropertyName = "totalWidth")>]
    TotalWidth : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "colWidthName")>]
    ColWidthName : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "colWidthResult")>]
    ColWidthResult : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "colWidthTiming")>]
    ColWidthTiming : ConfigNodePropertyInteger;
  }

  //#endregion
