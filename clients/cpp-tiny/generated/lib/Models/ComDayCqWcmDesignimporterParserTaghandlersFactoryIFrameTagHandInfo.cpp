

#include "ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandInfo.h"

using namespace Tiny;

ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandInfo::ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandProperties();
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandInfo::ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandInfo::~ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandInfo()
{

}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandInfo::fromJson(std::string jsonObj)
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




        ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandProperties
ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandInfo::setProperties(ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandProperties properties)
{
	this->properties = properties;
}



