namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyInteger

module OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties =

  //#region OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties


  type orgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties = {
    AsyncConfigs : ConfigNodePropertyArray;
    LeaseTimeOutMinutes : ConfigNodePropertyInteger;
    FailingIndexTimeoutSeconds : ConfigNodePropertyInteger;
    ErrorWarnIntervalSeconds : ConfigNodePropertyInteger;
  }
  //#endregion
