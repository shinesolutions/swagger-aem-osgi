package models

type OrgApacheSlingEngineImplLogRequestLoggerProperties struct {

	RequestLogOutput ConfigNodePropertyString `json:"request.log.output,omitempty"`

	RequestLogOutputtype ConfigNodePropertyDropDown `json:"request.log.outputtype,omitempty"`

	RequestLogEnabled ConfigNodePropertyBoolean `json:"request.log.enabled,omitempty"`

	AccessLogOutput ConfigNodePropertyString `json:"access.log.output,omitempty"`

	AccessLogOutputtype ConfigNodePropertyDropDown `json:"access.log.outputtype,omitempty"`

	AccessLogEnabled ConfigNodePropertyBoolean `json:"access.log.enabled,omitempty"`
}
