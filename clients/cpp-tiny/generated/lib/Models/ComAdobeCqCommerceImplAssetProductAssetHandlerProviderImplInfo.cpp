

#include "ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo.h"

using namespace Tiny;

ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo::ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties();
}

ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo::ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo::~ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo()
{

}

void
ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo::getPid()
{
	return pid;
}

void
ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo::getTitle()
{
	return title;
}

void
ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo::getDescription()
{
	return description;
}

void
ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties
ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo::setProperties(ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties properties)
{
	this->properties = properties;
}



