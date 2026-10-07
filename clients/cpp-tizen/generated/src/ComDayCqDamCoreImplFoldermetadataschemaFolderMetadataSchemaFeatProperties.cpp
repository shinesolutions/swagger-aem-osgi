#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties::ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties()
{
	//__init();
}

ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties::~ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties()
{
	//__cleanup();
}

void
ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties::__init()
{
	//isEnabled = new ConfigNodePropertyBoolean();
}

void
ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties::__cleanup()
{
	//if(isEnabled != NULL) {
	//
	//delete isEnabled;
	//isEnabled = NULL;
	//}
	//
}

void
ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *isEnabledKey = "isEnabled";
	node = json_object_get_member(pJsonObject, isEnabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&isEnabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&isEnabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties::ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getIsEnabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getIsEnabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *isEnabledKey = "isEnabled";
	json_object_set_member(pJsonObject, isEnabledKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties::getIsEnabled()
{
	return isEnabled;
}

void
ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties::setIsEnabled(ConfigNodePropertyBoolean  isEnabled)
{
	this->isEnabled = isEnabled;
}


