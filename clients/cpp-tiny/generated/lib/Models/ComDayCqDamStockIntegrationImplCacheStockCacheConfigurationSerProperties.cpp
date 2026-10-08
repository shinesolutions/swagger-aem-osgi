

#include "ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties.h"

using namespace Tiny;

ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties::ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties()
{
	getCacheExpirationUnit = ConfigNodePropertyDropDown();
	getCacheExpirationValue = ConfigNodePropertyInteger();
}

ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties::ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties::~ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties()
{

}

void
ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *getCacheExpirationUnitKey = "getCacheExpirationUnit";

    if(object.has_key(getCacheExpirationUnitKey))
    {
        bourne::json value = object[getCacheExpirationUnitKey];




        ConfigNodePropertyDropDown* obj = &getCacheExpirationUnit;
		obj->fromJson(value.dump());

    }

    const char *getCacheExpirationValueKey = "getCacheExpirationValue";

    if(object.has_key(getCacheExpirationValueKey))
    {
        bourne::json value = object[getCacheExpirationValueKey];




        ConfigNodePropertyInteger* obj = &getCacheExpirationValue;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["getCacheExpirationUnit"] = getGetCacheExpirationUnit().toJson();






	object["getCacheExpirationValue"] = getGetCacheExpirationValue().toJson();


    return object;

}

ConfigNodePropertyDropDown
ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties::getGetCacheExpirationUnit()
{
	return getCacheExpirationUnit;
}

void
ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties::setGetCacheExpirationUnit(ConfigNodePropertyDropDown getCacheExpirationUnit)
{
	this->getCacheExpirationUnit = getCacheExpirationUnit;
}

ConfigNodePropertyInteger
ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties::getGetCacheExpirationValue()
{
	return getCacheExpirationValue;
}

void
ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties::setGetCacheExpirationValue(ConfigNodePropertyInteger getCacheExpirationValue)
{
	this->getCacheExpirationValue = getCacheExpirationValue;
}



