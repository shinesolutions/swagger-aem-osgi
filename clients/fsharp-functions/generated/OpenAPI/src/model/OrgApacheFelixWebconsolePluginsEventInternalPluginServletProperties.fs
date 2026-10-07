namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger

module OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties =

  //#region OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties

  [<CLIMutable>]
  type OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties = {
    [<JsonProperty(PropertyName = "max.size")>]
    MaxSize : ConfigNodePropertyInteger;
  }

  //#endregion
