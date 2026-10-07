

#include "ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo.h"

using namespace Tiny;

ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo::ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties();
}

ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo::ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo::~ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo()
{

}

void
ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo::fromJson(std::string jsonObj)
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




        ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo::getPid()
{
	return pid;
}

void
ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo::getTitle()
{
	return title;
}

void
ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo::getDescription()
{
	return description;
}

void
ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties
ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo::getProperties()
{
	return properties;
}

void
ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo::setProperties(ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties properties)
{
	this->properties = properties;
}



