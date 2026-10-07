namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties =

  //#region ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties

  [<CLIMutable>]
  type ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties = {
    [<JsonProperty(PropertyName = "pseudo.patterns")>]
    PseudoPatterns : ConfigNodePropertyArray;
  }

  //#endregion
