#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamHandlerFfmpegLocatorImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamHandlerFfmpegLocatorImplProperties::ComDayCqDamHandlerFfmpegLocatorImplProperties()
{
	//__init();
}

ComDayCqDamHandlerFfmpegLocatorImplProperties::~ComDayCqDamHandlerFfmpegLocatorImplProperties()
{
	//__cleanup();
}

void
ComDayCqDamHandlerFfmpegLocatorImplProperties::__init()
{
	//executablesearchpath = new ConfigNodePropertyArray();
}

void
ComDayCqDamHandlerFfmpegLocatorImplProperties::__cleanup()
{
	//if(executablesearchpath != NULL) {
	//
	//delete executablesearchpath;
	//executablesearchpath = NULL;
	//}
	//
}

void
ComDayCqDamHandlerFfmpegLocatorImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *executablesearchpathKey = "executable.searchpath";
	node = json_object_get_member(pJsonObject, executablesearchpathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&executablesearchpath, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&executablesearchpath);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamHandlerFfmpegLocatorImplProperties::ComDayCqDamHandlerFfmpegLocatorImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamHandlerFfmpegLocatorImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getExecutablesearchpath();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getExecutablesearchpath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *executablesearchpathKey = "executable.searchpath";
	json_object_set_member(pJsonObject, executablesearchpathKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComDayCqDamHandlerFfmpegLocatorImplProperties::getExecutablesearchpath()
{
	return executablesearchpath;
}

void
ComDayCqDamHandlerFfmpegLocatorImplProperties::setExecutablesearchpath(ConfigNodePropertyArray  executablesearchpath)
{
	this->executablesearchpath = executablesearchpath;
}


