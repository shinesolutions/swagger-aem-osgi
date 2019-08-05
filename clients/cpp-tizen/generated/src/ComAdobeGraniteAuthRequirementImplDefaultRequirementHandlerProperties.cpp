#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties::ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties()
{
	//__init();
}

ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties::~ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties::__init()
{
	//supportedPaths = new ConfigNodePropertyArray();
}

void
ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties::__cleanup()
{
	//if(supportedPaths != NULL) {
	//
	//delete supportedPaths;
	//supportedPaths = NULL;
	//}
	//
}

void
ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *supportedPathsKey = "supportedPaths";
	node = json_object_get_member(pJsonObject, supportedPathsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&supportedPaths, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&supportedPaths);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties::ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getSupportedPaths();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getSupportedPaths());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *supportedPathsKey = "supportedPaths";
	json_object_set_member(pJsonObject, supportedPathsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties::getSupportedPaths()
{
	return supportedPaths;
}

void
ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties::setSupportedPaths(ConfigNodePropertyArray  supportedPaths)
{
	this->supportedPaths = supportedPaths;
}


