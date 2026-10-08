namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties

module OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo =

  //#region OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo

  [<CLIMutable>]
  type OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties;
  }

  //#endregion
