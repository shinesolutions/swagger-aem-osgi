namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties =

  //#region ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties

  [<CLIMutable>]
  type ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties = {
    [<JsonProperty(PropertyName = "aggregate.relationships")>]
    AggregateRelationships : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "aggregate.descend.virtual")>]
    AggregateDescendVirtual : ConfigNodePropertyBoolean;
  }

  //#endregion
