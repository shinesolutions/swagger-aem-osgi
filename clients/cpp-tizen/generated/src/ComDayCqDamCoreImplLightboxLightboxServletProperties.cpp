#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamCoreImplLightboxLightboxServletProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamCoreImplLightboxLightboxServletProperties::ComDayCqDamCoreImplLightboxLightboxServletProperties()
{
	//__init();
}

ComDayCqDamCoreImplLightboxLightboxServletProperties::~ComDayCqDamCoreImplLightboxLightboxServletProperties()
{
	//__cleanup();
}

void
ComDayCqDamCoreImplLightboxLightboxServletProperties::__init()
{
	//slingservletpaths = new ConfigNodePropertyString();
	//slingservletmethods = new ConfigNodePropertyArray();
	//cqdamenableanonymous = new ConfigNodePropertyBoolean();
}

void
ComDayCqDamCoreImplLightboxLightboxServletProperties::__cleanup()
{
	//if(slingservletpaths != NULL) {
	//
	//delete slingservletpaths;
	//slingservletpaths = NULL;
	//}
	//if(slingservletmethods != NULL) {
	//
	//delete slingservletmethods;
	//slingservletmethods = NULL;
	//}
	//if(cqdamenableanonymous != NULL) {
	//
	//delete cqdamenableanonymous;
	//cqdamenableanonymous = NULL;
	//}
	//
}

void
ComDayCqDamCoreImplLightboxLightboxServletProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *slingservletpathsKey = "sling.servlet.paths";
	node = json_object_get_member(pJsonObject, slingservletpathsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&slingservletpaths, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&slingservletpaths);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *slingservletmethodsKey = "sling.servlet.methods";
	node = json_object_get_member(pJsonObject, slingservletmethodsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&slingservletmethods, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&slingservletmethods);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqdamenableanonymousKey = "cq.dam.enable.anonymous";
	node = json_object_get_member(pJsonObject, cqdamenableanonymousKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&cqdamenableanonymous, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&cqdamenableanonymous);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamCoreImplLightboxLightboxServletProperties::ComDayCqDamCoreImplLightboxLightboxServletProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamCoreImplLightboxLightboxServletProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSlingservletpaths();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSlingservletpaths());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *slingservletpathsKey = "sling.servlet.paths";
	json_object_set_member(pJsonObject, slingservletpathsKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getSlingservletmethods();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getSlingservletmethods());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *slingservletmethodsKey = "sling.servlet.methods";
	json_object_set_member(pJsonObject, slingservletmethodsKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getCqdamenableanonymous();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getCqdamenableanonymous());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdamenableanonymousKey = "cq.dam.enable.anonymous";
	json_object_set_member(pJsonObject, cqdamenableanonymousKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqDamCoreImplLightboxLightboxServletProperties::getSlingservletpaths()
{
	return slingservletpaths;
}

void
ComDayCqDamCoreImplLightboxLightboxServletProperties::setSlingservletpaths(ConfigNodePropertyString  slingservletpaths)
{
	this->slingservletpaths = slingservletpaths;
}

ConfigNodePropertyArray
ComDayCqDamCoreImplLightboxLightboxServletProperties::getSlingservletmethods()
{
	return slingservletmethods;
}

void
ComDayCqDamCoreImplLightboxLightboxServletProperties::setSlingservletmethods(ConfigNodePropertyArray  slingservletmethods)
{
	this->slingservletmethods = slingservletmethods;
}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplLightboxLightboxServletProperties::getCqdamenableanonymous()
{
	return cqdamenableanonymous;
}

void
ComDayCqDamCoreImplLightboxLightboxServletProperties::setCqdamenableanonymous(ConfigNodePropertyBoolean  cqdamenableanonymous)
{
	this->cqdamenableanonymous = cqdamenableanonymous;
}


