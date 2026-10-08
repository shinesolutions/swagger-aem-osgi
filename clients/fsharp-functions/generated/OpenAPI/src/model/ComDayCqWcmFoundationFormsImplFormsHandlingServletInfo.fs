namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties

module ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo =

  //#region ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo

  [<CLIMutable>]
  type ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties;
  }

  //#endregion
