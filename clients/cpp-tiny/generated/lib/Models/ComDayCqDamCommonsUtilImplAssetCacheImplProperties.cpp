

#include "ComDayCqDamCommonsUtilImplAssetCacheImplProperties.h"

using namespace Tiny;

ComDayCqDamCommonsUtilImplAssetCacheImplProperties::ComDayCqDamCommonsUtilImplAssetCacheImplProperties()
{
	largefilemin = ConfigNodePropertyInteger();
	cacheapply = ConfigNodePropertyBoolean();
	mimetypes = ConfigNodePropertyArray();
}

ComDayCqDamCommonsUtilImplAssetCacheImplProperties::ComDayCqDamCommonsUtilImplAssetCacheImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCommonsUtilImplAssetCacheImplProperties::~ComDayCqDamCommonsUtilImplAssetCacheImplProperties()
{

}

void
ComDayCqDamCommonsUtilImplAssetCacheImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *largefileminKey = "large.file.min";

    if(object.has_key(largefileminKey))
    {
        bourne::json value = object[largefileminKey];




        ConfigNodePropertyInteger* obj = &largefilemin;
		obj->fromJson(value.dump());

    }

    const char *cacheapplyKey = "cache.apply";

    if(object.has_key(cacheapplyKey))
    {
        bourne::json value = object[cacheapplyKey];




        ConfigNodePropertyBoolean* obj = &cacheapply;
		obj->fromJson(value.dump());

    }

    const char *mimetypesKey = "mime.types";

    if(object.has_key(mimetypesKey))
    {
        bourne::json value = object[mimetypesKey];




        ConfigNodePropertyArray* obj = &mimetypes;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCommonsUtilImplAssetCacheImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["largefilemin"] = getLargefilemin().toJson();






	object["cacheapply"] = getCacheapply().toJson();






	object["mimetypes"] = getMimetypes().toJson();


    return object;

}

ConfigNodePropertyInteger
ComDayCqDamCommonsUtilImplAssetCacheImplProperties::getLargefilemin()
{
	return largefilemin;
}

void
ComDayCqDamCommonsUtilImplAssetCacheImplProperties::setLargefilemin(ConfigNodePropertyInteger largefilemin)
{
	this->largefilemin = largefilemin;
}

ConfigNodePropertyBoolean
ComDayCqDamCommonsUtilImplAssetCacheImplProperties::getCacheapply()
{
	return cacheapply;
}

void
ComDayCqDamCommonsUtilImplAssetCacheImplProperties::setCacheapply(ConfigNodePropertyBoolean cacheapply)
{
	this->cacheapply = cacheapply;
}

ConfigNodePropertyArray
ComDayCqDamCommonsUtilImplAssetCacheImplProperties::getMimetypes()
{
	return mimetypes;
}

void
ComDayCqDamCommonsUtilImplAssetCacheImplProperties::setMimetypes(ConfigNodePropertyArray mimetypes)
{
	this->mimetypes = mimetypes;
}



