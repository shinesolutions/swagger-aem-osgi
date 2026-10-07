namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqContentsyncImplContentSyncManagerImplProperties =

  //#region ComDayCqContentsyncImplContentSyncManagerImplProperties

  [<CLIMutable>]
  type ComDayCqContentsyncImplContentSyncManagerImplProperties = {
    [<JsonProperty(PropertyName = "contentsync.fallback.authorizable")>]
    ContentsyncFallbackAuthorizable : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "contentsync.fallback.updateuser")>]
    ContentsyncFallbackUpdateuser : ConfigNodePropertyString;
  }

  //#endregion
