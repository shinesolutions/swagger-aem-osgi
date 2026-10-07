

#include "ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties.h"

using namespace Tiny;

ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties::ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties()
{
	cqdamwebdavversionlinkingenable = ConfigNodePropertyBoolean();
	cqdamwebdavversionlinkingschedulerperiod = ConfigNodePropertyInteger();
	cqdamwebdavversionlinkingstagingtimeout = ConfigNodePropertyInteger();
}

ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties::ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties::~ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties()
{

}

void
ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqdamwebdavversionlinkingenableKey = "cq.dam.webdav.version.linking.enable";

    if(object.has_key(cqdamwebdavversionlinkingenableKey))
    {
        bourne::json value = object[cqdamwebdavversionlinkingenableKey];




        ConfigNodePropertyBoolean* obj = &cqdamwebdavversionlinkingenable;
		obj->fromJson(value.dump());

    }

    const char *cqdamwebdavversionlinkingschedulerperiodKey = "cq.dam.webdav.version.linking.scheduler.period";

    if(object.has_key(cqdamwebdavversionlinkingschedulerperiodKey))
    {
        bourne::json value = object[cqdamwebdavversionlinkingschedulerperiodKey];




        ConfigNodePropertyInteger* obj = &cqdamwebdavversionlinkingschedulerperiod;
		obj->fromJson(value.dump());

    }

    const char *cqdamwebdavversionlinkingstagingtimeoutKey = "cq.dam.webdav.version.linking.staging.timeout";

    if(object.has_key(cqdamwebdavversionlinkingstagingtimeoutKey))
    {
        bourne::json value = object[cqdamwebdavversionlinkingstagingtimeoutKey];




        ConfigNodePropertyInteger* obj = &cqdamwebdavversionlinkingstagingtimeout;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqdamwebdavversionlinkingenable"] = getCqdamwebdavversionlinkingenable().toJson();






	object["cqdamwebdavversionlinkingschedulerperiod"] = getCqdamwebdavversionlinkingschedulerperiod().toJson();






	object["cqdamwebdavversionlinkingstagingtimeout"] = getCqdamwebdavversionlinkingstagingtimeout().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties::getCqdamwebdavversionlinkingenable()
{
	return cqdamwebdavversionlinkingenable;
}

void
ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties::setCqdamwebdavversionlinkingenable(ConfigNodePropertyBoolean cqdamwebdavversionlinkingenable)
{
	this->cqdamwebdavversionlinkingenable = cqdamwebdavversionlinkingenable;
}

ConfigNodePropertyInteger
ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties::getCqdamwebdavversionlinkingschedulerperiod()
{
	return cqdamwebdavversionlinkingschedulerperiod;
}

void
ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties::setCqdamwebdavversionlinkingschedulerperiod(ConfigNodePropertyInteger cqdamwebdavversionlinkingschedulerperiod)
{
	this->cqdamwebdavversionlinkingschedulerperiod = cqdamwebdavversionlinkingschedulerperiod;
}

ConfigNodePropertyInteger
ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties::getCqdamwebdavversionlinkingstagingtimeout()
{
	return cqdamwebdavversionlinkingstagingtimeout;
}

void
ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties::setCqdamwebdavversionlinkingstagingtimeout(ConfigNodePropertyInteger cqdamwebdavversionlinkingstagingtimeout)
{
	this->cqdamwebdavversionlinkingstagingtimeout = cqdamwebdavversionlinkingstagingtimeout;
}



