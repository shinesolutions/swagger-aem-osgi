namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties

module OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo =

  //#region OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo

  [<CLIMutable>]
  type OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties;
  }

  //#endregion
