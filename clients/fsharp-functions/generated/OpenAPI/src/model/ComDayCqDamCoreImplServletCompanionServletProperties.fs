namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqDamCoreImplServletCompanionServletProperties =

  //#region ComDayCqDamCoreImplServletCompanionServletProperties

  [<CLIMutable>]
  type ComDayCqDamCoreImplServletCompanionServletProperties = {
    [<JsonProperty(PropertyName = "More Info")>]
    MoreInfo : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "/mnt/overlay/dam/gui/content/assets/moreinfo.html/${path}")>]
    MntOverlayDamGuiContentAssetsMoreinfoHtmlPath : ConfigNodePropertyString;
  }

  //#endregion
