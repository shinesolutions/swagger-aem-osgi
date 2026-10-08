namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties =

  //#region ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties

  [<CLIMutable>]
  type ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties = {
    [<JsonProperty(PropertyName = "dam.showexpired")>]
    DamShowexpired : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "dam.showhidden")>]
    DamShowhidden : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "tagTitleSearch")>]
    TagTitleSearch : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "guessTotal")>]
    GuessTotal : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "dam.expiryProperty")>]
    DamExpiryProperty : ConfigNodePropertyString;
  }

  //#endregion
