namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties

module ComDayCqMailerImplEmailCqEmailTemplateFactoryInfo =

  //#region ComDayCqMailerImplEmailCqEmailTemplateFactoryInfo

  [<CLIMutable>]
  type ComDayCqMailerImplEmailCqEmailTemplateFactoryInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties;
  }

  //#endregion
