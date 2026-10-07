#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties::ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties()
{
	//__init();
}

ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties::~ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties()
{
	//__cleanup();
}

void
ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties::__init()
{
	//cqdamimagecachemaxmemory = new ConfigNodePropertyInteger();
	//cqdamimagecachemaxage = new ConfigNodePropertyInteger();
	//cqdamimagecachemaxdimension = new ConfigNodePropertyString();
}

void
ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties::__cleanup()
{
	//if(cqdamimagecachemaxmemory != NULL) {
	//
	//delete cqdamimagecachemaxmemory;
	//cqdamimagecachemaxmemory = NULL;
	//}
	//if(cqdamimagecachemaxage != NULL) {
	//
	//delete cqdamimagecachemaxage;
	//cqdamimagecachemaxage = NULL;
	//}
	//if(cqdamimagecachemaxdimension != NULL) {
	//
	//delete cqdamimagecachemaxdimension;
	//cqdamimagecachemaxdimension = NULL;
	//}
	//
}

void
ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cqdamimagecachemaxmemoryKey = "cq.dam.image.cache.max.memory";
	node = json_object_get_member(pJsonObject, cqdamimagecachemaxmemoryKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cqdamimagecachemaxmemory, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cqdamimagecachemaxmemory);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqdamimagecachemaxageKey = "cq.dam.image.cache.max.age";
	node = json_object_get_member(pJsonObject, cqdamimagecachemaxageKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cqdamimagecachemaxage, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cqdamimagecachemaxage);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqdamimagecachemaxdimensionKey = "cq.dam.image.cache.max.dimension";
	node = json_object_get_member(pJsonObject, cqdamimagecachemaxdimensionKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&cqdamimagecachemaxdimension, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&cqdamimagecachemaxdimension);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties::ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCqdamimagecachemaxmemory();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCqdamimagecachemaxmemory());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdamimagecachemaxmemoryKey = "cq.dam.image.cache.max.memory";
	json_object_set_member(pJsonObject, cqdamimagecachemaxmemoryKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCqdamimagecachemaxage();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCqdamimagecachemaxage());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdamimagecachemaxageKey = "cq.dam.image.cache.max.age";
	json_object_set_member(pJsonObject, cqdamimagecachemaxageKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getCqdamimagecachemaxdimension();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getCqdamimagecachemaxdimension());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdamimagecachemaxdimensionKey = "cq.dam.image.cache.max.dimension";
	json_object_set_member(pJsonObject, cqdamimagecachemaxdimensionKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties::getCqdamimagecachemaxmemory()
{
	return cqdamimagecachemaxmemory;
}

void
ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties::setCqdamimagecachemaxmemory(ConfigNodePropertyInteger  cqdamimagecachemaxmemory)
{
	this->cqdamimagecachemaxmemory = cqdamimagecachemaxmemory;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties::getCqdamimagecachemaxage()
{
	return cqdamimagecachemaxage;
}

void
ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties::setCqdamimagecachemaxage(ConfigNodePropertyInteger  cqdamimagecachemaxage)
{
	this->cqdamimagecachemaxage = cqdamimagecachemaxage;
}

ConfigNodePropertyString
ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties::getCqdamimagecachemaxdimension()
{
	return cqdamimagecachemaxdimension;
}

void
ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties::setCqdamimagecachemaxdimension(ConfigNodePropertyString  cqdamimagecachemaxdimension)
{
	this->cqdamimagecachemaxdimension = cqdamimagecachemaxdimension;
}


