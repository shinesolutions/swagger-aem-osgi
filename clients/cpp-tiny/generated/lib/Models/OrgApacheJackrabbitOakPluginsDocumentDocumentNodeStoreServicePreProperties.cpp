

#include "OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties.h"

using namespace Tiny;

OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties::OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties()
{
	persistentCacheIncludes = ConfigNodePropertyArray();
}

OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties::OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties::~OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties()
{

}

void
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *persistentCacheIncludesKey = "persistentCacheIncludes";

    if(object.has_key(persistentCacheIncludesKey))
    {
        bourne::json value = object[persistentCacheIncludesKey];




        ConfigNodePropertyArray* obj = &persistentCacheIncludes;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["persistentCacheIncludes"] = getPersistentCacheIncludes().toJson();


    return object;

}

ConfigNodePropertyArray
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties::getPersistentCacheIncludes()
{
	return persistentCacheIncludes;
}

void
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties::setPersistentCacheIncludes(ConfigNodePropertyArray persistentCacheIncludes)
{
	this->persistentCacheIncludes = persistentCacheIncludes;
}



