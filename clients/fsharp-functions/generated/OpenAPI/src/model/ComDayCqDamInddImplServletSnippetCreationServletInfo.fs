namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqDamInddImplServletSnippetCreationServletProperties

module ComDayCqDamInddImplServletSnippetCreationServletInfo =

  //#region ComDayCqDamInddImplServletSnippetCreationServletInfo

  [<CLIMutable>]
  type ComDayCqDamInddImplServletSnippetCreationServletInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqDamInddImplServletSnippetCreationServletProperties;
  }

  //#endregion
