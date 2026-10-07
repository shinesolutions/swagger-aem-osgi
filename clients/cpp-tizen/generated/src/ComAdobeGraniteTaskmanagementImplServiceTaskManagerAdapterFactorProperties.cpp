#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties::ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties()
{
	//__init();
}

ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties::~ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties::__init()
{
	//adaptercondition = new ConfigNodePropertyString();
	//taskmanageradmingroups = new ConfigNodePropertyArray();
}

void
ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties::__cleanup()
{
	//if(adaptercondition != NULL) {
	//
	//delete adaptercondition;
	//adaptercondition = NULL;
	//}
	//if(taskmanageradmingroups != NULL) {
	//
	//delete taskmanageradmingroups;
	//taskmanageradmingroups = NULL;
	//}
	//
}

void
ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *adapterconditionKey = "adapter.condition";
	node = json_object_get_member(pJsonObject, adapterconditionKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&adaptercondition, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&adaptercondition);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *taskmanageradmingroupsKey = "taskmanager.admingroups";
	node = json_object_get_member(pJsonObject, taskmanageradmingroupsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&taskmanageradmingroups, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&taskmanageradmingroups);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties::ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getAdaptercondition();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getAdaptercondition());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *adapterconditionKey = "adapter.condition";
	json_object_set_member(pJsonObject, adapterconditionKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getTaskmanageradmingroups();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getTaskmanageradmingroups());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *taskmanageradmingroupsKey = "taskmanager.admingroups";
	json_object_set_member(pJsonObject, taskmanageradmingroupsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties::getAdaptercondition()
{
	return adaptercondition;
}

void
ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties::setAdaptercondition(ConfigNodePropertyString  adaptercondition)
{
	this->adaptercondition = adaptercondition;
}

ConfigNodePropertyArray
ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties::getTaskmanageradmingroups()
{
	return taskmanageradmingroups;
}

void
ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties::setTaskmanageradmingroups(ConfigNodePropertyArray  taskmanageradmingroups)
{
	this->taskmanageradmingroups = taskmanageradmingroups;
}


