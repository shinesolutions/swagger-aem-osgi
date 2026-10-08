

#include "ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.h"

using namespace Tiny;

ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties()
{
	messageproperties = ConfigNodePropertyArray();
	messageBoxSizeLimit = ConfigNodePropertyInteger();
	messageCountLimit = ConfigNodePropertyInteger();
	notifyFailure = ConfigNodePropertyBoolean();
	failureMessageFrom = ConfigNodePropertyString();
	failureTemplatePath = ConfigNodePropertyString();
	maxRetries = ConfigNodePropertyInteger();
	minWaitBetweenRetries = ConfigNodePropertyInteger();
	countUpdatePoolSize = ConfigNodePropertyInteger();
	inboxpath = ConfigNodePropertyString();
	sentitemspath = ConfigNodePropertyString();
	supportAttachments = ConfigNodePropertyBoolean();
	supportGroupMessaging = ConfigNodePropertyBoolean();
	maxTotalRecipients = ConfigNodePropertyInteger();
	batchSize = ConfigNodePropertyInteger();
	maxTotalAttachmentSize = ConfigNodePropertyInteger();
	attachmentTypeBlacklist = ConfigNodePropertyArray();
	allowedAttachmentTypes = ConfigNodePropertyArray();
	serviceSelector = ConfigNodePropertyString();
	fieldWhitelist = ConfigNodePropertyArray();
}

ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::~ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties()
{

}

