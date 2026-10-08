namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties

module OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo =

  //#region OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo

  [<CLIMutable>]
  type OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties;
  }

  //#endregion
