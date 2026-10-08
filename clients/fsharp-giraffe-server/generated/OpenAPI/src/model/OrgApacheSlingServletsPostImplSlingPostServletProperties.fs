namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingServletsPostImplSlingPostServletProperties =

  //#region OrgApacheSlingServletsPostImplSlingPostServletProperties


  type orgApacheSlingServletsPostImplSlingPostServletProperties = {
    ServletPostDateFormats : ConfigNodePropertyArray;
    ServletPostNodeNameHints : ConfigNodePropertyArray;
    ServletPostNodeNameMaxLength : ConfigNodePropertyInteger;
    ServletPostCheckinNewVersionableNodes : ConfigNodePropertyBoolean;
    ServletPostAutoCheckout : ConfigNodePropertyBoolean;
    ServletPostAutoCheckin : ConfigNodePropertyBoolean;
    ServletPostIgnorePattern : ConfigNodePropertyString;
  }
  //#endregion
