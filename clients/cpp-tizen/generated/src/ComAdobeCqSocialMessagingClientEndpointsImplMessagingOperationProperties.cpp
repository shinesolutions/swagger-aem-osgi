#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties()
{
	//__init();
}

ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::~ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::__init()
{
	//messageproperties = new ConfigNodePropertyArray();
	//messageBoxSizeLimit = new ConfigNodePropertyInteger();
	//messageCountLimit = new ConfigNodePropertyInteger();
	//notifyFailure = new ConfigNodePropertyBoolean();
	//failureMessageFrom = new ConfigNodePropertyString();
	//failureTemplatePath = new ConfigNodePropertyString();
	//maxRetries = new ConfigNodePropertyInteger();
	//minWaitBetweenRetries = new ConfigNodePropertyInteger();
	//countUpdatePoolSize = new ConfigNodePropertyInteger();
	//inboxpath = new ConfigNodePropertyString();
	//sentitemspath = new ConfigNodePropertyString();
	//supportAttachments = new ConfigNodePropertyBoolean();
	//supportGroupMessaging = new ConfigNodePropertyBoolean();
	//maxTotalRecipients = new ConfigNodePropertyInteger();
	//batchSize = new ConfigNodePropertyInteger();
	//maxTotalAttachmentSize = new ConfigNodePropertyInteger();
	//attachmentTypeBlacklist = new ConfigNodePropertyArray();
	//allowedAttachmentTypes = new ConfigNodePropertyArray();
	//serviceSelector = new ConfigNodePropertyString();
	//fieldWhitelist = new ConfigNodePropertyArray();
}

void
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::__cleanup()
{
	//if(messageproperties != NULL) {
	//
	//delete messageproperties;
	//messageproperties = NULL;
	//}
	//if(messageBoxSizeLimit != NULL) {
	//
	//delete messageBoxSizeLimit;
	//messageBoxSizeLimit = NULL;
	//}
	//if(messageCountLimit != NULL) {
	//
	//delete messageCountLimit;
	//messageCountLimit = NULL;
	//}
	//if(notifyFailure != NULL) {
	//
	//delete notifyFailure;
	//notifyFailure = NULL;
	//}
	//if(failureMessageFrom != NULL) {
	//
	//delete failureMessageFrom;
	//failureMessageFrom = NULL;
	//}
	//if(failureTemplatePath != NULL) {
	//
	//delete failureTemplatePath;
	//failureTemplatePath = NULL;
	//}
	//if(maxRetries != NULL) {
	//
	//delete maxRetries;
	//maxRetries = NULL;
	//}
	//if(minWaitBetweenRetries != NULL) {
	//
	//delete minWaitBetweenRetries;
	//minWaitBetweenRetries = NULL;
	//}
	//if(countUpdatePoolSize != NULL) {
	//
	//delete countUpdatePoolSize;
	//countUpdatePoolSize = NULL;
	//}
	//if(inboxpath != NULL) {
	//
	//delete inboxpath;
	//inboxpath = NULL;
	//}
	//if(sentitemspath != NULL) {
	//
	//delete sentitemspath;
	//sentitemspath = NULL;
	//}
	//if(supportAttachments != NULL) {
	//
	//delete supportAttachments;
	//supportAttachments = NULL;
	//}
	//if(supportGroupMessaging != NULL) {
	//
	//delete supportGroupMessaging;
	//supportGroupMessaging = NULL;
	//}
	//if(maxTotalRecipients != NULL) {
	//
	//delete maxTotalRecipients;
	//maxTotalRecipients = NULL;
	//}
	//if(batchSize != NULL) {
	//
	//delete batchSize;
	//batchSize = NULL;
	//}
	//if(maxTotalAttachmentSize != NULL) {
	//
	//delete maxTotalAttachmentSize;
	//maxTotalAttachmentSize = NULL;
	//}
	//if(attachmentTypeBlacklist != NULL) {
	//
	//delete attachmentTypeBlacklist;
	//attachmentTypeBlacklist = NULL;
	//}
	//if(allowedAttachmentTypes != NULL) {
	//
	//delete allowedAttachmentTypes;
	//allowedAttachmentTypes = NULL;
	//}
	//if(serviceSelector != NULL) {
	//
	//delete serviceSelector;
	//serviceSelector = NULL;
	//}
	//if(fieldWhitelist != NULL) {
	//
	//delete fieldWhitelist;
	//fieldWhitelist = NULL;
	//}
	//
}

