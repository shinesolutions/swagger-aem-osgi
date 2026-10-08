

#include "ComDayCqWcmUndoUndoConfigProperties.h"

using namespace Tiny;

ComDayCqWcmUndoUndoConfigProperties::ComDayCqWcmUndoUndoConfigProperties()
{
	cqwcmundoenabled = ConfigNodePropertyBoolean();
	cqwcmundopath = ConfigNodePropertyString();
	cqwcmundovalidity = ConfigNodePropertyInteger();
	cqwcmundosteps = ConfigNodePropertyInteger();
	cqwcmundopersistence = ConfigNodePropertyString();
	cqwcmundopersistencemode = ConfigNodePropertyBoolean();
	cqwcmundomarkermode = ConfigNodePropertyString();
	cqwcmundowhitelist = ConfigNodePropertyArray();
	cqwcmundoblacklist = ConfigNodePropertyArray();
}

ComDayCqWcmUndoUndoConfigProperties::ComDayCqWcmUndoUndoConfigProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmUndoUndoConfigProperties::~ComDayCqWcmUndoUndoConfigProperties()
{

}

void
ComDayCqWcmUndoUndoConfigProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqwcmundoenabledKey = "cq.wcm.undo.enabled";

    if(object.has_key(cqwcmundoenabledKey))
    {
        bourne::json value = object[cqwcmundoenabledKey];




        ConfigNodePropertyBoolean* obj = &cqwcmundoenabled;
		obj->fromJson(value.dump());

    }

    const char *cqwcmundopathKey = "cq.wcm.undo.path";

    if(object.has_key(cqwcmundopathKey))
    {
        bourne::json value = object[cqwcmundopathKey];




        ConfigNodePropertyString* obj = &cqwcmundopath;
		obj->fromJson(value.dump());

    }

    const char *cqwcmundovalidityKey = "cq.wcm.undo.validity";

    if(object.has_key(cqwcmundovalidityKey))
    {
        bourne::json value = object[cqwcmundovalidityKey];




        ConfigNodePropertyInteger* obj = &cqwcmundovalidity;
		obj->fromJson(value.dump());

    }

    const char *cqwcmundostepsKey = "cq.wcm.undo.steps";

    if(object.has_key(cqwcmundostepsKey))
    {
        bourne::json value = object[cqwcmundostepsKey];




        ConfigNodePropertyInteger* obj = &cqwcmundosteps;
		obj->fromJson(value.dump());

    }

    const char *cqwcmundopersistenceKey = "cq.wcm.undo.persistence";

    if(object.has_key(cqwcmundopersistenceKey))
    {
        bourne::json value = object[cqwcmundopersistenceKey];




        ConfigNodePropertyString* obj = &cqwcmundopersistence;
		obj->fromJson(value.dump());

    }

    const char *cqwcmundopersistencemodeKey = "cq.wcm.undo.persistence.mode";

    if(object.has_key(cqwcmundopersistencemodeKey))
    {
        bourne::json value = object[cqwcmundopersistencemodeKey];




        ConfigNodePropertyBoolean* obj = &cqwcmundopersistencemode;
		obj->fromJson(value.dump());

    }

    const char *cqwcmundomarkermodeKey = "cq.wcm.undo.markermode";

    if(object.has_key(cqwcmundomarkermodeKey))
    {
        bourne::json value = object[cqwcmundomarkermodeKey];




        ConfigNodePropertyString* obj = &cqwcmundomarkermode;
		obj->fromJson(value.dump());

    }

    const char *cqwcmundowhitelistKey = "cq.wcm.undo.whitelist";

    if(object.has_key(cqwcmundowhitelistKey))
    {
        bourne::json value = object[cqwcmundowhitelistKey];




        ConfigNodePropertyArray* obj = &cqwcmundowhitelist;
		obj->fromJson(value.dump());

    }

    const char *cqwcmundoblacklistKey = "cq.wcm.undo.blacklist";

    if(object.has_key(cqwcmundoblacklistKey))
    {
        bourne::json value = object[cqwcmundoblacklistKey];




        ConfigNodePropertyArray* obj = &cqwcmundoblacklist;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmUndoUndoConfigProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqwcmundoenabled"] = getCqwcmundoenabled().toJson();






	object["cqwcmundopath"] = getCqwcmundopath().toJson();






	object["cqwcmundovalidity"] = getCqwcmundovalidity().toJson();






	object["cqwcmundosteps"] = getCqwcmundosteps().toJson();






	object["cqwcmundopersistence"] = getCqwcmundopersistence().toJson();






	object["cqwcmundopersistencemode"] = getCqwcmundopersistencemode().toJson();






	object["cqwcmundomarkermode"] = getCqwcmundomarkermode().toJson();






	object["cqwcmundowhitelist"] = getCqwcmundowhitelist().toJson();






	object["cqwcmundoblacklist"] = getCqwcmundoblacklist().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComDayCqWcmUndoUndoConfigProperties::getCqwcmundoenabled()
{
	return cqwcmundoenabled;
}

void
ComDayCqWcmUndoUndoConfigProperties::setCqwcmundoenabled(ConfigNodePropertyBoolean cqwcmundoenabled)
{
	this->cqwcmundoenabled = cqwcmundoenabled;
}

ConfigNodePropertyString
ComDayCqWcmUndoUndoConfigProperties::getCqwcmundopath()
{
	return cqwcmundopath;
}

void
ComDayCqWcmUndoUndoConfigProperties::setCqwcmundopath(ConfigNodePropertyString cqwcmundopath)
{
	this->cqwcmundopath = cqwcmundopath;
}

ConfigNodePropertyInteger
ComDayCqWcmUndoUndoConfigProperties::getCqwcmundovalidity()
{
	return cqwcmundovalidity;
}

void
ComDayCqWcmUndoUndoConfigProperties::setCqwcmundovalidity(ConfigNodePropertyInteger cqwcmundovalidity)
{
	this->cqwcmundovalidity = cqwcmundovalidity;
}

ConfigNodePropertyInteger
ComDayCqWcmUndoUndoConfigProperties::getCqwcmundosteps()
{
	return cqwcmundosteps;
}

void
ComDayCqWcmUndoUndoConfigProperties::setCqwcmundosteps(ConfigNodePropertyInteger cqwcmundosteps)
{
	this->cqwcmundosteps = cqwcmundosteps;
}

ConfigNodePropertyString
ComDayCqWcmUndoUndoConfigProperties::getCqwcmundopersistence()
{
	return cqwcmundopersistence;
}

void
ComDayCqWcmUndoUndoConfigProperties::setCqwcmundopersistence(ConfigNodePropertyString cqwcmundopersistence)
{
	this->cqwcmundopersistence = cqwcmundopersistence;
}

ConfigNodePropertyBoolean
ComDayCqWcmUndoUndoConfigProperties::getCqwcmundopersistencemode()
{
	return cqwcmundopersistencemode;
}

void
ComDayCqWcmUndoUndoConfigProperties::setCqwcmundopersistencemode(ConfigNodePropertyBoolean cqwcmundopersistencemode)
{
	this->cqwcmundopersistencemode = cqwcmundopersistencemode;
}

ConfigNodePropertyString
ComDayCqWcmUndoUndoConfigProperties::getCqwcmundomarkermode()
{
	return cqwcmundomarkermode;
}

void
ComDayCqWcmUndoUndoConfigProperties::setCqwcmundomarkermode(ConfigNodePropertyString cqwcmundomarkermode)
{
	this->cqwcmundomarkermode = cqwcmundomarkermode;
}

ConfigNodePropertyArray
ComDayCqWcmUndoUndoConfigProperties::getCqwcmundowhitelist()
{
	return cqwcmundowhitelist;
}

void
ComDayCqWcmUndoUndoConfigProperties::setCqwcmundowhitelist(ConfigNodePropertyArray cqwcmundowhitelist)
{
	this->cqwcmundowhitelist = cqwcmundowhitelist;
}

ConfigNodePropertyArray
ComDayCqWcmUndoUndoConfigProperties::getCqwcmundoblacklist()
{
	return cqwcmundoblacklist;
}

void
ComDayCqWcmUndoUndoConfigProperties::setCqwcmundoblacklist(ConfigNodePropertyArray cqwcmundoblacklist)
{
	this->cqwcmundoblacklist = cqwcmundoblacklist;
}



