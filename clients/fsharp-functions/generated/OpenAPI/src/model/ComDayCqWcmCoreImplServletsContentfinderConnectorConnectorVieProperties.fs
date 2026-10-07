namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties =

  //#region ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties

  [<CLIMutable>]
  type ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties = {
    [<JsonProperty(PropertyName = "item.resource.types")>]
    ItemResourceTypes : ConfigNodePropertyArray;
  }

  //#endregion
