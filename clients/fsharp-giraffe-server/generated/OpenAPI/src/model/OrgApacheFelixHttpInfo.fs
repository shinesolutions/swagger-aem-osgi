namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.OrgApacheFelixHttpProperties

module OrgApacheFelixHttpInfo =

  //#region OrgApacheFelixHttpInfo


  type orgApacheFelixHttpInfo = {
    Pid : string;
    Title : string;
    Description : string;
    Properties : OrgApacheFelixHttpProperties;
    BundleLocation : string;
    ServiceLocation : string;
  }
  //#endregion
