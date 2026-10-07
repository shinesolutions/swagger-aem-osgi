package models

type ConfigNodePropertyDropDown struct {

	// property name
	Name string `json:"name,omitempty"`

	// True if optional
	Optional bool `json:"optional,omitempty"`

	// True if property is set
	IsSet bool `json:"is_set,omitempty"`

	Type ConfigNodePropertyDropDownType `json:"type,omitempty"`

	// Property value
	Value *interface{} `json:"value,omitempty"`

	// Property description
	Description string `json:"description,omitempty"`
}
