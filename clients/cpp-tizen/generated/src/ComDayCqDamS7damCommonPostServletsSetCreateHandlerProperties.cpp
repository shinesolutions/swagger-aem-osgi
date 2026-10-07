#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties::ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties()
{
	//__init();
}

ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties::~ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties()
{
	//__cleanup();
}

void
ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties::__init()
{
	//slingpostoperation = new ConfigNodePropertyString();
	//slingservletmethods = new ConfigNodePropertyString();
}

void
ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties::__cleanup()
{
	//if(slingpostoperation != NULL) {
	//
	//delete slingpostoperation;
	//slingpostoperation = NULL;
	//}
	//if(slingservletmethods != NULL) {
	//
	//delete slingservletmethods;
	//slingservletmethods = NULL;
	//}
	//
}

void
ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *slingpostoperationKey = "sling.post.operation";
	node = json_object_get_member(pJsonObject, slingpostoperationKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&slingpostoperation, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&slingpostoperation);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *slingservletmethodsKey = "sling.servlet.methods";
	node = json_object_get_member(pJsonObject, slingservletmethodsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&slingservletmethods, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&slingservletmethods);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties::ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSlingpostoperation();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSlingpostoperation());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *slingpostoperationKey = "sling.post.operation";
	json_object_set_member(pJsonObject, slingpostoperationKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSlingservletmethods();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSlingservletmethods());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *slingservletmethodsKey = "sling.servlet.methods";
	json_object_set_member(pJsonObject, slingservletmethodsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties::getSlingpostoperation()
{
	return slingpostoperation;
}

void
ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties::setSlingpostoperation(ConfigNodePropertyString  slingpostoperation)
{
	this->slingpostoperation = slingpostoperation;
}

ConfigNodePropertyString
ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties::getSlingservletmethods()
{
	return slingservletmethods;
}

void
ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties::setSlingservletmethods(ConfigNodePropertyString  slingservletmethods)
{
	this->slingservletmethods = slingservletmethods;
}


