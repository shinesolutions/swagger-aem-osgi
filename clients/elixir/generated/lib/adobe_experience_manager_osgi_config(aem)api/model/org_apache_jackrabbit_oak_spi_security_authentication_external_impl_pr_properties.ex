# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule AdobeExperienceManagerOSGIConfig(AEM)API.Model.OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"protectExternalId"
  ]

  @type t :: %__MODULE__{
    :"protectExternalId" => ConfigNodePropertyBoolean
  }
end

defimpl Poison.Decoder, for: AdobeExperienceManagerOSGIConfig(AEM)API.Model.OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties do
  import AdobeExperienceManagerOSGIConfig(AEM)API.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"protectExternalId", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyBoolean, options)
  end
end

