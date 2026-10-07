

#include "ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo.h"

using namespace Tiny;

ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo::ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties();
}

ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo::ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo::~ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo()
{

}

void
ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo::getPid()
{
	return pid;
}

void
ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo::getTitle()
{
	return title;
}

void
ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo::getDescription()
{
	return description;
}

void
ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties
ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo::setProperties(ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties properties)
{
	this->properties = properties;
}



