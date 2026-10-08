namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger

module ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties =

  //#region ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties

  [<CLIMutable>]
  type ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties = {
    [<JsonProperty(PropertyName = "binary.threshold")>]
    BinaryThreshold : ConfigNodePropertyInteger;
  }

  //#endregion
