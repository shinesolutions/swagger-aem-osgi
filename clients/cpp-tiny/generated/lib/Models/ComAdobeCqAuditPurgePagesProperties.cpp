

#include "ComAdobeCqAuditPurgePagesProperties.h"

using namespace Tiny;

ComAdobeCqAuditPurgePagesProperties::ComAdobeCqAuditPurgePagesProperties()
{
	auditlogrulename = ConfigNodePropertyString();
	auditlogrulecontentpath = ConfigNodePropertyString();
	auditlogruleminimumage = ConfigNodePropertyInteger();
	auditlogruletypes = ConfigNodePropertyDropDown();
}

ComAdobeCqAuditPurgePagesProperties::ComAdobeCqAuditPurgePagesProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqAuditPurgePagesProperties::~ComAdobeCqAuditPurgePagesProperties()
{

}

void
ComAdobeCqAuditPurgePagesProperties::fromJson(std::string jsonObj)
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
ComAdobeCqAuditPurgePagesProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["auditlogrulename"] = getAuditlogrulename().toJson();






	object["auditlogrulecontentpath"] = getAuditlogrulecontentpath().toJson();






	object["auditlogruleminimumage"] = getAuditlogruleminimumage().toJson();






	object["auditlogruletypes"] = getAuditlogruletypes().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeCqAuditPurgePagesProperties::getAuditlogrulename()
{
	return auditlogrulename;
}

void
ComAdobeCqAuditPurgePagesProperties::setAuditlogrulename(ConfigNodePropertyString auditlogrulename)
{
	this->auditlogrulename = auditlogrulename;
}

ConfigNodePropertyString
ComAdobeCqAuditPurgePagesProperties::getAuditlogrulecontentpath()
{
	return auditlogrulecontentpath;
}

void
ComAdobeCqAuditPurgePagesProperties::setAuditlogrulecontentpath(ConfigNodePropertyString auditlogrulecontentpath)
{
	this->auditlogrulecontentpath = auditlogrulecontentpath;
}

ConfigNodePropertyInteger
ComAdobeCqAuditPurgePagesProperties::getAuditlogruleminimumage()
{
	return auditlogruleminimumage;
}

void
ComAdobeCqAuditPurgePagesProperties::setAuditlogruleminimumage(ConfigNodePropertyInteger auditlogruleminimumage)
{
	this->auditlogruleminimumage = auditlogruleminimumage;
}

ConfigNodePropertyDropDown
ComAdobeCqAuditPurgePagesProperties::getAuditlogruletypes()
{
	return auditlogruletypes;
}

void
ComAdobeCqAuditPurgePagesProperties::setAuditlogruletypes(ConfigNodePropertyDropDown auditlogruletypes)
{
	this->auditlogruletypes = auditlogruletypes;
}



