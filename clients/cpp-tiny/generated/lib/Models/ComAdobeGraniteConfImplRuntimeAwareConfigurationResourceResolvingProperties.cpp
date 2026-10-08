

#include "ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties.h"

using namespace Tiny;

ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties::ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties()
{
	enabled = ConfigNodePropertyBoolean();
	fallbackPaths = ConfigNodePropertyArray();
}

ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties::ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties::~ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties()
{

}

void
ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *enabledKey = "enabled";

    if(object.has_key(enabledKey))
    {
        bourne::json value = object[enabledKey];




        ConfigNodePropertyBoolean* obj = &enabled;
		obj->fromJson(value.dump());

    }

    const char *fallbackPathsKey = "fallbackPaths";

    if(object.has_key(fallbackPathsKey))
    {
        bourne::json value = object[fallbackPathsKey];




        ConfigNodePropertyArray* obj = &fallbackPaths;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["enabled"] = getEnabled().toJson();






	object["fallbackPaths"] = getFallbackPaths().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties::getEnabled()
{
	return enabled;
}

void
ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties::setEnabled(ConfigNodePropertyBoolean enabled)
{
	this->enabled = enabled;
}

ConfigNodePropertyArray
ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties::getFallbackPaths()
{
	return fallbackPaths;
}

void
ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties::setFallbackPaths(ConfigNodePropertyArray fallbackPaths)
{
	this->fallbackPaths = fallbackPaths;
}



