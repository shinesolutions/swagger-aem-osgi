

#include "ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties.h"

using namespace Tiny;

ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties::ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties()
{
	hcname = ConfigNodePropertyString();
	hctags = ConfigNodePropertyArray();
	hcmbeanname = ConfigNodePropertyString();
}

ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties::ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties::~ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties()
{

}

void
ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *hcnameKey = "hc.name";

    if(object.has_key(hcnameKey))
    {
        bourne::json value = object[hcnameKey];




        ConfigNodePropertyString* obj = &hcname;
		obj->fromJson(value.dump());

    }

    const char *hctagsKey = "hc.tags";

    if(object.has_key(hctagsKey))
    {
        bourne::json value = object[hctagsKey];




        ConfigNodePropertyArray* obj = &hctags;
		obj->fromJson(value.dump());

    }

    const char *hcmbeannameKey = "hc.mbean.name";

    if(object.has_key(hcmbeannameKey))
    {
        bourne::json value = object[hcmbeannameKey];




        ConfigNodePropertyString* obj = &hcmbeanname;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["hcname"] = getHcname().toJson();






	object["hctags"] = getHctags().toJson();






	object["hcmbeanname"] = getHcmbeanname().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties::getHcname()
{
	return hcname;
}

void
ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties::setHcname(ConfigNodePropertyString hcname)
{
	this->hcname = hcname;
}

ConfigNodePropertyArray
ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties::getHctags()
{
	return hctags;
}

void
ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties::setHctags(ConfigNodePropertyArray hctags)
{
	this->hctags = hctags;
}

ConfigNodePropertyString
ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties::getHcmbeanname()
{
	return hcmbeanname;
}

void
ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties::setHcmbeanname(ConfigNodePropertyString hcmbeanname)
{
	this->hcmbeanname = hcmbeanname;
}



