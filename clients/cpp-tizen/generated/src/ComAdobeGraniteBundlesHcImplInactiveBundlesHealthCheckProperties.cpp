#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties::ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties()
{
	//__init();
}

ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties::~ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties::__init()
{
	//hctags = new ConfigNodePropertyArray();
	//ignoredbundles = new ConfigNodePropertyArray();
}

void
ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties::__cleanup()
{
	//if(hctags != NULL) {
	//
	//delete hctags;
	//hctags = NULL;
	//}
	//if(ignoredbundles != NULL) {
	//
	//delete ignoredbundles;
	//ignoredbundles = NULL;
	//}
	//
}

void
ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties::fromJson(char* jsonStr)
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
	const gchar *ignoredbundlesKey = "ignored.bundles";
	node = json_object_get_member(pJsonObject, ignoredbundlesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&ignoredbundles, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&ignoredbundles);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties::ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties::toJson()
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
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getIgnoredbundles();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getIgnoredbundles());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *ignoredbundlesKey = "ignored.bundles";
	json_object_set_member(pJsonObject, ignoredbundlesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties::getHctags()
{
	return hctags;
}

void
ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties::setHctags(ConfigNodePropertyArray  hctags)
{
	this->hctags = hctags;
}

ConfigNodePropertyArray
ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties::getIgnoredbundles()
{
	return ignoredbundles;
}

void
ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties::setIgnoredbundles(ConfigNodePropertyArray  ignoredbundles)
{
	this->ignoredbundles = ignoredbundles;
}


