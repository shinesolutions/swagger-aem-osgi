namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger

module OrgApacheSlingServletsGetDefaultGetServletProperties =

  //#region OrgApacheSlingServletsGetDefaultGetServletProperties

  [<CLIMutable>]
  type OrgApacheSlingServletsGetDefaultGetServletProperties = {
    [<JsonProperty(PropertyName = "aliases")>]
    Aliases : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "index")>]
    Index : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "index.files")>]
    IndexFiles : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "enable.html")>]
    EnableHtml : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "enable.json")>]
    EnableJson : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "enable.txt")>]
    EnableTxt : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "enable.xml")>]
    EnableXml : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "json.maximumresults")>]
    JsonMaximumresults : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "ecmaSuport")>]
    EcmaSuport : ConfigNodePropertyBoolean;
  }

  //#endregion
