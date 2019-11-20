# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule AdobeExperienceManagerOSGIConfig(AEM)API.Model.ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"path",
    :"token.required.attr",
    :"token.alternate.url",
    :"token.encapsulated",
    :"skip.token.refresh"
  ]

  @type t :: %__MODULE__{
    :"path" => ConfigNodePropertyString,
    :"token.required.attr" => ConfigNodePropertyDropDown,
    :"token.alternate.url" => ConfigNodePropertyString,
    :"token.encapsulated" => ConfigNodePropertyBoolean,
    :"skip.token.refresh" => ConfigNodePropertyArray
  }
end

defimpl Poison.Decoder, for: AdobeExperienceManagerOSGIConfig(AEM)API.Model.ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties do
  import AdobeExperienceManagerOSGIConfig(AEM)API.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"path", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyString, options)
    |> deserialize(:"token.required.attr", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyDropDown, options)
    |> deserialize(:"token.alternate.url", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyString, options)
    |> deserialize(:"token.encapsulated", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyBoolean, options)
    |> deserialize(:"skip.token.refresh", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyArray, options)
  end
end
