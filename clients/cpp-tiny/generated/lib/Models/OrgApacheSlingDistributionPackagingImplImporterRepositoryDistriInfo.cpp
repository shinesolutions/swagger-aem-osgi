

#include "OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo.h"

using namespace Tiny;

OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo::OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties();
}

OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo::OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo::~OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo()
{

}

void
OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties
OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo::setProperties(OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties properties)
{
	this->properties = properties;
}



