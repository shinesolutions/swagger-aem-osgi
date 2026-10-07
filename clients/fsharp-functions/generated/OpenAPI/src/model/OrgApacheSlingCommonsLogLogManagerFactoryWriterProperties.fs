namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties =

  //#region OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties

  [<CLIMutable>]
  type OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties = {
    [<JsonProperty(PropertyName = "org.apache.sling.commons.log.file")>]
    OrgApacheSlingCommonsLogFile : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "org.apache.sling.commons.log.file.number")>]
    OrgApacheSlingCommonsLogFileNumber : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "org.apache.sling.commons.log.file.size")>]
    OrgApacheSlingCommonsLogFileSize : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "org.apache.sling.commons.log.file.buffered")>]
    OrgApacheSlingCommonsLogFileBuffered : ConfigNodePropertyBoolean;
  }

  //#endregion
