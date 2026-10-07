namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties =

  //#region OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties

  [<CLIMutable>]
  type OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties = {
    [<JsonProperty(PropertyName = "mime.types")>]
    MimeTypes : ConfigNodePropertyArray;
  }

  //#endregion
