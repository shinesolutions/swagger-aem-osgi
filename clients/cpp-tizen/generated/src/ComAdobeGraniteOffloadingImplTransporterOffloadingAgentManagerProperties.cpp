#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties::ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties()
{
	//__init();
}

ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties::~ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties::__init()
{
	//offloadingagentmanagerenabled = new ConfigNodePropertyBoolean();
}

void
ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties::__cleanup()
{
	//if(offloadingagentmanagerenabled != NULL) {
	//
	//delete offloadingagentmanagerenabled;
	//offloadingagentmanagerenabled = NULL;
	//}
	//
}

void
ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *offloadingagentmanagerenabledKey = "offloading.agentmanager.enabled";
	node = json_object_get_member(pJsonObject, offloadingagentmanagerenabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&offloadingagentmanagerenabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&offloadingagentmanagerenabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties::ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getOffloadingagentmanagerenabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getOffloadingagentmanagerenabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *offloadingagentmanagerenabledKey = "offloading.agentmanager.enabled";
	json_object_set_member(pJsonObject, offloadingagentmanagerenabledKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties::getOffloadingagentmanagerenabled()
{
	return offloadingagentmanagerenabled;
}

void
ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties::setOffloadingagentmanagerenabled(ConfigNodePropertyBoolean  offloadingagentmanagerenabled)
{
	this->offloadingagentmanagerenabled = offloadingagentmanagerenabled;
}


