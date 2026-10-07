namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties =

  //#region ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties

  [<CLIMutable>]
  type ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties = {
    [<JsonProperty(PropertyName = "threshold")>]
    Threshold : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "jobTopicName")>]
    JobTopicName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "emailEnabled")>]
    EmailEnabled : ConfigNodePropertyBoolean;
  }

  //#endregion
