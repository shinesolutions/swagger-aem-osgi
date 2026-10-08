

#include "ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo.h"

using namespace Tiny;

ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo::ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties();
}

ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo::ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo::~ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo()
{

}

void
ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties
ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo::setProperties(ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties properties)
{
	this->properties = properties;
}



