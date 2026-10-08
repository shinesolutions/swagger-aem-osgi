

#include "ComDayCqWcmDesignimporterDesignPackageImporterInfo.h"

using namespace Tiny;

ComDayCqWcmDesignimporterDesignPackageImporterInfo::ComDayCqWcmDesignimporterDesignPackageImporterInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqWcmDesignimporterDesignPackageImporterProperties();
}

ComDayCqWcmDesignimporterDesignPackageImporterInfo::ComDayCqWcmDesignimporterDesignPackageImporterInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmDesignimporterDesignPackageImporterInfo::~ComDayCqWcmDesignimporterDesignPackageImporterInfo()
{

}

void
ComDayCqWcmDesignimporterDesignPackageImporterInfo::fromJson(std::string jsonObj)
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




        ComDayCqWcmDesignimporterDesignPackageImporterProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmDesignimporterDesignPackageImporterInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqWcmDesignimporterDesignPackageImporterInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmDesignimporterDesignPackageImporterInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmDesignimporterDesignPackageImporterInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmDesignimporterDesignPackageImporterInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqWcmDesignimporterDesignPackageImporterInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmDesignimporterDesignPackageImporterInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqWcmDesignimporterDesignPackageImporterProperties
ComDayCqWcmDesignimporterDesignPackageImporterInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmDesignimporterDesignPackageImporterInfo::setProperties(ComDayCqWcmDesignimporterDesignPackageImporterProperties properties)
{
	this->properties = properties;
}



