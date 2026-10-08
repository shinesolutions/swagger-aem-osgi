

#include "GuideLocalizationServiceInfo.h"

using namespace Tiny;

GuideLocalizationServiceInfo::GuideLocalizationServiceInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = GuideLocalizationServiceProperties();
}

GuideLocalizationServiceInfo::GuideLocalizationServiceInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

GuideLocalizationServiceInfo::~GuideLocalizationServiceInfo()
{

}

void
GuideLocalizationServiceInfo::fromJson(std::string jsonObj)
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




        GuideLocalizationServiceProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
GuideLocalizationServiceInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
GuideLocalizationServiceInfo::getPid()
{
	return pid;
}

void
GuideLocalizationServiceInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
GuideLocalizationServiceInfo::getTitle()
{
	return title;
}

void
GuideLocalizationServiceInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
GuideLocalizationServiceInfo::getDescription()
{
	return description;
}

void
GuideLocalizationServiceInfo::setDescription(std::string description)
{
	this->description = description;
}

GuideLocalizationServiceProperties
GuideLocalizationServiceInfo::getProperties()
{
	return properties;
}

void
GuideLocalizationServiceInfo::setProperties(GuideLocalizationServiceProperties properties)
{
	this->properties = properties;
}



