namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties =

  //#region ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties

  [<CLIMutable>]
  type ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties = {
    [<JsonProperty(PropertyName = "ignore_path")>]
    IgnorePath : ConfigNodePropertyBoolean;
  }

  //#endregion
