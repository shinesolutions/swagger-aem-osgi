package models

type ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties struct {

	WatchwordsPositive ConfigNodePropertyArray `json:"watchwords.positive,omitempty"`

	WatchwordsNegative ConfigNodePropertyArray `json:"watchwords.negative,omitempty"`

	WatchwordsPath ConfigNodePropertyString `json:"watchwords.path,omitempty"`

	SentimentPath ConfigNodePropertyString `json:"sentiment.path,omitempty"`
}
