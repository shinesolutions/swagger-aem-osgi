

#include "ComDayCqDamIdsImplIDSJobProcessorProperties.h"

using namespace Tiny;

ComDayCqDamIdsImplIDSJobProcessorProperties::ComDayCqDamIdsImplIDSJobProcessorProperties()
{
	enablemultisession = ConfigNodePropertyBoolean();
	idsccenable = ConfigNodePropertyBoolean();
	enableretry = ConfigNodePropertyBoolean();
	enableretryscripterror = ConfigNodePropertyBoolean();
	externalizerdomaincqhost = ConfigNodePropertyString();
	externalizerdomainhttp = ConfigNodePropertyString();
}

ComDayCqDamIdsImplIDSJobProcessorProperties::ComDayCqDamIdsImplIDSJobProcessorProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamIdsImplIDSJobProcessorProperties::~ComDayCqDamIdsImplIDSJobProcessorProperties()
{

}

void
ComDayCqDamIdsImplIDSJobProcessorProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *enablemultisessionKey = "enable.multisession";

    if(object.has_key(enablemultisessionKey))
    {
        bourne::json value = object[enablemultisessionKey];




        ConfigNodePropertyBoolean* obj = &enablemultisession;
		obj->fromJson(value.dump());

    }

    const char *idsccenableKey = "ids.cc.enable";

    if(object.has_key(idsccenableKey))
    {
        bourne::json value = object[idsccenableKey];




        ConfigNodePropertyBoolean* obj = &idsccenable;
		obj->fromJson(value.dump());

    }

    const char *enableretryKey = "enable.retry";

    if(object.has_key(enableretryKey))
    {
        bourne::json value = object[enableretryKey];




        ConfigNodePropertyBoolean* obj = &enableretry;
		obj->fromJson(value.dump());

    }

    const char *enableretryscripterrorKey = "enable.retry.scripterror";

    if(object.has_key(enableretryscripterrorKey))
    {
        bourne::json value = object[enableretryscripterrorKey];




        ConfigNodePropertyBoolean* obj = &enableretryscripterror;
		obj->fromJson(value.dump());

    }

    const char *externalizerdomaincqhostKey = "externalizer.domain.cqhost";

    if(object.has_key(externalizerdomaincqhostKey))
    {
        bourne::json value = object[externalizerdomaincqhostKey];




        ConfigNodePropertyString* obj = &externalizerdomaincqhost;
		obj->fromJson(value.dump());

    }

    const char *externalizerdomainhttpKey = "externalizer.domain.http";

    if(object.has_key(externalizerdomainhttpKey))
    {
        bourne::json value = object[externalizerdomainhttpKey];




        ConfigNodePropertyString* obj = &externalizerdomainhttp;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamIdsImplIDSJobProcessorProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["enablemultisession"] = getEnablemultisession().toJson();






	object["idsccenable"] = getIdsccenable().toJson();






	object["enableretry"] = getEnableretry().toJson();






	object["enableretryscripterror"] = getEnableretryscripterror().toJson();






	object["externalizerdomaincqhost"] = getExternalizerdomaincqhost().toJson();






	object["externalizerdomainhttp"] = getExternalizerdomainhttp().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComDayCqDamIdsImplIDSJobProcessorProperties::getEnablemultisession()
{
	return enablemultisession;
}

void
ComDayCqDamIdsImplIDSJobProcessorProperties::setEnablemultisession(ConfigNodePropertyBoolean enablemultisession)
{
	this->enablemultisession = enablemultisession;
}

ConfigNodePropertyBoolean
ComDayCqDamIdsImplIDSJobProcessorProperties::getIdsccenable()
{
	return idsccenable;
}

void
ComDayCqDamIdsImplIDSJobProcessorProperties::setIdsccenable(ConfigNodePropertyBoolean idsccenable)
{
	this->idsccenable = idsccenable;
}

ConfigNodePropertyBoolean
ComDayCqDamIdsImplIDSJobProcessorProperties::getEnableretry()
{
	return enableretry;
}

void
ComDayCqDamIdsImplIDSJobProcessorProperties::setEnableretry(ConfigNodePropertyBoolean enableretry)
{
	this->enableretry = enableretry;
}

ConfigNodePropertyBoolean
ComDayCqDamIdsImplIDSJobProcessorProperties::getEnableretryscripterror()
{
	return enableretryscripterror;
}

void
ComDayCqDamIdsImplIDSJobProcessorProperties::setEnableretryscripterror(ConfigNodePropertyBoolean enableretryscripterror)
{
	this->enableretryscripterror = enableretryscripterror;
}

ConfigNodePropertyString
ComDayCqDamIdsImplIDSJobProcessorProperties::getExternalizerdomaincqhost()
{
	return externalizerdomaincqhost;
}

void
ComDayCqDamIdsImplIDSJobProcessorProperties::setExternalizerdomaincqhost(ConfigNodePropertyString externalizerdomaincqhost)
{
	this->externalizerdomaincqhost = externalizerdomaincqhost;
}

ConfigNodePropertyString
ComDayCqDamIdsImplIDSJobProcessorProperties::getExternalizerdomainhttp()
{
	return externalizerdomainhttp;
}

void
ComDayCqDamIdsImplIDSJobProcessorProperties::setExternalizerdomainhttp(ConfigNodePropertyString externalizerdomainhttp)
{
	this->externalizerdomainhttp = externalizerdomainhttp;
}



