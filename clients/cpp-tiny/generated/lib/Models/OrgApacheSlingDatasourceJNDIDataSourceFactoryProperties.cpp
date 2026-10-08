

#include "OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties.h"

using namespace Tiny;

OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties::OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties()
{
	datasourcename = ConfigNodePropertyString();
	datasourcesvcpropname = ConfigNodePropertyString();
	datasourcejndiname = ConfigNodePropertyString();
	jndiproperties = ConfigNodePropertyArray();
}

OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties::OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties::~OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties()
{

}

void
OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *datasourcenameKey = "datasource.name";

    if(object.has_key(datasourcenameKey))
    {
        bourne::json value = object[datasourcenameKey];




        ConfigNodePropertyString* obj = &datasourcename;
		obj->fromJson(value.dump());

    }

    const char *datasourcesvcpropnameKey = "datasource.svc.prop.name";

    if(object.has_key(datasourcesvcpropnameKey))
    {
        bourne::json value = object[datasourcesvcpropnameKey];




        ConfigNodePropertyString* obj = &datasourcesvcpropname;
		obj->fromJson(value.dump());

    }

    const char *datasourcejndinameKey = "datasource.jndi.name";

    if(object.has_key(datasourcejndinameKey))
    {
        bourne::json value = object[datasourcejndinameKey];




        ConfigNodePropertyString* obj = &datasourcejndiname;
		obj->fromJson(value.dump());

    }

    const char *jndipropertiesKey = "jndi.properties";

    if(object.has_key(jndipropertiesKey))
    {
        bourne::json value = object[jndipropertiesKey];




        ConfigNodePropertyArray* obj = &jndiproperties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["datasourcename"] = getDatasourcename().toJson();






	object["datasourcesvcpropname"] = getDatasourcesvcpropname().toJson();






	object["datasourcejndiname"] = getDatasourcejndiname().toJson();






	object["jndiproperties"] = getJndiproperties().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties::getDatasourcename()
{
	return datasourcename;
}

void
OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties::setDatasourcename(ConfigNodePropertyString datasourcename)
{
	this->datasourcename = datasourcename;
}

ConfigNodePropertyString
OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties::getDatasourcesvcpropname()
{
	return datasourcesvcpropname;
}

void
OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties::setDatasourcesvcpropname(ConfigNodePropertyString datasourcesvcpropname)
{
	this->datasourcesvcpropname = datasourcesvcpropname;
}

ConfigNodePropertyString
OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties::getDatasourcejndiname()
{
	return datasourcejndiname;
}

void
OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties::setDatasourcejndiname(ConfigNodePropertyString datasourcejndiname)
{
	this->datasourcejndiname = datasourcejndiname;
}

ConfigNodePropertyArray
OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties::getJndiproperties()
{
	return jndiproperties;
}

void
OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties::setJndiproperties(ConfigNodePropertyArray jndiproperties)
{
	this->jndiproperties = jndiproperties;
}



