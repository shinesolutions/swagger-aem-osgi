namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.OrgApacheSlingEngineParametersProperties

module OrgApacheSlingEngineParametersInfo =

  //#region OrgApacheSlingEngineParametersInfo


  type orgApacheSlingEngineParametersInfo = {
    Pid : string;
    Title : string;
    Description : string;
    Properties : OrgApacheSlingEngineParametersProperties;
    BundleLocation : string;
    ServiceLocation : string;
  }
  //#endregion
