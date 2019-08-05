#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties::ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties()
{
	//__init();
}

ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties::~ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties()
{
	//__cleanup();
}

void
ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties::__init()
{
	//illegalCharMapping = new ConfigNodePropertyString();
	//pageSubTreeActivationCheck = new ConfigNodePropertyBoolean();
}

void
ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties::__cleanup()
{
	//if(illegalCharMapping != NULL) {
	//
	//delete illegalCharMapping;
	//illegalCharMapping = NULL;
	//}
	//if(pageSubTreeActivationCheck != NULL) {
	//
	//delete pageSubTreeActivationCheck;
	//pageSubTreeActivationCheck = NULL;
	//}
	//
}

void
ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *illegalCharMappingKey = "illegalCharMapping";
	node = json_object_get_member(pJsonObject, illegalCharMappingKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&illegalCharMapping, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&illegalCharMapping);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *pageSubTreeActivationCheckKey = "pageSubTreeActivationCheck";
	node = json_object_get_member(pJsonObject, pageSubTreeActivationCheckKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&pageSubTreeActivationCheck, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&pageSubTreeActivationCheck);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties::ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getIllegalCharMapping();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getIllegalCharMapping());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *illegalCharMappingKey = "illegalCharMapping";
	json_object_set_member(pJsonObject, illegalCharMappingKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getPageSubTreeActivationCheck();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getPageSubTreeActivationCheck());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pageSubTreeActivationCheckKey = "pageSubTreeActivationCheck";
	json_object_set_member(pJsonObject, pageSubTreeActivationCheckKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties::getIllegalCharMapping()
{
	return illegalCharMapping;
}

void
ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties::setIllegalCharMapping(ConfigNodePropertyString  illegalCharMapping)
{
	this->illegalCharMapping = illegalCharMapping;
}

ConfigNodePropertyBoolean
ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties::getPageSubTreeActivationCheck()
{
	return pageSubTreeActivationCheck;
}

void
ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties::setPageSubTreeActivationCheck(ConfigNodePropertyBoolean  pageSubTreeActivationCheck)
{
	this->pageSubTreeActivationCheck = pageSubTreeActivationCheck;
}


