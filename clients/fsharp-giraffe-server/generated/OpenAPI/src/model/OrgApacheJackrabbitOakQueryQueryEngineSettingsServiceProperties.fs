namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger

module OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties =

  //#region OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties


  type orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties = {
    QueryLimitInMemory : ConfigNodePropertyInteger;
    QueryLimitReads : ConfigNodePropertyInteger;
    QueryFailTraversal : ConfigNodePropertyBoolean;
    FastQuerySize : ConfigNodePropertyBoolean;
  }
  //#endregion
