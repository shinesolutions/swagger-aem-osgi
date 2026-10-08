namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqPollingImporterImplManagedPollConfigImplProperties =

  //#region ComDayCqPollingImporterImplManagedPollConfigImplProperties

  [<CLIMutable>]
  type ComDayCqPollingImporterImplManagedPollConfigImplProperties = {
    [<JsonProperty(PropertyName = "id")>]
    Id : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "enabled")>]
    Enabled : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "reference")>]
    Reference : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "interval")>]
    Interval : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "expression")>]
    Expression : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "source")>]
    Source : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "target")>]
    Target : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "login")>]
    Login : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "password")>]
    Password : ConfigNodePropertyString;
  }

  //#endregion
