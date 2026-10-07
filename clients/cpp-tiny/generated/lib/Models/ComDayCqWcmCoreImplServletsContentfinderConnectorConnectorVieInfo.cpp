

#include "ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo.h"

using namespace Tiny;

ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo::ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties();
}

ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo::ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo::~ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo()
{

}

void
ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo::fromJson(std::string jsonObj)
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




        ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties
ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo::setProperties(ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties properties)
{
	this->properties = properties;
}



