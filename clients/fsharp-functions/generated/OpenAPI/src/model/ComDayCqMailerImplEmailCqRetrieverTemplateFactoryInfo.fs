namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties

module ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo =

  //#region ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo

  [<CLIMutable>]
  type ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties;
  }

  //#endregion
