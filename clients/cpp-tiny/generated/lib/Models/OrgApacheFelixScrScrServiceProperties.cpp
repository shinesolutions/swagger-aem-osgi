

#include "OrgApacheFelixScrScrServiceProperties.h"

using namespace Tiny;

OrgApacheFelixScrScrServiceProperties::OrgApacheFelixScrScrServiceProperties()
{
	dsloglevel = ConfigNodePropertyDropDown();
	dsfactoryenabled = ConfigNodePropertyBoolean();
	dsdelayedkeepInstances = ConfigNodePropertyBoolean();
	dslocktimeoutmilliseconds = ConfigNodePropertyInteger();
	dsstoptimeoutmilliseconds = ConfigNodePropertyInteger();
	dsglobalextender = ConfigNodePropertyBoolean();
}

OrgApacheFelixScrScrServiceProperties::OrgApacheFelixScrScrServiceProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheFelixScrScrServiceProperties::~OrgApacheFelixScrScrServiceProperties()
{

}

void
OrgApacheFelixScrScrServiceProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *dsloglevelKey = "ds.loglevel";

    if(object.has_key(dsloglevelKey))
    {
        bourne::json value = object[dsloglevelKey];




        ConfigNodePropertyDropDown* obj = &dsloglevel;
		obj->fromJson(value.dump());

    }

    const char *dsfactoryenabledKey = "ds.factory.enabled";

    if(object.has_key(dsfactoryenabledKey))
    {
        bourne::json value = object[dsfactoryenabledKey];




        ConfigNodePropertyBoolean* obj = &dsfactoryenabled;
		obj->fromJson(value.dump());

    }

    const char *dsdelayedkeepInstancesKey = "ds.delayed.keepInstances";

    if(object.has_key(dsdelayedkeepInstancesKey))
    {
        bourne::json value = object[dsdelayedkeepInstancesKey];




        ConfigNodePropertyBoolean* obj = &dsdelayedkeepInstances;
		obj->fromJson(value.dump());

    }

    const char *dslocktimeoutmillisecondsKey = "ds.lock.timeout.milliseconds";

    if(object.has_key(dslocktimeoutmillisecondsKey))
    {
        bourne::json value = object[dslocktimeoutmillisecondsKey];




        ConfigNodePropertyInteger* obj = &dslocktimeoutmilliseconds;
		obj->fromJson(value.dump());

    }

    const char *dsstoptimeoutmillisecondsKey = "ds.stop.timeout.milliseconds";

    if(object.has_key(dsstoptimeoutmillisecondsKey))
    {
        bourne::json value = object[dsstoptimeoutmillisecondsKey];




        ConfigNodePropertyInteger* obj = &dsstoptimeoutmilliseconds;
		obj->fromJson(value.dump());

    }

    const char *dsglobalextenderKey = "ds.global.extender";

    if(object.has_key(dsglobalextenderKey))
    {
        bourne::json value = object[dsglobalextenderKey];




        ConfigNodePropertyBoolean* obj = &dsglobalextender;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheFelixScrScrServiceProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["dsloglevel"] = getDsloglevel().toJson();






	object["dsfactoryenabled"] = getDsfactoryenabled().toJson();






	object["dsdelayedkeepInstances"] = getDsdelayedkeepInstances().toJson();






	object["dslocktimeoutmilliseconds"] = getDslocktimeoutmilliseconds().toJson();






	object["dsstoptimeoutmilliseconds"] = getDsstoptimeoutmilliseconds().toJson();






	object["dsglobalextender"] = getDsglobalextender().toJson();


    return object;

}

ConfigNodePropertyDropDown
OrgApacheFelixScrScrServiceProperties::getDsloglevel()
{
	return dsloglevel;
}

void
OrgApacheFelixScrScrServiceProperties::setDsloglevel(ConfigNodePropertyDropDown dsloglevel)
{
	this->dsloglevel = dsloglevel;
}

ConfigNodePropertyBoolean
OrgApacheFelixScrScrServiceProperties::getDsfactoryenabled()
{
	return dsfactoryenabled;
}

void
OrgApacheFelixScrScrServiceProperties::setDsfactoryenabled(ConfigNodePropertyBoolean dsfactoryenabled)
{
	this->dsfactoryenabled = dsfactoryenabled;
}

ConfigNodePropertyBoolean
OrgApacheFelixScrScrServiceProperties::getDsdelayedkeepInstances()
{
	return dsdelayedkeepInstances;
}

void
OrgApacheFelixScrScrServiceProperties::setDsdelayedkeepInstances(ConfigNodePropertyBoolean dsdelayedkeepInstances)
{
	this->dsdelayedkeepInstances = dsdelayedkeepInstances;
}

ConfigNodePropertyInteger
OrgApacheFelixScrScrServiceProperties::getDslocktimeoutmilliseconds()
{
	return dslocktimeoutmilliseconds;
}

void
OrgApacheFelixScrScrServiceProperties::setDslocktimeoutmilliseconds(ConfigNodePropertyInteger dslocktimeoutmilliseconds)
{
	this->dslocktimeoutmilliseconds = dslocktimeoutmilliseconds;
}

ConfigNodePropertyInteger
OrgApacheFelixScrScrServiceProperties::getDsstoptimeoutmilliseconds()
{
	return dsstoptimeoutmilliseconds;
}

void
OrgApacheFelixScrScrServiceProperties::setDsstoptimeoutmilliseconds(ConfigNodePropertyInteger dsstoptimeoutmilliseconds)
{
	this->dsstoptimeoutmilliseconds = dsstoptimeoutmilliseconds;
}

ConfigNodePropertyBoolean
OrgApacheFelixScrScrServiceProperties::getDsglobalextender()
{
	return dsglobalextender;
}

void
OrgApacheFelixScrScrServiceProperties::setDsglobalextender(ConfigNodePropertyBoolean dsglobalextender)
{
	this->dsglobalextender = dsglobalextender;
}



