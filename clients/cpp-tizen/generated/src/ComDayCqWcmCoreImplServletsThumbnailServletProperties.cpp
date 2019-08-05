#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWcmCoreImplServletsThumbnailServletProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWcmCoreImplServletsThumbnailServletProperties::ComDayCqWcmCoreImplServletsThumbnailServletProperties()
{
	//__init();
}

ComDayCqWcmCoreImplServletsThumbnailServletProperties::~ComDayCqWcmCoreImplServletsThumbnailServletProperties()
{
	//__cleanup();
}

void
ComDayCqWcmCoreImplServletsThumbnailServletProperties::__init()
{
	//workspace = new ConfigNodePropertyString();
	//dimensions = new ConfigNodePropertyArray();
}

void
ComDayCqWcmCoreImplServletsThumbnailServletProperties::__cleanup()
{
	//if(workspace != NULL) {
	//
	//delete workspace;
	//workspace = NULL;
	//}
	//if(dimensions != NULL) {
	//
	//delete dimensions;
	//dimensions = NULL;
	//}
	//
}

void
ComDayCqWcmCoreImplServletsThumbnailServletProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *workspaceKey = "workspace";
	node = json_object_get_member(pJsonObject, workspaceKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&workspace, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&workspace);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *dimensionsKey = "dimensions";
	node = json_object_get_member(pJsonObject, dimensionsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&dimensions, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&dimensions);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWcmCoreImplServletsThumbnailServletProperties::ComDayCqWcmCoreImplServletsThumbnailServletProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWcmCoreImplServletsThumbnailServletProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getWorkspace();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getWorkspace());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *workspaceKey = "workspace";
	json_object_set_member(pJsonObject, workspaceKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getDimensions();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getDimensions());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *dimensionsKey = "dimensions";
	json_object_set_member(pJsonObject, dimensionsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqWcmCoreImplServletsThumbnailServletProperties::getWorkspace()
{
	return workspace;
}

void
ComDayCqWcmCoreImplServletsThumbnailServletProperties::setWorkspace(ConfigNodePropertyString  workspace)
{
	this->workspace = workspace;
}

ConfigNodePropertyArray
ComDayCqWcmCoreImplServletsThumbnailServletProperties::getDimensions()
{
	return dimensions;
}

void
ComDayCqWcmCoreImplServletsThumbnailServletProperties::setDimensions(ConfigNodePropertyArray  dimensions)
{
	this->dimensions = dimensions;
}


