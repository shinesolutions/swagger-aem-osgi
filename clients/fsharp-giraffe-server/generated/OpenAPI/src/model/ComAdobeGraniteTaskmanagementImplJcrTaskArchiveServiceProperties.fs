namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties =

  //#region ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties


  type comAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties = {
    ArchivingEnabled : ConfigNodePropertyBoolean;
    SchedulerExpression : ConfigNodePropertyString;
    ArchiveSinceDaysCompleted : ConfigNodePropertyInteger;
  }
  //#endregion
