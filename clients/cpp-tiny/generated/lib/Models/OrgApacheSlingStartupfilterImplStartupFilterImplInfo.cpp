

#include "OrgApacheSlingStartupfilterImplStartupFilterImplInfo.h"

using namespace Tiny;

OrgApacheSlingStartupfilterImplStartupFilterImplInfo::OrgApacheSlingStartupfilterImplStartupFilterImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingStartupfilterImplStartupFilterImplProperties();
}

OrgApacheSlingStartupfilterImplStartupFilterImplInfo::OrgApacheSlingStartupfilterImplStartupFilterImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingStartupfilterImplStartupFilterImplInfo::~OrgApacheSlingStartupfilterImplStartupFilterImplInfo()
{

}

void
OrgApacheSlingStartupfilterImplStartupFilterImplInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingStartupfilterImplStartupFilterImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingStartupfilterImplStartupFilterImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingStartupfilterImplStartupFilterImplInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingStartupfilterImplStartupFilterImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingStartupfilterImplStartupFilterImplInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingStartupfilterImplStartupFilterImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingStartupfilterImplStartupFilterImplInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingStartupfilterImplStartupFilterImplInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingStartupfilterImplStartupFilterImplProperties
OrgApacheSlingStartupfilterImplStartupFilterImplInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingStartupfilterImplStartupFilterImplInfo::setProperties(OrgApacheSlingStartupfilterImplStartupFilterImplProperties properties)
{
	this->properties = properties;
}



