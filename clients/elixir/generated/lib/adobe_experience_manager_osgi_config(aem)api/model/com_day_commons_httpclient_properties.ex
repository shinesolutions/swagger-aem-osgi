# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule AdobeExperienceManagerOSGIConfig(AEM)API.Model.ComDayCommonsHttpclientProperties do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"proxy.enabled",
    :"proxy.host",
    :"proxy.user",
    :"proxy.password",
    :"proxy.ntlm.host",
    :"proxy.ntlm.domain",
    :"proxy.exceptions"
  ]

  @type t :: %__MODULE__{
    :"proxy.enabled" => ConfigNodePropertyBoolean,
    :"proxy.host" => ConfigNodePropertyString,
    :"proxy.user" => ConfigNodePropertyString,
    :"proxy.password" => ConfigNodePropertyString,
    :"proxy.ntlm.host" => ConfigNodePropertyString,
    :"proxy.ntlm.domain" => ConfigNodePropertyString,
    :"proxy.exceptions" => ConfigNodePropertyArray
  }
end

defimpl Poison.Decoder, for: AdobeExperienceManagerOSGIConfig(AEM)API.Model.ComDayCommonsHttpclientProperties do
  import AdobeExperienceManagerOSGIConfig(AEM)API.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"proxy.enabled", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyBoolean, options)
    |> deserialize(:"proxy.host", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyString, options)
    |> deserialize(:"proxy.user", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyString, options)
    |> deserialize(:"proxy.password", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyString, options)
    |> deserialize(:"proxy.ntlm.host", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyString, options)
    |> deserialize(:"proxy.ntlm.domain", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyString, options)
    |> deserialize(:"proxy.exceptions", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyArray, options)
  end
end

