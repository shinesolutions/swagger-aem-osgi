#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamCoreImplServletMetadataGetServletProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamCoreImplServletMetadataGetServletProperties::ComDayCqDamCoreImplServletMetadataGetServletProperties()
{
	//__init();
}

ComDayCqDamCoreImplServletMetadataGetServletProperties::~ComDayCqDamCoreImplServletMetadataGetServletProperties()
{
	//__cleanup();
}

void
ComDayCqDamCoreImplServletMetadataGetServletProperties::__init()
{
	//slingservletresourceTypes = new ConfigNodePropertyString();
	//slingservletmethods = new ConfigNodePropertyString();
	//slingservletextensions = new ConfigNodePropertyString();
	//slingservletselectors = new ConfigNodePropertyString();
}

void
ComDayCqDamCoreImplServletMetadataGetServletProperties::__cleanup()
{
	//if(slingservletresourceTypes != NULL) {
	//
	//delete slingservletresourceTypes;
	//slingservletresourceTypes = NULL;
	//}
	//if(slingservletmethods != NULL) {
	//
	//delete slingservletmethods;
	//slingservletmethods = NULL;
	//}
	//if(slingservletextensions != NULL) {
	//
	//delete slingservletextensions;
	//slingservletextensions = NULL;
	//}
	//if(slingservletselectors != NULL) {
	//
	//delete slingservletselectors;
	//slingservletselectors = NULL;
	//}
	//
}

void
ComDayCqDamCoreImplServletMetadataGetServletProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *slingservletresourceTypesKey = "sling.servlet.resourceTypes";
	node = json_object_get_member(pJsonObject, slingservletresourceTypesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&slingservletresourceTypes, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&slingservletresourceTypes);
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
	const gchar *slingservletextensionsKey = "sling.servlet.extensions";
	node = json_object_get_member(pJsonObject, slingservletextensionsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&slingservletextensions, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&slingservletextensions);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *slingservletselectorsKey = "sling.servlet.selectors";
	node = json_object_get_member(pJsonObject, slingservletselectorsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&slingservletselectors, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&slingservletselectors);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamCoreImplServletMetadataGetServletProperties::ComDayCqDamCoreImplServletMetadataGetServletProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamCoreImplServletMetadataGetServletProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSlingservletresourceTypes();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSlingservletresourceTypes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *slingservletresourceTypesKey = "sling.servlet.resourceTypes";
	json_object_set_member(pJsonObject, slingservletresourceTypesKey, node);
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
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSlingservletextensions();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSlingservletextensions());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *slingservletextensionsKey = "sling.servlet.extensions";
	json_object_set_member(pJsonObject, slingservletextensionsKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSlingservletselectors();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSlingservletselectors());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *slingservletselectorsKey = "sling.servlet.selectors";
	json_object_set_member(pJsonObject, slingservletselectorsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqDamCoreImplServletMetadataGetServletProperties::getSlingservletresourceTypes()
{
	return slingservletresourceTypes;
}

void
ComDayCqDamCoreImplServletMetadataGetServletProperties::setSlingservletresourceTypes(ConfigNodePropertyString  slingservletresourceTypes)
{
	this->slingservletresourceTypes = slingservletresourceTypes;
}

ConfigNodePropertyString
ComDayCqDamCoreImplServletMetadataGetServletProperties::getSlingservletmethods()
{
	return slingservletmethods;
}

void
ComDayCqDamCoreImplServletMetadataGetServletProperties::setSlingservletmethods(ConfigNodePropertyString  slingservletmethods)
{
	this->slingservletmethods = slingservletmethods;
}

ConfigNodePropertyString
ComDayCqDamCoreImplServletMetadataGetServletProperties::getSlingservletextensions()
{
	return slingservletextensions;
}

void
ComDayCqDamCoreImplServletMetadataGetServletProperties::setSlingservletextensions(ConfigNodePropertyString  slingservletextensions)
{
	this->slingservletextensions = slingservletextensions;
}

ConfigNodePropertyString
ComDayCqDamCoreImplServletMetadataGetServletProperties::getSlingservletselectors()
{
	return slingservletselectors;
}

void
ComDayCqDamCoreImplServletMetadataGetServletProperties::setSlingservletselectors(ConfigNodePropertyString  slingservletselectors)
{
	this->slingservletselectors = slingservletselectors;
}


