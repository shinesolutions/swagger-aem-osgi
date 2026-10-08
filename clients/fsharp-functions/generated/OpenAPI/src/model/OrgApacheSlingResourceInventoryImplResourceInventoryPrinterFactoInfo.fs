namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties

module OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo =

  //#region OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo

  [<CLIMutable>]
  type OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties;
  }

  //#endregion
