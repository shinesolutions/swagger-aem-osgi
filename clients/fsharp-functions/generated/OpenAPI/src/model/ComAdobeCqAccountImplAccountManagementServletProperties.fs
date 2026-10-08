namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqAccountImplAccountManagementServletProperties =

  //#region ComAdobeCqAccountImplAccountManagementServletProperties

  [<CLIMutable>]
  type ComAdobeCqAccountImplAccountManagementServletProperties = {
    [<JsonProperty(PropertyName = "cq.accountmanager.config.informnewaccount.mail")>]
    CqAccountmanagerConfigInformnewaccountMail : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "cq.accountmanager.config.informnewpwd.mail")>]
    CqAccountmanagerConfigInformnewpwdMail : ConfigNodePropertyString;
  }

  //#endregion
