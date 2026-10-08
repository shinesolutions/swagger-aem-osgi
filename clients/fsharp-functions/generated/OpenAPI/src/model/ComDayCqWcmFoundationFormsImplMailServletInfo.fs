namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqWcmFoundationFormsImplMailServletProperties

module ComDayCqWcmFoundationFormsImplMailServletInfo =

  //#region ComDayCqWcmFoundationFormsImplMailServletInfo

  [<CLIMutable>]
  type ComDayCqWcmFoundationFormsImplMailServletInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqWcmFoundationFormsImplMailServletProperties;
  }

  //#endregion
