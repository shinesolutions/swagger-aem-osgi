package models

type MessagingUserComponentFactoryInfo struct {

	Pid string `json:"pid,omitempty"`

	Title string `json:"title,omitempty"`

	Description string `json:"description,omitempty"`

	Properties MessagingUserComponentFactoryProperties `json:"properties,omitempty"`
}
