namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties =

  //#region OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties


  type orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties = {
    OrgApacheSlingInstallerConfigurationPersist : ConfigNodePropertyBoolean;
    Mode : ConfigNodePropertyDropDown;
    Port : ConfigNodePropertyInteger;
    PrimaryHost : ConfigNodePropertyString;
    Interval : ConfigNodePropertyInteger;
    PrimaryAllowedClientIpRanges : ConfigNodePropertyArray;
    Secure : ConfigNodePropertyBoolean;
    StandbyReadtimeout : ConfigNodePropertyInteger;
    StandbyAutoclean : ConfigNodePropertyBoolean;
  }
  //#endregion
