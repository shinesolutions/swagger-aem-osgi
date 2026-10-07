namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties =

  //#region ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties

  [<CLIMutable>]
  type ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties = {
    [<JsonProperty(PropertyName = "defaultConnectorName")>]
    DefaultConnectorName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "defaultCategory")>]
    DefaultCategory : ConfigNodePropertyString;
  }

  //#endregion
