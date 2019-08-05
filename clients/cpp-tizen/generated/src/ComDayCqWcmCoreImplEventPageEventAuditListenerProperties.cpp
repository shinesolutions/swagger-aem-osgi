#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWcmCoreImplEventPageEventAuditListenerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWcmCoreImplEventPageEventAuditListenerProperties::ComDayCqWcmCoreImplEventPageEventAuditListenerProperties()
{
	//__init();
}

ComDayCqWcmCoreImplEventPageEventAuditListenerProperties::~ComDayCqWcmCoreImplEventPageEventAuditListenerProperties()
{
	//__cleanup();
}

void
ComDayCqWcmCoreImplEventPageEventAuditListenerProperties::__init()
{
	//configured = new ConfigNodePropertyString();
}

void
ComDayCqWcmCoreImplEventPageEventAuditListenerProperties::__cleanup()
{
	//if(configured != NULL) {
	//
	//delete configured;
	//configured = NULL;
	//}
	//
}

void
ComDayCqWcmCoreImplEventPageEventAuditListenerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *configuredKey = "configured";
	node = json_object_get_member(pJsonObject, configuredKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&configured, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&configured);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWcmCoreImplEventPageEventAuditListenerProperties::ComDayCqWcmCoreImplEventPageEventAuditListenerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWcmCoreImplEventPageEventAuditListenerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getConfigured();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getConfigured());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *configuredKey = "configured";
	json_object_set_member(pJsonObject, configuredKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqWcmCoreImplEventPageEventAuditListenerProperties::getConfigured()
{
	return configured;
}

void
ComDayCqWcmCoreImplEventPageEventAuditListenerProperties::setConfigured(ConfigNodePropertyString  configured)
{
	this->configured = configured;
}


