

#include "ComDayCqReportingImplConfigServiceImplInfo.h"

using namespace Tiny;

ComDayCqReportingImplConfigServiceImplInfo::ComDayCqReportingImplConfigServiceImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqReportingImplConfigServiceImplProperties();
}

ComDayCqReportingImplConfigServiceImplInfo::ComDayCqReportingImplConfigServiceImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqReportingImplConfigServiceImplInfo::~ComDayCqReportingImplConfigServiceImplInfo()
{

}

void
ComDayCqReportingImplConfigServiceImplInfo::fromJson(std::string jsonObj)
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




        ComDayCqReportingImplConfigServiceImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqReportingImplConfigServiceImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqReportingImplConfigServiceImplInfo::getPid()
{
	return pid;
}

void
ComDayCqReportingImplConfigServiceImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqReportingImplConfigServiceImplInfo::getTitle()
{
	return title;
}

void
ComDayCqReportingImplConfigServiceImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqReportingImplConfigServiceImplInfo::getDescription()
{
	return description;
}

void
ComDayCqReportingImplConfigServiceImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqReportingImplConfigServiceImplProperties
ComDayCqReportingImplConfigServiceImplInfo::getProperties()
{
	return properties;
}

void
ComDayCqReportingImplConfigServiceImplInfo::setProperties(ComDayCqReportingImplConfigServiceImplProperties properties)
{
	this->properties = properties;
}



