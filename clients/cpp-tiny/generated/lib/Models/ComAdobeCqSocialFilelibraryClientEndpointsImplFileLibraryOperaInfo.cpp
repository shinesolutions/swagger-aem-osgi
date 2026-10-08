

#include "ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo.h"

using namespace Tiny;

ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo::ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties();
}

ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo::ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo::~ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo()
{

}

void
ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties
ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo::setProperties(ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties properties)
{
	this->properties = properties;
}



