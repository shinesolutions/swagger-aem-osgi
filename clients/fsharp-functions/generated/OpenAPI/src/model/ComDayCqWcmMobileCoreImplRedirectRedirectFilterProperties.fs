namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties =

  //#region ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties

  [<CLIMutable>]
  type ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties = {
    [<JsonProperty(PropertyName = "redirect.enabled")>]
    RedirectEnabled : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "redirect.stats.enabled")>]
    RedirectStatsEnabled : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "redirect.extensions")>]
    RedirectExtensions : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "redirect.paths")>]
    RedirectPaths : ConfigNodePropertyArray;
  }

  //#endregion
