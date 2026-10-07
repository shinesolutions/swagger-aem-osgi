#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties::ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties()
{
	//__init();
}

ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties::~ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties()
{
	//__cleanup();
}

void
ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties::__init()
{
	//wcmdevmodefilterenabled = new ConfigNodePropertyBoolean();
}

void
ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties::__cleanup()
{
	//if(wcmdevmodefilterenabled != NULL) {
	//
	//delete wcmdevmodefilterenabled;
	//wcmdevmodefilterenabled = NULL;
	//}
	//
}

void
ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *wcmdevmodefilterenabledKey = "wcmdevmodefilter.enabled";
	node = json_object_get_member(pJsonObject, wcmdevmodefilterenabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&wcmdevmodefilterenabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&wcmdevmodefilterenabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties::ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getWcmdevmodefilterenabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getWcmdevmodefilterenabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *wcmdevmodefilterenabledKey = "wcmdevmodefilter.enabled";
	json_object_set_member(pJsonObject, wcmdevmodefilterenabledKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties::getWcmdevmodefilterenabled()
{
	return wcmdevmodefilterenabled;
}

void
ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties::setWcmdevmodefilterenabled(ConfigNodePropertyBoolean  wcmdevmodefilterenabled)
{
	this->wcmdevmodefilterenabled = wcmdevmodefilterenabled;
}


