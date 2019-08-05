#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties::ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties()
{
	//__init();
}

ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties::~ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties::__init()
{
	//hctags = new ConfigNodePropertyArray();
}

void
ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties::__cleanup()
{
	//if(hctags != NULL) {
	//
	//delete hctags;
	//hctags = NULL;
	//}
	//
}

void
ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties::fromJson(char* jsonStr)
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

ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties::ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties::toJson()
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
ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties::getHctags()
{
	return hctags;
}

void
ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties::setHctags(ConfigNodePropertyArray  hctags)
{
	this->hctags = hctags;
}


