namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties =

  //#region OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties

  [<CLIMutable>]
  type OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties = {
    [<JsonProperty(PropertyName = "parser.features")>]
    ParserFeatures : ConfigNodePropertyArray;
  }

  //#endregion
