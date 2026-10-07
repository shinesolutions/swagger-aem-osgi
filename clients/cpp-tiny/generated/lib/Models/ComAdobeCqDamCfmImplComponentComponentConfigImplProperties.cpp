

#include "ComAdobeCqDamCfmImplComponentComponentConfigImplProperties.h"

using namespace Tiny;

ComAdobeCqDamCfmImplComponentComponentConfigImplProperties::ComAdobeCqDamCfmImplComponentComponentConfigImplProperties()
{
	damcfmcomponentresourceType = ConfigNodePropertyString();
	damcfmcomponentfileReferenceProp = ConfigNodePropertyString();
	damcfmcomponentelementsProp = ConfigNodePropertyString();
	damcfmcomponentvariationProp = ConfigNodePropertyString();
}

ComAdobeCqDamCfmImplComponentComponentConfigImplProperties::ComAdobeCqDamCfmImplComponentComponentConfigImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqDamCfmImplComponentComponentConfigImplProperties::~ComAdobeCqDamCfmImplComponentComponentConfigImplProperties()
{

}

void
ComAdobeCqDamCfmImplComponentComponentConfigImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *damcfmcomponentresourceTypeKey = "dam.cfm.component.resourceType";

    if(object.has_key(damcfmcomponentresourceTypeKey))
    {
        bourne::json value = object[damcfmcomponentresourceTypeKey];




        ConfigNodePropertyString* obj = &damcfmcomponentresourceType;
		obj->fromJson(value.dump());

    }

    const char *damcfmcomponentfileReferencePropKey = "dam.cfm.component.fileReferenceProp";

    if(object.has_key(damcfmcomponentfileReferencePropKey))
    {
        bourne::json value = object[damcfmcomponentfileReferencePropKey];




        ConfigNodePropertyString* obj = &damcfmcomponentfileReferenceProp;
		obj->fromJson(value.dump());

    }

    const char *damcfmcomponentelementsPropKey = "dam.cfm.component.elementsProp";

    if(object.has_key(damcfmcomponentelementsPropKey))
    {
        bourne::json value = object[damcfmcomponentelementsPropKey];




        ConfigNodePropertyString* obj = &damcfmcomponentelementsProp;
		obj->fromJson(value.dump());

    }

    const char *damcfmcomponentvariationPropKey = "dam.cfm.component.variationProp";

    if(object.has_key(damcfmcomponentvariationPropKey))
    {
        bourne::json value = object[damcfmcomponentvariationPropKey];




        ConfigNodePropertyString* obj = &damcfmcomponentvariationProp;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqDamCfmImplComponentComponentConfigImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["damcfmcomponentresourceType"] = getDamcfmcomponentresourceType().toJson();






	object["damcfmcomponentfileReferenceProp"] = getDamcfmcomponentfileReferenceProp().toJson();






	object["damcfmcomponentelementsProp"] = getDamcfmcomponentelementsProp().toJson();






	object["damcfmcomponentvariationProp"] = getDamcfmcomponentvariationProp().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeCqDamCfmImplComponentComponentConfigImplProperties::getDamcfmcomponentresourceType()
{
	return damcfmcomponentresourceType;
}

void
ComAdobeCqDamCfmImplComponentComponentConfigImplProperties::setDamcfmcomponentresourceType(ConfigNodePropertyString damcfmcomponentresourceType)
{
	this->damcfmcomponentresourceType = damcfmcomponentresourceType;
}

ConfigNodePropertyString
ComAdobeCqDamCfmImplComponentComponentConfigImplProperties::getDamcfmcomponentfileReferenceProp()
{
	return damcfmcomponentfileReferenceProp;
}

void
ComAdobeCqDamCfmImplComponentComponentConfigImplProperties::setDamcfmcomponentfileReferenceProp(ConfigNodePropertyString damcfmcomponentfileReferenceProp)
{
	this->damcfmcomponentfileReferenceProp = damcfmcomponentfileReferenceProp;
}

ConfigNodePropertyString
ComAdobeCqDamCfmImplComponentComponentConfigImplProperties::getDamcfmcomponentelementsProp()
{
	return damcfmcomponentelementsProp;
}

void
ComAdobeCqDamCfmImplComponentComponentConfigImplProperties::setDamcfmcomponentelementsProp(ConfigNodePropertyString damcfmcomponentelementsProp)
{
	this->damcfmcomponentelementsProp = damcfmcomponentelementsProp;
}

ConfigNodePropertyString
ComAdobeCqDamCfmImplComponentComponentConfigImplProperties::getDamcfmcomponentvariationProp()
{
	return damcfmcomponentvariationProp;
}

void
ComAdobeCqDamCfmImplComponentComponentConfigImplProperties::setDamcfmcomponentvariationProp(ConfigNodePropertyString damcfmcomponentvariationProp)
{
	this->damcfmcomponentvariationProp = damcfmcomponentvariationProp;
}



