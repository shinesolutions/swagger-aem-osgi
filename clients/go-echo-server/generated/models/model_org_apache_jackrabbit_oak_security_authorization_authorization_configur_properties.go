package models

type OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties struct {

	PermissionsJr2 ConfigNodePropertyDropDown `json:"permissionsJr2,omitempty"`

	ImportBehavior ConfigNodePropertyDropDown `json:"importBehavior,omitempty"`

	ReadPaths ConfigNodePropertyArray `json:"readPaths,omitempty"`

	AdministrativePrincipals ConfigNodePropertyArray `json:"administrativePrincipals,omitempty"`

	ConfigurationRanking ConfigNodePropertyInteger `json:"configurationRanking,omitempty"`
}
