# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule AdobeExperienceManagerOSGIConfig(AEM)API.Model.ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"page.info.provider.property.regex.default",
    :"page.info.provider.property.name"
  ]

  @type t :: %__MODULE__{
    :"page.info.provider.property.regex.default" => ConfigNodePropertyString,
    :"page.info.provider.property.name" => ConfigNodePropertyString
  }
end

defimpl Poison.Decoder, for: AdobeExperienceManagerOSGIConfig(AEM)API.Model.ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties do
  import AdobeExperienceManagerOSGIConfig(AEM)API.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"page.info.provider.property.regex.default", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyString, options)
    |> deserialize(:"page.info.provider.property.name", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyString, options)
  end
end
