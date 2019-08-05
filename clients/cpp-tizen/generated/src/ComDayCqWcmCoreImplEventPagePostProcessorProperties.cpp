#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWcmCoreImplEventPagePostProcessorProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWcmCoreImplEventPagePostProcessorProperties::ComDayCqWcmCoreImplEventPagePostProcessorProperties()
{
	//__init();
}

ComDayCqWcmCoreImplEventPagePostProcessorProperties::~ComDayCqWcmCoreImplEventPagePostProcessorProperties()
{
	//__cleanup();
}

void
ComDayCqWcmCoreImplEventPagePostProcessorProperties::__init()
{
	//paths = new ConfigNodePropertyArray();
}

void
ComDayCqWcmCoreImplEventPagePostProcessorProperties::__cleanup()
{
	//if(paths != NULL) {
	//
	//delete paths;
	//paths = NULL;
	//}
	//
}

void
ComDayCqWcmCoreImplEventPagePostProcessorProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *pathsKey = "paths";
	node = json_object_get_member(pJsonObject, pathsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&paths, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&paths);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWcmCoreImplEventPagePostProcessorProperties::ComDayCqWcmCoreImplEventPagePostProcessorProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWcmCoreImplEventPagePostProcessorProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getPaths();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getPaths());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pathsKey = "paths";
	json_object_set_member(pJsonObject, pathsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComDayCqWcmCoreImplEventPagePostProcessorProperties::getPaths()
{
	return paths;
}

void
ComDayCqWcmCoreImplEventPagePostProcessorProperties::setPaths(ConfigNodePropertyArray  paths)
{
	this->paths = paths;
}


