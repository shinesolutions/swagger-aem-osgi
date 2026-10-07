

#include "OrgApacheSlingDatasourceDataSourceFactoryProperties.h"

using namespace Tiny;

OrgApacheSlingDatasourceDataSourceFactoryProperties::OrgApacheSlingDatasourceDataSourceFactoryProperties()
{
	datasourcename = ConfigNodePropertyString();
	datasourcesvcpropname = ConfigNodePropertyString();
	driverClassName = ConfigNodePropertyString();
	url = ConfigNodePropertyString();
	username = ConfigNodePropertyString();
	password = ConfigNodePropertyString();
	defaultAutoCommit = ConfigNodePropertyDropDown();
	defaultReadOnly = ConfigNodePropertyDropDown();
	defaultTransactionIsolation = ConfigNodePropertyDropDown();
	defaultCatalog = ConfigNodePropertyString();
	maxActive = ConfigNodePropertyInteger();
	maxIdle = ConfigNodePropertyInteger();
	minIdle = ConfigNodePropertyInteger();
	initialSize = ConfigNodePropertyInteger();
	maxWait = ConfigNodePropertyInteger();
	maxAge = ConfigNodePropertyInteger();
	testOnBorrow = ConfigNodePropertyBoolean();
	testOnReturn = ConfigNodePropertyBoolean();
	testWhileIdle = ConfigNodePropertyBoolean();
	validationQuery = ConfigNodePropertyString();
	validationQueryTimeout = ConfigNodePropertyInteger();
	timeBetweenEvictionRunsMillis = ConfigNodePropertyInteger();
	minEvictableIdleTimeMillis = ConfigNodePropertyInteger();
	connectionProperties = ConfigNodePropertyString();
	initSQL = ConfigNodePropertyString();
	jdbcInterceptors = ConfigNodePropertyString();
	validationInterval = ConfigNodePropertyInteger();
	logValidationErrors = ConfigNodePropertyBoolean();
	datasourcesvcproperties = ConfigNodePropertyArray();
}

