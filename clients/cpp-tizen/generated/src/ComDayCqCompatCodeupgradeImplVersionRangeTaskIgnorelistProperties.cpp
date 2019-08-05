#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties::ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties()
{
	//__init();
}

ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties::~ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties()
{
	//__cleanup();
}

void
ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties::__init()
{
	//effectiveBundleListPath = new ConfigNodePropertyString();
}

void
ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties::__cleanup()
{
	//if(effectiveBundleListPath != NULL) {
	//
	//delete effectiveBundleListPath;
	//effectiveBundleListPath = NULL;
	//}
	//
}

void
ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *effectiveBundleListPathKey = "effectiveBundleListPath";
	node = json_object_get_member(pJsonObject, effectiveBundleListPathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&effectiveBundleListPath, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&effectiveBundleListPath);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties::ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getEffectiveBundleListPath();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getEffectiveBundleListPath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *effectiveBundleListPathKey = "effectiveBundleListPath";
	json_object_set_member(pJsonObject, effectiveBundleListPathKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties::getEffectiveBundleListPath()
{
	return effectiveBundleListPath;
}

void
ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties::setEffectiveBundleListPath(ConfigNodePropertyString  effectiveBundleListPath)
{
	this->effectiveBundleListPath = effectiveBundleListPath;
}


