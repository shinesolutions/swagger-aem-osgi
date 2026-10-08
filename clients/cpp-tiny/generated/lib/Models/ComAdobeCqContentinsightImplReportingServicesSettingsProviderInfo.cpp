

#include "ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo.h"

using namespace Tiny;

ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo::ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties();
}

ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo::ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo::~ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo()
{

}

void
ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo::getPid()
{
	return pid;
}

void
ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo::getTitle()
{
	return title;
}

void
ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo::getDescription()
{
	return description;
}

void
ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties
ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo::setProperties(ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties properties)
{
	this->properties = properties;
}



