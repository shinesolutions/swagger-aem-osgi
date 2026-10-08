

#include "ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties.h"

using namespace Tiny;

ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties::ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties()
{
	hcname = ConfigNodePropertyString();
	hctags = ConfigNodePropertyArray();
	hcmbeanname = ConfigNodePropertyString();
}

ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties::ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties::~ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties()
{

}

void
ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties::fromJson(std::string jsonObj)
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
ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["hcname"] = getHcname().toJson();






	object["hctags"] = getHctags().toJson();






	object["hcmbeanname"] = getHcmbeanname().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties::getHcname()
{
	return hcname;
}

void
ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties::setHcname(ConfigNodePropertyString hcname)
{
	this->hcname = hcname;
}

ConfigNodePropertyArray
ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties::getHctags()
{
	return hctags;
}

void
ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties::setHctags(ConfigNodePropertyArray hctags)
{
	this->hctags = hctags;
}

ConfigNodePropertyString
ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties::getHcmbeanname()
{
	return hcmbeanname;
}

void
ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties::setHcmbeanname(ConfigNodePropertyString hcmbeanname)
{
	this->hcmbeanname = hcmbeanname;
}



