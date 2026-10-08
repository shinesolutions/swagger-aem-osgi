namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties =

  //#region ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties

  [<CLIMutable>]
  type ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties = {
    [<JsonProperty(PropertyName = "adapt.supported.widths")>]
    AdaptSupportedWidths : ConfigNodePropertyArray;
  }

  //#endregion
