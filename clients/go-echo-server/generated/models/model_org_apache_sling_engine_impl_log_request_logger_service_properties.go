package models

type OrgApacheSlingEngineImplLogRequestLoggerServiceProperties struct {

	RequestLogServiceFormat ConfigNodePropertyString `json:"request.log.service.format,omitempty"`

	RequestLogServiceOutput ConfigNodePropertyString `json:"request.log.service.output,omitempty"`

	RequestLogServiceOutputtype ConfigNodePropertyDropDown `json:"request.log.service.outputtype,omitempty"`

	RequestLogServiceOnentry ConfigNodePropertyBoolean `json:"request.log.service.onentry,omitempty"`
}
