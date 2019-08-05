#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties::ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties()
{
	//__init();
}

ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties::~ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties()
{
	//__cleanup();
}

void
ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties::__init()
{
	//mimetype = new ConfigNodePropertyArray();
}

void
ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties::__cleanup()
{
	//if(mimetype != NULL) {
	//
	//delete mimetype;
	//mimetype = NULL;
	//}
	//
}

void
ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *mimetypeKey = "mimetype";
	node = json_object_get_member(pJsonObject, mimetypeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&mimetype, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&mimetype);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties::ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getMimetype();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getMimetype());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *mimetypeKey = "mimetype";
	json_object_set_member(pJsonObject, mimetypeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties::getMimetype()
{
	return mimetype;
}

void
ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties::setMimetype(ConfigNodePropertyArray  mimetype)
{
	this->mimetype = mimetype;
}


