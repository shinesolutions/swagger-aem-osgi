

#include "OrgApacheSlingScriptingCoreImplScriptCacheImplProperties.h"

using namespace Tiny;

OrgApacheSlingScriptingCoreImplScriptCacheImplProperties::OrgApacheSlingScriptingCoreImplScriptCacheImplProperties()
{
	orgapacheslingscriptingcachesize = ConfigNodePropertyInteger();
	orgapacheslingscriptingcacheadditional_extensions = ConfigNodePropertyArray();
}

OrgApacheSlingScriptingCoreImplScriptCacheImplProperties::OrgApacheSlingScriptingCoreImplScriptCacheImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingScriptingCoreImplScriptCacheImplProperties::~OrgApacheSlingScriptingCoreImplScriptCacheImplProperties()
{

}

void
OrgApacheSlingScriptingCoreImplScriptCacheImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *orgapacheslingscriptingcachesizeKey = "org.apache.sling.scripting.cache.size";

    if(object.has_key(orgapacheslingscriptingcachesizeKey))
    {
        bourne::json value = object[orgapacheslingscriptingcachesizeKey];




        ConfigNodePropertyInteger* obj = &orgapacheslingscriptingcachesize;
		obj->fromJson(value.dump());

    }

    const char *orgapacheslingscriptingcacheadditional_extensionsKey = "org.apache.sling.scripting.cache.additional_extensions";

    if(object.has_key(orgapacheslingscriptingcacheadditional_extensionsKey))
    {
        bourne::json value = object[orgapacheslingscriptingcacheadditional_extensionsKey];




        ConfigNodePropertyArray* obj = &orgapacheslingscriptingcacheadditional_extensions;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingScriptingCoreImplScriptCacheImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["orgapacheslingscriptingcachesize"] = getOrgapacheslingscriptingcachesize().toJson();






	object["orgapacheslingscriptingcacheadditional_extensions"] = getOrgapacheslingscriptingcacheadditionalExtensions().toJson();


    return object;

}

ConfigNodePropertyInteger
OrgApacheSlingScriptingCoreImplScriptCacheImplProperties::getOrgapacheslingscriptingcachesize()
{
	return orgapacheslingscriptingcachesize;
}

void
OrgApacheSlingScriptingCoreImplScriptCacheImplProperties::setOrgapacheslingscriptingcachesize(ConfigNodePropertyInteger orgapacheslingscriptingcachesize)
{
	this->orgapacheslingscriptingcachesize = orgapacheslingscriptingcachesize;
}

ConfigNodePropertyArray
OrgApacheSlingScriptingCoreImplScriptCacheImplProperties::getOrgapacheslingscriptingcacheadditionalExtensions()
{
	return orgapacheslingscriptingcacheadditional_extensions;
}

void
OrgApacheSlingScriptingCoreImplScriptCacheImplProperties::setOrgapacheslingscriptingcacheadditionalExtensions(ConfigNodePropertyArray orgapacheslingscriptingcacheadditional_extensions)
{
	this->orgapacheslingscriptingcacheadditional_extensions = orgapacheslingscriptingcacheadditional_extensions;
}



