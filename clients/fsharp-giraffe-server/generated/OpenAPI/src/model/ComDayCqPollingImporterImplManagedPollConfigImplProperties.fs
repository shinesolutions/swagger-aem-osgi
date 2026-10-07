namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqPollingImporterImplManagedPollConfigImplProperties =

  //#region ComDayCqPollingImporterImplManagedPollConfigImplProperties


  type comDayCqPollingImporterImplManagedPollConfigImplProperties = {
    Id : ConfigNodePropertyString;
    Enabled : ConfigNodePropertyBoolean;
    Reference : ConfigNodePropertyBoolean;
    Interval : ConfigNodePropertyInteger;
    Expression : ConfigNodePropertyString;
    Source : ConfigNodePropertyString;
    Target : ConfigNodePropertyString;
    Login : ConfigNodePropertyString;
    Password : ConfigNodePropertyString;
  }
  //#endregion
