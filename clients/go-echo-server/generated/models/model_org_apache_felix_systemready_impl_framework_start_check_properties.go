package models

type OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties struct {

	Timeout ConfigNodePropertyInteger `json:"timeout,omitempty"`

	TargetStartLevel ConfigNodePropertyInteger `json:"target.start.level,omitempty"`

	TargetStartLevelPropName ConfigNodePropertyString `json:"target.start.level.prop.name,omitempty"`

	Type ConfigNodePropertyDropDown `json:"type,omitempty"`
}
