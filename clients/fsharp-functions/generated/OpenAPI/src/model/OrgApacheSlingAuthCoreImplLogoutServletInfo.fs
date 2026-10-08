namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingAuthCoreImplLogoutServletProperties

module OrgApacheSlingAuthCoreImplLogoutServletInfo =

  //#region OrgApacheSlingAuthCoreImplLogoutServletInfo

  [<CLIMutable>]
  type OrgApacheSlingAuthCoreImplLogoutServletInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingAuthCoreImplLogoutServletProperties;
  }

  //#endregion
