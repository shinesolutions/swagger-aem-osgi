

#include "ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.h"

using namespace Tiny;

ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties::ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties()
{
	jdbcdriverclass = ConfigNodePropertyString();
	jdbcconnectionuri = ConfigNodePropertyString();
	jdbcusername = ConfigNodePropertyString();
	jdbcpassword = ConfigNodePropertyString();
	jdbcvalidationquery = ConfigNodePropertyString();
	defaultreadonly = ConfigNodePropertyBoolean();
	defaultautocommit = ConfigNodePropertyBoolean();
	poolsize = ConfigNodePropertyInteger();
	poolmaxwaitmsec = ConfigNodePropertyInteger();
	datasourcename = ConfigNodePropertyString();
	datasourcesvcproperties = ConfigNodePropertyArray();
}

ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties::ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties::~ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties()
{

}

void
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *jdbcdriverclassKey = "jdbc.driver.class";

    if(object.has_key(jdbcdriverclassKey))
    {
        bourne::json value = object[jdbcdriverclassKey];




        ConfigNodePropertyString* obj = &jdbcdriverclass;
		obj->fromJson(value.dump());

    }

    const char *jdbcconnectionuriKey = "jdbc.connection.uri";

    if(object.has_key(jdbcconnectionuriKey))
    {
        bourne::json value = object[jdbcconnectionuriKey];




        ConfigNodePropertyString* obj = &jdbcconnectionuri;
		obj->fromJson(value.dump());

    }

    const char *jdbcusernameKey = "jdbc.username";

    if(object.has_key(jdbcusernameKey))
    {
        bourne::json value = object[jdbcusernameKey];




        ConfigNodePropertyString* obj = &jdbcusername;
		obj->fromJson(value.dump());

    }

    const char *jdbcpasswordKey = "jdbc.password";

    if(object.has_key(jdbcpasswordKey))
    {
        bourne::json value = object[jdbcpasswordKey];




        ConfigNodePropertyString* obj = &jdbcpassword;
		obj->fromJson(value.dump());

    }

    const char *jdbcvalidationqueryKey = "jdbc.validation.query";

    if(object.has_key(jdbcvalidationqueryKey))
    {
        bourne::json value = object[jdbcvalidationqueryKey];




        ConfigNodePropertyString* obj = &jdbcvalidationquery;
		obj->fromJson(value.dump());

    }

    const char *defaultreadonlyKey = "default.readonly";

    if(object.has_key(defaultreadonlyKey))
    {
        bourne::json value = object[defaultreadonlyKey];




        ConfigNodePropertyBoolean* obj = &defaultreadonly;
		obj->fromJson(value.dump());

    }

    const char *defaultautocommitKey = "default.autocommit";

    if(object.has_key(defaultautocommitKey))
    {
        bourne::json value = object[defaultautocommitKey];




        ConfigNodePropertyBoolean* obj = &defaultautocommit;
		obj->fromJson(value.dump());

    }

    const char *poolsizeKey = "pool.size";

    if(object.has_key(poolsizeKey))
    {
        bourne::json value = object[poolsizeKey];




        ConfigNodePropertyInteger* obj = &poolsize;
		obj->fromJson(value.dump());

    }

    const char *poolmaxwaitmsecKey = "pool.max.wait.msec";

    if(object.has_key(poolmaxwaitmsecKey))
    {
        bourne::json value = object[poolmaxwaitmsecKey];




        ConfigNodePropertyInteger* obj = &poolmaxwaitmsec;
		obj->fromJson(value.dump());

    }

    const char *datasourcenameKey = "datasource.name";

    if(object.has_key(datasourcenameKey))
    {
        bourne::json value = object[datasourcenameKey];




        ConfigNodePropertyString* obj = &datasourcename;
		obj->fromJson(value.dump());

    }

    const char *datasourcesvcpropertiesKey = "datasource.svc.properties";

    if(object.has_key(datasourcesvcpropertiesKey))
    {
        bourne::json value = object[datasourcesvcpropertiesKey];




        ConfigNodePropertyArray* obj = &datasourcesvcproperties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["jdbcdriverclass"] = getJdbcdriverclass().toJson();






	object["jdbcconnectionuri"] = getJdbcconnectionuri().toJson();






	object["jdbcusername"] = getJdbcusername().toJson();






	object["jdbcpassword"] = getJdbcpassword().toJson();






	object["jdbcvalidationquery"] = getJdbcvalidationquery().toJson();






	object["defaultreadonly"] = getDefaultreadonly().toJson();






	object["defaultautocommit"] = getDefaultautocommit().toJson();






	object["poolsize"] = getPoolsize().toJson();






	object["poolmaxwaitmsec"] = getPoolmaxwaitmsec().toJson();






	object["datasourcename"] = getDatasourcename().toJson();






	object["datasourcesvcproperties"] = getDatasourcesvcproperties().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties::getJdbcdriverclass()
{
	return jdbcdriverclass;
}

void
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties::setJdbcdriverclass(ConfigNodePropertyString jdbcdriverclass)
{
	this->jdbcdriverclass = jdbcdriverclass;
}

ConfigNodePropertyString
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties::getJdbcconnectionuri()
{
	return jdbcconnectionuri;
}

void
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties::setJdbcconnectionuri(ConfigNodePropertyString jdbcconnectionuri)
{
	this->jdbcconnectionuri = jdbcconnectionuri;
}

ConfigNodePropertyString
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties::getJdbcusername()
{
	return jdbcusername;
}

void
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties::setJdbcusername(ConfigNodePropertyString jdbcusername)
{
	this->jdbcusername = jdbcusername;
}

ConfigNodePropertyString
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties::getJdbcpassword()
{
	return jdbcpassword;
}

void
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties::setJdbcpassword(ConfigNodePropertyString jdbcpassword)
{
	this->jdbcpassword = jdbcpassword;
}

ConfigNodePropertyString
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties::getJdbcvalidationquery()
{
	return jdbcvalidationquery;
}

void
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties::setJdbcvalidationquery(ConfigNodePropertyString jdbcvalidationquery)
{
	this->jdbcvalidationquery = jdbcvalidationquery;
}

ConfigNodePropertyBoolean
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties::getDefaultreadonly()
{
	return defaultreadonly;
}

void
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties::setDefaultreadonly(ConfigNodePropertyBoolean defaultreadonly)
{
	this->defaultreadonly = defaultreadonly;
}

ConfigNodePropertyBoolean
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties::getDefaultautocommit()
{
	return defaultautocommit;
}

void
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties::setDefaultautocommit(ConfigNodePropertyBoolean defaultautocommit)
{
	this->defaultautocommit = defaultautocommit;
}

ConfigNodePropertyInteger
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties::getPoolsize()
{
	return poolsize;
}

void
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties::setPoolsize(ConfigNodePropertyInteger poolsize)
{
	this->poolsize = poolsize;
}

ConfigNodePropertyInteger
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties::getPoolmaxwaitmsec()
{
	return poolmaxwaitmsec;
}

void
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties::setPoolmaxwaitmsec(ConfigNodePropertyInteger poolmaxwaitmsec)
{
	this->poolmaxwaitmsec = poolmaxwaitmsec;
}

ConfigNodePropertyString
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties::getDatasourcename()
{
	return datasourcename;
}

void
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties::setDatasourcename(ConfigNodePropertyString datasourcename)
{
	this->datasourcename = datasourcename;
}

ConfigNodePropertyArray
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties::getDatasourcesvcproperties()
{
	return datasourcesvcproperties;
}

void
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties::setDatasourcesvcproperties(ConfigNodePropertyArray datasourcesvcproperties)
{
	this->datasourcesvcproperties = datasourcesvcproperties;
}



