namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties

module ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo =

  //#region ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo

  [<CLIMutable>]
  type ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties;
  }

  //#endregion
