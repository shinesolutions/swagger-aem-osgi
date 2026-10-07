namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties =

  //#region OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties

  [<CLIMutable>]
  type OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties = {
    [<JsonProperty(PropertyName = "org.apache.sling.commons.log.level")>]
    OrgApacheSlingCommonsLogLevel : ConfigNodePropertyDropDown;
    [<JsonProperty(PropertyName = "org.apache.sling.commons.log.file")>]
    OrgApacheSlingCommonsLogFile : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "org.apache.sling.commons.log.pattern")>]
    OrgApacheSlingCommonsLogPattern : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "org.apache.sling.commons.log.names")>]
    OrgApacheSlingCommonsLogNames : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "org.apache.sling.commons.log.additiv")>]
    OrgApacheSlingCommonsLogAdditiv : ConfigNodePropertyBoolean;
  }

  //#endregion
