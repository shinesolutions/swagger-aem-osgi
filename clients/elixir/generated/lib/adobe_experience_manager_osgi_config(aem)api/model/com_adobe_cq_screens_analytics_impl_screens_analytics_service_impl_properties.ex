# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule AdobeExperienceManagerOSGIConfig(AEM)API.Model.ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"com.adobe.cq.screens.analytics.impl.url",
    :"com.adobe.cq.screens.analytics.impl.apikey",
    :"com.adobe.cq.screens.analytics.impl.project",
    :"com.adobe.cq.screens.analytics.impl.environment",
    :"com.adobe.cq.screens.analytics.impl.sendFrequency"
  ]

  @type t :: %__MODULE__{
    :"com.adobe.cq.screens.analytics.impl.url" => ConfigNodePropertyString,
    :"com.adobe.cq.screens.analytics.impl.apikey" => ConfigNodePropertyString,
    :"com.adobe.cq.screens.analytics.impl.project" => ConfigNodePropertyString,
    :"com.adobe.cq.screens.analytics.impl.environment" => ConfigNodePropertyDropDown,
    :"com.adobe.cq.screens.analytics.impl.sendFrequency" => ConfigNodePropertyInteger
  }
end

defimpl Poison.Decoder, for: AdobeExperienceManagerOSGIConfig(AEM)API.Model.ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties do
  import AdobeExperienceManagerOSGIConfig(AEM)API.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"com.adobe.cq.screens.analytics.impl.url", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyString, options)
    |> deserialize(:"com.adobe.cq.screens.analytics.impl.apikey", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyString, options)
    |> deserialize(:"com.adobe.cq.screens.analytics.impl.project", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyString, options)
    |> deserialize(:"com.adobe.cq.screens.analytics.impl.environment", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyDropDown, options)
    |> deserialize(:"com.adobe.cq.screens.analytics.impl.sendFrequency", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyInteger, options)
  end
end
