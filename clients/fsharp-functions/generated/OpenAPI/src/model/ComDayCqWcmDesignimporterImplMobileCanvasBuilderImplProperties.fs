namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties =

  //#region ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties

  [<CLIMutable>]
  type ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties = {
    [<JsonProperty(PropertyName = "filepattern")>]
    Filepattern : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "device.groups")>]
    DeviceGroups : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "build.page.nodes")>]
    BuildPageNodes : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "build.client.libs")>]
    BuildClientLibs : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "build.canvas.component")>]
    BuildCanvasComponent : ConfigNodePropertyBoolean;
  }

  //#endregion
