namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger

module ComDayCqDamInddImplServletSnippetCreationServletProperties =

  //#region ComDayCqDamInddImplServletSnippetCreationServletProperties

  [<CLIMutable>]
  type ComDayCqDamInddImplServletSnippetCreationServletProperties = {
    [<JsonProperty(PropertyName = "snippetcreation.maxcollections")>]
    SnippetcreationMaxcollections : ConfigNodePropertyInteger;
  }

  //#endregion
