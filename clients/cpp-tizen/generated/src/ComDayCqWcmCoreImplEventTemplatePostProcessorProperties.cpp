#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWcmCoreImplEventTemplatePostProcessorProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWcmCoreImplEventTemplatePostProcessorProperties::ComDayCqWcmCoreImplEventTemplatePostProcessorProperties()
{
	//__init();
}

ComDayCqWcmCoreImplEventTemplatePostProcessorProperties::~ComDayCqWcmCoreImplEventTemplatePostProcessorProperties()
{
	//__cleanup();
}

void
ComDayCqWcmCoreImplEventTemplatePostProcessorProperties::__init()
{
	//paths = new ConfigNodePropertyString();
}

void
ComDayCqWcmCoreImplEventTemplatePostProcessorProperties::__cleanup()
{
	//if(paths != NULL) {
	//
	//delete paths;
	//paths = NULL;
	//}
	//
}

void
ComDayCqWcmCoreImplEventTemplatePostProcessorProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *pathsKey = "paths";
	node = json_object_get_member(pJsonObject, pathsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&paths, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&paths);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWcmCoreImplEventTemplatePostProcessorProperties::ComDayCqWcmCoreImplEventTemplatePostProcessorProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWcmCoreImplEventTemplatePostProcessorProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getPaths();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getPaths());
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

ConfigNodePropertyString
ComDayCqWcmCoreImplEventTemplatePostProcessorProperties::getPaths()
{
	return paths;
}

void
ComDayCqWcmCoreImplEventTemplatePostProcessorProperties::setPaths(ConfigNodePropertyString  paths)
{
	this->paths = paths;
}


