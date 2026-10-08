namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean

module OrgApacheSlingSecurityImplContentDispositionFilterProperties =

  //#region OrgApacheSlingSecurityImplContentDispositionFilterProperties


  type orgApacheSlingSecurityImplContentDispositionFilterProperties = {
    SlingContentDispositionPaths : ConfigNodePropertyArray;
    SlingContentDispositionExcludedPaths : ConfigNodePropertyArray;
    SlingContentDispositionAllPaths : ConfigNodePropertyBoolean;
  }
  //#endregion