OrgApacheSlingDatasourceDataSourceFactoryProperties::OrgApacheSlingDatasourceDataSourceFactoryProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingDatasourceDataSourceFactoryProperties::~OrgApacheSlingDatasourceDataSourceFactoryProperties()
{

}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::fromJson(std::string jsonObj)
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

    const char *driverClassNameKey = "driverClassName";

    if(object.has_key(driverClassNameKey))
    {
        bourne::json value = object[driverClassNameKey];




        ConfigNodePropertyString* obj = &driverClassName;
		obj->fromJson(value.dump());

    }

    const char *urlKey = "url";

    if(object.has_key(urlKey))
    {
        bourne::json value = object[urlKey];




        ConfigNodePropertyString* obj = &url;
		obj->fromJson(value.dump());

    }

    const char *usernameKey = "username";

    if(object.has_key(usernameKey))
    {
        bourne::json value = object[usernameKey];




        ConfigNodePropertyString* obj = &username;
		obj->fromJson(value.dump());

    }

    const char *passwordKey = "password";

    if(object.has_key(passwordKey))
    {
        bourne::json value = object[passwordKey];




        ConfigNodePropertyString* obj = &password;
		obj->fromJson(value.dump());

    }

    const char *defaultAutoCommitKey = "defaultAutoCommit";

    if(object.has_key(defaultAutoCommitKey))
    {
        bourne::json value = object[defaultAutoCommitKey];




        ConfigNodePropertyDropDown* obj = &defaultAutoCommit;
		obj->fromJson(value.dump());

    }

    const char *defaultReadOnlyKey = "defaultReadOnly";

    if(object.has_key(defaultReadOnlyKey))
    {
        bourne::json value = object[defaultReadOnlyKey];




        ConfigNodePropertyDropDown* obj = &defaultReadOnly;
		obj->fromJson(value.dump());

    }

    const char *defaultTransactionIsolationKey = "defaultTransactionIsolation";

    if(object.has_key(defaultTransactionIsolationKey))
    {
        bourne::json value = object[defaultTransactionIsolationKey];




        ConfigNodePropertyDropDown* obj = &defaultTransactionIsolation;
		obj->fromJson(value.dump());

    }

    const char *defaultCatalogKey = "defaultCatalog";

    if(object.has_key(defaultCatalogKey))
    {
        bourne::json value = object[defaultCatalogKey];




        ConfigNodePropertyString* obj = &defaultCatalog;
		obj->fromJson(value.dump());

    }

    const char *maxActiveKey = "maxActive";

    if(object.has_key(maxActiveKey))
    {
        bourne::json value = object[maxActiveKey];




        ConfigNodePropertyInteger* obj = &maxActive;
		obj->fromJson(value.dump());

    }

    const char *maxIdleKey = "maxIdle";

    if(object.has_key(maxIdleKey))
    {
        bourne::json value = object[maxIdleKey];




        ConfigNodePropertyInteger* obj = &maxIdle;
		obj->fromJson(value.dump());

    }

    const char *minIdleKey = "minIdle";

    if(object.has_key(minIdleKey))
    {
        bourne::json value = object[minIdleKey];




        ConfigNodePropertyInteger* obj = &minIdle;
		obj->fromJson(value.dump());

    }

    const char *initialSizeKey = "initialSize";

    if(object.has_key(initialSizeKey))
    {
        bourne::json value = object[initialSizeKey];




        ConfigNodePropertyInteger* obj = &initialSize;
		obj->fromJson(value.dump());

    }

    const char *maxWaitKey = "maxWait";

    if(object.has_key(maxWaitKey))
    {
        bourne::json value = object[maxWaitKey];




        ConfigNodePropertyInteger* obj = &maxWait;
		obj->fromJson(value.dump());

    }

    const char *maxAgeKey = "maxAge";

    if(object.has_key(maxAgeKey))
    {
        bourne::json value = object[maxAgeKey];




        ConfigNodePropertyInteger* obj = &maxAge;
		obj->fromJson(value.dump());

    }

    const char *testOnBorrowKey = "testOnBorrow";

    if(object.has_key(testOnBorrowKey))
    {
        bourne::json value = object[testOnBorrowKey];




        ConfigNodePropertyBoolean* obj = &testOnBorrow;
		obj->fromJson(value.dump());

    }

    const char *testOnReturnKey = "testOnReturn";

    if(object.has_key(testOnReturnKey))
    {
        bourne::json value = object[testOnReturnKey];




        ConfigNodePropertyBoolean* obj = &testOnReturn;
		obj->fromJson(value.dump());

    }

    const char *testWhileIdleKey = "testWhileIdle";

    if(object.has_key(testWhileIdleKey))
    {
        bourne::json value = object[testWhileIdleKey];




        ConfigNodePropertyBoolean* obj = &testWhileIdle;
		obj->fromJson(value.dump());

    }

    const char *validationQueryKey = "validationQuery";

    if(object.has_key(validationQueryKey))
    {
        bourne::json value = object[validationQueryKey];




        ConfigNodePropertyString* obj = &validationQuery;
		obj->fromJson(value.dump());

    }

    const char *validationQueryTimeoutKey = "validationQueryTimeout";

    if(object.has_key(validationQueryTimeoutKey))
    {
        bourne::json value = object[validationQueryTimeoutKey];




        ConfigNodePropertyInteger* obj = &validationQueryTimeout;
		obj->fromJson(value.dump());

    }

    const char *timeBetweenEvictionRunsMillisKey = "timeBetweenEvictionRunsMillis";

    if(object.has_key(timeBetweenEvictionRunsMillisKey))
    {
        bourne::json value = object[timeBetweenEvictionRunsMillisKey];




        ConfigNodePropertyInteger* obj = &timeBetweenEvictionRunsMillis;
		obj->fromJson(value.dump());

    }

    const char *minEvictableIdleTimeMillisKey = "minEvictableIdleTimeMillis";

    if(object.has_key(minEvictableIdleTimeMillisKey))
    {
        bourne::json value = object[minEvictableIdleTimeMillisKey];




        ConfigNodePropertyInteger* obj = &minEvictableIdleTimeMillis;
		obj->fromJson(value.dump());

    }

    const char *connectionPropertiesKey = "connectionProperties";

    if(object.has_key(connectionPropertiesKey))
    {
        bourne::json value = object[connectionPropertiesKey];




        ConfigNodePropertyString* obj = &connectionProperties;
		obj->fromJson(value.dump());

    }

    const char *initSQLKey = "initSQL";

    if(object.has_key(initSQLKey))
    {
        bourne::json value = object[initSQLKey];




        ConfigNodePropertyString* obj = &initSQL;
		obj->fromJson(value.dump());

    }

    const char *jdbcInterceptorsKey = "jdbcInterceptors";

    if(object.has_key(jdbcInterceptorsKey))
    {
        bourne::json value = object[jdbcInterceptorsKey];




        ConfigNodePropertyString* obj = &jdbcInterceptors;
		obj->fromJson(value.dump());

    }

    const char *validationIntervalKey = "validationInterval";

    if(object.has_key(validationIntervalKey))
    {
        bourne::json value = object[validationIntervalKey];




        ConfigNodePropertyInteger* obj = &validationInterval;
		obj->fromJson(value.dump());

    }

    const char *logValidationErrorsKey = "logValidationErrors";

    if(object.has_key(logValidationErrorsKey))
    {
        bourne::json value = object[logValidationErrorsKey];




        ConfigNodePropertyBoolean* obj = &logValidationErrors;
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
OrgApacheSlingDatasourceDataSourceFactoryProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["datasourcename"] = getDatasourcename().toJson();






	object["datasourcesvcpropname"] = getDatasourcesvcpropname().toJson();






	object["driverClassName"] = getDriverClassName().toJson();






	object["url"] = getUrl().toJson();






	object["username"] = getUsername().toJson();






	object["password"] = getPassword().toJson();






	object["defaultAutoCommit"] = getDefaultAutoCommit().toJson();






	object["defaultReadOnly"] = getDefaultReadOnly().toJson();






	object["defaultTransactionIsolation"] = getDefaultTransactionIsolation().toJson();






	object["defaultCatalog"] = getDefaultCatalog().toJson();






	object["maxActive"] = getMaxActive().toJson();






	object["maxIdle"] = getMaxIdle().toJson();






	object["minIdle"] = getMinIdle().toJson();






	object["initialSize"] = getInitialSize().toJson();






	object["maxWait"] = getMaxWait().toJson();






	object["maxAge"] = getMaxAge().toJson();






	object["testOnBorrow"] = getTestOnBorrow().toJson();






	object["testOnReturn"] = getTestOnReturn().toJson();






	object["testWhileIdle"] = getTestWhileIdle().toJson();






	object["validationQuery"] = getValidationQuery().toJson();






	object["validationQueryTimeout"] = getValidationQueryTimeout().toJson();






	object["timeBetweenEvictionRunsMillis"] = getTimeBetweenEvictionRunsMillis().toJson();






	object["minEvictableIdleTimeMillis"] = getMinEvictableIdleTimeMillis().toJson();






	object["connectionProperties"] = getConnectionProperties().toJson();






	object["initSQL"] = getInitSQL().toJson();






	object["jdbcInterceptors"] = getJdbcInterceptors().toJson();






	object["validationInterval"] = getValidationInterval().toJson();






	object["logValidationErrors"] = getLogValidationErrors().toJson();






	object["datasourcesvcproperties"] = getDatasourcesvcproperties().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingDatasourceDataSourceFactoryProperties::getDatasourcename()
{
	return datasourcename;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setDatasourcename(ConfigNodePropertyString datasourcename)
{
	this->datasourcename = datasourcename;
}

ConfigNodePropertyString
OrgApacheSlingDatasourceDataSourceFactoryProperties::getDatasourcesvcpropname()
{
	return datasourcesvcpropname;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setDatasourcesvcpropname(ConfigNodePropertyString datasourcesvcpropname)
{
	this->datasourcesvcpropname = datasourcesvcpropname;
}

ConfigNodePropertyString
OrgApacheSlingDatasourceDataSourceFactoryProperties::getDriverClassName()
{
	return driverClassName;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setDriverClassName(ConfigNodePropertyString driverClassName)
{
	this->driverClassName = driverClassName;
}

ConfigNodePropertyString
OrgApacheSlingDatasourceDataSourceFactoryProperties::getUrl()
{
	return url;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setUrl(ConfigNodePropertyString url)
{
	this->url = url;
}

ConfigNodePropertyString
OrgApacheSlingDatasourceDataSourceFactoryProperties::getUsername()
{
	return username;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setUsername(ConfigNodePropertyString username)
{
	this->username = username;
}

ConfigNodePropertyString
OrgApacheSlingDatasourceDataSourceFactoryProperties::getPassword()
{
	return password;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setPassword(ConfigNodePropertyString password)
{
	this->password = password;
}

ConfigNodePropertyDropDown
OrgApacheSlingDatasourceDataSourceFactoryProperties::getDefaultAutoCommit()
{
	return defaultAutoCommit;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setDefaultAutoCommit(ConfigNodePropertyDropDown defaultAutoCommit)
{
	this->defaultAutoCommit = defaultAutoCommit;
}

ConfigNodePropertyDropDown
OrgApacheSlingDatasourceDataSourceFactoryProperties::getDefaultReadOnly()
{
	return defaultReadOnly;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setDefaultReadOnly(ConfigNodePropertyDropDown defaultReadOnly)
{
	this->defaultReadOnly = defaultReadOnly;
}

ConfigNodePropertyDropDown
OrgApacheSlingDatasourceDataSourceFactoryProperties::getDefaultTransactionIsolation()
{
	return defaultTransactionIsolation;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setDefaultTransactionIsolation(ConfigNodePropertyDropDown defaultTransactionIsolation)
{
	this->defaultTransactionIsolation = defaultTransactionIsolation;
}

ConfigNodePropertyString
OrgApacheSlingDatasourceDataSourceFactoryProperties::getDefaultCatalog()
{
	return defaultCatalog;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setDefaultCatalog(ConfigNodePropertyString defaultCatalog)
{
	this->defaultCatalog = defaultCatalog;
}

ConfigNodePropertyInteger
OrgApacheSlingDatasourceDataSourceFactoryProperties::getMaxActive()
{
	return maxActive;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setMaxActive(ConfigNodePropertyInteger maxActive)
{
	this->maxActive = maxActive;
}

ConfigNodePropertyInteger
OrgApacheSlingDatasourceDataSourceFactoryProperties::getMaxIdle()
{
	return maxIdle;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setMaxIdle(ConfigNodePropertyInteger maxIdle)
{
	this->maxIdle = maxIdle;
}

ConfigNodePropertyInteger
OrgApacheSlingDatasourceDataSourceFactoryProperties::getMinIdle()
{
	return minIdle;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setMinIdle(ConfigNodePropertyInteger minIdle)
{
	this->minIdle = minIdle;
}

ConfigNodePropertyInteger
OrgApacheSlingDatasourceDataSourceFactoryProperties::getInitialSize()
{
	return initialSize;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setInitialSize(ConfigNodePropertyInteger initialSize)
{
	this->initialSize = initialSize;
}

ConfigNodePropertyInteger
OrgApacheSlingDatasourceDataSourceFactoryProperties::getMaxWait()
{
	return maxWait;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setMaxWait(ConfigNodePropertyInteger maxWait)
{
	this->maxWait = maxWait;
}

ConfigNodePropertyInteger
OrgApacheSlingDatasourceDataSourceFactoryProperties::getMaxAge()
{
	return maxAge;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setMaxAge(ConfigNodePropertyInteger maxAge)
{
	this->maxAge = maxAge;
}

ConfigNodePropertyBoolean
OrgApacheSlingDatasourceDataSourceFactoryProperties::getTestOnBorrow()
{
	return testOnBorrow;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setTestOnBorrow(ConfigNodePropertyBoolean testOnBorrow)
{
	this->testOnBorrow = testOnBorrow;
}

ConfigNodePropertyBoolean
OrgApacheSlingDatasourceDataSourceFactoryProperties::getTestOnReturn()
{
	return testOnReturn;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setTestOnReturn(ConfigNodePropertyBoolean testOnReturn)
{
	this->testOnReturn = testOnReturn;
}

ConfigNodePropertyBoolean
OrgApacheSlingDatasourceDataSourceFactoryProperties::getTestWhileIdle()
{
	return testWhileIdle;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setTestWhileIdle(ConfigNodePropertyBoolean testWhileIdle)
{
	this->testWhileIdle = testWhileIdle;
}

ConfigNodePropertyString
OrgApacheSlingDatasourceDataSourceFactoryProperties::getValidationQuery()
{
	return validationQuery;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setValidationQuery(ConfigNodePropertyString validationQuery)
{
	this->validationQuery = validationQuery;
}

ConfigNodePropertyInteger
OrgApacheSlingDatasourceDataSourceFactoryProperties::getValidationQueryTimeout()
{
	return validationQueryTimeout;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setValidationQueryTimeout(ConfigNodePropertyInteger validationQueryTimeout)
{
	this->validationQueryTimeout = validationQueryTimeout;
}

ConfigNodePropertyInteger
OrgApacheSlingDatasourceDataSourceFactoryProperties::getTimeBetweenEvictionRunsMillis()
{
	return timeBetweenEvictionRunsMillis;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setTimeBetweenEvictionRunsMillis(ConfigNodePropertyInteger timeBetweenEvictionRunsMillis)
{
	this->timeBetweenEvictionRunsMillis = timeBetweenEvictionRunsMillis;
}

ConfigNodePropertyInteger
OrgApacheSlingDatasourceDataSourceFactoryProperties::getMinEvictableIdleTimeMillis()
{
	return minEvictableIdleTimeMillis;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setMinEvictableIdleTimeMillis(ConfigNodePropertyInteger minEvictableIdleTimeMillis)
{
	this->minEvictableIdleTimeMillis = minEvictableIdleTimeMillis;
}

ConfigNodePropertyString
OrgApacheSlingDatasourceDataSourceFactoryProperties::getConnectionProperties()
{
	return connectionProperties;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setConnectionProperties(ConfigNodePropertyString connectionProperties)
{
	this->connectionProperties = connectionProperties;
}

ConfigNodePropertyString
OrgApacheSlingDatasourceDataSourceFactoryProperties::getInitSQL()
{
	return initSQL;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setInitSQL(ConfigNodePropertyString initSQL)
{
	this->initSQL = initSQL;
}

ConfigNodePropertyString
OrgApacheSlingDatasourceDataSourceFactoryProperties::getJdbcInterceptors()
{
	return jdbcInterceptors;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setJdbcInterceptors(ConfigNodePropertyString jdbcInterceptors)
{
	this->jdbcInterceptors = jdbcInterceptors;
}

ConfigNodePropertyInteger
OrgApacheSlingDatasourceDataSourceFactoryProperties::getValidationInterval()
{
	return validationInterval;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setValidationInterval(ConfigNodePropertyInteger validationInterval)
{
	this->validationInterval = validationInterval;
}

ConfigNodePropertyBoolean
OrgApacheSlingDatasourceDataSourceFactoryProperties::getLogValidationErrors()
{
	return logValidationErrors;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setLogValidationErrors(ConfigNodePropertyBoolean logValidationErrors)
{
	this->logValidationErrors = logValidationErrors;
}

ConfigNodePropertyArray
OrgApacheSlingDatasourceDataSourceFactoryProperties::getDatasourcesvcproperties()
{
	return datasourcesvcproperties;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setDatasourcesvcproperties(ConfigNodePropertyArray datasourcesvcproperties)
{
	this->datasourcesvcproperties = datasourcesvcproperties;
}



