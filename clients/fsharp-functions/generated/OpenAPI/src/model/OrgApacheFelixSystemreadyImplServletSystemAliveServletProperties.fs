namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties =

  //#region OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties

  [<CLIMutable>]
  type OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties = {
    [<JsonProperty(PropertyName = "osgi.http.whiteboard.servlet.pattern")>]
    OsgiHttpWhiteboardServletPattern : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "osgi.http.whiteboard.context.select")>]
    OsgiHttpWhiteboardContextSelect : ConfigNodePropertyString;
  }

  //#endregion
