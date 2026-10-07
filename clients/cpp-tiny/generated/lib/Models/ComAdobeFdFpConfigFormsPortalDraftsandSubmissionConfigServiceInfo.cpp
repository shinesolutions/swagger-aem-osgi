

#include "ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo.h"

using namespace Tiny;

ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo::ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties();
}

ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo::ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo::~ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo()
{

}

void
ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo::fromJson(std::string jsonObj)
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




        ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo::getPid()
{
	return pid;
}

void
ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo::getTitle()
{
	return title;
}

void
ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo::getDescription()
{
	return description;
}

void
ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties
ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo::getProperties()
{
	return properties;
}

void
ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo::setProperties(ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties properties)
{
	this->properties = properties;
}



