namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties =

  //#region ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties

  [<CLIMutable>]
  type ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties = {
    [<JsonProperty(PropertyName = "security.preferences.name")>]
    SecurityPreferencesName : ConfigNodePropertyString;
  }

  //#endregion
