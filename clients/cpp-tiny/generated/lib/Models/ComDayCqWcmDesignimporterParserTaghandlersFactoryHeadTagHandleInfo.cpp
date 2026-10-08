

#include "ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleInfo.h"

using namespace Tiny;

ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleInfo::ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties();
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleInfo::ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleInfo::~ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleInfo()
{

}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleInfo::fromJson(std::string jsonObj)
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




        ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties
ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleInfo::setProperties(ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties properties)
{
	this->properties = properties;
}



