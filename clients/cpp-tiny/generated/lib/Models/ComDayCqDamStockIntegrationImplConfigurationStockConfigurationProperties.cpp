

#include "ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties.h"

using namespace Tiny;

ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties::ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties()
{
	name = ConfigNodePropertyString();
	locale = ConfigNodePropertyString();
	imsConfig = ConfigNodePropertyString();
}

ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties::ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties::~ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties()
{

}

void
ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];




        ConfigNodePropertyString* obj = &name;
		obj->fromJson(value.dump());

    }

    const char *localeKey = "locale";

    if(object.has_key(localeKey))
    {
        bourne::json value = object[localeKey];




        ConfigNodePropertyString* obj = &locale;
		obj->fromJson(value.dump());

    }

    const char *imsConfigKey = "imsConfig";

    if(object.has_key(imsConfigKey))
    {
        bourne::json value = object[imsConfigKey];




        ConfigNodePropertyString* obj = &imsConfig;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["name"] = getName().toJson();






	object["locale"] = getLocale().toJson();






	object["imsConfig"] = getImsConfig().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties::getName()
{
	return name;
}

void
ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties::setName(ConfigNodePropertyString name)
{
	this->name = name;
}

ConfigNodePropertyString
ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties::getLocale()
{
	return locale;
}

void
ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties::setLocale(ConfigNodePropertyString locale)
{
	this->locale = locale;
}

ConfigNodePropertyString
ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties::getImsConfig()
{
	return imsConfig;
}

void
ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties::setImsConfig(ConfigNodePropertyString imsConfig)
{
	this->imsConfig = imsConfig;
}



