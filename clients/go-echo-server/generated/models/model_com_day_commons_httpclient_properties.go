package models

type ComDayCommonsHttpclientProperties struct {

	ProxyEnabled ConfigNodePropertyBoolean `json:"proxy.enabled,omitempty"`

	ProxyHost ConfigNodePropertyString `json:"proxy.host,omitempty"`

	ProxyUser ConfigNodePropertyString `json:"proxy.user,omitempty"`

	ProxyPassword ConfigNodePropertyString `json:"proxy.password,omitempty"`

	ProxyNtlmHost ConfigNodePropertyString `json:"proxy.ntlm.host,omitempty"`

	ProxyNtlmDomain ConfigNodePropertyString `json:"proxy.ntlm.domain,omitempty"`

	ProxyExceptions ConfigNodePropertyArray `json:"proxy.exceptions,omitempty"`
}
