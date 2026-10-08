package models

type ComDayCqMailerDefaultMailServiceProperties struct {

	SmtpHost ConfigNodePropertyString `json:"smtp.host,omitempty"`

	SmtpPort ConfigNodePropertyInteger `json:"smtp.port,omitempty"`

	SmtpUser ConfigNodePropertyString `json:"smtp.user,omitempty"`

	SmtpPassword ConfigNodePropertyString `json:"smtp.password,omitempty"`

	FromAddress ConfigNodePropertyString `json:"from.address,omitempty"`

	SmtpSsl ConfigNodePropertyBoolean `json:"smtp.ssl,omitempty"`

	SmtpStarttls ConfigNodePropertyBoolean `json:"smtp.starttls,omitempty"`

	DebugEmail ConfigNodePropertyBoolean `json:"debug.email,omitempty"`
}
