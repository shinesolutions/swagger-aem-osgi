
/*
 * OrgApacheSlingDatasourceDataSourceFactoryProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingDatasourceDataSourceFactoryProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingDatasourceDataSourceFactoryProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingDatasourceDataSourceFactoryProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingDatasourceDataSourceFactoryProperties();
    OrgApacheSlingDatasourceDataSourceFactoryProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingDatasourceDataSourceFactoryProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getDatasourcename();

	/*! \brief Set 
	 */
	void setDatasourcename(ConfigNodePropertyString datasourcename);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDatasourcesvcpropname();

	/*! \brief Set 
	 */
	void setDatasourcesvcpropname(ConfigNodePropertyString datasourcesvcpropname);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDriverClassName();

	/*! \brief Set 
	 */
	void setDriverClassName(ConfigNodePropertyString driverClassName);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getUrl();

	/*! \brief Set 
	 */
	void setUrl(ConfigNodePropertyString url);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getUsername();

	/*! \brief Set 
	 */
	void setUsername(ConfigNodePropertyString username);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPassword();

	/*! \brief Set 
	 */
	void setPassword(ConfigNodePropertyString password);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getDefaultAutoCommit();

	/*! \brief Set 
	 */
	void setDefaultAutoCommit(ConfigNodePropertyDropDown defaultAutoCommit);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getDefaultReadOnly();

	/*! \brief Set 
	 */
	void setDefaultReadOnly(ConfigNodePropertyDropDown defaultReadOnly);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getDefaultTransactionIsolation();

	/*! \brief Set 
	 */
	void setDefaultTransactionIsolation(ConfigNodePropertyDropDown defaultTransactionIsolation);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDefaultCatalog();

	/*! \brief Set 
	 */
	void setDefaultCatalog(ConfigNodePropertyString defaultCatalog);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxActive();

	/*! \brief Set 
	 */
	void setMaxActive(ConfigNodePropertyInteger maxActive);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxIdle();

	/*! \brief Set 
	 */
	void setMaxIdle(ConfigNodePropertyInteger maxIdle);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMinIdle();

	/*! \brief Set 
	 */
	void setMinIdle(ConfigNodePropertyInteger minIdle);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getInitialSize();

	/*! \brief Set 
	 */
	void setInitialSize(ConfigNodePropertyInteger initialSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxWait();

	/*! \brief Set 
	 */
	void setMaxWait(ConfigNodePropertyInteger maxWait);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxAge();

	/*! \brief Set 
	 */
	void setMaxAge(ConfigNodePropertyInteger maxAge);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getTestOnBorrow();

	/*! \brief Set 
	 */
	void setTestOnBorrow(ConfigNodePropertyBoolean testOnBorrow);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getTestOnReturn();

	/*! \brief Set 
	 */
	void setTestOnReturn(ConfigNodePropertyBoolean testOnReturn);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getTestWhileIdle();

	/*! \brief Set 
	 */
	void setTestWhileIdle(ConfigNodePropertyBoolean testWhileIdle);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getValidationQuery();

	/*! \brief Set 
	 */
	void setValidationQuery(ConfigNodePropertyString validationQuery);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getValidationQueryTimeout();

	/*! \brief Set 
	 */
	void setValidationQueryTimeout(ConfigNodePropertyInteger validationQueryTimeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getTimeBetweenEvictionRunsMillis();

	/*! \brief Set 
	 */
	void setTimeBetweenEvictionRunsMillis(ConfigNodePropertyInteger timeBetweenEvictionRunsMillis);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMinEvictableIdleTimeMillis();

	/*! \brief Set 
	 */
	void setMinEvictableIdleTimeMillis(ConfigNodePropertyInteger minEvictableIdleTimeMillis);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getConnectionProperties();

	/*! \brief Set 
	 */
	void setConnectionProperties(ConfigNodePropertyString connectionProperties);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getInitSQL();

	/*! \brief Set 
	 */
	void setInitSQL(ConfigNodePropertyString initSQL);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getJdbcInterceptors();

	/*! \brief Set 
	 */
	void setJdbcInterceptors(ConfigNodePropertyString jdbcInterceptors);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getValidationInterval();

	/*! \brief Set 
	 */
	void setValidationInterval(ConfigNodePropertyInteger validationInterval);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getLogValidationErrors();

	/*! \brief Set 
	 */
	void setLogValidationErrors(ConfigNodePropertyBoolean logValidationErrors);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getDatasourcesvcproperties();

	/*! \brief Set 
	 */
	void setDatasourcesvcproperties(ConfigNodePropertyArray datasourcesvcproperties);


    private:
    ConfigNodePropertyString datasourcename;
    ConfigNodePropertyString datasourcesvcpropname;
    ConfigNodePropertyString driverClassName;
    ConfigNodePropertyString url;
    ConfigNodePropertyString username;
    ConfigNodePropertyString password;
    ConfigNodePropertyDropDown defaultAutoCommit;
    ConfigNodePropertyDropDown defaultReadOnly;
    ConfigNodePropertyDropDown defaultTransactionIsolation;
    ConfigNodePropertyString defaultCatalog;
    ConfigNodePropertyInteger maxActive;
    ConfigNodePropertyInteger maxIdle;
    ConfigNodePropertyInteger minIdle;
    ConfigNodePropertyInteger initialSize;
    ConfigNodePropertyInteger maxWait;
    ConfigNodePropertyInteger maxAge;
    ConfigNodePropertyBoolean testOnBorrow;
    ConfigNodePropertyBoolean testOnReturn;
    ConfigNodePropertyBoolean testWhileIdle;
    ConfigNodePropertyString validationQuery;
    ConfigNodePropertyInteger validationQueryTimeout;
    ConfigNodePropertyInteger timeBetweenEvictionRunsMillis;
    ConfigNodePropertyInteger minEvictableIdleTimeMillis;
    ConfigNodePropertyString connectionProperties;
    ConfigNodePropertyString initSQL;
    ConfigNodePropertyString jdbcInterceptors;
    ConfigNodePropertyInteger validationInterval;
    ConfigNodePropertyBoolean logValidationErrors;
    ConfigNodePropertyArray datasourcesvcproperties;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingDatasourceDataSourceFactoryProperties_H_ */
