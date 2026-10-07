namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger

module OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties =

  //#region OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties

  [<CLIMutable>]
  type OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties = {
    [<JsonProperty(PropertyName = "queryLimitInMemory")>]
    QueryLimitInMemory : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "queryLimitReads")>]
    QueryLimitReads : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "queryFailTraversal")>]
    QueryFailTraversal : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "fastQuerySize")>]
    FastQuerySize : ConfigNodePropertyBoolean;
  }

  //#endregion
