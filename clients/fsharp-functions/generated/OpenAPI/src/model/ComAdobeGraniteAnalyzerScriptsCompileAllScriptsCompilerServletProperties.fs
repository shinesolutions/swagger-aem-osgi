namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties =

  //#region ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties

  [<CLIMutable>]
  type ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties = {
    [<JsonProperty(PropertyName = "disabled")>]
    Disabled : ConfigNodePropertyBoolean;
  }

  //#endregion
