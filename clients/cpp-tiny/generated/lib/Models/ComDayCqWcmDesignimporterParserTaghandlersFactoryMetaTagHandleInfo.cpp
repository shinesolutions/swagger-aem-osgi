

#include "ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo.h"

using namespace Tiny;

ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo::ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleProperties();
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo::ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo::~ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo()
{

}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo::fromJson(std::string jsonObj)
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




        ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleProperties
ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo::setProperties(ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleProperties properties)
{
	this->properties = properties;
}



