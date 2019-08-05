#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties::ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties()
{
	//__init();
}

ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties::~ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties()
{
	//__cleanup();
}

void
ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties::__init()
{
	//cacheenable = new ConfigNodePropertyBoolean();
	//cacherootPaths = new ConfigNodePropertyArray();
	//cachemaxSize = new ConfigNodePropertyInteger();
	//cachemaxEntries = new ConfigNodePropertyInteger();
}

void
ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties::__cleanup()
{
	//if(cacheenable != NULL) {
	//
	//delete cacheenable;
	//cacheenable = NULL;
	//}
	//if(cacherootPaths != NULL) {
	//
	//delete cacherootPaths;
	//cacherootPaths = NULL;
	//}
	//if(cachemaxSize != NULL) {
	//
	//delete cachemaxSize;
	//cachemaxSize = NULL;
	//}
	//if(cachemaxEntries != NULL) {
	//
	//delete cachemaxEntries;
	//cachemaxEntries = NULL;
	//}
	//
}

void
ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cacheenableKey = "cache.enable";
	node = json_object_get_member(pJsonObject, cacheenableKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&cacheenable, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&cacheenable);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cacherootPathsKey = "cache.rootPaths";
	node = json_object_get_member(pJsonObject, cacherootPathsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&cacherootPaths, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&cacherootPaths);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cachemaxSizeKey = "cache.maxSize";
	node = json_object_get_member(pJsonObject, cachemaxSizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cachemaxSize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cachemaxSize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cachemaxEntriesKey = "cache.maxEntries";
	node = json_object_get_member(pJsonObject, cachemaxEntriesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cachemaxEntries, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cachemaxEntries);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties::ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getCacheenable();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getCacheenable());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cacheenableKey = "cache.enable";
	json_object_set_member(pJsonObject, cacheenableKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getCacherootPaths();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getCacherootPaths());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cacherootPathsKey = "cache.rootPaths";
	json_object_set_member(pJsonObject, cacherootPathsKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCachemaxSize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCachemaxSize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cachemaxSizeKey = "cache.maxSize";
	json_object_set_member(pJsonObject, cachemaxSizeKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCachemaxEntries();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCachemaxEntries());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cachemaxEntriesKey = "cache.maxEntries";
	json_object_set_member(pJsonObject, cachemaxEntriesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties::getCacheenable()
{
	return cacheenable;
}

void
ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties::setCacheenable(ConfigNodePropertyBoolean  cacheenable)
{
	this->cacheenable = cacheenable;
}

ConfigNodePropertyArray
ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties::getCacherootPaths()
{
	return cacherootPaths;
}

void
ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties::setCacherootPaths(ConfigNodePropertyArray  cacherootPaths)
{
	this->cacherootPaths = cacherootPaths;
}

ConfigNodePropertyInteger
ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties::getCachemaxSize()
{
	return cachemaxSize;
}

void
ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties::setCachemaxSize(ConfigNodePropertyInteger  cachemaxSize)
{
	this->cachemaxSize = cachemaxSize;
}

ConfigNodePropertyInteger
ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties::getCachemaxEntries()
{
	return cachemaxEntries;
}

void
ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties::setCachemaxEntries(ConfigNodePropertyInteger  cachemaxEntries)
{
	this->cachemaxEntries = cachemaxEntries;
}


