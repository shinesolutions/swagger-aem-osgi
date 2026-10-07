namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger

module ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties =

  //#region ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties

  [<CLIMutable>]
  type ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties = {
    [<JsonProperty(PropertyName = "cq.dam.adhoc.asset.share.prezip.maxcontentsize")>]
    CqDamAdhocAssetSharePrezipMaxcontentsize : ConfigNodePropertyInteger;
  }

  //#endregion
