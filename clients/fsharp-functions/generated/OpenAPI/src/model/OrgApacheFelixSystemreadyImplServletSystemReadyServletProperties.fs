namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties =

  //#region OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties

  [<CLIMutable>]
  type OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties = {
    [<JsonProperty(PropertyName = "osgi.http.whiteboard.servlet.pattern")>]
    OsgiHttpWhiteboardServletPattern : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "osgi.http.whiteboard.context.select")>]
    OsgiHttpWhiteboardContextSelect : ConfigNodePropertyString;
  }

  //#endregion
