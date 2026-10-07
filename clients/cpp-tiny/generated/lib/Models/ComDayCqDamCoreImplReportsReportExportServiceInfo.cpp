

#include "ComDayCqDamCoreImplReportsReportExportServiceInfo.h"

using namespace Tiny;

ComDayCqDamCoreImplReportsReportExportServiceInfo::ComDayCqDamCoreImplReportsReportExportServiceInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamCoreImplReportsReportExportServiceProperties();
}

ComDayCqDamCoreImplReportsReportExportServiceInfo::ComDayCqDamCoreImplReportsReportExportServiceInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplReportsReportExportServiceInfo::~ComDayCqDamCoreImplReportsReportExportServiceInfo()
{

}

void
ComDayCqDamCoreImplReportsReportExportServiceInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamCoreImplReportsReportExportServiceProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplReportsReportExportServiceInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamCoreImplReportsReportExportServiceInfo::getPid()
{
	return pid;
}

void
ComDayCqDamCoreImplReportsReportExportServiceInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamCoreImplReportsReportExportServiceInfo::getTitle()
{
	return title;
}

void
ComDayCqDamCoreImplReportsReportExportServiceInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamCoreImplReportsReportExportServiceInfo::getDescription()
{
	return description;
}

void
ComDayCqDamCoreImplReportsReportExportServiceInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamCoreImplReportsReportExportServiceProperties
ComDayCqDamCoreImplReportsReportExportServiceInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamCoreImplReportsReportExportServiceInfo::setProperties(ComDayCqDamCoreImplReportsReportExportServiceProperties properties)
{
	this->properties = properties;
}



