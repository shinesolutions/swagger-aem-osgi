#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties::OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties()
{
	//__init();
}

OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties::~OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties()
{
	//__cleanup();
}

void
OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties::__init()
{
	//servletPath = new ConfigNodePropertyString();
	//disabled = new ConfigNodePropertyBoolean();
	//corsaccessControlAllowOrigin = new ConfigNodePropertyString();
}

void
OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties::__cleanup()
{
	//if(servletPath != NULL) {
	//
	//delete servletPath;
	//servletPath = NULL;
	//}
	//if(disabled != NULL) {
	//
	//delete disabled;
	//disabled = NULL;
	//}
	//if(corsaccessControlAllowOrigin != NULL) {
	//
	//delete corsaccessControlAllowOrigin;
	//corsaccessControlAllowOrigin = NULL;
	//}
	//
}

void
OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *servletPathKey = "servletPath";
	node = json_object_get_member(pJsonObject, servletPathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&servletPath, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&servletPath);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *disabledKey = "disabled";
	node = json_object_get_member(pJsonObject, disabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&disabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&disabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *corsaccessControlAllowOriginKey = "cors.accessControlAllowOrigin";
	node = json_object_get_member(pJsonObject, corsaccessControlAllowOriginKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&corsaccessControlAllowOrigin, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&corsaccessControlAllowOrigin);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties::OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getServletPath();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getServletPath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *servletPathKey = "servletPath";
	json_object_set_member(pJsonObject, servletPathKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getDisabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getDisabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *disabledKey = "disabled";
	json_object_set_member(pJsonObject, disabledKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getCorsaccessControlAllowOrigin();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getCorsaccessControlAllowOrigin());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *corsaccessControlAllowOriginKey = "cors.accessControlAllowOrigin";
	json_object_set_member(pJsonObject, corsaccessControlAllowOriginKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties::getServletPath()
{
	return servletPath;
}

void
OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties::setServletPath(ConfigNodePropertyString  servletPath)
{
	this->servletPath = servletPath;
}

ConfigNodePropertyBoolean
OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties::getDisabled()
{
	return disabled;
}

void
OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties::setDisabled(ConfigNodePropertyBoolean  disabled)
{
	this->disabled = disabled;
}

ConfigNodePropertyString
OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties::getCorsaccessControlAllowOrigin()
{
	return corsaccessControlAllowOrigin;
}

void
OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties::setCorsaccessControlAllowOrigin(ConfigNodePropertyString  corsaccessControlAllowOrigin)
{
	this->corsaccessControlAllowOrigin = corsaccessControlAllowOrigin;
}


