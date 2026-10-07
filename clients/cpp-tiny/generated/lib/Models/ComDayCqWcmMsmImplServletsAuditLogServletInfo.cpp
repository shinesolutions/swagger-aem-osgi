

#include "ComDayCqWcmMsmImplServletsAuditLogServletInfo.h"

using namespace Tiny;

ComDayCqWcmMsmImplServletsAuditLogServletInfo::ComDayCqWcmMsmImplServletsAuditLogServletInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqWcmMsmImplServletsAuditLogServletProperties();
}

ComDayCqWcmMsmImplServletsAuditLogServletInfo::ComDayCqWcmMsmImplServletsAuditLogServletInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmMsmImplServletsAuditLogServletInfo::~ComDayCqWcmMsmImplServletsAuditLogServletInfo()
{

}

void
ComDayCqWcmMsmImplServletsAuditLogServletInfo::fromJson(std::string jsonObj)
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




        ComDayCqWcmMsmImplServletsAuditLogServletProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmMsmImplServletsAuditLogServletInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqWcmMsmImplServletsAuditLogServletInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmMsmImplServletsAuditLogServletInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmMsmImplServletsAuditLogServletInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmMsmImplServletsAuditLogServletInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqWcmMsmImplServletsAuditLogServletInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmMsmImplServletsAuditLogServletInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqWcmMsmImplServletsAuditLogServletProperties
ComDayCqWcmMsmImplServletsAuditLogServletInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmMsmImplServletsAuditLogServletInfo::setProperties(ComDayCqWcmMsmImplServletsAuditLogServletProperties properties)
{
	this->properties = properties;
}



