#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqTaggingImplJcrTagManagerFactoryImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqTaggingImplJcrTagManagerFactoryImplProperties::ComDayCqTaggingImplJcrTagManagerFactoryImplProperties()
{
	//__init();
}

ComDayCqTaggingImplJcrTagManagerFactoryImplProperties::~ComDayCqTaggingImplJcrTagManagerFactoryImplProperties()
{
	//__cleanup();
}

void
ComDayCqTaggingImplJcrTagManagerFactoryImplProperties::__init()
{
	//validationenabled = new ConfigNodePropertyBoolean();
}

void
ComDayCqTaggingImplJcrTagManagerFactoryImplProperties::__cleanup()
{
	//if(validationenabled != NULL) {
	//
	//delete validationenabled;
	//validationenabled = NULL;
	//}
	//
}

void
ComDayCqTaggingImplJcrTagManagerFactoryImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *validationenabledKey = "validation.enabled";
	node = json_object_get_member(pJsonObject, validationenabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&validationenabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&validationenabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqTaggingImplJcrTagManagerFactoryImplProperties::ComDayCqTaggingImplJcrTagManagerFactoryImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqTaggingImplJcrTagManagerFactoryImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getValidationenabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getValidationenabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *validationenabledKey = "validation.enabled";
	json_object_set_member(pJsonObject, validationenabledKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComDayCqTaggingImplJcrTagManagerFactoryImplProperties::getValidationenabled()
{
	return validationenabled;
}

void
ComDayCqTaggingImplJcrTagManagerFactoryImplProperties::setValidationenabled(ConfigNodePropertyBoolean  validationenabled)
{
	this->validationenabled = validationenabled;
}


