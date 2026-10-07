namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties =

  //#region OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties

  [<CLIMutable>]
  type OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties = {
    [<JsonProperty(PropertyName = "felix.inventory.printer.name")>]
    FelixInventoryPrinterName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "felix.inventory.printer.title")>]
    FelixInventoryPrinterTitle : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "path")>]
    Path : ConfigNodePropertyString;
  }

  //#endregion
