#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqSearchImplBuilderQueryBuilderImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqSearchImplBuilderQueryBuilderImplProperties::ComDayCqSearchImplBuilderQueryBuilderImplProperties()
{
	//__init();
}

ComDayCqSearchImplBuilderQueryBuilderImplProperties::~ComDayCqSearchImplBuilderQueryBuilderImplProperties()
{
	//__cleanup();
}

void
ComDayCqSearchImplBuilderQueryBuilderImplProperties::__init()
{
	//excerptproperties = new ConfigNodePropertyArray();
	//cachemaxentries = new ConfigNodePropertyInteger();
	//cacheentrylifetime = new ConfigNodePropertyInteger();
	//xpathunion = new ConfigNodePropertyBoolean();
}

void
ComDayCqSearchImplBuilderQueryBuilderImplProperties::__cleanup()
{
	//if(excerptproperties != NULL) {
	//
	//delete excerptproperties;
	//excerptproperties = NULL;
	//}
	//if(cachemaxentries != NULL) {
	//
	//delete cachemaxentries;
	//cachemaxentries = NULL;
	//}
	//if(cacheentrylifetime != NULL) {
	//
	//delete cacheentrylifetime;
	//cacheentrylifetime = NULL;
	//}
	//if(xpathunion != NULL) {
	//
	//delete xpathunion;
	//xpathunion = NULL;
	//}
	//
}

void
ComDayCqSearchImplBuilderQueryBuilderImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *excerptpropertiesKey = "excerpt.properties";
	node = json_object_get_member(pJsonObject, excerptpropertiesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&excerptproperties, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&excerptproperties);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cachemaxentriesKey = "cache.max.entries";
	node = json_object_get_member(pJsonObject, cachemaxentriesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cachemaxentries, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cachemaxentries);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cacheentrylifetimeKey = "cache.entry.lifetime";
	node = json_object_get_member(pJsonObject, cacheentrylifetimeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cacheentrylifetime, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cacheentrylifetime);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *xpathunionKey = "xpath.union";
	node = json_object_get_member(pJsonObject, xpathunionKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&xpathunion, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&xpathunion);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqSearchImplBuilderQueryBuilderImplProperties::ComDayCqSearchImplBuilderQueryBuilderImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqSearchImplBuilderQueryBuilderImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getExcerptproperties();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getExcerptproperties());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *excerptpropertiesKey = "excerpt.properties";
	json_object_set_member(pJsonObject, excerptpropertiesKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCachemaxentries();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCachemaxentries());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cachemaxentriesKey = "cache.max.entries";
	json_object_set_member(pJsonObject, cachemaxentriesKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCacheentrylifetime();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCacheentrylifetime());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cacheentrylifetimeKey = "cache.entry.lifetime";
	json_object_set_member(pJsonObject, cacheentrylifetimeKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getXpathunion();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getXpathunion());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *xpathunionKey = "xpath.union";
	json_object_set_member(pJsonObject, xpathunionKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComDayCqSearchImplBuilderQueryBuilderImplProperties::getExcerptproperties()
{
	return excerptproperties;
}

void
ComDayCqSearchImplBuilderQueryBuilderImplProperties::setExcerptproperties(ConfigNodePropertyArray  excerptproperties)
{
	this->excerptproperties = excerptproperties;
}

ConfigNodePropertyInteger
ComDayCqSearchImplBuilderQueryBuilderImplProperties::getCachemaxentries()
{
	return cachemaxentries;
}

void
ComDayCqSearchImplBuilderQueryBuilderImplProperties::setCachemaxentries(ConfigNodePropertyInteger  cachemaxentries)
{
	this->cachemaxentries = cachemaxentries;
}

ConfigNodePropertyInteger
ComDayCqSearchImplBuilderQueryBuilderImplProperties::getCacheentrylifetime()
{
	return cacheentrylifetime;
}

void
ComDayCqSearchImplBuilderQueryBuilderImplProperties::setCacheentrylifetime(ConfigNodePropertyInteger  cacheentrylifetime)
{
	this->cacheentrylifetime = cacheentrylifetime;
}

ConfigNodePropertyBoolean
ComDayCqSearchImplBuilderQueryBuilderImplProperties::getXpathunion()
{
	return xpathunion;
}

void
ComDayCqSearchImplBuilderQueryBuilderImplProperties::setXpathunion(ConfigNodePropertyBoolean  xpathunion)
{
	this->xpathunion = xpathunion;
}


