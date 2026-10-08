namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties =

  //#region ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties

  [<CLIMutable>]
  type ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties = {
    [<JsonProperty(PropertyName = "paths")>]
    Paths : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "excludedPaths")>]
    ExcludedPaths : ConfigNodePropertyArray;
  }

  //#endregion
