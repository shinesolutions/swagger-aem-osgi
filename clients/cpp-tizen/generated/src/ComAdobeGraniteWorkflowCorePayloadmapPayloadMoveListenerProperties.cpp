#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties::ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties()
{
	//__init();
}

ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties::~ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties::__init()
{
	//payloadmovewhitelist = new ConfigNodePropertyArray();
	//payloadmovehandlefromworkflowprocess = new ConfigNodePropertyBoolean();
}

void
ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties::__cleanup()
{
	//if(payloadmovewhitelist != NULL) {
	//
	//delete payloadmovewhitelist;
	//payloadmovewhitelist = NULL;
	//}
	//if(payloadmovehandlefromworkflowprocess != NULL) {
	//
	//delete payloadmovehandlefromworkflowprocess;
	//payloadmovehandlefromworkflowprocess = NULL;
	//}
	//
}

void
ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *payloadmovewhitelistKey = "payload.move.white.list";
	node = json_object_get_member(pJsonObject, payloadmovewhitelistKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&payloadmovewhitelist, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&payloadmovewhitelist);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *payloadmovehandlefromworkflowprocessKey = "payload.move.handle.from.workflow.process";
	node = json_object_get_member(pJsonObject, payloadmovehandlefromworkflowprocessKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&payloadmovehandlefromworkflowprocess, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&payloadmovehandlefromworkflowprocess);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties::ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getPayloadmovewhitelist();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getPayloadmovewhitelist());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *payloadmovewhitelistKey = "payload.move.white.list";
	json_object_set_member(pJsonObject, payloadmovewhitelistKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getPayloadmovehandlefromworkflowprocess();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getPayloadmovehandlefromworkflowprocess());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *payloadmovehandlefromworkflowprocessKey = "payload.move.handle.from.workflow.process";
	json_object_set_member(pJsonObject, payloadmovehandlefromworkflowprocessKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties::getPayloadmovewhitelist()
{
	return payloadmovewhitelist;
}

void
ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties::setPayloadmovewhitelist(ConfigNodePropertyArray  payloadmovewhitelist)
{
	this->payloadmovewhitelist = payloadmovewhitelist;
}

ConfigNodePropertyBoolean
ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties::getPayloadmovehandlefromworkflowprocess()
{
	return payloadmovehandlefromworkflowprocess;
}

void
ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties::setPayloadmovehandlefromworkflowprocess(ConfigNodePropertyBoolean  payloadmovehandlefromworkflowprocess)
{
	this->payloadmovehandlefromworkflowprocess = payloadmovehandlefromworkflowprocess;
}


