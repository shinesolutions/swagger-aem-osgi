namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties

module OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfo =

  //#region OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfo

  [<CLIMutable>]
  type OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties;
  }

  //#endregion
