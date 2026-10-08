

#include "ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties.h"

using namespace Tiny;

ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties::ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties()
{
	defaultexternalizerdomain = ConfigNodePropertyString();
}

ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties::ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties::~ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties()
{

}

void
ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *defaultexternalizerdomainKey = "default.externalizer.domain";

    if(object.has_key(defaultexternalizerdomainKey))
    {
        bourne::json value = object[defaultexternalizerdomainKey];




        ConfigNodePropertyString* obj = &defaultexternalizerdomain;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["defaultexternalizerdomain"] = getDefaultexternalizerdomain().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties::getDefaultexternalizerdomain()
{
	return defaultexternalizerdomain;
}

void
ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties::setDefaultexternalizerdomain(ConfigNodePropertyString defaultexternalizerdomain)
{
	this->defaultexternalizerdomain = defaultexternalizerdomain;
}



