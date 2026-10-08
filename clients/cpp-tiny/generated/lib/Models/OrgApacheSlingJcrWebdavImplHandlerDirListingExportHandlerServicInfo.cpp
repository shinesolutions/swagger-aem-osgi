

#include "OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo.h"

using namespace Tiny;

OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo::OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties();
}

OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo::OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo::~OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo()
{

}

void
OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties
OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo::setProperties(OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties properties)
{
	this->properties = properties;
}



