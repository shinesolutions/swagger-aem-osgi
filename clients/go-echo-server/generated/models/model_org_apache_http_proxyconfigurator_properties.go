package models

type OrgApacheHttpProxyconfiguratorProperties struct {

	ProxyEnabled ConfigNodePropertyBoolean `json:"proxy.enabled,omitempty"`

	ProxyHost ConfigNodePropertyString `json:"proxy.host,omitempty"`

	ProxyPort ConfigNodePropertyInteger `json:"proxy.port,omitempty"`

	ProxyUser ConfigNodePropertyString `json:"proxy.user,omitempty"`

	ProxyPassword ConfigNodePropertyString `json:"proxy.password,omitempty"`

	ProxyExceptions ConfigNodePropertyArray `json:"proxy.exceptions,omitempty"`
}
