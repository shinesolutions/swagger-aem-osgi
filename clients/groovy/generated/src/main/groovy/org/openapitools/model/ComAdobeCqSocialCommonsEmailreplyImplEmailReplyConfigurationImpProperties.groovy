package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties {
    ConfigNodePropertyString emailName = null

    ConfigNodePropertyBoolean emailCreatePostFromReply = null

    ConfigNodePropertyDropDown emailAddCommentIdTo = null

    ConfigNodePropertyInteger emailSubjectMaximumLength = null

    ConfigNodePropertyString emailReplyToAddress = null

    ConfigNodePropertyString emailReplyToDelimiter = null

    ConfigNodePropertyString emailTrackerIdPrefixInSubject = null

    ConfigNodePropertyString emailTrackerIdPrefixInBody = null

    ConfigNodePropertyBoolean emailAsHTML = null

    ConfigNodePropertyString emailDefaultUserName = null

    ConfigNodePropertyString emailTemplatesRootPath = null

}
