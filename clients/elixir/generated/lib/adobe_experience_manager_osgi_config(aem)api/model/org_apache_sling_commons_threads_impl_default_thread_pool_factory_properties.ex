# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule AdobeExperienceManagerOSGIConfig(AEM)API.Model.OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"name",
    :"minPoolSize",
    :"maxPoolSize",
    :"queueSize",
    :"maxThreadAge",
    :"keepAliveTime",
    :"blockPolicy",
    :"shutdownGraceful",
    :"daemon",
    :"shutdownWaitTime",
    :"priority"
  ]

  @type t :: %__MODULE__{
    :"name" => ConfigNodePropertyString,
    :"minPoolSize" => ConfigNodePropertyInteger,
    :"maxPoolSize" => ConfigNodePropertyInteger,
    :"queueSize" => ConfigNodePropertyInteger,
    :"maxThreadAge" => ConfigNodePropertyInteger,
    :"keepAliveTime" => ConfigNodePropertyInteger,
    :"blockPolicy" => ConfigNodePropertyDropDown,
    :"shutdownGraceful" => ConfigNodePropertyBoolean,
    :"daemon" => ConfigNodePropertyBoolean,
    :"shutdownWaitTime" => ConfigNodePropertyInteger,
    :"priority" => ConfigNodePropertyDropDown
  }
end

defimpl Poison.Decoder, for: AdobeExperienceManagerOSGIConfig(AEM)API.Model.OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties do
  import AdobeExperienceManagerOSGIConfig(AEM)API.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"name", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyString, options)
    |> deserialize(:"minPoolSize", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyInteger, options)
    |> deserialize(:"maxPoolSize", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyInteger, options)
    |> deserialize(:"queueSize", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyInteger, options)
    |> deserialize(:"maxThreadAge", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyInteger, options)
    |> deserialize(:"keepAliveTime", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyInteger, options)
    |> deserialize(:"blockPolicy", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyDropDown, options)
    |> deserialize(:"shutdownGraceful", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyBoolean, options)
    |> deserialize(:"daemon", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyBoolean, options)
    |> deserialize(:"shutdownWaitTime", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyInteger, options)
    |> deserialize(:"priority", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyDropDown, options)
  end
end
