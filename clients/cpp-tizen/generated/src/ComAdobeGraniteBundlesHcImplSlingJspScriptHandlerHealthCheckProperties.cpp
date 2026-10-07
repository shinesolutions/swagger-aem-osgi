#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties::ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties()
{
	//__init();
}

ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties::~ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties::__init()
{
	//hctags = new ConfigNodePropertyArray();
}

void
ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties::__cleanup()
{
	//if(hctags != NULL) {
	//
	//delete hctags;
	//hctags = NULL;
	//}
	//
}

void
ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *hctagsKey = "hc.tags";
	node = json_object_get_member(pJsonObject, hctagsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&hctags, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&hctags);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties::ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getHctags();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getHctags());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *hctagsKey = "hc.tags";
	json_object_set_member(pJsonObject, hctagsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties::getHctags()
{
	return hctags;
}

void
ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties::setHctags(ConfigNodePropertyArray  hctags)
{
	this->hctags = hctags;
}


