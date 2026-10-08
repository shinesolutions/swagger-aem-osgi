namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties =

  //#region ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties

  [<CLIMutable>]
  type ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties = {
    [<JsonProperty(PropertyName = "event.filter")>]
    EventFilter : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "fontmgr.system.font.dir")>]
    FontmgrSystemFontDir : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "fontmgr.adobe.font.dir")>]
    FontmgrAdobeFontDir : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "fontmgr.customer.font.dir")>]
    FontmgrCustomerFontDir : ConfigNodePropertyString;
  }

  //#endregion
