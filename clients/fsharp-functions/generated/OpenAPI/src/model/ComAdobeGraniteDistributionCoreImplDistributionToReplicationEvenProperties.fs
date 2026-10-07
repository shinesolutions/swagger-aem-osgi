namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties =

  //#region ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties

  [<CLIMutable>]
  type ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties = {
    [<JsonProperty(PropertyName = "importer.name")>]
    ImporterName : ConfigNodePropertyArray;
  }

  //#endregion
