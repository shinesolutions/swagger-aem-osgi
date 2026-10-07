#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamCoreImplServletAssetXMPSearchServletProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamCoreImplServletAssetXMPSearchServletProperties::ComDayCqDamCoreImplServletAssetXMPSearchServletProperties()
{
	//__init();
}

ComDayCqDamCoreImplServletAssetXMPSearchServletProperties::~ComDayCqDamCoreImplServletAssetXMPSearchServletProperties()
{
	//__cleanup();
}

void
ComDayCqDamCoreImplServletAssetXMPSearchServletProperties::__init()
{
	//cqdambatchindesignmaxassets = new ConfigNodePropertyInteger();
}

void
ComDayCqDamCoreImplServletAssetXMPSearchServletProperties::__cleanup()
{
	//if(cqdambatchindesignmaxassets != NULL) {
	//
	//delete cqdambatchindesignmaxassets;
	//cqdambatchindesignmaxassets = NULL;
	//}
	//
}

void
ComDayCqDamCoreImplServletAssetXMPSearchServletProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cqdambatchindesignmaxassetsKey = "cq.dam.batch.indesign.maxassets";
	node = json_object_get_member(pJsonObject, cqdambatchindesignmaxassetsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cqdambatchindesignmaxassets, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cqdambatchindesignmaxassets);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamCoreImplServletAssetXMPSearchServletProperties::ComDayCqDamCoreImplServletAssetXMPSearchServletProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamCoreImplServletAssetXMPSearchServletProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCqdambatchindesignmaxassets();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCqdambatchindesignmaxassets());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdambatchindesignmaxassetsKey = "cq.dam.batch.indesign.maxassets";
	json_object_set_member(pJsonObject, cqdambatchindesignmaxassetsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplServletAssetXMPSearchServletProperties::getCqdambatchindesignmaxassets()
{
	return cqdambatchindesignmaxassets;
}

void
ComDayCqDamCoreImplServletAssetXMPSearchServletProperties::setCqdambatchindesignmaxassets(ConfigNodePropertyInteger  cqdambatchindesignmaxassets)
{
	this->cqdambatchindesignmaxassets = cqdambatchindesignmaxassets;
}


