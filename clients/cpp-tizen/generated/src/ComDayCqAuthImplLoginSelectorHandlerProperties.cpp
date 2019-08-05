#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqAuthImplLoginSelectorHandlerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqAuthImplLoginSelectorHandlerProperties::ComDayCqAuthImplLoginSelectorHandlerProperties()
{
	//__init();
}

ComDayCqAuthImplLoginSelectorHandlerProperties::~ComDayCqAuthImplLoginSelectorHandlerProperties()
{
	//__cleanup();
}

void
ComDayCqAuthImplLoginSelectorHandlerProperties::__init()
{
	//path = new ConfigNodePropertyString();
	//serviceranking = new ConfigNodePropertyInteger();
	//authloginselectormappings = new ConfigNodePropertyArray();
	//authloginselectorchangepwmappings = new ConfigNodePropertyArray();
	//authloginselectordefaultloginpage = new ConfigNodePropertyString();
	//authloginselectordefaultchangepwpage = new ConfigNodePropertyString();
	//authloginselectorhandle = new ConfigNodePropertyArray();
	//authloginselectorhandleallextensions = new ConfigNodePropertyBoolean();
}

void
ComDayCqAuthImplLoginSelectorHandlerProperties::__cleanup()
{
	//if(path != NULL) {
	//
	//delete path;
	//path = NULL;
	//}
	//if(serviceranking != NULL) {
	//
	//delete serviceranking;
	//serviceranking = NULL;
	//}
	//if(authloginselectormappings != NULL) {
	//
	//delete authloginselectormappings;
	//authloginselectormappings = NULL;
	//}
	//if(authloginselectorchangepwmappings != NULL) {
	//
	//delete authloginselectorchangepwmappings;
	//authloginselectorchangepwmappings = NULL;
	//}
	//if(authloginselectordefaultloginpage != NULL) {
	//
	//delete authloginselectordefaultloginpage;
	//authloginselectordefaultloginpage = NULL;
	//}
	//if(authloginselectordefaultchangepwpage != NULL) {
	//
	//delete authloginselectordefaultchangepwpage;
	//authloginselectordefaultchangepwpage = NULL;
	//}
	//if(authloginselectorhandle != NULL) {
	//
	//delete authloginselectorhandle;
	//authloginselectorhandle = NULL;
	//}
	//if(authloginselectorhandleallextensions != NULL) {
	//
	//delete authloginselectorhandleallextensions;
	//authloginselectorhandleallextensions = NULL;
	//}
	//
}

