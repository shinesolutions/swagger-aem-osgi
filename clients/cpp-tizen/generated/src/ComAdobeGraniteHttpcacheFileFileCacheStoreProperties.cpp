#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteHttpcacheFileFileCacheStoreProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteHttpcacheFileFileCacheStoreProperties::ComAdobeGraniteHttpcacheFileFileCacheStoreProperties()
{
	//__init();
}

ComAdobeGraniteHttpcacheFileFileCacheStoreProperties::~ComAdobeGraniteHttpcacheFileFileCacheStoreProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteHttpcacheFileFileCacheStoreProperties::__init()
{
	//comadobegranitehttpcachefiledocumentRoot = new ConfigNodePropertyString();
	//comadobegranitehttpcachefileincludeHost = new ConfigNodePropertyString();
}

void
ComAdobeGraniteHttpcacheFileFileCacheStoreProperties::__cleanup()
{
	//if(comadobegranitehttpcachefiledocumentRoot != NULL) {
	//
	//delete comadobegranitehttpcachefiledocumentRoot;
	//comadobegranitehttpcachefiledocumentRoot = NULL;
	//}
	//if(comadobegranitehttpcachefileincludeHost != NULL) {
	//
	//delete comadobegranitehttpcachefileincludeHost;
	//comadobegranitehttpcachefileincludeHost = NULL;
	//}
	//
}

void
ComAdobeGraniteHttpcacheFileFileCacheStoreProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *comadobegranitehttpcachefiledocumentRootKey = "com.adobe.granite.httpcache.file.documentRoot";
	node = json_object_get_member(pJsonObject, comadobegranitehttpcachefiledocumentRootKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&comadobegranitehttpcachefiledocumentRoot, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&comadobegranitehttpcachefiledocumentRoot);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *comadobegranitehttpcachefileincludeHostKey = "com.adobe.granite.httpcache.file.includeHost";
	node = json_object_get_member(pJsonObject, comadobegranitehttpcachefileincludeHostKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&comadobegranitehttpcachefileincludeHost, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&comadobegranitehttpcachefileincludeHost);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteHttpcacheFileFileCacheStoreProperties::ComAdobeGraniteHttpcacheFileFileCacheStoreProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteHttpcacheFileFileCacheStoreProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getComadobegranitehttpcachefiledocumentRoot();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getComadobegranitehttpcachefiledocumentRoot());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *comadobegranitehttpcachefiledocumentRootKey = "com.adobe.granite.httpcache.file.documentRoot";
	json_object_set_member(pJsonObject, comadobegranitehttpcachefiledocumentRootKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getComadobegranitehttpcachefileincludeHost();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getComadobegranitehttpcachefileincludeHost());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *comadobegranitehttpcachefileincludeHostKey = "com.adobe.granite.httpcache.file.includeHost";
	json_object_set_member(pJsonObject, comadobegranitehttpcachefileincludeHostKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeGraniteHttpcacheFileFileCacheStoreProperties::getComadobegranitehttpcachefiledocumentRoot()
{
	return comadobegranitehttpcachefiledocumentRoot;
}

void
ComAdobeGraniteHttpcacheFileFileCacheStoreProperties::setComadobegranitehttpcachefiledocumentRoot(ConfigNodePropertyString  comadobegranitehttpcachefiledocumentRoot)
{
	this->comadobegranitehttpcachefiledocumentRoot = comadobegranitehttpcachefiledocumentRoot;
}

ConfigNodePropertyString
ComAdobeGraniteHttpcacheFileFileCacheStoreProperties::getComadobegranitehttpcachefileincludeHost()
{
	return comadobegranitehttpcachefileincludeHost;
}

void
ComAdobeGraniteHttpcacheFileFileCacheStoreProperties::setComadobegranitehttpcachefileincludeHost(ConfigNodePropertyString  comadobegranitehttpcachefileincludeHost)
{
	this->comadobegranitehttpcachefileincludeHost = comadobegranitehttpcachefileincludeHost;
}


