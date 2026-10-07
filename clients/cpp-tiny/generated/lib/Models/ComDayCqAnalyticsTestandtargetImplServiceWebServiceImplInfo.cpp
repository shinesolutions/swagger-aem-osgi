

#include "ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo.h"

using namespace Tiny;

ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo::ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties();
}

ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo::ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo::~ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo()
{

}

void
ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo::fromJson(std::string jsonObj)
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




        ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo::getPid()
{
	return pid;
}

void
ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo::getTitle()
{
	return title;
}

void
ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo::getDescription()
{
	return description;
}

void
ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties
ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo::getProperties()
{
	return properties;
}

void
ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo::setProperties(ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties properties)
{
	this->properties = properties;
}



