

#include "OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties.h"

using namespace Tiny;

OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties::OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties()
{
	length = ConfigNodePropertyInteger();
}

OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties::OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties::~OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties()
{

}

void
OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *lengthKey = "length";

    if(object.has_key(lengthKey))
    {
        bourne::json value = object[lengthKey];




        ConfigNodePropertyInteger* obj = &length;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["length"] = getLength().toJson();


    return object;

}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties::getLength()
{
	return length;
}

void
OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties::setLength(ConfigNodePropertyInteger length)
{
	this->length = length;
}



