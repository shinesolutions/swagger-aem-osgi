namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyFloat
open OpenAPI.Model.ConfigNodePropertyInteger

module OrgApacheFelixEventadminImplEventAdminProperties =

  //#region OrgApacheFelixEventadminImplEventAdminProperties


  type orgApacheFelixEventadminImplEventAdminProperties = {
    OrgApacheFelixEventadminThreadPoolSize : ConfigNodePropertyInteger;
    OrgApacheFelixEventadminAsyncToSyncThreadRatio : ConfigNodePropertyFloat;
    OrgApacheFelixEventadminTimeout : ConfigNodePropertyInteger;
    OrgApacheFelixEventadminRequireTopic : ConfigNodePropertyBoolean;
    OrgApacheFelixEventadminIgnoreTimeout : ConfigNodePropertyArray;
    OrgApacheFelixEventadminIgnoreTopic : ConfigNodePropertyArray;
  }
  //#endregion
