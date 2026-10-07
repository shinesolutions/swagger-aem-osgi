package models

type ComDayCommonsHttpclientInfo struct {

	Pid string `json:"pid,omitempty"`

	Title string `json:"title,omitempty"`

	Description string `json:"description,omitempty"`

	Properties ComDayCommonsHttpclientProperties `json:"properties,omitempty"`
}
