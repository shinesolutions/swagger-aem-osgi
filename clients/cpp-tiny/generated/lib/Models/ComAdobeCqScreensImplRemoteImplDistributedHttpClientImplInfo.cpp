

#include "ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo.h"

using namespace Tiny;

ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo::ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties();
}

ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo::ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo::~ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo()
{

}

void
ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo::getPid()
{
	return pid;
}

void
ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo::getTitle()
{
	return title;
}

void
ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo::getDescription()
{
	return description;
}

void
ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties
ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo::setProperties(ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties properties)
{
	this->properties = properties;
}



