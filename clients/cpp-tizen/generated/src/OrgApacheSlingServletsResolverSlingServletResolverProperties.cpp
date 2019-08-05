#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingServletsResolverSlingServletResolverProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingServletsResolverSlingServletResolverProperties::OrgApacheSlingServletsResolverSlingServletResolverProperties()
{
	//__init();
}

OrgApacheSlingServletsResolverSlingServletResolverProperties::~OrgApacheSlingServletsResolverSlingServletResolverProperties()
{
	//__cleanup();
}

void
OrgApacheSlingServletsResolverSlingServletResolverProperties::__init()
{
	//servletresolverservletRoot = new ConfigNodePropertyString();
	//servletresolvercacheSize = new ConfigNodePropertyInteger();
	//servletresolverpaths = new ConfigNodePropertyArray();
	//servletresolverdefaultExtensions = new ConfigNodePropertyArray();
}

void
OrgApacheSlingServletsResolverSlingServletResolverProperties::__cleanup()
{
	//if(servletresolverservletRoot != NULL) {
	//
	//delete servletresolverservletRoot;
	//servletresolverservletRoot = NULL;
	//}
	//if(servletresolvercacheSize != NULL) {
	//
	//delete servletresolvercacheSize;
	//servletresolvercacheSize = NULL;
	//}
	//if(servletresolverpaths != NULL) {
	//
	//delete servletresolverpaths;
	//servletresolverpaths = NULL;
	//}
	//if(servletresolverdefaultExtensions != NULL) {
	//
	//delete servletresolverdefaultExtensions;
	//servletresolverdefaultExtensions = NULL;
	//}
	//
}

void
OrgApacheSlingServletsResolverSlingServletResolverProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *servletresolverservletRootKey = "servletresolver.servletRoot";
	node = json_object_get_member(pJsonObject, servletresolverservletRootKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&servletresolverservletRoot, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&servletresolverservletRoot);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *servletresolvercacheSizeKey = "servletresolver.cacheSize";
	node = json_object_get_member(pJsonObject, servletresolvercacheSizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&servletresolvercacheSize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&servletresolvercacheSize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *servletresolverpathsKey = "servletresolver.paths";
	node = json_object_get_member(pJsonObject, servletresolverpathsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&servletresolverpaths, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&servletresolverpaths);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *servletresolverdefaultExtensionsKey = "servletresolver.defaultExtensions";
	node = json_object_get_member(pJsonObject, servletresolverdefaultExtensionsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&servletresolverdefaultExtensions, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&servletresolverdefaultExtensions);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingServletsResolverSlingServletResolverProperties::OrgApacheSlingServletsResolverSlingServletResolverProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingServletsResolverSlingServletResolverProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getServletresolverservletRoot();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getServletresolverservletRoot());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *servletresolverservletRootKey = "servletresolver.servletRoot";
	json_object_set_member(pJsonObject, servletresolverservletRootKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getServletresolvercacheSize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getServletresolvercacheSize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *servletresolvercacheSizeKey = "servletresolver.cacheSize";
	json_object_set_member(pJsonObject, servletresolvercacheSizeKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getServletresolverpaths();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getServletresolverpaths());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *servletresolverpathsKey = "servletresolver.paths";
	json_object_set_member(pJsonObject, servletresolverpathsKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getServletresolverdefaultExtensions();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getServletresolverdefaultExtensions());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *servletresolverdefaultExtensionsKey = "servletresolver.defaultExtensions";
	json_object_set_member(pJsonObject, servletresolverdefaultExtensionsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
OrgApacheSlingServletsResolverSlingServletResolverProperties::getServletresolverservletRoot()
{
	return servletresolverservletRoot;
}

void
OrgApacheSlingServletsResolverSlingServletResolverProperties::setServletresolverservletRoot(ConfigNodePropertyString  servletresolverservletRoot)
{
	this->servletresolverservletRoot = servletresolverservletRoot;
}

ConfigNodePropertyInteger
OrgApacheSlingServletsResolverSlingServletResolverProperties::getServletresolvercacheSize()
{
	return servletresolvercacheSize;
}

void
OrgApacheSlingServletsResolverSlingServletResolverProperties::setServletresolvercacheSize(ConfigNodePropertyInteger  servletresolvercacheSize)
{
	this->servletresolvercacheSize = servletresolvercacheSize;
}

ConfigNodePropertyArray
OrgApacheSlingServletsResolverSlingServletResolverProperties::getServletresolverpaths()
{
	return servletresolverpaths;
}

void
OrgApacheSlingServletsResolverSlingServletResolverProperties::setServletresolverpaths(ConfigNodePropertyArray  servletresolverpaths)
{
	this->servletresolverpaths = servletresolverpaths;
}

ConfigNodePropertyArray
OrgApacheSlingServletsResolverSlingServletResolverProperties::getServletresolverdefaultExtensions()
{
	return servletresolverdefaultExtensions;
}

void
OrgApacheSlingServletsResolverSlingServletResolverProperties::setServletresolverdefaultExtensions(ConfigNodePropertyArray  servletresolverdefaultExtensions)
{
	this->servletresolverdefaultExtensions = servletresolverdefaultExtensions;
}


