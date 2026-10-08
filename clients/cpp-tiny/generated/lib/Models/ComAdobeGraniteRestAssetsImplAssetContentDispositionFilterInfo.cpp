

#include "ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo.h"

using namespace Tiny;

ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo::ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties();
}

ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo::ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo::~ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo()
{

}

void
ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties
ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo::setProperties(ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties properties)
{
	this->properties = properties;
}