void
ComDayCqAuthImplLoginSelectorHandlerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *pathKey = "path";
	node = json_object_get_member(pJsonObject, pathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&path, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&path);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *servicerankingKey = "service.ranking";
	node = json_object_get_member(pJsonObject, servicerankingKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&serviceranking, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&serviceranking);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *authloginselectormappingsKey = "auth.loginselector.mappings";
	node = json_object_get_member(pJsonObject, authloginselectormappingsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&authloginselectormappings, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&authloginselectormappings);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *authloginselectorchangepwmappingsKey = "auth.loginselector.changepw.mappings";
	node = json_object_get_member(pJsonObject, authloginselectorchangepwmappingsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&authloginselectorchangepwmappings, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&authloginselectorchangepwmappings);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *authloginselectordefaultloginpageKey = "auth.loginselector.defaultloginpage";
	node = json_object_get_member(pJsonObject, authloginselectordefaultloginpageKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&authloginselectordefaultloginpage, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&authloginselectordefaultloginpage);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *authloginselectordefaultchangepwpageKey = "auth.loginselector.defaultchangepwpage";
	node = json_object_get_member(pJsonObject, authloginselectordefaultchangepwpageKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&authloginselectordefaultchangepwpage, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&authloginselectordefaultchangepwpage);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *authloginselectorhandleKey = "auth.loginselector.handle";
	node = json_object_get_member(pJsonObject, authloginselectorhandleKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&authloginselectorhandle, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&authloginselectorhandle);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *authloginselectorhandleallextensionsKey = "auth.loginselector.handle.all.extensions";
	node = json_object_get_member(pJsonObject, authloginselectorhandleallextensionsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&authloginselectorhandleallextensions, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&authloginselectorhandleallextensions);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqAuthImplLoginSelectorHandlerProperties::ComDayCqAuthImplLoginSelectorHandlerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqAuthImplLoginSelectorHandlerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getPath();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getPath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pathKey = "path";
	json_object_set_member(pJsonObject, pathKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getServiceranking();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getServiceranking());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *servicerankingKey = "service.ranking";
	json_object_set_member(pJsonObject, servicerankingKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getAuthloginselectormappings();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getAuthloginselectormappings());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *authloginselectormappingsKey = "auth.loginselector.mappings";
	json_object_set_member(pJsonObject, authloginselectormappingsKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getAuthloginselectorchangepwmappings();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getAuthloginselectorchangepwmappings());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *authloginselectorchangepwmappingsKey = "auth.loginselector.changepw.mappings";
	json_object_set_member(pJsonObject, authloginselectorchangepwmappingsKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getAuthloginselectordefaultloginpage();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getAuthloginselectordefaultloginpage());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *authloginselectordefaultloginpageKey = "auth.loginselector.defaultloginpage";
	json_object_set_member(pJsonObject, authloginselectordefaultloginpageKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getAuthloginselectordefaultchangepwpage();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getAuthloginselectordefaultchangepwpage());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *authloginselectordefaultchangepwpageKey = "auth.loginselector.defaultchangepwpage";
	json_object_set_member(pJsonObject, authloginselectordefaultchangepwpageKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getAuthloginselectorhandle();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getAuthloginselectorhandle());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *authloginselectorhandleKey = "auth.loginselector.handle";
	json_object_set_member(pJsonObject, authloginselectorhandleKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getAuthloginselectorhandleallextensions();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getAuthloginselectorhandleallextensions());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *authloginselectorhandleallextensionsKey = "auth.loginselector.handle.all.extensions";
	json_object_set_member(pJsonObject, authloginselectorhandleallextensionsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqAuthImplLoginSelectorHandlerProperties::getPath()
{
	return path;
}

void
ComDayCqAuthImplLoginSelectorHandlerProperties::setPath(ConfigNodePropertyString  path)
{
	this->path = path;
}

ConfigNodePropertyInteger
ComDayCqAuthImplLoginSelectorHandlerProperties::getServiceranking()
{
	return serviceranking;
}

void
ComDayCqAuthImplLoginSelectorHandlerProperties::setServiceranking(ConfigNodePropertyInteger  serviceranking)
{
	this->serviceranking = serviceranking;
}

ConfigNodePropertyArray
ComDayCqAuthImplLoginSelectorHandlerProperties::getAuthloginselectormappings()
{
	return authloginselectormappings;
}

void
ComDayCqAuthImplLoginSelectorHandlerProperties::setAuthloginselectormappings(ConfigNodePropertyArray  authloginselectormappings)
{
	this->authloginselectormappings = authloginselectormappings;
}

ConfigNodePropertyArray
ComDayCqAuthImplLoginSelectorHandlerProperties::getAuthloginselectorchangepwmappings()
{
	return authloginselectorchangepwmappings;
}

void
ComDayCqAuthImplLoginSelectorHandlerProperties::setAuthloginselectorchangepwmappings(ConfigNodePropertyArray  authloginselectorchangepwmappings)
{
	this->authloginselectorchangepwmappings = authloginselectorchangepwmappings;
}

ConfigNodePropertyString
ComDayCqAuthImplLoginSelectorHandlerProperties::getAuthloginselectordefaultloginpage()
{
	return authloginselectordefaultloginpage;
}

void
ComDayCqAuthImplLoginSelectorHandlerProperties::setAuthloginselectordefaultloginpage(ConfigNodePropertyString  authloginselectordefaultloginpage)
{
	this->authloginselectordefaultloginpage = authloginselectordefaultloginpage;
}

ConfigNodePropertyString
ComDayCqAuthImplLoginSelectorHandlerProperties::getAuthloginselectordefaultchangepwpage()
{
	return authloginselectordefaultchangepwpage;
}

void
ComDayCqAuthImplLoginSelectorHandlerProperties::setAuthloginselectordefaultchangepwpage(ConfigNodePropertyString  authloginselectordefaultchangepwpage)
{
	this->authloginselectordefaultchangepwpage = authloginselectordefaultchangepwpage;
}

ConfigNodePropertyArray
ComDayCqAuthImplLoginSelectorHandlerProperties::getAuthloginselectorhandle()
{
	return authloginselectorhandle;
}

void
ComDayCqAuthImplLoginSelectorHandlerProperties::setAuthloginselectorhandle(ConfigNodePropertyArray  authloginselectorhandle)
{
	this->authloginselectorhandle = authloginselectorhandle;
}

ConfigNodePropertyBoolean
ComDayCqAuthImplLoginSelectorHandlerProperties::getAuthloginselectorhandleallextensions()
{
	return authloginselectorhandleallextensions;
}

void
ComDayCqAuthImplLoginSelectorHandlerProperties::setAuthloginselectorhandleallextensions(ConfigNodePropertyBoolean  authloginselectorhandleallextensions)
{
	this->authloginselectorhandleallextensions = authloginselectorhandleallextensions;
}


