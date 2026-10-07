

#include "ComAdobeAemTransactionCoreImplTransactionRecorderInfo.h"

using namespace Tiny;

ComAdobeAemTransactionCoreImplTransactionRecorderInfo::ComAdobeAemTransactionCoreImplTransactionRecorderInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeAemTransactionCoreImplTransactionRecorderProperties();
}

ComAdobeAemTransactionCoreImplTransactionRecorderInfo::ComAdobeAemTransactionCoreImplTransactionRecorderInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeAemTransactionCoreImplTransactionRecorderInfo::~ComAdobeAemTransactionCoreImplTransactionRecorderInfo()
{

}

void
ComAdobeAemTransactionCoreImplTransactionRecorderInfo::fromJson(std::string jsonObj)
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




        ComAdobeAemTransactionCoreImplTransactionRecorderProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeAemTransactionCoreImplTransactionRecorderInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeAemTransactionCoreImplTransactionRecorderInfo::getPid()
{
	return pid;
}

void
ComAdobeAemTransactionCoreImplTransactionRecorderInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeAemTransactionCoreImplTransactionRecorderInfo::getTitle()
{
	return title;
}

void
ComAdobeAemTransactionCoreImplTransactionRecorderInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeAemTransactionCoreImplTransactionRecorderInfo::getDescription()
{
	return description;
}

void
ComAdobeAemTransactionCoreImplTransactionRecorderInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeAemTransactionCoreImplTransactionRecorderProperties
ComAdobeAemTransactionCoreImplTransactionRecorderInfo::getProperties()
{
	return properties;
}

void
ComAdobeAemTransactionCoreImplTransactionRecorderInfo::setProperties(ComAdobeAemTransactionCoreImplTransactionRecorderProperties properties)
{
	this->properties = properties;
}



