namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MessagingUserComponentFactoryProperties

module MessagingUserComponentFactoryInfo =

  //#region MessagingUserComponentFactoryInfo


  type MessagingUserComponentFactoryInfo = {
    Pid : string;
    Title : string;
    Description : string;
    Properties : MessagingUserComponentFactoryProperties;
  }
  //#endregion
