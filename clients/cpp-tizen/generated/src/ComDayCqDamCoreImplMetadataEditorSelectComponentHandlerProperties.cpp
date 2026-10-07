#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties::ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties()
{
	//__init();
}

ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties::~ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties()
{
	//__cleanup();
}

void
ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties::__init()
{
	//granitedata = new ConfigNodePropertyArray();
}

void
ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties::__cleanup()
{
	//if(granitedata != NULL) {
	//
	//delete granitedata;
	//granitedata = NULL;
	//}
	//
}

void
ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *granitedataKey = "granite:data";
	node = json_object_get_member(pJsonObject, granitedataKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&granitedata, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&granitedata);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties::ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getGranitedata();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getGranitedata());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *granitedataKey = "granite:data";
	json_object_set_member(pJsonObject, granitedataKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties::getGranitedata()
{
	return granitedata;
}

void
ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties::setGranitedata(ConfigNodePropertyArray  granitedata)
{
	this->granitedata = granitedata;
}


