

#include "ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties.h"

using namespace Tiny;

ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties::ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties()
{
	tempStorageConfig = ConfigNodePropertyDropDown();
}

ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties::ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties::~ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties()
{

}

void
ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *tempStorageConfigKey = "tempStorageConfig";

    if(object.has_key(tempStorageConfigKey))
    {
        bourne::json value = object[tempStorageConfigKey];




        ConfigNodePropertyDropDown* obj = &tempStorageConfig;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["tempStorageConfig"] = getTempStorageConfig().toJson();


    return object;

}

ConfigNodePropertyDropDown
ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties::getTempStorageConfig()
{
	return tempStorageConfig;
}

void
ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties::setTempStorageConfig(ConfigNodePropertyDropDown tempStorageConfig)
{
	this->tempStorageConfig = tempStorageConfig;
}



