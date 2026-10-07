namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyInteger

module ComDayCqDamCoreImplServletCollectionsServletProperties =

  //#region ComDayCqDamCoreImplServletCollectionsServletProperties

  [<CLIMutable>]
  type ComDayCqDamCoreImplServletCollectionsServletProperties = {
    [<JsonProperty(PropertyName = "cq.dam.batch.collections.properties")>]
    CqDamBatchCollectionsProperties : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "cq.dam.batch.collections.limit")>]
    CqDamBatchCollectionsLimit : ConfigNodePropertyInteger;
  }

  //#endregion
