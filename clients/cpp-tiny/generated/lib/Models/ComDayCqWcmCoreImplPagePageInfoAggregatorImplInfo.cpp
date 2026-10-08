

#include "ComDayCqWcmCoreImplPagePageInfoAggregatorImplInfo.h"

using namespace Tiny;

ComDayCqWcmCoreImplPagePageInfoAggregatorImplInfo::ComDayCqWcmCoreImplPagePageInfoAggregatorImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties();
}

ComDayCqWcmCoreImplPagePageInfoAggregatorImplInfo::ComDayCqWcmCoreImplPagePageInfoAggregatorImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmCoreImplPagePageInfoAggregatorImplInfo::~ComDayCqWcmCoreImplPagePageInfoAggregatorImplInfo()
{

}

void
ComDayCqWcmCoreImplPagePageInfoAggregatorImplInfo::fromJson(std::string jsonObj)
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




        ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmCoreImplPagePageInfoAggregatorImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqWcmCoreImplPagePageInfoAggregatorImplInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmCoreImplPagePageInfoAggregatorImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmCoreImplPagePageInfoAggregatorImplInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmCoreImplPagePageInfoAggregatorImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqWcmCoreImplPagePageInfoAggregatorImplInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmCoreImplPagePageInfoAggregatorImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties
ComDayCqWcmCoreImplPagePageInfoAggregatorImplInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmCoreImplPagePageInfoAggregatorImplInfo::setProperties(ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties properties)
{
	this->properties = properties;
}



