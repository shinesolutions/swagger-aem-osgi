

#include "OrgApacheFelixJaasConfigurationFactoryProperties.h"

using namespace Tiny;

OrgApacheFelixJaasConfigurationFactoryProperties::OrgApacheFelixJaasConfigurationFactoryProperties()
{
	jaascontrolFlag = ConfigNodePropertyDropDown();
	jaasranking = ConfigNodePropertyInteger();
	jaasrealmName = ConfigNodePropertyString();
	jaasclassname = ConfigNodePropertyString();
	jaasoptions = ConfigNodePropertyArray();
}

OrgApacheFelixJaasConfigurationFactoryProperties::OrgApacheFelixJaasConfigurationFactoryProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheFelixJaasConfigurationFactoryProperties::~OrgApacheFelixJaasConfigurationFactoryProperties()
{

}

void
OrgApacheFelixJaasConfigurationFactoryProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *jaascontrolFlagKey = "jaas.controlFlag";

    if(object.has_key(jaascontrolFlagKey))
    {
        bourne::json value = object[jaascontrolFlagKey];




        ConfigNodePropertyDropDown* obj = &jaascontrolFlag;
		obj->fromJson(value.dump());

    }

    const char *jaasrankingKey = "jaas.ranking";

    if(object.has_key(jaasrankingKey))
    {
        bourne::json value = object[jaasrankingKey];




        ConfigNodePropertyInteger* obj = &jaasranking;
		obj->fromJson(value.dump());

    }

    const char *jaasrealmNameKey = "jaas.realmName";

    if(object.has_key(jaasrealmNameKey))
    {
        bourne::json value = object[jaasrealmNameKey];




        ConfigNodePropertyString* obj = &jaasrealmName;
		obj->fromJson(value.dump());

    }

    const char *jaasclassnameKey = "jaas.classname";

    if(object.has_key(jaasclassnameKey))
    {
        bourne::json value = object[jaasclassnameKey];




        ConfigNodePropertyString* obj = &jaasclassname;
		obj->fromJson(value.dump());

    }

    const char *jaasoptionsKey = "jaas.options";

    if(object.has_key(jaasoptionsKey))
    {
        bourne::json value = object[jaasoptionsKey];




        ConfigNodePropertyArray* obj = &jaasoptions;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheFelixJaasConfigurationFactoryProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["jaascontrolFlag"] = getJaascontrolFlag().toJson();






	object["jaasranking"] = getJaasranking().toJson();






	object["jaasrealmName"] = getJaasrealmName().toJson();






	object["jaasclassname"] = getJaasclassname().toJson();






	object["jaasoptions"] = getJaasoptions().toJson();


    return object;

}

ConfigNodePropertyDropDown
OrgApacheFelixJaasConfigurationFactoryProperties::getJaascontrolFlag()
{
	return jaascontrolFlag;
}

void
OrgApacheFelixJaasConfigurationFactoryProperties::setJaascontrolFlag(ConfigNodePropertyDropDown jaascontrolFlag)
{
	this->jaascontrolFlag = jaascontrolFlag;
}

ConfigNodePropertyInteger
OrgApacheFelixJaasConfigurationFactoryProperties::getJaasranking()
{
	return jaasranking;
}

void
OrgApacheFelixJaasConfigurationFactoryProperties::setJaasranking(ConfigNodePropertyInteger jaasranking)
{
	this->jaasranking = jaasranking;
}

ConfigNodePropertyString
OrgApacheFelixJaasConfigurationFactoryProperties::getJaasrealmName()
{
	return jaasrealmName;
}

void
OrgApacheFelixJaasConfigurationFactoryProperties::setJaasrealmName(ConfigNodePropertyString jaasrealmName)
{
	this->jaasrealmName = jaasrealmName;
}

ConfigNodePropertyString
OrgApacheFelixJaasConfigurationFactoryProperties::getJaasclassname()
{
	return jaasclassname;
}

void
OrgApacheFelixJaasConfigurationFactoryProperties::setJaasclassname(ConfigNodePropertyString jaasclassname)
{
	this->jaasclassname = jaasclassname;
}

ConfigNodePropertyArray
OrgApacheFelixJaasConfigurationFactoryProperties::getJaasoptions()
{
	return jaasoptions;
}

void
OrgApacheFelixJaasConfigurationFactoryProperties::setJaasoptions(ConfigNodePropertyArray jaasoptions)
{
	this->jaasoptions = jaasoptions;
}



