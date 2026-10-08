

#include "ComDayCqMcmCampaignImplIntegrationConfigImplInfo.h"

using namespace Tiny;

ComDayCqMcmCampaignImplIntegrationConfigImplInfo::ComDayCqMcmCampaignImplIntegrationConfigImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqMcmCampaignImplIntegrationConfigImplProperties();
}

ComDayCqMcmCampaignImplIntegrationConfigImplInfo::ComDayCqMcmCampaignImplIntegrationConfigImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqMcmCampaignImplIntegrationConfigImplInfo::~ComDayCqMcmCampaignImplIntegrationConfigImplInfo()
{

}

void
ComDayCqMcmCampaignImplIntegrationConfigImplInfo::fromJson(std::string jsonObj)
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




        ComDayCqMcmCampaignImplIntegrationConfigImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqMcmCampaignImplIntegrationConfigImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqMcmCampaignImplIntegrationConfigImplInfo::getPid()
{
	return pid;
}

void
ComDayCqMcmCampaignImplIntegrationConfigImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqMcmCampaignImplIntegrationConfigImplInfo::getTitle()
{
	return title;
}

void
ComDayCqMcmCampaignImplIntegrationConfigImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqMcmCampaignImplIntegrationConfigImplInfo::getDescription()
{
	return description;
}

void
ComDayCqMcmCampaignImplIntegrationConfigImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqMcmCampaignImplIntegrationConfigImplProperties
ComDayCqMcmCampaignImplIntegrationConfigImplInfo::getProperties()
{
	return properties;
}

void
ComDayCqMcmCampaignImplIntegrationConfigImplInfo::setProperties(ComDayCqMcmCampaignImplIntegrationConfigImplProperties properties)
{
	this->properties = properties;
}



