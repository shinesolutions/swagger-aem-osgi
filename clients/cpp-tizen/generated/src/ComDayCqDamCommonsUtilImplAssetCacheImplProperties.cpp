#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamCommonsUtilImplAssetCacheImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamCommonsUtilImplAssetCacheImplProperties::ComDayCqDamCommonsUtilImplAssetCacheImplProperties()
{
	//__init();
}

ComDayCqDamCommonsUtilImplAssetCacheImplProperties::~ComDayCqDamCommonsUtilImplAssetCacheImplProperties()
{
	//__cleanup();
}

void
ComDayCqDamCommonsUtilImplAssetCacheImplProperties::__init()
{
	//largefilemin = new ConfigNodePropertyInteger();
	//cacheapply = new ConfigNodePropertyBoolean();
	//mimetypes = new ConfigNodePropertyArray();
}

void
ComDayCqDamCommonsUtilImplAssetCacheImplProperties::__cleanup()
{
	//if(largefilemin != NULL) {
	//
	//delete largefilemin;
	//largefilemin = NULL;
	//}
	//if(cacheapply != NULL) {
	//
	//delete cacheapply;
	//cacheapply = NULL;
	//}
	//if(mimetypes != NULL) {
	//
	//delete mimetypes;
	//mimetypes = NULL;
	//}
	//
}

void
ComDayCqDamCommonsUtilImplAssetCacheImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *largefileminKey = "large.file.min";
	node = json_object_get_member(pJsonObject, largefileminKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&largefilemin, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&largefilemin);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cacheapplyKey = "cache.apply";
	node = json_object_get_member(pJsonObject, cacheapplyKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&cacheapply, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&cacheapply);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *mimetypesKey = "mime.types";
	node = json_object_get_member(pJsonObject, mimetypesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&mimetypes, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&mimetypes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamCommonsUtilImplAssetCacheImplProperties::ComDayCqDamCommonsUtilImplAssetCacheImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamCommonsUtilImplAssetCacheImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getLargefilemin();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getLargefilemin());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *largefileminKey = "large.file.min";
	json_object_set_member(pJsonObject, largefileminKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getCacheapply();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getCacheapply());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cacheapplyKey = "cache.apply";
	json_object_set_member(pJsonObject, cacheapplyKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getMimetypes();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getMimetypes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *mimetypesKey = "mime.types";
	json_object_set_member(pJsonObject, mimetypesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComDayCqDamCommonsUtilImplAssetCacheImplProperties::getLargefilemin()
{
	return largefilemin;
}

void
ComDayCqDamCommonsUtilImplAssetCacheImplProperties::setLargefilemin(ConfigNodePropertyInteger  largefilemin)
{
	this->largefilemin = largefilemin;
}

ConfigNodePropertyBoolean
ComDayCqDamCommonsUtilImplAssetCacheImplProperties::getCacheapply()
{
	return cacheapply;
}

void
ComDayCqDamCommonsUtilImplAssetCacheImplProperties::setCacheapply(ConfigNodePropertyBoolean  cacheapply)
{
	this->cacheapply = cacheapply;
}

ConfigNodePropertyArray
ComDayCqDamCommonsUtilImplAssetCacheImplProperties::getMimetypes()
{
	return mimetypes;
}

void
ComDayCqDamCommonsUtilImplAssetCacheImplProperties::setMimetypes(ConfigNodePropertyArray  mimetypes)
{
	this->mimetypes = mimetypes;
}


