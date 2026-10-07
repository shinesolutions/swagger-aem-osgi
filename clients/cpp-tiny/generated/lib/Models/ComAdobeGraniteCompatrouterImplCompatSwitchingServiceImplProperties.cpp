

#include "ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties.h"

using namespace Tiny;

ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties::ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties()
{
	compatgroups = ConfigNodePropertyArray();
	enabled = ConfigNodePropertyBoolean();
}

ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties::ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties::~ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties()
{

}

void
ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *compatgroupsKey = "compatgroups";

    if(object.has_key(compatgroupsKey))
    {
        bourne::json value = object[compatgroupsKey];




        ConfigNodePropertyArray* obj = &compatgroups;
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
ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["compatgroups"] = getCompatgroups().toJson();






	object["enabled"] = getEnabled().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties::getCompatgroups()
{
	return compatgroups;
}

void
ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties::setCompatgroups(ConfigNodePropertyArray compatgroups)
{
	this->compatgroups = compatgroups;
}

ConfigNodePropertyBoolean
ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties::getEnabled()
{
	return enabled;
}

void
ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties::setEnabled(ConfigNodePropertyBoolean enabled)
{
	this->enabled = enabled;
}



