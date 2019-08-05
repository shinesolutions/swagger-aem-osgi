#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWcmFoundationFormsImplMailServletProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWcmFoundationFormsImplMailServletProperties::ComDayCqWcmFoundationFormsImplMailServletProperties()
{
	//__init();
}

ComDayCqWcmFoundationFormsImplMailServletProperties::~ComDayCqWcmFoundationFormsImplMailServletProperties()
{
	//__cleanup();
}

void
ComDayCqWcmFoundationFormsImplMailServletProperties::__init()
{
	//slingservletresourceTypes = new ConfigNodePropertyString();
	//slingservletselectors = new ConfigNodePropertyString();
	//resourcewhitelist = new ConfigNodePropertyArray();
	//resourceblacklist = new ConfigNodePropertyString();
}

void
ComDayCqWcmFoundationFormsImplMailServletProperties::__cleanup()
{
	//if(slingservletresourceTypes != NULL) {
	//
	//delete slingservletresourceTypes;
	//slingservletresourceTypes = NULL;
	//}
	//if(slingservletselectors != NULL) {
	//
	//delete slingservletselectors;
	//slingservletselectors = NULL;
	//}
	//if(resourcewhitelist != NULL) {
	//
	//delete resourcewhitelist;
	//resourcewhitelist = NULL;
	//}
	//if(resourceblacklist != NULL) {
	//
	//delete resourceblacklist;
	//resourceblacklist = NULL;
	//}
	//
}

void
ComDayCqWcmFoundationFormsImplMailServletProperties::fromJson(char* jsonStr)
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
	const gchar *resourcewhitelistKey = "resource.whitelist";
	node = json_object_get_member(pJsonObject, resourcewhitelistKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&resourcewhitelist, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&resourcewhitelist);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *resourceblacklistKey = "resource.blacklist";
	node = json_object_get_member(pJsonObject, resourceblacklistKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&resourceblacklist, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&resourceblacklist);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWcmFoundationFormsImplMailServletProperties::ComDayCqWcmFoundationFormsImplMailServletProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWcmFoundationFormsImplMailServletProperties::toJson()
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
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getResourcewhitelist();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getResourcewhitelist());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *resourcewhitelistKey = "resource.whitelist";
	json_object_set_member(pJsonObject, resourcewhitelistKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getResourceblacklist();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getResourceblacklist());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *resourceblacklistKey = "resource.blacklist";
	json_object_set_member(pJsonObject, resourceblacklistKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqWcmFoundationFormsImplMailServletProperties::getSlingservletresourceTypes()
{
	return slingservletresourceTypes;
}

void
ComDayCqWcmFoundationFormsImplMailServletProperties::setSlingservletresourceTypes(ConfigNodePropertyString  slingservletresourceTypes)
{
	this->slingservletresourceTypes = slingservletresourceTypes;
}

ConfigNodePropertyString
ComDayCqWcmFoundationFormsImplMailServletProperties::getSlingservletselectors()
{
	return slingservletselectors;
}

void
ComDayCqWcmFoundationFormsImplMailServletProperties::setSlingservletselectors(ConfigNodePropertyString  slingservletselectors)
{
	this->slingservletselectors = slingservletselectors;
}

ConfigNodePropertyArray
ComDayCqWcmFoundationFormsImplMailServletProperties::getResourcewhitelist()
{
	return resourcewhitelist;
}

void
ComDayCqWcmFoundationFormsImplMailServletProperties::setResourcewhitelist(ConfigNodePropertyArray  resourcewhitelist)
{
	this->resourcewhitelist = resourcewhitelist;
}

ConfigNodePropertyString
ComDayCqWcmFoundationFormsImplMailServletProperties::getResourceblacklist()
{
	return resourceblacklist;
}

void
ComDayCqWcmFoundationFormsImplMailServletProperties::setResourceblacklist(ConfigNodePropertyString  resourceblacklist)
{
	this->resourceblacklist = resourceblacklist;
}


