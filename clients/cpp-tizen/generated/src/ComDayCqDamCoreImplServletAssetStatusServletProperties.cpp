#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamCoreImplServletAssetStatusServletProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamCoreImplServletAssetStatusServletProperties::ComDayCqDamCoreImplServletAssetStatusServletProperties()
{
	//__init();
}

ComDayCqDamCoreImplServletAssetStatusServletProperties::~ComDayCqDamCoreImplServletAssetStatusServletProperties()
{
	//__cleanup();
}

void
ComDayCqDamCoreImplServletAssetStatusServletProperties::__init()
{
	//cqdambatchstatusmaxassets = new ConfigNodePropertyInteger();
}

void
ComDayCqDamCoreImplServletAssetStatusServletProperties::__cleanup()
{
	//if(cqdambatchstatusmaxassets != NULL) {
	//
	//delete cqdambatchstatusmaxassets;
	//cqdambatchstatusmaxassets = NULL;
	//}
	//
}

void
ComDayCqDamCoreImplServletAssetStatusServletProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cqdambatchstatusmaxassetsKey = "cq.dam.batch.status.maxassets";
	node = json_object_get_member(pJsonObject, cqdambatchstatusmaxassetsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cqdambatchstatusmaxassets, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cqdambatchstatusmaxassets);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamCoreImplServletAssetStatusServletProperties::ComDayCqDamCoreImplServletAssetStatusServletProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamCoreImplServletAssetStatusServletProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCqdambatchstatusmaxassets();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCqdambatchstatusmaxassets());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdambatchstatusmaxassetsKey = "cq.dam.batch.status.maxassets";
	json_object_set_member(pJsonObject, cqdambatchstatusmaxassetsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplServletAssetStatusServletProperties::getCqdambatchstatusmaxassets()
{
	return cqdambatchstatusmaxassets;
}

void
ComDayCqDamCoreImplServletAssetStatusServletProperties::setCqdambatchstatusmaxassets(ConfigNodePropertyInteger  cqdambatchstatusmaxassets)
{
	this->cqdambatchstatusmaxassets = cqdambatchstatusmaxassets;
}


