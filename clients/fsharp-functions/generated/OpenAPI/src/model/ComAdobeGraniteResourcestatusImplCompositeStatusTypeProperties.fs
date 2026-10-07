namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties =

  //#region ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties

  [<CLIMutable>]
  type ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties = {
    [<JsonProperty(PropertyName = "name")>]
    Name : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "types")>]
    Types : ConfigNodePropertyArray;
  }

  //#endregion
