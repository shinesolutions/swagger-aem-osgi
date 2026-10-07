namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger

module OrgApacheFelixScrScrServiceProperties =

  //#region OrgApacheFelixScrScrServiceProperties


  type orgApacheFelixScrScrServiceProperties = {
    DsLoglevel : ConfigNodePropertyDropDown;
    DsFactoryEnabled : ConfigNodePropertyBoolean;
    DsDelayedKeepInstances : ConfigNodePropertyBoolean;
    DsLockTimeoutMilliseconds : ConfigNodePropertyInteger;
    DsStopTimeoutMilliseconds : ConfigNodePropertyInteger;
    DsGlobalExtender : ConfigNodePropertyBoolean;
  }
  //#endregion
