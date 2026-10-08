namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.OrgApacheSlingDiscoveryOakConfigProperties

module OrgApacheSlingDiscoveryOakConfigInfo =

  //#region OrgApacheSlingDiscoveryOakConfigInfo


  type orgApacheSlingDiscoveryOakConfigInfo = {
    Pid : string;
    Title : string;
    Description : string;
    Properties : OrgApacheSlingDiscoveryOakConfigProperties;
    BundleLocation : string;
    ServiceLocation : string;
  }
  //#endregion
