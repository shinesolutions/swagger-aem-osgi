

#include "ComDayCqWcmMsmImplServletsAuditLogServletProperties.h"

using namespace Tiny;

ComDayCqWcmMsmImplServletsAuditLogServletProperties::ComDayCqWcmMsmImplServletsAuditLogServletProperties()
{
	auditlogservletdefaulteventscount = ConfigNodePropertyInteger();
	auditlogservletdefaultpath = ConfigNodePropertyString();
}

ComDayCqWcmMsmImplServletsAuditLogServletProperties::ComDayCqWcmMsmImplServletsAuditLogServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmMsmImplServletsAuditLogServletProperties::~ComDayCqWcmMsmImplServletsAuditLogServletProperties()
{

}

void
ComDayCqWcmMsmImplServletsAuditLogServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *auditlogservletdefaulteventscountKey = "auditlogservlet.default.events.count";

    if(object.has_key(auditlogservletdefaulteventscountKey))
    {
        bourne::json value = object[auditlogservletdefaulteventscountKey];




        ConfigNodePropertyInteger* obj = &auditlogservletdefaulteventscount;
		obj->fromJson(value.dump());

    }

    const char *auditlogservletdefaultpathKey = "auditlogservlet.default.path";

    if(object.has_key(auditlogservletdefaultpathKey))
    {
        bourne::json value = object[auditlogservletdefaultpathKey];




        ConfigNodePropertyString* obj = &auditlogservletdefaultpath;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmMsmImplServletsAuditLogServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["auditlogservletdefaulteventscount"] = getAuditlogservletdefaulteventscount().toJson();






	object["auditlogservletdefaultpath"] = getAuditlogservletdefaultpath().toJson();


    return object;

}

ConfigNodePropertyInteger
ComDayCqWcmMsmImplServletsAuditLogServletProperties::getAuditlogservletdefaulteventscount()
{
	return auditlogservletdefaulteventscount;
}

void
ComDayCqWcmMsmImplServletsAuditLogServletProperties::setAuditlogservletdefaulteventscount(ConfigNodePropertyInteger auditlogservletdefaulteventscount)
{
	this->auditlogservletdefaulteventscount = auditlogservletdefaulteventscount;
}

ConfigNodePropertyString
ComDayCqWcmMsmImplServletsAuditLogServletProperties::getAuditlogservletdefaultpath()
{
	return auditlogservletdefaultpath;
}

void
ComDayCqWcmMsmImplServletsAuditLogServletProperties::setAuditlogservletdefaultpath(ConfigNodePropertyString auditlogservletdefaultpath)
{
	this->auditlogservletdefaultpath = auditlogservletdefaultpath;
}



