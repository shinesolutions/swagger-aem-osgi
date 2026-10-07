namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties

module OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo =

  //#region OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo

  [<CLIMutable>]
  type OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties;
  }

  //#endregion
