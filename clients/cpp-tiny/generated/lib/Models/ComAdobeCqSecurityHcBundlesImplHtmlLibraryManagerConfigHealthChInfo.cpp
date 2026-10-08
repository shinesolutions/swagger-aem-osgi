

#include "ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo.h"

using namespace Tiny;

ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo::ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties();
}

ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo::ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo::~ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo()
{

}

void
ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties
ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo::setProperties(ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties properties)
{
	this->properties = properties;
}



