# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule AdobeExperienceManagerOSGIConfig(AEM)API.Model.OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"server.type"
  ]

  @type t :: %__MODULE__{
    :"server.type" => ConfigNodePropertyDropDown
  }
end

defimpl Poison.Decoder, for: AdobeExperienceManagerOSGIConfig(AEM)API.Model.OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties do
  import AdobeExperienceManagerOSGIConfig(AEM)API.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"server.type", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyDropDown, options)
  end
end
