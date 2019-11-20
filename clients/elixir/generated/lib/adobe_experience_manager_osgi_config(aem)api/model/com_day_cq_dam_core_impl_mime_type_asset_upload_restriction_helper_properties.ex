# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule AdobeExperienceManagerOSGIConfig(AEM)API.Model.ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"cq.dam.allow.all.mime",
    :"cq.dam.allowed.asset.mimes"
  ]

  @type t :: %__MODULE__{
    :"cq.dam.allow.all.mime" => ConfigNodePropertyBoolean,
    :"cq.dam.allowed.asset.mimes" => ConfigNodePropertyArray
  }
end

defimpl Poison.Decoder, for: AdobeExperienceManagerOSGIConfig(AEM)API.Model.ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties do
  import AdobeExperienceManagerOSGIConfig(AEM)API.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"cq.dam.allow.all.mime", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyBoolean, options)
    |> deserialize(:"cq.dam.allowed.asset.mimes", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyArray, options)
  end
end
