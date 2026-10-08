

#include "ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties.h"

using namespace Tiny;

ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties::ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties()
{
	enabled = ConfigNodePropertyBoolean();
	disabledForGroups = ConfigNodePropertyArray();
}

ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties::ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties::~ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties()
{

}

void
ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *enabledKey = "enabled";

    if(object.has_key(enabledKey))
    {
        bourne::json value = object[enabledKey];




        ConfigNodePropertyBoolean* obj = &enabled;
		obj->fromJson(value.dump());

    }

    const char *disabledForGroupsKey = "disabledForGroups";

    if(object.has_key(disabledForGroupsKey))
    {
        bourne::json value = object[disabledForGroupsKey];




        ConfigNodePropertyArray* obj = &disabledForGroups;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["enabled"] = getEnabled().toJson();






	object["disabledForGroups"] = getDisabledForGroups().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties::getEnabled()
{
	return enabled;
}

void
ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties::setEnabled(ConfigNodePropertyBoolean enabled)
{
	this->enabled = enabled;
}

ConfigNodePropertyArray
ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties::getDisabledForGroups()
{
	return disabledForGroups;
}

void
ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties::setDisabledForGroups(ConfigNodePropertyArray disabledForGroups)
{
	this->disabledForGroups = disabledForGroups;
}



