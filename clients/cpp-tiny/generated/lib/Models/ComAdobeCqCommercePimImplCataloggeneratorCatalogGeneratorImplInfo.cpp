

#include "ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo.h"

using namespace Tiny;

ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo::ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties();
}

ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo::ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo::~ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo()
{

}

void
ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo::getPid()
{
	return pid;
}

void
ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo::getTitle()
{
	return title;
}

void
ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo::getDescription()
{
	return description;
}

void
ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties
ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo::setProperties(ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties properties)
{
	this->properties = properties;
}



