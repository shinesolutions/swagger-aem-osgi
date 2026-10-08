namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean

module OrgApacheSlingSecurityImplReferrerFilterProperties =

  //#region OrgApacheSlingSecurityImplReferrerFilterProperties


  type orgApacheSlingSecurityImplReferrerFilterProperties = {
    AllowEmpty : ConfigNodePropertyBoolean;
    AllowHosts : ConfigNodePropertyArray;
    AllowHostsRegexp : ConfigNodePropertyArray;
    FilterMethods : ConfigNodePropertyArray;
    ExcludeAgentsRegexp : ConfigNodePropertyArray;
  }
  //#endregion
