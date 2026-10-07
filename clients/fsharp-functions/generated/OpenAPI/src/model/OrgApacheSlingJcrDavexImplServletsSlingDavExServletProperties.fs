namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties =

  //#region OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties

  [<CLIMutable>]
  type OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties = {
    [<JsonProperty(PropertyName = "alias")>]
    Alias : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "dav.create-absolute-uri")>]
    DavCreateAbsoluteUri : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "dav.protectedhandlers")>]
    DavProtectedhandlers : ConfigNodePropertyString;
  }

  //#endregion
