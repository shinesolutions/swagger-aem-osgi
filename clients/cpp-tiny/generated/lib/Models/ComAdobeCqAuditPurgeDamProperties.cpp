

#include "ComAdobeCqAuditPurgeDamProperties.h"

using namespace Tiny;

ComAdobeCqAuditPurgeDamProperties::ComAdobeCqAuditPurgeDamProperties()
{
	auditlogrulename = ConfigNodePropertyString();
	auditlogrulecontentpath = ConfigNodePropertyString();
	auditlogruleminimumage = ConfigNodePropertyInteger();
	auditlogruletypes = ConfigNodePropertyDropDown();
}

ComAdobeCqAuditPurgeDamProperties::ComAdobeCqAuditPurgeDamProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqAuditPurgeDamProperties::~ComAdobeCqAuditPurgeDamProperties()
{

}

void
ComAdobeCqAuditPurgeDamProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *auditlogrulenameKey = "auditlog.rule.name";

    if(object.has_key(auditlogrulenameKey))
    {
        bourne::json value = object[auditlogrulenameKey];




        ConfigNodePropertyString* obj = &auditlogrulename;
		obj->fromJson(value.dump());

    }

    const char *auditlogrulecontentpathKey = "auditlog.rule.contentpath";

    if(object.has_key(auditlogrulecontentpathKey))
    {
        bourne::json value = object[auditlogrulecontentpathKey];




        ConfigNodePropertyString* obj = &auditlogrulecontentpath;
		obj->fromJson(value.dump());

    }

    const char *auditlogruleminimumageKey = "auditlog.rule.minimumage";

    if(object.has_key(auditlogruleminimumageKey))
    {
        bourne::json value = object[auditlogruleminimumageKey];




        ConfigNodePropertyInteger* obj = &auditlogruleminimumage;
		obj->fromJson(value.dump());

    }

    const char *auditlogruletypesKey = "auditlog.rule.types";

    if(object.has_key(auditlogruletypesKey))
    {
        bourne::json value = object[auditlogruletypesKey];




        ConfigNodePropertyDropDown* obj = &auditlogruletypes;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqAuditPurgeDamProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["auditlogrulename"] = getAuditlogrulename().toJson();






	object["auditlogrulecontentpath"] = getAuditlogrulecontentpath().toJson();






	object["auditlogruleminimumage"] = getAuditlogruleminimumage().toJson();






	object["auditlogruletypes"] = getAuditlogruletypes().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeCqAuditPurgeDamProperties::getAuditlogrulename()
{
	return auditlogrulename;
}

void
ComAdobeCqAuditPurgeDamProperties::setAuditlogrulename(ConfigNodePropertyString auditlogrulename)
{
	this->auditlogrulename = auditlogrulename;
}

ConfigNodePropertyString
ComAdobeCqAuditPurgeDamProperties::getAuditlogrulecontentpath()
{
	return auditlogrulecontentpath;
}

void
ComAdobeCqAuditPurgeDamProperties::setAuditlogrulecontentpath(ConfigNodePropertyString auditlogrulecontentpath)
{
	this->auditlogrulecontentpath = auditlogrulecontentpath;
}

ConfigNodePropertyInteger
ComAdobeCqAuditPurgeDamProperties::getAuditlogruleminimumage()
{
	return auditlogruleminimumage;
}

void
ComAdobeCqAuditPurgeDamProperties::setAuditlogruleminimumage(ConfigNodePropertyInteger auditlogruleminimumage)
{
	this->auditlogruleminimumage = auditlogruleminimumage;
}

ConfigNodePropertyDropDown
ComAdobeCqAuditPurgeDamProperties::getAuditlogruletypes()
{
	return auditlogruletypes;
}

void
ComAdobeCqAuditPurgeDamProperties::setAuditlogruletypes(ConfigNodePropertyDropDown auditlogruletypes)
{
	this->auditlogruletypes = auditlogruletypes;
}



