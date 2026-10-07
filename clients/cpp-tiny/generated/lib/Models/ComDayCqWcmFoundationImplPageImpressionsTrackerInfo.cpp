

#include "ComDayCqWcmFoundationImplPageImpressionsTrackerInfo.h"

using namespace Tiny;

ComDayCqWcmFoundationImplPageImpressionsTrackerInfo::ComDayCqWcmFoundationImplPageImpressionsTrackerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqWcmFoundationImplPageImpressionsTrackerProperties();
}

ComDayCqWcmFoundationImplPageImpressionsTrackerInfo::ComDayCqWcmFoundationImplPageImpressionsTrackerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmFoundationImplPageImpressionsTrackerInfo::~ComDayCqWcmFoundationImplPageImpressionsTrackerInfo()
{

}

void
ComDayCqWcmFoundationImplPageImpressionsTrackerInfo::fromJson(std::string jsonObj)
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




        ComDayCqWcmFoundationImplPageImpressionsTrackerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmFoundationImplPageImpressionsTrackerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqWcmFoundationImplPageImpressionsTrackerInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmFoundationImplPageImpressionsTrackerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmFoundationImplPageImpressionsTrackerInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmFoundationImplPageImpressionsTrackerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqWcmFoundationImplPageImpressionsTrackerInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmFoundationImplPageImpressionsTrackerInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqWcmFoundationImplPageImpressionsTrackerProperties
ComDayCqWcmFoundationImplPageImpressionsTrackerInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmFoundationImplPageImpressionsTrackerInfo::setProperties(ComDayCqWcmFoundationImplPageImpressionsTrackerProperties properties)
{
	this->properties = properties;
}



