

#include "OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo.h"

using namespace Tiny;

OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo::OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties();
}

OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo::OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo::~OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo()
{

}

void
OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties
OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo::setProperties(OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties properties)
{
	this->properties = properties;
}



