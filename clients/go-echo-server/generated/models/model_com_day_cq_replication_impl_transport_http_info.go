package models

type ComDayCqReplicationImplTransportHttpInfo struct {

	Pid string `json:"pid,omitempty"`

	Title string `json:"title,omitempty"`

	Description string `json:"description,omitempty"`

	Properties ComDayCqReplicationImplTransportHttpProperties `json:"properties,omitempty"`
}
