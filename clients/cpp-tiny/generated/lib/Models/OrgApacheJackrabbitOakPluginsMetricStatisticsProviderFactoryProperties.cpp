

#include "OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties.h"

using namespace Tiny;

OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties::OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties()
{
	providerType = ConfigNodePropertyDropDown();
}

OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties::OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties::~OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties()
{

}

void
OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *providerTypeKey = "providerType";

    if(object.has_key(providerTypeKey))
    {
        bourne::json value = object[providerTypeKey];




        ConfigNodePropertyDropDown* obj = &providerType;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["providerType"] = getProviderType().toJson();


    return object;

}

ConfigNodePropertyDropDown
OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties::getProviderType()
{
	return providerType;
}

void
OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties::setProviderType(ConfigNodePropertyDropDown providerType)
{
	this->providerType = providerType;
}



