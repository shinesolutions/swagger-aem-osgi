#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqReportingImplCacheCacheImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqReportingImplCacheCacheImplProperties::ComDayCqReportingImplCacheCacheImplProperties()
{
	//__init();
}

ComDayCqReportingImplCacheCacheImplProperties::~ComDayCqReportingImplCacheCacheImplProperties()
{
	//__cleanup();
}

void
ComDayCqReportingImplCacheCacheImplProperties::__init()
{
	//repcacheenable = new ConfigNodePropertyBoolean();
	//repcachettl = new ConfigNodePropertyInteger();
	//repcachemax = new ConfigNodePropertyInteger();
}

void
ComDayCqReportingImplCacheCacheImplProperties::__cleanup()
{
	//if(repcacheenable != NULL) {
	//
	//delete repcacheenable;
	//repcacheenable = NULL;
	//}
	//if(repcachettl != NULL) {
	//
	//delete repcachettl;
	//repcachettl = NULL;
	//}
	//if(repcachemax != NULL) {
	//
	//delete repcachemax;
	//repcachemax = NULL;
	//}
	//
}

void
ComDayCqReportingImplCacheCacheImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *repcacheenableKey = "repcache.enable";
	node = json_object_get_member(pJsonObject, repcacheenableKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&repcacheenable, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&repcacheenable);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *repcachettlKey = "repcache.ttl";
	node = json_object_get_member(pJsonObject, repcachettlKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&repcachettl, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&repcachettl);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *repcachemaxKey = "repcache.max";
	node = json_object_get_member(pJsonObject, repcachemaxKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&repcachemax, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&repcachemax);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqReportingImplCacheCacheImplProperties::ComDayCqReportingImplCacheCacheImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqReportingImplCacheCacheImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getRepcacheenable();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getRepcacheenable());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *repcacheenableKey = "repcache.enable";
	json_object_set_member(pJsonObject, repcacheenableKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getRepcachettl();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getRepcachettl());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *repcachettlKey = "repcache.ttl";
	json_object_set_member(pJsonObject, repcachettlKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getRepcachemax();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getRepcachemax());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *repcachemaxKey = "repcache.max";
	json_object_set_member(pJsonObject, repcachemaxKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComDayCqReportingImplCacheCacheImplProperties::getRepcacheenable()
{
	return repcacheenable;
}

void
ComDayCqReportingImplCacheCacheImplProperties::setRepcacheenable(ConfigNodePropertyBoolean  repcacheenable)
{
	this->repcacheenable = repcacheenable;
}

ConfigNodePropertyInteger
ComDayCqReportingImplCacheCacheImplProperties::getRepcachettl()
{
	return repcachettl;
}

void
ComDayCqReportingImplCacheCacheImplProperties::setRepcachettl(ConfigNodePropertyInteger  repcachettl)
{
	this->repcachettl = repcachettl;
}

ConfigNodePropertyInteger
ComDayCqReportingImplCacheCacheImplProperties::getRepcachemax()
{
	return repcachemax;
}

void
ComDayCqReportingImplCacheCacheImplProperties::setRepcachemax(ConfigNodePropertyInteger  repcachemax)
{
	this->repcachemax = repcachemax;
}


