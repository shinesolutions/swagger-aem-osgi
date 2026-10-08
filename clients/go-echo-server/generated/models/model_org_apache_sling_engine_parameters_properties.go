package models

type OrgApacheSlingEngineParametersProperties struct {

	SlingDefaultParameterEncoding ConfigNodePropertyString `json:"sling.default.parameter.encoding,omitempty"`

	SlingDefaultMaxParameters ConfigNodePropertyInteger `json:"sling.default.max.parameters,omitempty"`

	FileLocation ConfigNodePropertyString `json:"file.location,omitempty"`

	FileThreshold ConfigNodePropertyInteger `json:"file.threshold,omitempty"`

	FileMax ConfigNodePropertyInteger `json:"file.max,omitempty"`

	RequestMax ConfigNodePropertyInteger `json:"request.max,omitempty"`

	SlingDefaultParameterCheckForAdditionalContainerParameters ConfigNodePropertyBoolean `json:"sling.default.parameter.checkForAdditionalContainerParameters,omitempty"`
}
