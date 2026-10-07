

#include "AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo.h"

using namespace Tiny;

AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo::AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties();
}

AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo::AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo::~AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo()
{

}

void
AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo::fromJson(std::string jsonObj)
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




        AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo::getPid()
{
	return pid;
}

void
AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo::getTitle()
{
	return title;
}

void
AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo::getDescription()
{
	return description;
}

void
AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo::setDescription(std::string description)
{
	this->description = description;
}

AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties
AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo::getProperties()
{
	return properties;
}

void
AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo::setProperties(AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties properties)
{
	this->properties = properties;
}



