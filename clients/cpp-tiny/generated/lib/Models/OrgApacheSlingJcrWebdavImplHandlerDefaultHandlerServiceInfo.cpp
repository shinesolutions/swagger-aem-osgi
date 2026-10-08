

#include "OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo.h"

using namespace Tiny;

OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo::OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties();
}

OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo::OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo::~OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo()
{

}

void
OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties
OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo::setProperties(OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties properties)
{
	this->properties = properties;
}



