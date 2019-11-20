# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule AdobeExperienceManagerOSGIConfig(AEM)API.Model.OrgApacheSlingServletsPostImplSlingPostServletProperties do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"servlet.post.dateFormats",
    :"servlet.post.nodeNameHints",
    :"servlet.post.nodeNameMaxLength",
    :"servlet.post.checkinNewVersionableNodes",
    :"servlet.post.autoCheckout",
    :"servlet.post.autoCheckin",
    :"servlet.post.ignorePattern"
  ]

  @type t :: %__MODULE__{
    :"servlet.post.dateFormats" => ConfigNodePropertyArray,
    :"servlet.post.nodeNameHints" => ConfigNodePropertyArray,
    :"servlet.post.nodeNameMaxLength" => ConfigNodePropertyInteger,
    :"servlet.post.checkinNewVersionableNodes" => ConfigNodePropertyBoolean,
    :"servlet.post.autoCheckout" => ConfigNodePropertyBoolean,
    :"servlet.post.autoCheckin" => ConfigNodePropertyBoolean,
    :"servlet.post.ignorePattern" => ConfigNodePropertyString
  }
end

defimpl Poison.Decoder, for: AdobeExperienceManagerOSGIConfig(AEM)API.Model.OrgApacheSlingServletsPostImplSlingPostServletProperties do
  import AdobeExperienceManagerOSGIConfig(AEM)API.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"servlet.post.dateFormats", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyArray, options)
    |> deserialize(:"servlet.post.nodeNameHints", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyArray, options)
    |> deserialize(:"servlet.post.nodeNameMaxLength", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyInteger, options)
    |> deserialize(:"servlet.post.checkinNewVersionableNodes", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyBoolean, options)
    |> deserialize(:"servlet.post.autoCheckout", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyBoolean, options)
    |> deserialize(:"servlet.post.autoCheckin", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyBoolean, options)
    |> deserialize(:"servlet.post.ignorePattern", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyString, options)
  end
end
