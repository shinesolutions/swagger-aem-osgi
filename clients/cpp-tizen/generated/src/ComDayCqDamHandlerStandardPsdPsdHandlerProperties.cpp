#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamHandlerStandardPsdPsdHandlerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamHandlerStandardPsdPsdHandlerProperties::ComDayCqDamHandlerStandardPsdPsdHandlerProperties()
{
	//__init();
}

ComDayCqDamHandlerStandardPsdPsdHandlerProperties::~ComDayCqDamHandlerStandardPsdPsdHandlerProperties()
{
	//__cleanup();
}

void
ComDayCqDamHandlerStandardPsdPsdHandlerProperties::__init()
{
	//large_file_threshold = new ConfigNodePropertyInteger();
}

void
ComDayCqDamHandlerStandardPsdPsdHandlerProperties::__cleanup()
{
	//if(large_file_threshold != NULL) {
	//
	//delete large_file_threshold;
	//large_file_threshold = NULL;
	//}
	//
}

void
ComDayCqDamHandlerStandardPsdPsdHandlerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *large_file_thresholdKey = "large_file_threshold";
	node = json_object_get_member(pJsonObject, large_file_thresholdKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&large_file_threshold, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&large_file_threshold);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamHandlerStandardPsdPsdHandlerProperties::ComDayCqDamHandlerStandardPsdPsdHandlerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamHandlerStandardPsdPsdHandlerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getLargeFileThreshold();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getLargeFileThreshold());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *large_file_thresholdKey = "large_file_threshold";
	json_object_set_member(pJsonObject, large_file_thresholdKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComDayCqDamHandlerStandardPsdPsdHandlerProperties::getLargeFileThreshold()
{
	return large_file_threshold;
}

void
ComDayCqDamHandlerStandardPsdPsdHandlerProperties::setLargeFileThreshold(ConfigNodePropertyInteger  large_file_threshold)
{
	this->large_file_threshold = large_file_threshold;
}


