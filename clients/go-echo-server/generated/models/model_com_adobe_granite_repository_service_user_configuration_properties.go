package models

type ComAdobeGraniteRepositoryServiceUserConfigurationProperties struct {

	ServiceRanking ConfigNodePropertyInteger `json:"service.ranking,omitempty"`

	ServiceusersSimpleSubjectPopulation ConfigNodePropertyBoolean `json:"serviceusers.simpleSubjectPopulation,omitempty"`

	ServiceusersList ConfigNodePropertyArray `json:"serviceusers.list,omitempty"`
}
