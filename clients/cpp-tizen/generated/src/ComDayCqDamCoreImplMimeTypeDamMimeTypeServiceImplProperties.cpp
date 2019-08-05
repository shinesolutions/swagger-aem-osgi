#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties::ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties()
{
	//__init();
}

ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties::~ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties()
{
	//__cleanup();
}

void
ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties::__init()
{
	//cqdamdetectassetmimefromcontent = new ConfigNodePropertyBoolean();
}

void
ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties::__cleanup()
{
	//if(cqdamdetectassetmimefromcontent != NULL) {
	//
	//delete cqdamdetectassetmimefromcontent;
	//cqdamdetectassetmimefromcontent = NULL;
	//}
	//
}

void
ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cqdamdetectassetmimefromcontentKey = "cq.dam.detect.asset.mime.from.content";
	node = json_object_get_member(pJsonObject, cqdamdetectassetmimefromcontentKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&cqdamdetectassetmimefromcontent, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&cqdamdetectassetmimefromcontent);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties::ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getCqdamdetectassetmimefromcontent();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getCqdamdetectassetmimefromcontent());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdamdetectassetmimefromcontentKey = "cq.dam.detect.asset.mime.from.content";
	json_object_set_member(pJsonObject, cqdamdetectassetmimefromcontentKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties::getCqdamdetectassetmimefromcontent()
{
	return cqdamdetectassetmimefromcontent;
}

void
ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties::setCqdamdetectassetmimefromcontent(ConfigNodePropertyBoolean  cqdamdetectassetmimefromcontent)
{
	this->cqdamdetectassetmimefromcontent = cqdamdetectassetmimefromcontent;
}


