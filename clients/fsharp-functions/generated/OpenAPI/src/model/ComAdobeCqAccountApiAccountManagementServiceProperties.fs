namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqAccountApiAccountManagementServiceProperties =

  //#region ComAdobeCqAccountApiAccountManagementServiceProperties

  [<CLIMutable>]
  type ComAdobeCqAccountApiAccountManagementServiceProperties = {
    [<JsonProperty(PropertyName = "cq.accountmanager.token.validity.period")>]
    CqAccountmanagerTokenValidityPeriod : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cq.accountmanager.config.requestnewaccount.mail")>]
    CqAccountmanagerConfigRequestnewaccountMail : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "cq.accountmanager.config.requestnewpwd.mail")>]
    CqAccountmanagerConfigRequestnewpwdMail : ConfigNodePropertyString;
  }

  //#endregion
