

#include "ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties.h"

using namespace Tiny;

ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties::ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties()
{
	hctags = ConfigNodePropertyArray();
}

ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties::ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties::~ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties()
{

}

void
ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *hctagsKey = "hc.tags";

    if(object.has_key(hctagsKey))
    {
        bourne::json value = object[hctagsKey];




        ConfigNodePropertyArray* obj = &hctags;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["hctags"] = getHctags().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties::getHctags()
{
	return hctags;
}

void
ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties::setHctags(ConfigNodePropertyArray hctags)
{
	this->hctags = hctags;
}



