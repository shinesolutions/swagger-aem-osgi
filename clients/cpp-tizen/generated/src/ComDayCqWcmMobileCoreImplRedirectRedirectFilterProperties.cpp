#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties::ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties()
{
	//__init();
}

ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties::~ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties()
{
	//__cleanup();
}

void
ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties::__init()
{
	//redirectenabled = new ConfigNodePropertyBoolean();
	//redirectstatsenabled = new ConfigNodePropertyBoolean();
	//redirectextensions = new ConfigNodePropertyArray();
	//redirectpaths = new ConfigNodePropertyArray();
}

void
ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties::__cleanup()
{
	//if(redirectenabled != NULL) {
	//
	//delete redirectenabled;
	//redirectenabled = NULL;
	//}
	//if(redirectstatsenabled != NULL) {
	//
	//delete redirectstatsenabled;
	//redirectstatsenabled = NULL;
	//}
	//if(redirectextensions != NULL) {
	//
	//delete redirectextensions;
	//redirectextensions = NULL;
	//}
	//if(redirectpaths != NULL) {
	//
	//delete redirectpaths;
	//redirectpaths = NULL;
	//}
	//
}

void
ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *redirectenabledKey = "redirect.enabled";
	node = json_object_get_member(pJsonObject, redirectenabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&redirectenabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&redirectenabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *redirectstatsenabledKey = "redirect.stats.enabled";
	node = json_object_get_member(pJsonObject, redirectstatsenabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&redirectstatsenabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&redirectstatsenabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *redirectextensionsKey = "redirect.extensions";
	node = json_object_get_member(pJsonObject, redirectextensionsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&redirectextensions, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&redirectextensions);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *redirectpathsKey = "redirect.paths";
	node = json_object_get_member(pJsonObject, redirectpathsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&redirectpaths, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&redirectpaths);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties::ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getRedirectenabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getRedirectenabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *redirectenabledKey = "redirect.enabled";
	json_object_set_member(pJsonObject, redirectenabledKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getRedirectstatsenabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getRedirectstatsenabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *redirectstatsenabledKey = "redirect.stats.enabled";
	json_object_set_member(pJsonObject, redirectstatsenabledKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getRedirectextensions();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getRedirectextensions());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *redirectextensionsKey = "redirect.extensions";
	json_object_set_member(pJsonObject, redirectextensionsKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getRedirectpaths();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getRedirectpaths());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *redirectpathsKey = "redirect.paths";
	json_object_set_member(pJsonObject, redirectpathsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties::getRedirectenabled()
{
	return redirectenabled;
}

void
ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties::setRedirectenabled(ConfigNodePropertyBoolean  redirectenabled)
{
	this->redirectenabled = redirectenabled;
}

ConfigNodePropertyBoolean
ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties::getRedirectstatsenabled()
{
	return redirectstatsenabled;
}

void
ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties::setRedirectstatsenabled(ConfigNodePropertyBoolean  redirectstatsenabled)
{
	this->redirectstatsenabled = redirectstatsenabled;
}

ConfigNodePropertyArray
ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties::getRedirectextensions()
{
	return redirectextensions;
}

void
ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties::setRedirectextensions(ConfigNodePropertyArray  redirectextensions)
{
	this->redirectextensions = redirectextensions;
}

ConfigNodePropertyArray
ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties::getRedirectpaths()
{
	return redirectpaths;
}

void
ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties::setRedirectpaths(ConfigNodePropertyArray  redirectpaths)
{
	this->redirectpaths = redirectpaths;
}


