namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqScheduledExporterImplScheduledExporterImplProperties =

  //#region ComAdobeCqScheduledExporterImplScheduledExporterImplProperties

  [<CLIMutable>]
  type ComAdobeCqScheduledExporterImplScheduledExporterImplProperties = {
    [<JsonProperty(PropertyName = "include.paths")>]
    IncludePaths : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "exporter.user")>]
    ExporterUser : ConfigNodePropertyString;
  }

  //#endregion
