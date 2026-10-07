package models

type ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties struct {

	EmailName ConfigNodePropertyString `json:"email.name,omitempty"`

	EmailCreatePostFromReply ConfigNodePropertyBoolean `json:"email.createPostFromReply,omitempty"`

	EmailAddCommentIdTo ConfigNodePropertyDropDown `json:"email.addCommentIdTo,omitempty"`

	EmailSubjectMaximumLength ConfigNodePropertyInteger `json:"email.subjectMaximumLength,omitempty"`

	EmailReplyToAddress ConfigNodePropertyString `json:"email.replyToAddress,omitempty"`

	EmailReplyToDelimiter ConfigNodePropertyString `json:"email.replyToDelimiter,omitempty"`

	EmailTrackerIdPrefixInSubject ConfigNodePropertyString `json:"email.trackerIdPrefixInSubject,omitempty"`

	EmailTrackerIdPrefixInBody ConfigNodePropertyString `json:"email.trackerIdPrefixInBody,omitempty"`

	EmailAsHTML ConfigNodePropertyBoolean `json:"email.asHTML,omitempty"`

	EmailDefaultUserName ConfigNodePropertyString `json:"email.defaultUserName,omitempty"`

	EmailTemplatesRootPath ConfigNodePropertyString `json:"email.templates.rootPath,omitempty"`
}
