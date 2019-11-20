# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule AdobeExperienceManagerOSGIConfig(AEM)API.Model.OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"enabledActions",
    :"userPrivilegeNames",
    :"groupPrivilegeNames",
    :"constraint"
  ]

  @type t :: %__MODULE__{
    :"enabledActions" => ConfigNodePropertyDropDown,
    :"userPrivilegeNames" => ConfigNodePropertyArray,
    :"groupPrivilegeNames" => ConfigNodePropertyArray,
    :"constraint" => ConfigNodePropertyString
  }
end

defimpl Poison.Decoder, for: AdobeExperienceManagerOSGIConfig(AEM)API.Model.OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties do
  import AdobeExperienceManagerOSGIConfig(AEM)API.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"enabledActions", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyDropDown, options)
    |> deserialize(:"userPrivilegeNames", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyArray, options)
    |> deserialize(:"groupPrivilegeNames", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyArray, options)
    |> deserialize(:"constraint", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyString, options)
  end
end
