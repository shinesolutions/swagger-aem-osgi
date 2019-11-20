# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule AdobeExperienceManagerOSGIConfig(AEM)API.Model.ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"workflowpackageinfoprovider.filter",
    :"workflowpackageinfoprovider.filter.rootpath"
  ]

  @type t :: %__MODULE__{
    :"workflowpackageinfoprovider.filter" => ConfigNodePropertyArray,
    :"workflowpackageinfoprovider.filter.rootpath" => ConfigNodePropertyString
  }
end

defimpl Poison.Decoder, for: AdobeExperienceManagerOSGIConfig(AEM)API.Model.ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties do
  import AdobeExperienceManagerOSGIConfig(AEM)API.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"workflowpackageinfoprovider.filter", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyArray, options)
    |> deserialize(:"workflowpackageinfoprovider.filter.rootpath", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyString, options)
  end
end
