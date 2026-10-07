#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties::ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties()
{
	//__init();
}

ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties::~ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties()
{
	//__cleanup();
}

void
ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties::__init()
{
	//defaultattachmenttypeblacklist = new ConfigNodePropertyArray();
	//baselineattachmenttypeblacklist = new ConfigNodePropertyArray();
}

void
ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties::__cleanup()
{
	//if(defaultattachmenttypeblacklist != NULL) {
	//
	//delete defaultattachmenttypeblacklist;
	//defaultattachmenttypeblacklist = NULL;
	//}
	//if(baselineattachmenttypeblacklist != NULL) {
	//
	//delete baselineattachmenttypeblacklist;
	//baselineattachmenttypeblacklist = NULL;
	//}
	//
}

void
ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *defaultattachmenttypeblacklistKey = "default.attachment.type.blacklist";
	node = json_object_get_member(pJsonObject, defaultattachmenttypeblacklistKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&defaultattachmenttypeblacklist, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&defaultattachmenttypeblacklist);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *baselineattachmenttypeblacklistKey = "baseline.attachment.type.blacklist";
	node = json_object_get_member(pJsonObject, baselineattachmenttypeblacklistKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&baselineattachmenttypeblacklist, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&baselineattachmenttypeblacklist);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties::ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getDefaultattachmenttypeblacklist();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getDefaultattachmenttypeblacklist());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *defaultattachmenttypeblacklistKey = "default.attachment.type.blacklist";
	json_object_set_member(pJsonObject, defaultattachmenttypeblacklistKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getBaselineattachmenttypeblacklist();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getBaselineattachmenttypeblacklist());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *baselineattachmenttypeblacklistKey = "baseline.attachment.type.blacklist";
	json_object_set_member(pJsonObject, baselineattachmenttypeblacklistKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties::getDefaultattachmenttypeblacklist()
{
	return defaultattachmenttypeblacklist;
}

void
ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties::setDefaultattachmenttypeblacklist(ConfigNodePropertyArray  defaultattachmenttypeblacklist)
{
	this->defaultattachmenttypeblacklist = defaultattachmenttypeblacklist;
}

ConfigNodePropertyArray
ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties::getBaselineattachmenttypeblacklist()
{
	return baselineattachmenttypeblacklist;
}

void
ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties::setBaselineattachmenttypeblacklist(ConfigNodePropertyArray  baselineattachmenttypeblacklist)
{
	this->baselineattachmenttypeblacklist = baselineattachmenttypeblacklist;
}


