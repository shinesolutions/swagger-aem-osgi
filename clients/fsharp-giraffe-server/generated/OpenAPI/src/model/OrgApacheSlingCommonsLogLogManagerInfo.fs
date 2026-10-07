namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.OrgApacheSlingCommonsLogLogManagerProperties

module OrgApacheSlingCommonsLogLogManagerInfo =

  //#region OrgApacheSlingCommonsLogLogManagerInfo


  type orgApacheSlingCommonsLogLogManagerInfo = {
    Pid : string;
    Title : string;
    Description : string;
    Properties : OrgApacheSlingCommonsLogLogManagerProperties;
    BundleLocation : string;
    ServiceLocation : string;
  }
  //#endregion
