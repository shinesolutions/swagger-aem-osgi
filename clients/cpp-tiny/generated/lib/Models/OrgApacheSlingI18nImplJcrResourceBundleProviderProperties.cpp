

#include "OrgApacheSlingI18nImplJcrResourceBundleProviderProperties.h"

using namespace Tiny;

OrgApacheSlingI18nImplJcrResourceBundleProviderProperties::OrgApacheSlingI18nImplJcrResourceBundleProviderProperties()
{
	localedefault = ConfigNodePropertyString();
	preloadbundles = ConfigNodePropertyBoolean();
	invalidationdelay = ConfigNodePropertyInteger();
}

OrgApacheSlingI18nImplJcrResourceBundleProviderProperties::OrgApacheSlingI18nImplJcrResourceBundleProviderProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingI18nImplJcrResourceBundleProviderProperties::~OrgApacheSlingI18nImplJcrResourceBundleProviderProperties()
{

}

void
OrgApacheSlingI18nImplJcrResourceBundleProviderProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *localedefaultKey = "locale.default";

    if(object.has_key(localedefaultKey))
    {
        bourne::json value = object[localedefaultKey];




        ConfigNodePropertyString* obj = &localedefault;
		obj->fromJson(value.dump());

    }

    const char *preloadbundlesKey = "preload.bundles";

    if(object.has_key(preloadbundlesKey))
    {
        bourne::json value = object[preloadbundlesKey];




        ConfigNodePropertyBoolean* obj = &preloadbundles;
		obj->fromJson(value.dump());

    }

    const char *invalidationdelayKey = "invalidation.delay";

    if(object.has_key(invalidationdelayKey))
    {
        bourne::json value = object[invalidationdelayKey];




        ConfigNodePropertyInteger* obj = &invalidationdelay;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingI18nImplJcrResourceBundleProviderProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["localedefault"] = getLocaledefault().toJson();






	object["preloadbundles"] = getPreloadbundles().toJson();






	object["invalidationdelay"] = getInvalidationdelay().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingI18nImplJcrResourceBundleProviderProperties::getLocaledefault()
{
	return localedefault;
}

void
OrgApacheSlingI18nImplJcrResourceBundleProviderProperties::setLocaledefault(ConfigNodePropertyString localedefault)
{
	this->localedefault = localedefault;
}

ConfigNodePropertyBoolean
OrgApacheSlingI18nImplJcrResourceBundleProviderProperties::getPreloadbundles()
{
	return preloadbundles;
}

void
OrgApacheSlingI18nImplJcrResourceBundleProviderProperties::setPreloadbundles(ConfigNodePropertyBoolean preloadbundles)
{
	this->preloadbundles = preloadbundles;
}

ConfigNodePropertyInteger
OrgApacheSlingI18nImplJcrResourceBundleProviderProperties::getInvalidationdelay()
{
	return invalidationdelay;
}

void
OrgApacheSlingI18nImplJcrResourceBundleProviderProperties::setInvalidationdelay(ConfigNodePropertyInteger invalidationdelay)
{
	this->invalidationdelay = invalidationdelay;
}



