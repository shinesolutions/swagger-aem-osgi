package models

type ComDayCqReplicationImplTransportHttpProperties struct {

	DisabledCipherSuites ConfigNodePropertyArray `json:"disabled.cipher.suites,omitempty"`

	EnabledCipherSuites ConfigNodePropertyArray `json:"enabled.cipher.suites,omitempty"`
}
