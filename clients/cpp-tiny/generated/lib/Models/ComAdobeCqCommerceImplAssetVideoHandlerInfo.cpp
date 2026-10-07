

#include "ComAdobeCqCommerceImplAssetVideoHandlerInfo.h"

using namespace Tiny;

ComAdobeCqCommerceImplAssetVideoHandlerInfo::ComAdobeCqCommerceImplAssetVideoHandlerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqCommerceImplAssetVideoHandlerProperties();
}

ComAdobeCqCommerceImplAssetVideoHandlerInfo::ComAdobeCqCommerceImplAssetVideoHandlerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqCommerceImplAssetVideoHandlerInfo::~ComAdobeCqCommerceImplAssetVideoHandlerInfo()
{

}

void
ComAdobeCqCommerceImplAssetVideoHandlerInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqCommerceImplAssetVideoHandlerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqCommerceImplAssetVideoHandlerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqCommerceImplAssetVideoHandlerInfo::getPid()
{
	return pid;
}

void
ComAdobeCqCommerceImplAssetVideoHandlerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqCommerceImplAssetVideoHandlerInfo::getTitle()
{
	return title;
}

void
ComAdobeCqCommerceImplAssetVideoHandlerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqCommerceImplAssetVideoHandlerInfo::getDescription()
{
	return description;
}

void
ComAdobeCqCommerceImplAssetVideoHandlerInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqCommerceImplAssetVideoHandlerProperties
ComAdobeCqCommerceImplAssetVideoHandlerInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqCommerceImplAssetVideoHandlerInfo::setProperties(ComAdobeCqCommerceImplAssetVideoHandlerProperties properties)
{
	this->properties = properties;
}



