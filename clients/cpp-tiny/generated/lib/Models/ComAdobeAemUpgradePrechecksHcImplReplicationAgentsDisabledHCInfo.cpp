

#include "ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo.h"

using namespace Tiny;

ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo::ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties();
}

ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo::ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo::~ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo()
{

}

void
ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pidKey = "pid";

    if(object.has_key(pidKey))
    {
        bourne::json value = object[pidKey];



        jsonToValue(&pid, value, "std::string");


    }

    const char *titleKey = "title";

    if(object.has_key(titleKey))
    {
        bourne::json value = object[titleKey];



        jsonToValue(&title, value, "std::string");


    }

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


    }

    const char *propertiesKey = "properties";

    if(object.has_key(propertiesKey))
    {
        bourne::json value = object[propertiesKey];




        ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo::getPid()
{
	return pid;
}

void
ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo::getTitle()
{
	return title;
}

void
ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo::getDescription()
{
	return description;
}

void
ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties
ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo::getProperties()
{
	return properties;
}

void
ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo::setProperties(ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties properties)
{
	this->properties = properties;
}



