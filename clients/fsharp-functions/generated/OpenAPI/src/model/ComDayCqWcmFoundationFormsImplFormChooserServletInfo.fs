namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqWcmFoundationFormsImplFormChooserServletProperties

module ComDayCqWcmFoundationFormsImplFormChooserServletInfo =

  //#region ComDayCqWcmFoundationFormsImplFormChooserServletInfo

  [<CLIMutable>]
  type ComDayCqWcmFoundationFormsImplFormChooserServletInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqWcmFoundationFormsImplFormChooserServletProperties;
  }

  //#endregion
