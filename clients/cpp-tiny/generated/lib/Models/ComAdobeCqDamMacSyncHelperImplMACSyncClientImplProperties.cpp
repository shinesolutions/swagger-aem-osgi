

#include "ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties.h"

using namespace Tiny;

ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties::ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties()
{
	comadobedammacsyncclientsotimeout = ConfigNodePropertyInteger();
}

ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties::ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties::~ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties()
{

}

void
ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *comadobedammacsyncclientsotimeoutKey = "com.adobe.dam.mac.sync.client.so.timeout";

    if(object.has_key(comadobedammacsyncclientsotimeoutKey))
    {
        bourne::json value = object[comadobedammacsyncclientsotimeoutKey];




        ConfigNodePropertyInteger* obj = &comadobedammacsyncclientsotimeout;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["comadobedammacsyncclientsotimeout"] = getComadobedammacsyncclientsotimeout().toJson();


    return object;

}

ConfigNodePropertyInteger
ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties::getComadobedammacsyncclientsotimeout()
{
	return comadobedammacsyncclientsotimeout;
}

void
ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties::setComadobedammacsyncclientsotimeout(ConfigNodePropertyInteger comadobedammacsyncclientsotimeout)
{
	this->comadobedammacsyncclientsotimeout = comadobedammacsyncclientsotimeout;
}



