namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ComDayCommonsHttpclientProperties

module ComDayCommonsHttpclientInfo =

  //#region ComDayCommonsHttpclientInfo


  type comDayCommonsHttpclientInfo = {
    Pid : string;
    Title : string;
    Description : string;
    Properties : ComDayCommonsHttpclientProperties;
  }
  //#endregion
