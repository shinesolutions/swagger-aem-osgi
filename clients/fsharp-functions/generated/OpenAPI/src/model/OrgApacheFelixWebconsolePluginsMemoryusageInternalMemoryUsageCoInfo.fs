namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties

module OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo =

  //#region OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo

  [<CLIMutable>]
  type OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties;
  }

  //#endregion
