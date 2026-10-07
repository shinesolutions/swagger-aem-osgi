#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties::ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties()
{
	//__init();
}

ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties::~ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties::__init()
{
	//graniteworkflowWorkflowPublishEventServiceenabled = new ConfigNodePropertyBoolean();
}

void
ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties::__cleanup()
{
	//if(graniteworkflowWorkflowPublishEventServiceenabled != NULL) {
	//
	//delete graniteworkflowWorkflowPublishEventServiceenabled;
	//graniteworkflowWorkflowPublishEventServiceenabled = NULL;
	//}
	//
}

void
ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *graniteworkflowWorkflowPublishEventServiceenabledKey = "granite.workflow.WorkflowPublishEventService.enabled";
	node = json_object_get_member(pJsonObject, graniteworkflowWorkflowPublishEventServiceenabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&graniteworkflowWorkflowPublishEventServiceenabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&graniteworkflowWorkflowPublishEventServiceenabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties::ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getGraniteworkflowWorkflowPublishEventServiceenabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getGraniteworkflowWorkflowPublishEventServiceenabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *graniteworkflowWorkflowPublishEventServiceenabledKey = "granite.workflow.WorkflowPublishEventService.enabled";
	json_object_set_member(pJsonObject, graniteworkflowWorkflowPublishEventServiceenabledKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties::getGraniteworkflowWorkflowPublishEventServiceenabled()
{
	return graniteworkflowWorkflowPublishEventServiceenabled;
}

void
ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties::setGraniteworkflowWorkflowPublishEventServiceenabled(ConfigNodePropertyBoolean  graniteworkflowWorkflowPublishEventServiceenabled)
{
	this->graniteworkflowWorkflowPublishEventServiceenabled = graniteworkflowWorkflowPublishEventServiceenabled;
}


