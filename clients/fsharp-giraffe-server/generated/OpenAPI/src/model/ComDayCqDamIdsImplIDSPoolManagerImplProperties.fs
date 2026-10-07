namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqDamIdsImplIDSPoolManagerImplProperties =

  //#region ComDayCqDamIdsImplIDSPoolManagerImplProperties


  type comDayCqDamIdsImplIDSPoolManagerImplProperties = {
    MaxErrorsToBlacklist : ConfigNodePropertyInteger;
    RetryIntervalToWhitelist : ConfigNodePropertyInteger;
    ConnectTimeout : ConfigNodePropertyInteger;
    SocketTimeout : ConfigNodePropertyInteger;
    ProcessLabel : ConfigNodePropertyString;
    ConnectionUseMax : ConfigNodePropertyInteger;
  }
  //#endregion
