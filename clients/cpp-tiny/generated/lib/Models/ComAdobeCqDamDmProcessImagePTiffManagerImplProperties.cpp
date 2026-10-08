

#include "ComAdobeCqDamDmProcessImagePTiffManagerImplProperties.h"

using namespace Tiny;

ComAdobeCqDamDmProcessImagePTiffManagerImplProperties::ComAdobeCqDamDmProcessImagePTiffManagerImplProperties()
{
	maxMemory = ConfigNodePropertyInteger();
}

ComAdobeCqDamDmProcessImagePTiffManagerImplProperties::ComAdobeCqDamDmProcessImagePTiffManagerImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqDamDmProcessImagePTiffManagerImplProperties::~ComAdobeCqDamDmProcessImagePTiffManagerImplProperties()
{

}

void
ComAdobeCqDamDmProcessImagePTiffManagerImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *maxMemoryKey = "maxMemory";

    if(object.has_key(maxMemoryKey))
    {
        bourne::json value = object[maxMemoryKey];




        ConfigNodePropertyInteger* obj = &maxMemory;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqDamDmProcessImagePTiffManagerImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["maxMemory"] = getMaxMemory().toJson();


    return object;

}

ConfigNodePropertyInteger
ComAdobeCqDamDmProcessImagePTiffManagerImplProperties::getMaxMemory()
{
	return maxMemory;
}

void
ComAdobeCqDamDmProcessImagePTiffManagerImplProperties::setMaxMemory(ConfigNodePropertyInteger maxMemory)
{
	this->maxMemory = maxMemory;
}



