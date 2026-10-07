namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingCommonsLogLogManagerProperties =

  //#region OrgApacheSlingCommonsLogLogManagerProperties

  [<CLIMutable>]
  type OrgApacheSlingCommonsLogLogManagerProperties = {
    [<JsonProperty(PropertyName = "org.apache.sling.commons.log.level")>]
    OrgApacheSlingCommonsLogLevel : ConfigNodePropertyDropDown;
    [<JsonProperty(PropertyName = "org.apache.sling.commons.log.file")>]
    OrgApacheSlingCommonsLogFile : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "org.apache.sling.commons.log.file.number")>]
    OrgApacheSlingCommonsLogFileNumber : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "org.apache.sling.commons.log.file.size")>]
    OrgApacheSlingCommonsLogFileSize : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "org.apache.sling.commons.log.pattern")>]
    OrgApacheSlingCommonsLogPattern : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "org.apache.sling.commons.log.configurationFile")>]
    OrgApacheSlingCommonsLogConfigurationFile : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "org.apache.sling.commons.log.packagingDataEnabled")>]
    OrgApacheSlingCommonsLogPackagingDataEnabled : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "org.apache.sling.commons.log.maxCallerDataDepth")>]
    OrgApacheSlingCommonsLogMaxCallerDataDepth : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "org.apache.sling.commons.log.maxOldFileCountInDump")>]
    OrgApacheSlingCommonsLogMaxOldFileCountInDump : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "org.apache.sling.commons.log.numOfLines")>]
    OrgApacheSlingCommonsLogNumOfLines : ConfigNodePropertyInteger;
  }

  //#endregion
