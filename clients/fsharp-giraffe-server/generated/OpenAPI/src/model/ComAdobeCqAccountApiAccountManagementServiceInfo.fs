namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ComAdobeCqAccountApiAccountManagementServiceProperties

module ComAdobeCqAccountApiAccountManagementServiceInfo =

  //#region ComAdobeCqAccountApiAccountManagementServiceInfo


  type comAdobeCqAccountApiAccountManagementServiceInfo = {
    Pid : string;
    Title : string;
    Description : string;
    Properties : ComAdobeCqAccountApiAccountManagementServiceProperties;
    AdditionalProperties : string;
    BundleLocation : string;
    ServiceLocation : string;
  }
  //#endregion
