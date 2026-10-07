namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComDayCqWcmDesignimporterDesignPackageImporterProperties =

  //#region ComDayCqWcmDesignimporterDesignPackageImporterProperties

  [<CLIMutable>]
  type ComDayCqWcmDesignimporterDesignPackageImporterProperties = {
    [<JsonProperty(PropertyName = "extract.filter")>]
    ExtractFilter : ConfigNodePropertyArray;
  }

  //#endregion
