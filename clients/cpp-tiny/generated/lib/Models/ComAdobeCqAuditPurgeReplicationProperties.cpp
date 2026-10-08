

#include "ComAdobeCqAuditPurgeReplicationProperties.h"

using namespace Tiny;

ComAdobeCqAuditPurgeReplicationProperties::ComAdobeCqAuditPurgeReplicationProperties()
{
	auditlogrulename = ConfigNodePropertyString();
	auditlogrulecontentpath = ConfigNodePropertyString();
	auditlogruleminimumage = ConfigNodePropertyInteger();
	auditlogruletypes = ConfigNodePropertyDropDown();
}

ComAdobeCqAuditPurgeReplicationProperties::ComAdobeCqAuditPurgeReplicationProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqAuditPurgeReplicationProperties::~ComAdobeCqAuditPurgeReplicationProperties()
{

}

void
ComAdobeCqAuditPurgeReplicationProperties::fromJson(std::string jsonObj)
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
ComAdobeCqAuditPurgeReplicationProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["auditlogrulename"] = getAuditlogrulename().toJson();






	object["auditlogrulecontentpath"] = getAuditlogrulecontentpath().toJson();






	object["auditlogruleminimumage"] = getAuditlogruleminimumage().toJson();






	object["auditlogruletypes"] = getAuditlogruletypes().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeCqAuditPurgeReplicationProperties::getAuditlogrulename()
{
	return auditlogrulename;
}

void
ComAdobeCqAuditPurgeReplicationProperties::setAuditlogrulename(ConfigNodePropertyString auditlogrulename)
{
	this->auditlogrulename = auditlogrulename;
}

ConfigNodePropertyString
ComAdobeCqAuditPurgeReplicationProperties::getAuditlogrulecontentpath()
{
	return auditlogrulecontentpath;
}

void
ComAdobeCqAuditPurgeReplicationProperties::setAuditlogrulecontentpath(ConfigNodePropertyString auditlogrulecontentpath)
{
	this->auditlogrulecontentpath = auditlogrulecontentpath;
}

ConfigNodePropertyInteger
ComAdobeCqAuditPurgeReplicationProperties::getAuditlogruleminimumage()
{
	return auditlogruleminimumage;
}

void
ComAdobeCqAuditPurgeReplicationProperties::setAuditlogruleminimumage(ConfigNodePropertyInteger auditlogruleminimumage)
{
	this->auditlogruleminimumage = auditlogruleminimumage;
}

ConfigNodePropertyDropDown
ComAdobeCqAuditPurgeReplicationProperties::getAuditlogruletypes()
{
	return auditlogruletypes;
}

void
ComAdobeCqAuditPurgeReplicationProperties::setAuditlogruletypes(ConfigNodePropertyDropDown auditlogruletypes)
{
	this->auditlogruletypes = auditlogruletypes;
}



