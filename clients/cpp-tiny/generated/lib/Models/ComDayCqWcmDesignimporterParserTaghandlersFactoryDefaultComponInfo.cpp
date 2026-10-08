

#include "ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponInfo.h"

using namespace Tiny;

ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponInfo::ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponProperties();
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponInfo::ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponInfo::~ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponInfo()
{

}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponInfo::fromJson(std::string jsonObj)
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




        ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponProperties
ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponInfo::setProperties(ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponProperties properties)
{
	this->properties = properties;
}



