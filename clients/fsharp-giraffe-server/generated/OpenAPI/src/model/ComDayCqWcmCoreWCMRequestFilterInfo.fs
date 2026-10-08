namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ComDayCqWcmCoreWCMRequestFilterProperties

module ComDayCqWcmCoreWCMRequestFilterInfo =

  //#region ComDayCqWcmCoreWCMRequestFilterInfo


  type comDayCqWcmCoreWCMRequestFilterInfo = {
    Pid : string;
    Title : string;
    Description : string;
    Properties : ComDayCqWcmCoreWCMRequestFilterProperties;
    BundleLocation : string;
    ServiceLocation : string;
  }
  //#endregion
