

#include "ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo.h"

using namespace Tiny;

ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo::ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties();
}

ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo::ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo::~ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo()
{

}

void
ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo::fromJson(std::string jsonObj)
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




        ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo::getPid()
{
	return pid;
}

void
ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo::getTitle()
{
	return title;
}

void
ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo::getDescription()
{
	return description;
}

void
ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties
ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo::getProperties()
{
	return properties;
}

void
ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo::setProperties(ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties properties)
{
	this->properties = properties;
}



