

#include "ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentInfo.h"

using namespace Tiny;

ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentInfo::ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties();
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentInfo::ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentInfo::~ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentInfo()
{

}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentInfo::fromJson(std::string jsonObj)
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




        ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties
ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentInfo::setProperties(ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties properties)
{
	this->properties = properties;
}



