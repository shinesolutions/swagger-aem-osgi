package models

type OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties struct {

	JaasRanking ConfigNodePropertyInteger `json:"jaas.ranking,omitempty"`

	JaasControlFlag ConfigNodePropertyString `json:"jaas.controlFlag,omitempty"`

	JaasRealmName ConfigNodePropertyString `json:"jaas.realmName,omitempty"`

	IdpName ConfigNodePropertyString `json:"idp.name,omitempty"`

	SyncHandlerName ConfigNodePropertyString `json:"sync.handlerName,omitempty"`
}
