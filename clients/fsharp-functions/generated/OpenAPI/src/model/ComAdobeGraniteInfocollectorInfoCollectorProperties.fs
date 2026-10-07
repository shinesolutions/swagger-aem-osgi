namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComAdobeGraniteInfocollectorInfoCollectorProperties =

  //#region ComAdobeGraniteInfocollectorInfoCollectorProperties

  [<CLIMutable>]
  type ComAdobeGraniteInfocollectorInfoCollectorProperties = {
    [<JsonProperty(PropertyName = "granite.infocollector.includeThreadDumps")>]
    GraniteInfocollectorIncludeThreadDumps : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "granite.infocollector.includeHeapDump")>]
    GraniteInfocollectorIncludeHeapDump : ConfigNodePropertyBoolean;
  }

  //#endregion
