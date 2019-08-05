#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWcmCoreImplCommandsWCMCommandServletProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWcmCoreImplCommandsWCMCommandServletProperties::ComDayCqWcmCoreImplCommandsWCMCommandServletProperties()
{
	//__init();
}

ComDayCqWcmCoreImplCommandsWCMCommandServletProperties::~ComDayCqWcmCoreImplCommandsWCMCommandServletProperties()
{
	//__cleanup();
}

void
ComDayCqWcmCoreImplCommandsWCMCommandServletProperties::__init()
{
	//wcmcommandservletdelete_whitelist = new ConfigNodePropertyArray();
}

void
ComDayCqWcmCoreImplCommandsWCMCommandServletProperties::__cleanup()
{
	//if(wcmcommandservletdelete_whitelist != NULL) {
	//
	//delete wcmcommandservletdelete_whitelist;
	//wcmcommandservletdelete_whitelist = NULL;
	//}
	//
}

void
ComDayCqWcmCoreImplCommandsWCMCommandServletProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *wcmcommandservletdelete_whitelistKey = "wcmcommandservlet.delete_whitelist";
	node = json_object_get_member(pJsonObject, wcmcommandservletdelete_whitelistKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&wcmcommandservletdelete_whitelist, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&wcmcommandservletdelete_whitelist);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWcmCoreImplCommandsWCMCommandServletProperties::ComDayCqWcmCoreImplCommandsWCMCommandServletProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWcmCoreImplCommandsWCMCommandServletProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getWcmcommandservletdeleteWhitelist();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getWcmcommandservletdeleteWhitelist());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *wcmcommandservletdelete_whitelistKey = "wcmcommandservlet.delete_whitelist";
	json_object_set_member(pJsonObject, wcmcommandservletdelete_whitelistKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComDayCqWcmCoreImplCommandsWCMCommandServletProperties::getWcmcommandservletdeleteWhitelist()
{
	return wcmcommandservletdelete_whitelist;
}

void
ComDayCqWcmCoreImplCommandsWCMCommandServletProperties::setWcmcommandservletdeleteWhitelist(ConfigNodePropertyArray  wcmcommandservletdelete_whitelist)
{
	this->wcmcommandservletdelete_whitelist = wcmcommandservletdelete_whitelist;
}


