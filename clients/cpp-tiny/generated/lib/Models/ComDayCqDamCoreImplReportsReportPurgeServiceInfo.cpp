

#include "ComDayCqDamCoreImplReportsReportPurgeServiceInfo.h"

using namespace Tiny;

ComDayCqDamCoreImplReportsReportPurgeServiceInfo::ComDayCqDamCoreImplReportsReportPurgeServiceInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamCoreImplReportsReportPurgeServiceProperties();
}

ComDayCqDamCoreImplReportsReportPurgeServiceInfo::ComDayCqDamCoreImplReportsReportPurgeServiceInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplReportsReportPurgeServiceInfo::~ComDayCqDamCoreImplReportsReportPurgeServiceInfo()
{

}

void
ComDayCqDamCoreImplReportsReportPurgeServiceInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamCoreImplReportsReportPurgeServiceProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplReportsReportPurgeServiceInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamCoreImplReportsReportPurgeServiceInfo::getPid()
{
	return pid;
}

void
ComDayCqDamCoreImplReportsReportPurgeServiceInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamCoreImplReportsReportPurgeServiceInfo::getTitle()
{
	return title;
}

void
ComDayCqDamCoreImplReportsReportPurgeServiceInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamCoreImplReportsReportPurgeServiceInfo::getDescription()
{
	return description;
}

void
ComDayCqDamCoreImplReportsReportPurgeServiceInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamCoreImplReportsReportPurgeServiceProperties
ComDayCqDamCoreImplReportsReportPurgeServiceInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamCoreImplReportsReportPurgeServiceInfo::setProperties(ComDayCqDamCoreImplReportsReportPurgeServiceProperties properties)
{
	this->properties = properties;
}



