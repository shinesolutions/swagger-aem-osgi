# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule AdobeExperienceManagerOSGIConfig(AEM)API.Model.OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"includedPaths",
    :"enableAsyncObserver",
    :"observerQueueSize"
  ]

  @type t :: %__MODULE__{
    :"includedPaths" => ConfigNodePropertyArray,
    :"enableAsyncObserver" => ConfigNodePropertyBoolean,
    :"observerQueueSize" => ConfigNodePropertyInteger
  }
end

defimpl Poison.Decoder, for: AdobeExperienceManagerOSGIConfig(AEM)API.Model.OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties do
  import AdobeExperienceManagerOSGIConfig(AEM)API.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"includedPaths", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyArray, options)
    |> deserialize(:"enableAsyncObserver", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyBoolean, options)
    |> deserialize(:"observerQueueSize", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyInteger, options)
  end
end
