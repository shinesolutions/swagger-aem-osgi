namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingModelsImplModelAdapterFactoryProperties =

  //#region OrgApacheSlingModelsImplModelAdapterFactoryProperties

  [<CLIMutable>]
  type OrgApacheSlingModelsImplModelAdapterFactoryProperties = {
    [<JsonProperty(PropertyName = "osgi.http.whiteboard.listener")>]
    OsgiHttpWhiteboardListener : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "osgi.http.whiteboard.context.select")>]
    OsgiHttpWhiteboardContextSelect : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "max.recursion.depth")>]
    MaxRecursionDepth : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cleanup.job.period")>]
    CleanupJobPeriod : ConfigNodePropertyInteger;
  }

  //#endregion
