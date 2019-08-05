#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties::ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties()
{
	//__init();
}

ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties::~ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties::__init()
{
	//adaptercondition = new ConfigNodePropertyString();
}

void
ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties::__cleanup()
{
	//if(adaptercondition != NULL) {
	//
	//delete adaptercondition;
	//adaptercondition = NULL;
	//}
	//
}

void
ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties::fromJson(char* jsonStr)
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
}

ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties::ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties::toJson()
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties::getAdaptercondition()
{
	return adaptercondition;
}

void
ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties::setAdaptercondition(ConfigNodePropertyString  adaptercondition)
{
	this->adaptercondition = adaptercondition;
}


