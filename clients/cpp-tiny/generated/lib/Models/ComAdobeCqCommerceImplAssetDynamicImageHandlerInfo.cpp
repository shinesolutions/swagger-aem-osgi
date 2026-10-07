

#include "ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo.h"

using namespace Tiny;

ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo::ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties();
}

ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo::ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo::~ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo()
{

}

void
ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo::getPid()
{
	return pid;
}

void
ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo::getTitle()
{
	return title;
}

void
ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo::getDescription()
{
	return description;
}

void
ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties
ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo::setProperties(ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties properties)
{
	this->properties = properties;
}



