namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingCommonsLogLogManagerProperties =

  //#region OrgApacheSlingCommonsLogLogManagerProperties


  type orgApacheSlingCommonsLogLogManagerProperties = {
    OrgApacheSlingCommonsLogLevel : ConfigNodePropertyDropDown;
    OrgApacheSlingCommonsLogFile : ConfigNodePropertyString;
    OrgApacheSlingCommonsLogFileNumber : ConfigNodePropertyInteger;
    OrgApacheSlingCommonsLogFileSize : ConfigNodePropertyString;
    OrgApacheSlingCommonsLogPattern : ConfigNodePropertyString;
    OrgApacheSlingCommonsLogConfigurationFile : ConfigNodePropertyString;
    OrgApacheSlingCommonsLogPackagingDataEnabled : ConfigNodePropertyBoolean;
    OrgApacheSlingCommonsLogMaxCallerDataDepth : ConfigNodePropertyInteger;
    OrgApacheSlingCommonsLogMaxOldFileCountInDump : ConfigNodePropertyInteger;
    OrgApacheSlingCommonsLogNumOfLines : ConfigNodePropertyInteger;
  }
  //#endregion
