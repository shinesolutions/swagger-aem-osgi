# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule AdobeExperienceManagerOSGIConfig(AEM)API.Model.ComDayCqWcmMsmImplRolloutManagerImplProperties do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"event.filter",
    :"rolloutmgr.excludedprops.default",
    :"rolloutmgr.excludedparagraphprops.default",
    :"rolloutmgr.excludednodetypes.default",
    :"rolloutmgr.threadpool.maxsize",
    :"rolloutmgr.threadpool.maxshutdowntime",
    :"rolloutmgr.threadpool.priority",
    :"rolloutmgr.commit.size",
    :"rolloutmgr.conflicthandling.enabled"
  ]

  @type t :: %__MODULE__{
    :"event.filter" => ConfigNodePropertyString,
    :"rolloutmgr.excludedprops.default" => ConfigNodePropertyArray,
    :"rolloutmgr.excludedparagraphprops.default" => ConfigNodePropertyArray,
    :"rolloutmgr.excludednodetypes.default" => ConfigNodePropertyArray,
    :"rolloutmgr.threadpool.maxsize" => ConfigNodePropertyInteger,
    :"rolloutmgr.threadpool.maxshutdowntime" => ConfigNodePropertyInteger,
    :"rolloutmgr.threadpool.priority" => ConfigNodePropertyDropDown,
    :"rolloutmgr.commit.size" => ConfigNodePropertyInteger,
    :"rolloutmgr.conflicthandling.enabled" => ConfigNodePropertyBoolean
  }
end

defimpl Poison.Decoder, for: AdobeExperienceManagerOSGIConfig(AEM)API.Model.ComDayCqWcmMsmImplRolloutManagerImplProperties do
  import AdobeExperienceManagerOSGIConfig(AEM)API.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"event.filter", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyString, options)
    |> deserialize(:"rolloutmgr.excludedprops.default", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyArray, options)
    |> deserialize(:"rolloutmgr.excludedparagraphprops.default", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyArray, options)
    |> deserialize(:"rolloutmgr.excludednodetypes.default", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyArray, options)
    |> deserialize(:"rolloutmgr.threadpool.maxsize", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyInteger, options)
    |> deserialize(:"rolloutmgr.threadpool.maxshutdowntime", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyInteger, options)
    |> deserialize(:"rolloutmgr.threadpool.priority", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyDropDown, options)
    |> deserialize(:"rolloutmgr.commit.size", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyInteger, options)
    |> deserialize(:"rolloutmgr.conflicthandling.enabled", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyBoolean, options)
  end
end
