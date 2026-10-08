

#include "ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo.h"

using namespace Tiny;

ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo::ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties();
}

ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo::ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo::~ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo()
{

}

void
ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo::fromJson(std::string jsonObj)
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




        ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo::getPid()
{
	return pid;
}

void
ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo::getTitle()
{
	return title;
}

void
ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo::getDescription()
{
	return description;
}

void
ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties
ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo::getProperties()
{
	return properties;
}

void
ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo::setProperties(ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties properties)
{
	this->properties = properties;
}



