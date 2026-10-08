

#include "ComAdobeGraniteCsrfImplCSRFServletInfo.h"

using namespace Tiny;

ComAdobeGraniteCsrfImplCSRFServletInfo::ComAdobeGraniteCsrfImplCSRFServletInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteCsrfImplCSRFServletProperties();
}

ComAdobeGraniteCsrfImplCSRFServletInfo::ComAdobeGraniteCsrfImplCSRFServletInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteCsrfImplCSRFServletInfo::~ComAdobeGraniteCsrfImplCSRFServletInfo()
{

}

void
ComAdobeGraniteCsrfImplCSRFServletInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteCsrfImplCSRFServletProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteCsrfImplCSRFServletInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteCsrfImplCSRFServletInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteCsrfImplCSRFServletInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteCsrfImplCSRFServletInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteCsrfImplCSRFServletInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteCsrfImplCSRFServletInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteCsrfImplCSRFServletInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteCsrfImplCSRFServletProperties
ComAdobeGraniteCsrfImplCSRFServletInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteCsrfImplCSRFServletInfo::setProperties(ComAdobeGraniteCsrfImplCSRFServletProperties properties)
{
	this->properties = properties;
}



