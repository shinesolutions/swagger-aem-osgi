#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties::ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties()
{
	//__init();
}

ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties::~ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties::__init()
{
	//hctags = new ConfigNodePropertyArray();
	//minimumcodecachesize = new ConfigNodePropertyInteger();
}

void
ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties::__cleanup()
{
	//if(hctags != NULL) {
	//
	//delete hctags;
	//hctags = NULL;
	//}
	//if(minimumcodecachesize != NULL) {
	//
	//delete minimumcodecachesize;
	//minimumcodecachesize = NULL;
	//}
	//
}

void
ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties::fromJson(char* jsonStr)
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
	const gchar *minimumcodecachesizeKey = "minimum.code.cache.size";
	node = json_object_get_member(pJsonObject, minimumcodecachesizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&minimumcodecachesize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&minimumcodecachesize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties::ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties::toJson()
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
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getMinimumcodecachesize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getMinimumcodecachesize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *minimumcodecachesizeKey = "minimum.code.cache.size";
	json_object_set_member(pJsonObject, minimumcodecachesizeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties::getHctags()
{
	return hctags;
}

void
ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties::setHctags(ConfigNodePropertyArray  hctags)
{
	this->hctags = hctags;
}

ConfigNodePropertyInteger
ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties::getMinimumcodecachesize()
{
	return minimumcodecachesize;
}

void
ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties::setMinimumcodecachesize(ConfigNodePropertyInteger  minimumcodecachesize)
{
	this->minimumcodecachesize = minimumcodecachesize;
}


