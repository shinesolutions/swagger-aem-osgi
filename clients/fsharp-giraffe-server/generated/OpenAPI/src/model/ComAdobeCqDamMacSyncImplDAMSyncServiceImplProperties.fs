namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger

module ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties =

  //#region ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties


  type comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties = {
    ComAdobeCqDamMacSyncDamsyncserviceRegisteredPaths : ConfigNodePropertyArray;
    ComAdobeCqDamMacSyncDamsyncserviceSyncRenditions : ConfigNodePropertyBoolean;
    ComAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs : ConfigNodePropertyInteger;
    ComAdobeCqDamMacSyncDamsyncservicePlatform : ConfigNodePropertyDropDown;
  }
  //#endregion
