

#include "OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties.h"

using namespace Tiny;

OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties::OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties()
{
	maxItems = ConfigNodePropertyInteger();
	maxPathDepth = ConfigNodePropertyInteger();
	enabled = ConfigNodePropertyBoolean();
}

OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties::OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties::~OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties()
{

}

void
OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *maxItemsKey = "maxItems";

    if(object.has_key(maxItemsKey))
    {
        bourne::json value = object[maxItemsKey];




        ConfigNodePropertyInteger* obj = &maxItems;
		obj->fromJson(value.dump());

    }

    const char *maxPathDepthKey = "maxPathDepth";

    if(object.has_key(maxPathDepthKey))
    {
        bourne::json value = object[maxPathDepthKey];




        ConfigNodePropertyInteger* obj = &maxPathDepth;
		obj->fromJson(value.dump());

    }

    const char *enabledKey = "enabled";

    if(object.has_key(enabledKey))
    {
        bourne::json value = object[enabledKey];




        ConfigNodePropertyBoolean* obj = &enabled;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["maxItems"] = getMaxItems().toJson();






	object["maxPathDepth"] = getMaxPathDepth().toJson();






	object["enabled"] = getEnabled().toJson();


    return object;

}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties::getMaxItems()
{
	return maxItems;
}

void
OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties::setMaxItems(ConfigNodePropertyInteger maxItems)
{
	this->maxItems = maxItems;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties::getMaxPathDepth()
{
	return maxPathDepth;
}

void
OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties::setMaxPathDepth(ConfigNodePropertyInteger maxPathDepth)
{
	this->maxPathDepth = maxPathDepth;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties::getEnabled()
{
	return enabled;
}

void
OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties::setEnabled(ConfigNodePropertyBoolean enabled)
{
	this->enabled = enabled;
}



