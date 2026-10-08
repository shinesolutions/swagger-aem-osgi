namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqAccountApiAccountManagementServiceProperties =

  //#region ComAdobeCqAccountApiAccountManagementServiceProperties


  type comAdobeCqAccountApiAccountManagementServiceProperties = {
    CqAccountmanagerTokenValidityPeriod : ConfigNodePropertyInteger;
    CqAccountmanagerConfigRequestnewaccountMail : ConfigNodePropertyString;
    CqAccountmanagerConfigRequestnewpwdMail : ConfigNodePropertyString;
  }
  //#endregion
