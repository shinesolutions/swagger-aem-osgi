namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties

module ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo =

  //#region ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo

  [<CLIMutable>]
  type ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties;
  }

  //#endregion
