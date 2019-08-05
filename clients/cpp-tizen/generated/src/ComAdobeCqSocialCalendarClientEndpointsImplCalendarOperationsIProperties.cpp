#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties::ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties()
{
	//__init();
}

ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties::~ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties::__init()
{
	//maxRetry = new ConfigNodePropertyInteger();
	//fieldWhitelist = new ConfigNodePropertyArray();
	//attachmentTypeBlacklist = new ConfigNodePropertyArray();
}

void
ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties::__cleanup()
{
	//if(maxRetry != NULL) {
	//
	//delete maxRetry;
	//maxRetry = NULL;
	//}
	//if(fieldWhitelist != NULL) {
	//
	//delete fieldWhitelist;
	//fieldWhitelist = NULL;
	//}
	//if(attachmentTypeBlacklist != NULL) {
	//
	//delete attachmentTypeBlacklist;
	//attachmentTypeBlacklist = NULL;
	//}
	//
}

void
ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *maxRetryKey = "MaxRetry";
	node = json_object_get_member(pJsonObject, maxRetryKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&maxRetry, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&maxRetry);
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
}

ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties::ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getMaxRetry();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getMaxRetry());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *maxRetryKey = "MaxRetry";
	json_object_set_member(pJsonObject, maxRetryKey, node);
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties::getMaxRetry()
{
	return maxRetry;
}

void
ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties::setMaxRetry(ConfigNodePropertyInteger  maxRetry)
{
	this->maxRetry = maxRetry;
}

ConfigNodePropertyArray
ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties::getFieldWhitelist()
{
	return fieldWhitelist;
}

void
ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties::setFieldWhitelist(ConfigNodePropertyArray  fieldWhitelist)
{
	this->fieldWhitelist = fieldWhitelist;
}

ConfigNodePropertyArray
ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties::getAttachmentTypeBlacklist()
{
	return attachmentTypeBlacklist;
}

void
ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties::setAttachmentTypeBlacklist(ConfigNodePropertyArray  attachmentTypeBlacklist)
{
	this->attachmentTypeBlacklist = attachmentTypeBlacklist;
}


