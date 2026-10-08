package models

type OrgApacheFelixJaasConfigurationFactoryProperties struct {

	JaasControlFlag ConfigNodePropertyDropDown `json:"jaas.controlFlag,omitempty"`

	JaasRanking ConfigNodePropertyInteger `json:"jaas.ranking,omitempty"`

	JaasRealmName ConfigNodePropertyString `json:"jaas.realmName,omitempty"`

	JaasClassname ConfigNodePropertyString `json:"jaas.classname,omitempty"`

	JaasOptions ConfigNodePropertyArray `json:"jaas.options,omitempty"`
}
