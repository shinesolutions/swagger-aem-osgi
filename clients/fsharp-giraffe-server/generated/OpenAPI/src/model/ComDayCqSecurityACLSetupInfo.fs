namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ComDayCqSecurityACLSetupProperties

module ComDayCqSecurityACLSetupInfo =

  //#region ComDayCqSecurityACLSetupInfo


  type comDayCqSecurityACLSetupInfo = {
    Pid : string;
    Title : string;
    Description : string;
    Properties : ComDayCqSecurityACLSetupProperties;
    BundleLocation : string;
    ServiceLocation : string;
  }
  //#endregion
