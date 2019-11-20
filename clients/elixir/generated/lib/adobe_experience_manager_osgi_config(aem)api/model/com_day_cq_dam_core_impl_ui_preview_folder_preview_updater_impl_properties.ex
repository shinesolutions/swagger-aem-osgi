# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule AdobeExperienceManagerOSGIConfig(AEM)API.Model.ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"createPreviewEnabled",
    :"updatePreviewEnabled",
    :"queueSize",
    :"folderPreviewRenditionRegex"
  ]

  @type t :: %__MODULE__{
    :"createPreviewEnabled" => ConfigNodePropertyBoolean,
    :"updatePreviewEnabled" => ConfigNodePropertyBoolean,
    :"queueSize" => ConfigNodePropertyInteger,
    :"folderPreviewRenditionRegex" => ConfigNodePropertyString
  }
end

defimpl Poison.Decoder, for: AdobeExperienceManagerOSGIConfig(AEM)API.Model.ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties do
  import AdobeExperienceManagerOSGIConfig(AEM)API.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"createPreviewEnabled", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyBoolean, options)
    |> deserialize(:"updatePreviewEnabled", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyBoolean, options)
    |> deserialize(:"queueSize", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyInteger, options)
    |> deserialize(:"folderPreviewRenditionRegex", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyString, options)
  end
end
