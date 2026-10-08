namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.OrgApacheSlingServletsGetDefaultGetServletProperties

module OrgApacheSlingServletsGetDefaultGetServletInfo =

  //#region OrgApacheSlingServletsGetDefaultGetServletInfo


  type orgApacheSlingServletsGetDefaultGetServletInfo = {
    Pid : string;
    Title : string;
    Description : string;
    Properties : OrgApacheSlingServletsGetDefaultGetServletProperties;
    BundleLocation : string;
    ServiceLocation : string;
  }
  //#endregion
