

#include "ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo.h"

using namespace Tiny;

ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo::ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties();
}

ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo::ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo::~ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo()
{

}

void
ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo::fromJson(std::string jsonObj)
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




        ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo::getPid()
{
	return pid;
}

void
ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo::getTitle()
{
	return title;
}

void
ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo::getDescription()
{
	return description;
}

void
ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties
ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo::getProperties()
{
	return properties;
}

void
ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo::setProperties(ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties properties)
{
	this->properties = properties;
}



