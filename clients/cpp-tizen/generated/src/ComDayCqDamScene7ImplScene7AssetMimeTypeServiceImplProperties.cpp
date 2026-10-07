#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties::ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties()
{
	//__init();
}

ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties::~ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties()
{
	//__cleanup();
}

void
ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties::__init()
{
	//cqdamscene7assetmimetypeservicemapping = new ConfigNodePropertyArray();
}

void
ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties::__cleanup()
{
	//if(cqdamscene7assetmimetypeservicemapping != NULL) {
	//
	//delete cqdamscene7assetmimetypeservicemapping;
	//cqdamscene7assetmimetypeservicemapping = NULL;
	//}
	//
}

void
ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cqdamscene7assetmimetypeservicemappingKey = "cq.dam.scene7.assetmimetypeservice.mapping";
	node = json_object_get_member(pJsonObject, cqdamscene7assetmimetypeservicemappingKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&cqdamscene7assetmimetypeservicemapping, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&cqdamscene7assetmimetypeservicemapping);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties::ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getCqdamscene7assetmimetypeservicemapping();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getCqdamscene7assetmimetypeservicemapping());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdamscene7assetmimetypeservicemappingKey = "cq.dam.scene7.assetmimetypeservice.mapping";
	json_object_set_member(pJsonObject, cqdamscene7assetmimetypeservicemappingKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties::getCqdamscene7assetmimetypeservicemapping()
{
	return cqdamscene7assetmimetypeservicemapping;
}

void
ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties::setCqdamscene7assetmimetypeservicemapping(ConfigNodePropertyArray  cqdamscene7assetmimetypeservicemapping)
{
	this->cqdamscene7assetmimetypeservicemapping = cqdamscene7assetmimetypeservicemapping;
}


