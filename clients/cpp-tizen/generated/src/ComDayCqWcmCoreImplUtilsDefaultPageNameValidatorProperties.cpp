#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties::ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties()
{
	//__init();
}

ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties::~ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties()
{
	//__cleanup();
}

void
ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties::__init()
{
	//nonValidChars = new ConfigNodePropertyString();
}

void
ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties::__cleanup()
{
	//if(nonValidChars != NULL) {
	//
	//delete nonValidChars;
	//nonValidChars = NULL;
	//}
	//
}

void
ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *nonValidCharsKey = "nonValidChars";
	node = json_object_get_member(pJsonObject, nonValidCharsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&nonValidChars, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&nonValidChars);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties::ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getNonValidChars();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getNonValidChars());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *nonValidCharsKey = "nonValidChars";
	json_object_set_member(pJsonObject, nonValidCharsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties::getNonValidChars()
{
	return nonValidChars;
}

void
ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties::setNonValidChars(ConfigNodePropertyString  nonValidChars)
{
	this->nonValidChars = nonValidChars;
}


