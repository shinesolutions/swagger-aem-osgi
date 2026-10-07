#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeAemTransactionCoreImplTransactionRecorderProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeAemTransactionCoreImplTransactionRecorderProperties::ComAdobeAemTransactionCoreImplTransactionRecorderProperties()
{
	//__init();
}

ComAdobeAemTransactionCoreImplTransactionRecorderProperties::~ComAdobeAemTransactionCoreImplTransactionRecorderProperties()
{
	//__cleanup();
}

void
ComAdobeAemTransactionCoreImplTransactionRecorderProperties::__init()
{
	//isTransactionRecordingEnabled = new ConfigNodePropertyBoolean();
}

void
ComAdobeAemTransactionCoreImplTransactionRecorderProperties::__cleanup()
{
	//if(isTransactionRecordingEnabled != NULL) {
	//
	//delete isTransactionRecordingEnabled;
	//isTransactionRecordingEnabled = NULL;
	//}
	//
}

void
ComAdobeAemTransactionCoreImplTransactionRecorderProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *isTransactionRecordingEnabledKey = "isTransactionRecordingEnabled";
	node = json_object_get_member(pJsonObject, isTransactionRecordingEnabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&isTransactionRecordingEnabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&isTransactionRecordingEnabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeAemTransactionCoreImplTransactionRecorderProperties::ComAdobeAemTransactionCoreImplTransactionRecorderProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeAemTransactionCoreImplTransactionRecorderProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getIsTransactionRecordingEnabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getIsTransactionRecordingEnabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *isTransactionRecordingEnabledKey = "isTransactionRecordingEnabled";
	json_object_set_member(pJsonObject, isTransactionRecordingEnabledKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComAdobeAemTransactionCoreImplTransactionRecorderProperties::getIsTransactionRecordingEnabled()
{
	return isTransactionRecordingEnabled;
}

void
ComAdobeAemTransactionCoreImplTransactionRecorderProperties::setIsTransactionRecordingEnabled(ConfigNodePropertyBoolean  isTransactionRecordingEnabled)
{
	this->isTransactionRecordingEnabled = isTransactionRecordingEnabled;
}


