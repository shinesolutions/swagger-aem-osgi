

#include "ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties.h"

using namespace Tiny;

ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties::ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties()
{
	isEnabled = ConfigNodePropertyBoolean();
}

ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties::ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties::~ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties()
{

}

void
ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *isEnabledKey = "isEnabled";

    if(object.has_key(isEnabledKey))
    {
        bourne::json value = object[isEnabledKey];




        ConfigNodePropertyBoolean* obj = &isEnabled;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["isEnabled"] = getIsEnabled().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties::getIsEnabled()
{
	return isEnabled;
}

void
ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties::setIsEnabled(ConfigNodePropertyBoolean isEnabled)
{
	this->isEnabled = isEnabled;
}



