namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.OrgApacheFelixJaasConfigurationSpiProperties

module OrgApacheFelixJaasConfigurationSpiInfo =

  //#region OrgApacheFelixJaasConfigurationSpiInfo


  type orgApacheFelixJaasConfigurationSpiInfo = {
    Pid : string;
    Title : string;
    Description : string;
    Properties : OrgApacheFelixJaasConfigurationSpiProperties;
    BundleLocation : string;
    ServiceLocation : string;
  }
  //#endregion
