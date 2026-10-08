namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyInteger

module ComAdobeGraniteAcpPlatformPlatformServletProperties =

  //#region ComAdobeGraniteAcpPlatformPlatformServletProperties

  [<CLIMutable>]
  type ComAdobeGraniteAcpPlatformPlatformServletProperties = {
    [<JsonProperty(PropertyName = "query.limit")>]
    QueryLimit : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "file.type.extension.map")>]
    FileTypeExtensionMap : ConfigNodePropertyArray;
  }

  //#endregion
