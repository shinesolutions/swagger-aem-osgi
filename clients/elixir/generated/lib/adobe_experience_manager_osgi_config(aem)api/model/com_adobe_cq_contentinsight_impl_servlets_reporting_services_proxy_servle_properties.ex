# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule AdobeExperienceManagerOSGIConfig(AEM)API.Model.ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"reportingservices.proxy.whitelist"
  ]

  @type t :: %__MODULE__{
    :"reportingservices.proxy.whitelist" => ConfigNodePropertyArray
  }
end

defimpl Poison.Decoder, for: AdobeExperienceManagerOSGIConfig(AEM)API.Model.ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties do
  import AdobeExperienceManagerOSGIConfig(AEM)API.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"reportingservices.proxy.whitelist", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyArray, options)
  end
end
