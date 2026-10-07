namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger

module OrgApacheFelixSystemreadySystemReadyMonitorProperties =

  //#region OrgApacheFelixSystemreadySystemReadyMonitorProperties

  [<CLIMutable>]
  type OrgApacheFelixSystemreadySystemReadyMonitorProperties = {
    [<JsonProperty(PropertyName = "poll.interval")>]
    PollInterval : ConfigNodePropertyInteger;
  }

  //#endregion
