

#include "OrgApacheAriesJmxFrameworkStateConfigProperties.h"

using namespace Tiny;

OrgApacheAriesJmxFrameworkStateConfigProperties::OrgApacheAriesJmxFrameworkStateConfigProperties()
{
	attributeChangeNotificationEnabled = ConfigNodePropertyBoolean();
}

OrgApacheAriesJmxFrameworkStateConfigProperties::OrgApacheAriesJmxFrameworkStateConfigProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheAriesJmxFrameworkStateConfigProperties::~OrgApacheAriesJmxFrameworkStateConfigProperties()
{

}

void
OrgApacheAriesJmxFrameworkStateConfigProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *attributeChangeNotificationEnabledKey = "attributeChangeNotificationEnabled";

    if(object.has_key(attributeChangeNotificationEnabledKey))
    {
        bourne::json value = object[attributeChangeNotificationEnabledKey];




        ConfigNodePropertyBoolean* obj = &attributeChangeNotificationEnabled;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheAriesJmxFrameworkStateConfigProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["attributeChangeNotificationEnabled"] = getAttributeChangeNotificationEnabled().toJson();


    return object;

}

ConfigNodePropertyBoolean
OrgApacheAriesJmxFrameworkStateConfigProperties::getAttributeChangeNotificationEnabled()
{
	return attributeChangeNotificationEnabled;
}

void
OrgApacheAriesJmxFrameworkStateConfigProperties::setAttributeChangeNotificationEnabled(ConfigNodePropertyBoolean attributeChangeNotificationEnabled)
{
	this->attributeChangeNotificationEnabled = attributeChangeNotificationEnabled;
}