void
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *messagepropertiesKey = "message.properties";

    if(object.has_key(messagepropertiesKey))
    {
        bourne::json value = object[messagepropertiesKey];




        ConfigNodePropertyArray* obj = &messageproperties;
		obj->fromJson(value.dump());

    }

    const char *messageBoxSizeLimitKey = "messageBoxSizeLimit";

    if(object.has_key(messageBoxSizeLimitKey))
    {
        bourne::json value = object[messageBoxSizeLimitKey];




        ConfigNodePropertyInteger* obj = &messageBoxSizeLimit;
		obj->fromJson(value.dump());

    }

    const char *messageCountLimitKey = "messageCountLimit";

    if(object.has_key(messageCountLimitKey))
    {
        bourne::json value = object[messageCountLimitKey];




        ConfigNodePropertyInteger* obj = &messageCountLimit;
		obj->fromJson(value.dump());

    }

    const char *notifyFailureKey = "notifyFailure";

    if(object.has_key(notifyFailureKey))
    {
        bourne::json value = object[notifyFailureKey];




        ConfigNodePropertyBoolean* obj = &notifyFailure;
		obj->fromJson(value.dump());

    }

    const char *failureMessageFromKey = "failureMessageFrom";

    if(object.has_key(failureMessageFromKey))
    {
        bourne::json value = object[failureMessageFromKey];




        ConfigNodePropertyString* obj = &failureMessageFrom;
		obj->fromJson(value.dump());

    }

    const char *failureTemplatePathKey = "failureTemplatePath";

    if(object.has_key(failureTemplatePathKey))
    {
        bourne::json value = object[failureTemplatePathKey];




        ConfigNodePropertyString* obj = &failureTemplatePath;
		obj->fromJson(value.dump());

    }

    const char *maxRetriesKey = "maxRetries";

    if(object.has_key(maxRetriesKey))
    {
        bourne::json value = object[maxRetriesKey];




        ConfigNodePropertyInteger* obj = &maxRetries;
		obj->fromJson(value.dump());

    }

    const char *minWaitBetweenRetriesKey = "minWaitBetweenRetries";

    if(object.has_key(minWaitBetweenRetriesKey))
    {
        bourne::json value = object[minWaitBetweenRetriesKey];




        ConfigNodePropertyInteger* obj = &minWaitBetweenRetries;
		obj->fromJson(value.dump());

    }

    const char *countUpdatePoolSizeKey = "countUpdatePoolSize";

    if(object.has_key(countUpdatePoolSizeKey))
    {
        bourne::json value = object[countUpdatePoolSizeKey];




        ConfigNodePropertyInteger* obj = &countUpdatePoolSize;
		obj->fromJson(value.dump());

    }

    const char *inboxpathKey = "inbox.path";

    if(object.has_key(inboxpathKey))
    {
        bourne::json value = object[inboxpathKey];




        ConfigNodePropertyString* obj = &inboxpath;
		obj->fromJson(value.dump());

    }

    const char *sentitemspathKey = "sentitems.path";

    if(object.has_key(sentitemspathKey))
    {
        bourne::json value = object[sentitemspathKey];




        ConfigNodePropertyString* obj = &sentitemspath;
		obj->fromJson(value.dump());

    }

    const char *supportAttachmentsKey = "supportAttachments";

    if(object.has_key(supportAttachmentsKey))
    {
        bourne::json value = object[supportAttachmentsKey];




        ConfigNodePropertyBoolean* obj = &supportAttachments;
		obj->fromJson(value.dump());

    }

    const char *supportGroupMessagingKey = "supportGroupMessaging";

    if(object.has_key(supportGroupMessagingKey))
    {
        bourne::json value = object[supportGroupMessagingKey];




        ConfigNodePropertyBoolean* obj = &supportGroupMessaging;
		obj->fromJson(value.dump());

    }

    const char *maxTotalRecipientsKey = "maxTotalRecipients";

    if(object.has_key(maxTotalRecipientsKey))
    {
        bourne::json value = object[maxTotalRecipientsKey];




        ConfigNodePropertyInteger* obj = &maxTotalRecipients;
		obj->fromJson(value.dump());

    }

    const char *batchSizeKey = "batchSize";

    if(object.has_key(batchSizeKey))
    {
        bourne::json value = object[batchSizeKey];




        ConfigNodePropertyInteger* obj = &batchSize;
		obj->fromJson(value.dump());

    }

    const char *maxTotalAttachmentSizeKey = "maxTotalAttachmentSize";

    if(object.has_key(maxTotalAttachmentSizeKey))
    {
        bourne::json value = object[maxTotalAttachmentSizeKey];




        ConfigNodePropertyInteger* obj = &maxTotalAttachmentSize;
		obj->fromJson(value.dump());

    }

    const char *attachmentTypeBlacklistKey = "attachmentTypeBlacklist";

    if(object.has_key(attachmentTypeBlacklistKey))
    {
        bourne::json value = object[attachmentTypeBlacklistKey];




        ConfigNodePropertyArray* obj = &attachmentTypeBlacklist;
		obj->fromJson(value.dump());

    }

    const char *allowedAttachmentTypesKey = "allowedAttachmentTypes";

    if(object.has_key(allowedAttachmentTypesKey))
    {
        bourne::json value = object[allowedAttachmentTypesKey];




        ConfigNodePropertyArray* obj = &allowedAttachmentTypes;
		obj->fromJson(value.dump());

    }

    const char *serviceSelectorKey = "serviceSelector";

    if(object.has_key(serviceSelectorKey))
    {
        bourne::json value = object[serviceSelectorKey];




        ConfigNodePropertyString* obj = &serviceSelector;
		obj->fromJson(value.dump());

    }

    const char *fieldWhitelistKey = "fieldWhitelist";

    if(object.has_key(fieldWhitelistKey))
    {
        bourne::json value = object[fieldWhitelistKey];




        ConfigNodePropertyArray* obj = &fieldWhitelist;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["messageproperties"] = getMessageproperties().toJson();






	object["messageBoxSizeLimit"] = getMessageBoxSizeLimit().toJson();






	object["messageCountLimit"] = getMessageCountLimit().toJson();






	object["notifyFailure"] = getNotifyFailure().toJson();






	object["failureMessageFrom"] = getFailureMessageFrom().toJson();






	object["failureTemplatePath"] = getFailureTemplatePath().toJson();






	object["maxRetries"] = getMaxRetries().toJson();






	object["minWaitBetweenRetries"] = getMinWaitBetweenRetries().toJson();






	object["countUpdatePoolSize"] = getCountUpdatePoolSize().toJson();






	object["inboxpath"] = getInboxpath().toJson();






	object["sentitemspath"] = getSentitemspath().toJson();






	object["supportAttachments"] = getSupportAttachments().toJson();






	object["supportGroupMessaging"] = getSupportGroupMessaging().toJson();






	object["maxTotalRecipients"] = getMaxTotalRecipients().toJson();






	object["batchSize"] = getBatchSize().toJson();






	object["maxTotalAttachmentSize"] = getMaxTotalAttachmentSize().toJson();






	object["attachmentTypeBlacklist"] = getAttachmentTypeBlacklist().toJson();






	object["allowedAttachmentTypes"] = getAllowedAttachmentTypes().toJson();






	object["serviceSelector"] = getServiceSelector().toJson();






	object["fieldWhitelist"] = getFieldWhitelist().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::getMessageproperties()
{
	return messageproperties;
}

void
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::setMessageproperties(ConfigNodePropertyArray messageproperties)
{
	this->messageproperties = messageproperties;
}

ConfigNodePropertyInteger
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::getMessageBoxSizeLimit()
{
	return messageBoxSizeLimit;
}

void
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::setMessageBoxSizeLimit(ConfigNodePropertyInteger messageBoxSizeLimit)
{
	this->messageBoxSizeLimit = messageBoxSizeLimit;
}

ConfigNodePropertyInteger
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::getMessageCountLimit()
{
	return messageCountLimit;
}

void
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::setMessageCountLimit(ConfigNodePropertyInteger messageCountLimit)
{
	this->messageCountLimit = messageCountLimit;
}

ConfigNodePropertyBoolean
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::getNotifyFailure()
{
	return notifyFailure;
}

void
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::setNotifyFailure(ConfigNodePropertyBoolean notifyFailure)
{
	this->notifyFailure = notifyFailure;
}

ConfigNodePropertyString
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::getFailureMessageFrom()
{
	return failureMessageFrom;
}

void
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::setFailureMessageFrom(ConfigNodePropertyString failureMessageFrom)
{
	this->failureMessageFrom = failureMessageFrom;
}

ConfigNodePropertyString
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::getFailureTemplatePath()
{
	return failureTemplatePath;
}

void
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::setFailureTemplatePath(ConfigNodePropertyString failureTemplatePath)
{
	this->failureTemplatePath = failureTemplatePath;
}

ConfigNodePropertyInteger
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::getMaxRetries()
{
	return maxRetries;
}

void
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::setMaxRetries(ConfigNodePropertyInteger maxRetries)
{
	this->maxRetries = maxRetries;
}

ConfigNodePropertyInteger
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::getMinWaitBetweenRetries()
{
	return minWaitBetweenRetries;
}

void
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::setMinWaitBetweenRetries(ConfigNodePropertyInteger minWaitBetweenRetries)
{
	this->minWaitBetweenRetries = minWaitBetweenRetries;
}

ConfigNodePropertyInteger
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::getCountUpdatePoolSize()
{
	return countUpdatePoolSize;
}

void
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::setCountUpdatePoolSize(ConfigNodePropertyInteger countUpdatePoolSize)
{
	this->countUpdatePoolSize = countUpdatePoolSize;
}

ConfigNodePropertyString
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::getInboxpath()
{
	return inboxpath;
}

void
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::setInboxpath(ConfigNodePropertyString inboxpath)
{
	this->inboxpath = inboxpath;
}

ConfigNodePropertyString
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::getSentitemspath()
{
	return sentitemspath;
}

void
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::setSentitemspath(ConfigNodePropertyString sentitemspath)
{
	this->sentitemspath = sentitemspath;
}

ConfigNodePropertyBoolean
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::getSupportAttachments()
{
	return supportAttachments;
}

void
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::setSupportAttachments(ConfigNodePropertyBoolean supportAttachments)
{
	this->supportAttachments = supportAttachments;
}

ConfigNodePropertyBoolean
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::getSupportGroupMessaging()
{
	return supportGroupMessaging;
}

void
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::setSupportGroupMessaging(ConfigNodePropertyBoolean supportGroupMessaging)
{
	this->supportGroupMessaging = supportGroupMessaging;
}

ConfigNodePropertyInteger
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::getMaxTotalRecipients()
{
	return maxTotalRecipients;
}

void
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::setMaxTotalRecipients(ConfigNodePropertyInteger maxTotalRecipients)
{
	this->maxTotalRecipients = maxTotalRecipients;
}

ConfigNodePropertyInteger
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::getBatchSize()
{
	return batchSize;
}

void
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::setBatchSize(ConfigNodePropertyInteger batchSize)
{
	this->batchSize = batchSize;
}

ConfigNodePropertyInteger
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::getMaxTotalAttachmentSize()
{
	return maxTotalAttachmentSize;
}

void
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::setMaxTotalAttachmentSize(ConfigNodePropertyInteger maxTotalAttachmentSize)
{
	this->maxTotalAttachmentSize = maxTotalAttachmentSize;
}

ConfigNodePropertyArray
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::getAttachmentTypeBlacklist()
{
	return attachmentTypeBlacklist;
}

void
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::setAttachmentTypeBlacklist(ConfigNodePropertyArray attachmentTypeBlacklist)
{
	this->attachmentTypeBlacklist = attachmentTypeBlacklist;
}

ConfigNodePropertyArray
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::getAllowedAttachmentTypes()
{
	return allowedAttachmentTypes;
}

void
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::setAllowedAttachmentTypes(ConfigNodePropertyArray allowedAttachmentTypes)
{
	this->allowedAttachmentTypes = allowedAttachmentTypes;
}

ConfigNodePropertyString
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::getServiceSelector()
{
	return serviceSelector;
}

void
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::setServiceSelector(ConfigNodePropertyString serviceSelector)
{
	this->serviceSelector = serviceSelector;
}

ConfigNodePropertyArray
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::getFieldWhitelist()
{
	return fieldWhitelist;
}

void
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::setFieldWhitelist(ConfigNodePropertyArray fieldWhitelist)
{
	this->fieldWhitelist = fieldWhitelist;
}



