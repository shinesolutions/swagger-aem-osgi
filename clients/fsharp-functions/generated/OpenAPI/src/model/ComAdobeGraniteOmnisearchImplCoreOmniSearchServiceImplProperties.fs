namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger

module ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties =

  //#region ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties

  [<CLIMutable>]
  type ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties = {
    [<JsonProperty(PropertyName = "omnisearch.suggestion.requiretext.min")>]
    OmnisearchSuggestionRequiretextMin : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "omnisearch.suggestion.spellcheck.require")>]
    OmnisearchSuggestionSpellcheckRequire : ConfigNodePropertyBoolean;
  }

  //#endregion
