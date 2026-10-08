package models

type OrgApacheFelixHttpSslfilterSslFilterProperties struct {

	SslForwardHeader ConfigNodePropertyString `json:"ssl-forward.header,omitempty"`

	SslForwardValue ConfigNodePropertyString `json:"ssl-forward.value,omitempty"`

	SslForwardCertHeader ConfigNodePropertyString `json:"ssl-forward-cert.header,omitempty"`

	RewriteAbsoluteUrls ConfigNodePropertyBoolean `json:"rewrite.absolute.urls,omitempty"`
}
