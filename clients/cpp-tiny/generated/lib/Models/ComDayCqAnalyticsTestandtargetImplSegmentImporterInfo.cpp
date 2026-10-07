

#include "ComDayCqAnalyticsTestandtargetImplSegmentImporterInfo.h"

using namespace Tiny;

ComDayCqAnalyticsTestandtargetImplSegmentImporterInfo::ComDayCqAnalyticsTestandtargetImplSegmentImporterInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties();
}

ComDayCqAnalyticsTestandtargetImplSegmentImporterInfo::ComDayCqAnalyticsTestandtargetImplSegmentImporterInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqAnalyticsTestandtargetImplSegmentImporterInfo::~ComDayCqAnalyticsTestandtargetImplSegmentImporterInfo()
{

}

void
ComDayCqAnalyticsTestandtargetImplSegmentImporterInfo::fromJson(std::string jsonObj)
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




        ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqAnalyticsTestandtargetImplSegmentImporterInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqAnalyticsTestandtargetImplSegmentImporterInfo::getPid()
{
	return pid;
}

void
ComDayCqAnalyticsTestandtargetImplSegmentImporterInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqAnalyticsTestandtargetImplSegmentImporterInfo::getTitle()
{
	return title;
}

void
ComDayCqAnalyticsTestandtargetImplSegmentImporterInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqAnalyticsTestandtargetImplSegmentImporterInfo::getDescription()
{
	return description;
}

void
ComDayCqAnalyticsTestandtargetImplSegmentImporterInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties
ComDayCqAnalyticsTestandtargetImplSegmentImporterInfo::getProperties()
{
	return properties;
}

void
ComDayCqAnalyticsTestandtargetImplSegmentImporterInfo::setProperties(ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties properties)
{
	this->properties = properties;
}



