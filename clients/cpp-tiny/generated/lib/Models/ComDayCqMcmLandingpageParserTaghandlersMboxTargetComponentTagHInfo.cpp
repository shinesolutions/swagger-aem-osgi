

#include "ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo.h"

using namespace Tiny;

ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo::ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties();
}

ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo::ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo::~ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo()
{

}

void
ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo::fromJson(std::string jsonObj)
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




        ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo::getPid()
{
	return pid;
}

void
ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo::getTitle()
{
	return title;
}

void
ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo::getDescription()
{
	return description;
}

void
ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties
ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo::getProperties()
{
	return properties;
}

void
ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo::setProperties(ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties properties)
{
	this->properties = properties;
}



