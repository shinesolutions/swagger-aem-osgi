

#include "ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo.h"

using namespace Tiny;

ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo::ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties();
}

ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo::ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo::~ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo()
{

}

void
ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo::getPid()
{
	return pid;
}

void
ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo::getTitle()
{
	return title;
}

void
ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo::getDescription()
{
	return description;
}

void
ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties
ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo::setProperties(ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties properties)
{
	this->properties = properties;
}



