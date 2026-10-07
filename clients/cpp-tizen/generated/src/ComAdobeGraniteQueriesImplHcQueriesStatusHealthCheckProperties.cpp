#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties::ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties()
{
	//__init();
}

ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties::~ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties::__init()
{
	//hctags = new ConfigNodePropertyArray();
}

void
ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties::__cleanup()
{
	//if(hctags != NULL) {
	//
	//delete hctags;
	//hctags = NULL;
	//}
	//
}

void
ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties::fromJson(char* jsonStr)
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

ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties::ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties::toJson()
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
ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties::getHctags()
{
	return hctags;
}

void
ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties::setHctags(ConfigNodePropertyArray  hctags)
{
	this->hctags = hctags;
}


