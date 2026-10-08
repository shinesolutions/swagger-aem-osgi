package models

type ComDayCqMailerImplCqMailingServiceInfo struct {

	Pid string `json:"pid,omitempty"`

	Title string `json:"title,omitempty"`

	Description string `json:"description,omitempty"`

	Properties ComDayCqMailerImplCqMailingServiceProperties `json:"properties,omitempty"`
}
