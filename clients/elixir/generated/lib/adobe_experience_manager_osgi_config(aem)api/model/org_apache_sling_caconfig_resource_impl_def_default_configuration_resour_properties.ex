# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule AdobeExperienceManagerOSGIConfig(AEM)API.Model.OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"enabled",
    :"configPath",
    :"fallbackPaths",
    :"configCollectionInheritancePropertyNames"
  ]

  @type t :: %__MODULE__{
    :"enabled" => ConfigNodePropertyBoolean,
    :"configPath" => ConfigNodePropertyString,
    :"fallbackPaths" => ConfigNodePropertyArray,
    :"configCollectionInheritancePropertyNames" => ConfigNodePropertyArray
  }
end

defimpl Poison.Decoder, for: AdobeExperienceManagerOSGIConfig(AEM)API.Model.OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties do
  import AdobeExperienceManagerOSGIConfig(AEM)API.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"enabled", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyBoolean, options)
    |> deserialize(:"configPath", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyString, options)
    |> deserialize(:"fallbackPaths", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyArray, options)
    |> deserialize(:"configCollectionInheritancePropertyNames", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyArray, options)
  end
end
