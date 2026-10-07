namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties =

  //#region ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties

  [<CLIMutable>]
  type ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties = {
    [<JsonProperty(PropertyName = "filepattern")>]
    Filepattern : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "build.page.nodes")>]
    BuildPageNodes : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "build.client.libs")>]
    BuildClientLibs : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "build.canvas.component")>]
    BuildCanvasComponent : ConfigNodePropertyBoolean;
  }

  //#endregion
