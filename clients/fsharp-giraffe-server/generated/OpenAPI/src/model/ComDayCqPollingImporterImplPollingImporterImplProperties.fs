namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqPollingImporterImplPollingImporterImplProperties =

  //#region ComDayCqPollingImporterImplPollingImporterImplProperties


  type comDayCqPollingImporterImplPollingImporterImplProperties = {
    ImporterMinInterval : ConfigNodePropertyInteger;
    ImporterUser : ConfigNodePropertyString;
    ExcludePaths : ConfigNodePropertyArray;
    IncludePaths : ConfigNodePropertyArray;
  }
  //#endregion
