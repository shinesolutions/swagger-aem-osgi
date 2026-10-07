namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingServletsPostImplSlingPostServletProperties =

  //#region OrgApacheSlingServletsPostImplSlingPostServletProperties

  [<CLIMutable>]
  type OrgApacheSlingServletsPostImplSlingPostServletProperties = {
    [<JsonProperty(PropertyName = "servlet.post.dateFormats")>]
    ServletPostDateFormats : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "servlet.post.nodeNameHints")>]
    ServletPostNodeNameHints : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "servlet.post.nodeNameMaxLength")>]
    ServletPostNodeNameMaxLength : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "servlet.post.checkinNewVersionableNodes")>]
    ServletPostCheckinNewVersionableNodes : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "servlet.post.autoCheckout")>]
    ServletPostAutoCheckout : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "servlet.post.autoCheckin")>]
    ServletPostAutoCheckin : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "servlet.post.ignorePattern")>]
    ServletPostIgnorePattern : ConfigNodePropertyString;
  }

  //#endregion
