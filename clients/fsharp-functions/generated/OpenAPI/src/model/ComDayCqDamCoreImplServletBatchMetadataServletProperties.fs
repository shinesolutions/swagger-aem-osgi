namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyInteger

module ComDayCqDamCoreImplServletBatchMetadataServletProperties =

  //#region ComDayCqDamCoreImplServletBatchMetadataServletProperties

  [<CLIMutable>]
  type ComDayCqDamCoreImplServletBatchMetadataServletProperties = {
    [<JsonProperty(PropertyName = "cq.dam.batch.metadata.asset.default")>]
    CqDamBatchMetadataAssetDefault : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "cq.dam.batch.metadata.collection.default")>]
    CqDamBatchMetadataCollectionDefault : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "cq.dam.batch.metadata.maxresources")>]
    CqDamBatchMetadataMaxresources : ConfigNodePropertyInteger;
  }

  //#endregion
