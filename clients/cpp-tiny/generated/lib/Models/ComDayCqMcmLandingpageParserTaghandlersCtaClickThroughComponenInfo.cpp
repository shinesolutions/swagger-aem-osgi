

#include "ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo.h"

using namespace Tiny;

ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo::ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties();
}

ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo::ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo::~ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo()
{

}

void
ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo::fromJson(std::string jsonObj)
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




        ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo::getPid()
{
	return pid;
}

void
ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo::getTitle()
{
	return title;
}

void
ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo::getDescription()
{
	return description;
}

void
ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties
ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo::getProperties()
{
	return properties;
}

void
ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo::setProperties(ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties properties)
{
	this->properties = properties;
}



