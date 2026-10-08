namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqDamS7imagingImplIsImageServerComponentProperties =

  //#region ComAdobeCqDamS7imagingImplIsImageServerComponentProperties


  type comAdobeCqDamS7imagingImplIsImageServerComponentProperties = {
    TcpPort : ConfigNodePropertyString;
    AllowRemoteAccess : ConfigNodePropertyBoolean;
    MaxRenderRgnPixels : ConfigNodePropertyString;
    MaxMessageSize : ConfigNodePropertyString;
    RandomAccessUrlTimeout : ConfigNodePropertyInteger;
    WorkerThreads : ConfigNodePropertyInteger;
  }
  //#endregion
