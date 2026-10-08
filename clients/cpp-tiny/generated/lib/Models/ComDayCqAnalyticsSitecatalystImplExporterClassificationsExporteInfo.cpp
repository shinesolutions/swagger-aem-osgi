

#include "ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo.h"

using namespace Tiny;

ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo::ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties();
}

ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo::ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo::~ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo()
{

}

void
ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo::fromJson(std::string jsonObj)
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




        ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo::getPid()
{
	return pid;
}

void
ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo::getTitle()
{
	return title;
}

void
ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo::getDescription()
{
	return description;
}

void
ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties
ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo::getProperties()
{
	return properties;
}

void
ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo::setProperties(ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties properties)
{
	this->properties = properties;
}



