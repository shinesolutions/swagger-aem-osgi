namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties =

  //#region OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties

  [<CLIMutable>]
  type OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties = {
    [<JsonProperty(PropertyName = "org.apache.sling.installer.configuration.persist")>]
    OrgApacheSlingInstallerConfigurationPersist : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "mode")>]
    Mode : ConfigNodePropertyDropDown;
    [<JsonProperty(PropertyName = "port")>]
    Port : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "primary.host")>]
    PrimaryHost : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "interval")>]
    Interval : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "primary.allowed-client-ip-ranges")>]
    PrimaryAllowedClientIpRanges : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "secure")>]
    Secure : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "standby.readtimeout")>]
    StandbyReadtimeout : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "standby.autoclean")>]
    StandbyAutoclean : ConfigNodePropertyBoolean;
  }

  //#endregion
