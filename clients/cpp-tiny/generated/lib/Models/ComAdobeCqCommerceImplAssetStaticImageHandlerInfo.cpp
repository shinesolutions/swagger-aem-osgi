

#include "ComAdobeCqCommerceImplAssetStaticImageHandlerInfo.h"

using namespace Tiny;

ComAdobeCqCommerceImplAssetStaticImageHandlerInfo::ComAdobeCqCommerceImplAssetStaticImageHandlerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqCommerceImplAssetStaticImageHandlerProperties();
}

ComAdobeCqCommerceImplAssetStaticImageHandlerInfo::ComAdobeCqCommerceImplAssetStaticImageHandlerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqCommerceImplAssetStaticImageHandlerInfo::~ComAdobeCqCommerceImplAssetStaticImageHandlerInfo()
{

}

void
ComAdobeCqCommerceImplAssetStaticImageHandlerInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqCommerceImplAssetStaticImageHandlerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqCommerceImplAssetStaticImageHandlerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqCommerceImplAssetStaticImageHandlerInfo::getPid()
{
	return pid;
}

void
ComAdobeCqCommerceImplAssetStaticImageHandlerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqCommerceImplAssetStaticImageHandlerInfo::getTitle()
{
	return title;
}

void
ComAdobeCqCommerceImplAssetStaticImageHandlerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqCommerceImplAssetStaticImageHandlerInfo::getDescription()
{
	return description;
}

void
ComAdobeCqCommerceImplAssetStaticImageHandlerInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqCommerceImplAssetStaticImageHandlerProperties
ComAdobeCqCommerceImplAssetStaticImageHandlerInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqCommerceImplAssetStaticImageHandlerInfo::setProperties(ComAdobeCqCommerceImplAssetStaticImageHandlerProperties properties)
{
	this->properties = properties;
}



