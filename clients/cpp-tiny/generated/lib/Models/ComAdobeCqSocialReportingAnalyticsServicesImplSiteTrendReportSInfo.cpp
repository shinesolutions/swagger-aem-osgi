

#include "ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo.h"

using namespace Tiny;

ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo::ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties();
}

ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo::ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo::~ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo()
{

}

void
ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties
ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo::setProperties(ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties properties)
{
	this->properties = properties;
}



