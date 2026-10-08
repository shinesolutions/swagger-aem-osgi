namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyInteger

module ComDayCqDamCoreImplServletCollectionServletProperties =

  //#region ComDayCqDamCoreImplServletCollectionServletProperties

  [<CLIMutable>]
  type ComDayCqDamCoreImplServletCollectionServletProperties = {
    [<JsonProperty(PropertyName = "cq.dam.batch.collection.properties")>]
    CqDamBatchCollectionProperties : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "cq.dam.batch.collection.maxcollections")>]
    CqDamBatchCollectionMaxcollections : ConfigNodePropertyInteger;
  }

  //#endregion
