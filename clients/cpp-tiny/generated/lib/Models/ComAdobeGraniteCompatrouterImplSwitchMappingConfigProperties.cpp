

#include "ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties.h"

using namespace Tiny;

ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties::ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties()
{
	group = ConfigNodePropertyString();
	ids = ConfigNodePropertyArray();
}

ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties::ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties::~ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties()
{

}

void
ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *groupKey = "group";

    if(object.has_key(groupKey))
    {
        bourne::json value = object[groupKey];




        ConfigNodePropertyString* obj = &group;
		obj->fromJson(value.dump());

    }

    const char *idsKey = "ids";

    if(object.has_key(idsKey))
    {
        bourne::json value = object[idsKey];




        ConfigNodePropertyArray* obj = &ids;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["group"] = getGroup().toJson();






	object["ids"] = getIds().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties::getGroup()
{
	return group;
}

void
ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties::setGroup(ConfigNodePropertyString group)
{
	this->group = group;
}

ConfigNodePropertyArray
ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties::getIds()
{
	return ids;
}

void
ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties::setIds(ConfigNodePropertyArray ids)
{
	this->ids = ids;
}



