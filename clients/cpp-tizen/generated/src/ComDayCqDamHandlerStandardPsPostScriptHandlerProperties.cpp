#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamHandlerStandardPsPostScriptHandlerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamHandlerStandardPsPostScriptHandlerProperties::ComDayCqDamHandlerStandardPsPostScriptHandlerProperties()
{
	//__init();
}

ComDayCqDamHandlerStandardPsPostScriptHandlerProperties::~ComDayCqDamHandlerStandardPsPostScriptHandlerProperties()
{
	//__cleanup();
}

void
ComDayCqDamHandlerStandardPsPostScriptHandlerProperties::__init()
{
	//rasterannotation = new ConfigNodePropertyBoolean();
}

void
ComDayCqDamHandlerStandardPsPostScriptHandlerProperties::__cleanup()
{
	//if(rasterannotation != NULL) {
	//
	//delete rasterannotation;
	//rasterannotation = NULL;
	//}
	//
}

void
ComDayCqDamHandlerStandardPsPostScriptHandlerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *rasterannotationKey = "raster.annotation";
	node = json_object_get_member(pJsonObject, rasterannotationKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&rasterannotation, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&rasterannotation);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamHandlerStandardPsPostScriptHandlerProperties::ComDayCqDamHandlerStandardPsPostScriptHandlerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamHandlerStandardPsPostScriptHandlerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getRasterannotation();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getRasterannotation());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *rasterannotationKey = "raster.annotation";
	json_object_set_member(pJsonObject, rasterannotationKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComDayCqDamHandlerStandardPsPostScriptHandlerProperties::getRasterannotation()
{
	return rasterannotation;
}

void
ComDayCqDamHandlerStandardPsPostScriptHandlerProperties::setRasterannotation(ConfigNodePropertyBoolean  rasterannotation)
{
	this->rasterannotation = rasterannotation;
}


