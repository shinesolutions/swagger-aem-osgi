namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqWorkflowImplEmailEMailNotificationServiceProperties =

  //#region ComDayCqWorkflowImplEmailEMailNotificationServiceProperties


  type comDayCqWorkflowImplEmailEMailNotificationServiceProperties = {
    FromAddress : ConfigNodePropertyString;
    HostPrefix : ConfigNodePropertyString;
    NotifyOnabort : ConfigNodePropertyBoolean;
    NotifyOncomplete : ConfigNodePropertyBoolean;
    NotifyOncontainercomplete : ConfigNodePropertyBoolean;
    NotifyUseronly : ConfigNodePropertyBoolean;
  }
  //#endregion
