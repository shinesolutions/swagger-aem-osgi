

#include "ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfo.h"

using namespace Tiny;

ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfo::ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties();
}

ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfo::ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfo::~ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfo()
{

}

void
ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfo::fromJson(std::string jsonObj)
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




        ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfo::getPid()
{
	return pid;
}

void
ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfo::getTitle()
{
	return title;
}

void
ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfo::getDescription()
{
	return description;
}

void
ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties
ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfo::getProperties()
{
	return properties;
}

void
ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfo::setProperties(ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties properties)
{
	this->properties = properties;
}



