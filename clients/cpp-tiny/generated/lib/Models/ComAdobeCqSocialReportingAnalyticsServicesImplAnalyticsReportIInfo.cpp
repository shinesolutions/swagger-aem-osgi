

#include "ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo.h"

using namespace Tiny;

ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo::ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties();
}

ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo::ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo::~ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo()
{

}

void
ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties
ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo::setProperties(ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties properties)
{
	this->properties = properties;
}



