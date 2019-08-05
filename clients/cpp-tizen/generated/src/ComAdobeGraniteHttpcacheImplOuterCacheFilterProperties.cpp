#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties::ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties()
{
	//__init();
}

ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties::~ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties::__init()
{
	//comadobegranitehttpcacheurlpaths = new ConfigNodePropertyArray();
}

void
ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties::__cleanup()
{
	//if(comadobegranitehttpcacheurlpaths != NULL) {
	//
	//delete comadobegranitehttpcacheurlpaths;
	//comadobegranitehttpcacheurlpaths = NULL;
	//}
	//
}

void
ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *comadobegranitehttpcacheurlpathsKey = "com.adobe.granite.httpcache.url.paths";
	node = json_object_get_member(pJsonObject, comadobegranitehttpcacheurlpathsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&comadobegranitehttpcacheurlpaths, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&comadobegranitehttpcacheurlpaths);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties::ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getComadobegranitehttpcacheurlpaths();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getComadobegranitehttpcacheurlpaths());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *comadobegranitehttpcacheurlpathsKey = "com.adobe.granite.httpcache.url.paths";
	json_object_set_member(pJsonObject, comadobegranitehttpcacheurlpathsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties::getComadobegranitehttpcacheurlpaths()
{
	return comadobegranitehttpcacheurlpaths;
}

void
ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties::setComadobegranitehttpcacheurlpaths(ConfigNodePropertyArray  comadobegranitehttpcacheurlpaths)
{
	this->comadobegranitehttpcacheurlpaths = comadobegranitehttpcacheurlpaths;
}


