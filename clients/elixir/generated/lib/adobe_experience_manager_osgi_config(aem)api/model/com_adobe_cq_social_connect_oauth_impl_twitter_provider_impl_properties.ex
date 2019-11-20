# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule AdobeExperienceManagerOSGIConfig(AEM)API.Model.ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"oauth.provider.id",
    :"oauth.cloud.config.root",
    :"provider.config.root",
    :"provider.config.user.folder",
    :"provider.config.twitter.enable.params",
    :"provider.config.twitter.params",
    :"provider.config.refresh.userdata.enabled"
  ]

  @type t :: %__MODULE__{
    :"oauth.provider.id" => ConfigNodePropertyString,
    :"oauth.cloud.config.root" => ConfigNodePropertyString,
    :"provider.config.root" => ConfigNodePropertyString,
    :"provider.config.user.folder" => ConfigNodePropertyDropDown,
    :"provider.config.twitter.enable.params" => ConfigNodePropertyBoolean,
    :"provider.config.twitter.params" => ConfigNodePropertyArray,
    :"provider.config.refresh.userdata.enabled" => ConfigNodePropertyBoolean
  }
end

defimpl Poison.Decoder, for: AdobeExperienceManagerOSGIConfig(AEM)API.Model.ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties do
  import AdobeExperienceManagerOSGIConfig(AEM)API.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"oauth.provider.id", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyString, options)
    |> deserialize(:"oauth.cloud.config.root", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyString, options)
    |> deserialize(:"provider.config.root", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyString, options)
    |> deserialize(:"provider.config.user.folder", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyDropDown, options)
    |> deserialize(:"provider.config.twitter.enable.params", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyBoolean, options)
    |> deserialize(:"provider.config.twitter.params", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyArray, options)
    |> deserialize(:"provider.config.refresh.userdata.enabled", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyBoolean, options)
  end
end
