package models

type OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties struct {

	EnabledActions ConfigNodePropertyDropDown `json:"enabledActions,omitempty"`

	UserPrivilegeNames ConfigNodePropertyArray `json:"userPrivilegeNames,omitempty"`

	GroupPrivilegeNames ConfigNodePropertyArray `json:"groupPrivilegeNames,omitempty"`

	Constraint ConfigNodePropertyString `json:"constraint,omitempty"`
}
