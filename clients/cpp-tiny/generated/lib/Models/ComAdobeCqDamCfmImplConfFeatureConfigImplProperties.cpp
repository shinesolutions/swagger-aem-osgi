

#include "ComAdobeCqDamCfmImplConfFeatureConfigImplProperties.h"

using namespace Tiny;

ComAdobeCqDamCfmImplConfFeatureConfigImplProperties::ComAdobeCqDamCfmImplConfFeatureConfigImplProperties()
{
	damcfmresourceTypes = ConfigNodePropertyArray();
	damcfmreferenceProperties = ConfigNodePropertyArray();
}

ComAdobeCqDamCfmImplConfFeatureConfigImplProperties::ComAdobeCqDamCfmImplConfFeatureConfigImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqDamCfmImplConfFeatureConfigImplProperties::~ComAdobeCqDamCfmImplConfFeatureConfigImplProperties()
{

}

void
ComAdobeCqDamCfmImplConfFeatureConfigImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *damcfmresourceTypesKey = "dam.cfm.resourceTypes";

    if(object.has_key(damcfmresourceTypesKey))
    {
        bourne::json value = object[damcfmresourceTypesKey];




        ConfigNodePropertyArray* obj = &damcfmresourceTypes;
		obj->fromJson(value.dump());

    }

    const char *damcfmreferencePropertiesKey = "dam.cfm.referenceProperties";

    if(object.has_key(damcfmreferencePropertiesKey))
    {
        bourne::json value = object[damcfmreferencePropertiesKey];




        ConfigNodePropertyArray* obj = &damcfmreferenceProperties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqDamCfmImplConfFeatureConfigImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["damcfmresourceTypes"] = getDamcfmresourceTypes().toJson();






	object["damcfmreferenceProperties"] = getDamcfmreferenceProperties().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeCqDamCfmImplConfFeatureConfigImplProperties::getDamcfmresourceTypes()
{
	return damcfmresourceTypes;
}

void
ComAdobeCqDamCfmImplConfFeatureConfigImplProperties::setDamcfmresourceTypes(ConfigNodePropertyArray damcfmresourceTypes)
{
	this->damcfmresourceTypes = damcfmresourceTypes;
}

ConfigNodePropertyArray
ComAdobeCqDamCfmImplConfFeatureConfigImplProperties::getDamcfmreferenceProperties()
{
	return damcfmreferenceProperties;
}

void
ComAdobeCqDamCfmImplConfFeatureConfigImplProperties::setDamcfmreferenceProperties(ConfigNodePropertyArray damcfmreferenceProperties)
{
	this->damcfmreferenceProperties = damcfmreferenceProperties;
}



