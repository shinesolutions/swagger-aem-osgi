

#include "OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo.h"

using namespace Tiny;

OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo::OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties();
}

OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo::OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo::~OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo()
{

}

void
OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties
OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo::setProperties(OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties properties)
{
	this->properties = properties;
}