void
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *messagepropertiesKey = "message.properties";
	node = json_object_get_member(pJsonObject, messagepropertiesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&messageproperties, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&messageproperties);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *messageBoxSizeLimitKey = "messageBoxSizeLimit";
	node = json_object_get_member(pJsonObject, messageBoxSizeLimitKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&messageBoxSizeLimit, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&messageBoxSizeLimit);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *messageCountLimitKey = "messageCountLimit";
	node = json_object_get_member(pJsonObject, messageCountLimitKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&messageCountLimit, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&messageCountLimit);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *notifyFailureKey = "notifyFailure";
	node = json_object_get_member(pJsonObject, notifyFailureKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&notifyFailure, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&notifyFailure);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *failureMessageFromKey = "failureMessageFrom";
	node = json_object_get_member(pJsonObject, failureMessageFromKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&failureMessageFrom, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&failureMessageFrom);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *failureTemplatePathKey = "failureTemplatePath";
	node = json_object_get_member(pJsonObject, failureTemplatePathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&failureTemplatePath, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&failureTemplatePath);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *maxRetriesKey = "maxRetries";
	node = json_object_get_member(pJsonObject, maxRetriesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&maxRetries, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&maxRetries);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *minWaitBetweenRetriesKey = "minWaitBetweenRetries";
	node = json_object_get_member(pJsonObject, minWaitBetweenRetriesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&minWaitBetweenRetries, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&minWaitBetweenRetries);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *countUpdatePoolSizeKey = "countUpdatePoolSize";
	node = json_object_get_member(pJsonObject, countUpdatePoolSizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&countUpdatePoolSize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&countUpdatePoolSize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *inboxpathKey = "inbox.path";
	node = json_object_get_member(pJsonObject, inboxpathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&inboxpath, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&inboxpath);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *sentitemspathKey = "sentitems.path";
	node = json_object_get_member(pJsonObject, sentitemspathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&sentitemspath, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&sentitemspath);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *supportAttachmentsKey = "supportAttachments";
	node = json_object_get_member(pJsonObject, supportAttachmentsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&supportAttachments, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&supportAttachments);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *supportGroupMessagingKey = "supportGroupMessaging";
	node = json_object_get_member(pJsonObject, supportGroupMessagingKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&supportGroupMessaging, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&supportGroupMessaging);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *maxTotalRecipientsKey = "maxTotalRecipients";
	node = json_object_get_member(pJsonObject, maxTotalRecipientsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&maxTotalRecipients, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&maxTotalRecipients);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *batchSizeKey = "batchSize";
	node = json_object_get_member(pJsonObject, batchSizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&batchSize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&batchSize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *maxTotalAttachmentSizeKey = "maxTotalAttachmentSize";
	node = json_object_get_member(pJsonObject, maxTotalAttachmentSizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&maxTotalAttachmentSize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&maxTotalAttachmentSize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *attachmentTypeBlacklistKey = "attachmentTypeBlacklist";
	node = json_object_get_member(pJsonObject, attachmentTypeBlacklistKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&attachmentTypeBlacklist, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&attachmentTypeBlacklist);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *allowedAttachmentTypesKey = "allowedAttachmentTypes";
	node = json_object_get_member(pJsonObject, allowedAttachmentTypesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&allowedAttachmentTypes, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&allowedAttachmentTypes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *serviceSelectorKey = "serviceSelector";
	node = json_object_get_member(pJsonObject, serviceSelectorKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&serviceSelector, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&serviceSelector);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *fieldWhitelistKey = "fieldWhitelist";
	node = json_object_get_member(pJsonObject, fieldWhitelistKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&fieldWhitelist, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&fieldWhitelist);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getMessageproperties();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getMessageproperties());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *messagepropertiesKey = "message.properties";
	json_object_set_member(pJsonObject, messagepropertiesKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getMessageBoxSizeLimit();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getMessageBoxSizeLimit());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *messageBoxSizeLimitKey = "messageBoxSizeLimit";
	json_object_set_member(pJsonObject, messageBoxSizeLimitKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getMessageCountLimit();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getMessageCountLimit());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *messageCountLimitKey = "messageCountLimit";
	json_object_set_member(pJsonObject, messageCountLimitKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getNotifyFailure();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getNotifyFailure());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *notifyFailureKey = "notifyFailure";
	json_object_set_member(pJsonObject, notifyFailureKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getFailureMessageFrom();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getFailureMessageFrom());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *failureMessageFromKey = "failureMessageFrom";
	json_object_set_member(pJsonObject, failureMessageFromKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getFailureTemplatePath();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getFailureTemplatePath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *failureTemplatePathKey = "failureTemplatePath";
	json_object_set_member(pJsonObject, failureTemplatePathKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getMaxRetries();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getMaxRetries());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *maxRetriesKey = "maxRetries";
	json_object_set_member(pJsonObject, maxRetriesKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getMinWaitBetweenRetries();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getMinWaitBetweenRetries());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *minWaitBetweenRetriesKey = "minWaitBetweenRetries";
	json_object_set_member(pJsonObject, minWaitBetweenRetriesKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCountUpdatePoolSize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCountUpdatePoolSize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *countUpdatePoolSizeKey = "countUpdatePoolSize";
	json_object_set_member(pJsonObject, countUpdatePoolSizeKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getInboxpath();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getInboxpath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *inboxpathKey = "inbox.path";
	json_object_set_member(pJsonObject, inboxpathKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSentitemspath();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSentitemspath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *sentitemspathKey = "sentitems.path";
	json_object_set_member(pJsonObject, sentitemspathKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getSupportAttachments();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getSupportAttachments());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *supportAttachmentsKey = "supportAttachments";
	json_object_set_member(pJsonObject, supportAttachmentsKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getSupportGroupMessaging();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getSupportGroupMessaging());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *supportGroupMessagingKey = "supportGroupMessaging";
	json_object_set_member(pJsonObject, supportGroupMessagingKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getMaxTotalRecipients();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getMaxTotalRecipients());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *maxTotalRecipientsKey = "maxTotalRecipients";
	json_object_set_member(pJsonObject, maxTotalRecipientsKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getBatchSize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getBatchSize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *batchSizeKey = "batchSize";
	json_object_set_member(pJsonObject, batchSizeKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getMaxTotalAttachmentSize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getMaxTotalAttachmentSize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *maxTotalAttachmentSizeKey = "maxTotalAttachmentSize";
	json_object_set_member(pJsonObject, maxTotalAttachmentSizeKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getAttachmentTypeBlacklist();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getAttachmentTypeBlacklist());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *attachmentTypeBlacklistKey = "attachmentTypeBlacklist";
	json_object_set_member(pJsonObject, attachmentTypeBlacklistKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getAllowedAttachmentTypes();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getAllowedAttachmentTypes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *allowedAttachmentTypesKey = "allowedAttachmentTypes";
	json_object_set_member(pJsonObject, allowedAttachmentTypesKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getServiceSelector();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getServiceSelector());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *serviceSelectorKey = "serviceSelector";
	json_object_set_member(pJsonObject, serviceSelectorKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getFieldWhitelist();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getFieldWhitelist());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *fieldWhitelistKey = "fieldWhitelist";
	json_object_set_member(pJsonObject, fieldWhitelistKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::getMessageproperties()
{
	return messageproperties;
}

void
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::setMessageproperties(ConfigNodePropertyArray  messageproperties)
{
	this->messageproperties = messageproperties;
}

ConfigNodePropertyInteger
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::getMessageBoxSizeLimit()
{
	return messageBoxSizeLimit;
}

void
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::setMessageBoxSizeLimit(ConfigNodePropertyInteger  messageBoxSizeLimit)
{
	this->messageBoxSizeLimit = messageBoxSizeLimit;
}

ConfigNodePropertyInteger
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::getMessageCountLimit()
{
	return messageCountLimit;
}

void
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::setMessageCountLimit(ConfigNodePropertyInteger  messageCountLimit)
{
	this->messageCountLimit = messageCountLimit;
}

ConfigNodePropertyBoolean
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::getNotifyFailure()
{
	return notifyFailure;
}

void
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::setNotifyFailure(ConfigNodePropertyBoolean  notifyFailure)
{
	this->notifyFailure = notifyFailure;
}

ConfigNodePropertyString
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::getFailureMessageFrom()
{
	return failureMessageFrom;
}

void
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::setFailureMessageFrom(ConfigNodePropertyString  failureMessageFrom)
{
	this->failureMessageFrom = failureMessageFrom;
}

ConfigNodePropertyString
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::getFailureTemplatePath()
{
	return failureTemplatePath;
}

void
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::setFailureTemplatePath(ConfigNodePropertyString  failureTemplatePath)
{
	this->failureTemplatePath = failureTemplatePath;
}

ConfigNodePropertyInteger
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::getMaxRetries()
{
	return maxRetries;
}

void
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::setMaxRetries(ConfigNodePropertyInteger  maxRetries)
{
	this->maxRetries = maxRetries;
}

ConfigNodePropertyInteger
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::getMinWaitBetweenRetries()
{
	return minWaitBetweenRetries;
}

void
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::setMinWaitBetweenRetries(ConfigNodePropertyInteger  minWaitBetweenRetries)
{
	this->minWaitBetweenRetries = minWaitBetweenRetries;
}

ConfigNodePropertyInteger
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::getCountUpdatePoolSize()
{
	return countUpdatePoolSize;
}

void
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::setCountUpdatePoolSize(ConfigNodePropertyInteger  countUpdatePoolSize)
{
	this->countUpdatePoolSize = countUpdatePoolSize;
}

ConfigNodePropertyString
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::getInboxpath()
{
	return inboxpath;
}

void
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::setInboxpath(ConfigNodePropertyString  inboxpath)
{
	this->inboxpath = inboxpath;
}

ConfigNodePropertyString
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::getSentitemspath()
{
	return sentitemspath;
}

void
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::setSentitemspath(ConfigNodePropertyString  sentitemspath)
{
	this->sentitemspath = sentitemspath;
}

ConfigNodePropertyBoolean
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::getSupportAttachments()
{
	return supportAttachments;
}

void
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::setSupportAttachments(ConfigNodePropertyBoolean  supportAttachments)
{
	this->supportAttachments = supportAttachments;
}

ConfigNodePropertyBoolean
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::getSupportGroupMessaging()
{
	return supportGroupMessaging;
}

void
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::setSupportGroupMessaging(ConfigNodePropertyBoolean  supportGroupMessaging)
{
	this->supportGroupMessaging = supportGroupMessaging;
}

ConfigNodePropertyInteger
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::getMaxTotalRecipients()
{
	return maxTotalRecipients;
}

void
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::setMaxTotalRecipients(ConfigNodePropertyInteger  maxTotalRecipients)
{
	this->maxTotalRecipients = maxTotalRecipients;
}

ConfigNodePropertyInteger
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::getBatchSize()
{
	return batchSize;
}

void
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::setBatchSize(ConfigNodePropertyInteger  batchSize)
{
	this->batchSize = batchSize;
}

ConfigNodePropertyInteger
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::getMaxTotalAttachmentSize()
{
	return maxTotalAttachmentSize;
}

void
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::setMaxTotalAttachmentSize(ConfigNodePropertyInteger  maxTotalAttachmentSize)
{
	this->maxTotalAttachmentSize = maxTotalAttachmentSize;
}

ConfigNodePropertyArray
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::getAttachmentTypeBlacklist()
{
	return attachmentTypeBlacklist;
}

void
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::setAttachmentTypeBlacklist(ConfigNodePropertyArray  attachmentTypeBlacklist)
{
	this->attachmentTypeBlacklist = attachmentTypeBlacklist;
}

ConfigNodePropertyArray
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::getAllowedAttachmentTypes()
{
	return allowedAttachmentTypes;
}

void
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::setAllowedAttachmentTypes(ConfigNodePropertyArray  allowedAttachmentTypes)
{
	this->allowedAttachmentTypes = allowedAttachmentTypes;
}

ConfigNodePropertyString
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::getServiceSelector()
{
	return serviceSelector;
}

void
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::setServiceSelector(ConfigNodePropertyString  serviceSelector)
{
	this->serviceSelector = serviceSelector;
}

ConfigNodePropertyArray
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::getFieldWhitelist()
{
	return fieldWhitelist;
}

void
ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties::setFieldWhitelist(ConfigNodePropertyArray  fieldWhitelist)
{
	this->fieldWhitelist = fieldWhitelist;
}


