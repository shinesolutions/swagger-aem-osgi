#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamCoreImplServletCreateAssetServletProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamCoreImplServletCreateAssetServletProperties::ComDayCqDamCoreImplServletCreateAssetServletProperties()
{
	//__init();
}

ComDayCqDamCoreImplServletCreateAssetServletProperties::~ComDayCqDamCoreImplServletCreateAssetServletProperties()
{
	//__cleanup();
}

void
ComDayCqDamCoreImplServletCreateAssetServletProperties::__init()
{
	//detect_duplicate = new ConfigNodePropertyBoolean();
}

void
ComDayCqDamCoreImplServletCreateAssetServletProperties::__cleanup()
{
	//if(detect_duplicate != NULL) {
	//
	//delete detect_duplicate;
	//detect_duplicate = NULL;
	//}
	//
}

void
ComDayCqDamCoreImplServletCreateAssetServletProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *detect_duplicateKey = "detect_duplicate";
	node = json_object_get_member(pJsonObject, detect_duplicateKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&detect_duplicate, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&detect_duplicate);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamCoreImplServletCreateAssetServletProperties::ComDayCqDamCoreImplServletCreateAssetServletProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamCoreImplServletCreateAssetServletProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getDetectDuplicate();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getDetectDuplicate());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *detect_duplicateKey = "detect_duplicate";
	json_object_set_member(pJsonObject, detect_duplicateKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplServletCreateAssetServletProperties::getDetectDuplicate()
{
	return detect_duplicate;
}

void
ComDayCqDamCoreImplServletCreateAssetServletProperties::setDetectDuplicate(ConfigNodePropertyBoolean  detect_duplicate)
{
	this->detect_duplicate = detect_duplicate;
}


