
/*
 * ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties_H_
#define TINY_CPP_CLIENT_ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties();
    ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getJdbcdriverclass();

	/*! \brief Set 
	 */
	void setJdbcdriverclass(ConfigNodePropertyString jdbcdriverclass);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getJdbcconnectionuri();

	/*! \brief Set 
	 */
	void setJdbcconnectionuri(ConfigNodePropertyString jdbcconnectionuri);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getJdbcusername();

	/*! \brief Set 
	 */
	void setJdbcusername(ConfigNodePropertyString jdbcusername);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getJdbcpassword();

	/*! \brief Set 
	 */
	void setJdbcpassword(ConfigNodePropertyString jdbcpassword);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getJdbcvalidationquery();

	/*! \brief Set 
	 */
	void setJdbcvalidationquery(ConfigNodePropertyString jdbcvalidationquery);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getDefaultreadonly();

	/*! \brief Set 
	 */
	void setDefaultreadonly(ConfigNodePropertyBoolean defaultreadonly);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getDefaultautocommit();

	/*! \brief Set 
	 */
	void setDefaultautocommit(ConfigNodePropertyBoolean defaultautocommit);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getPoolsize();

	/*! \brief Set 
	 */
	void setPoolsize(ConfigNodePropertyInteger poolsize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getPoolmaxwaitmsec();

	/*! \brief Set 
	 */
	void setPoolmaxwaitmsec(ConfigNodePropertyInteger poolmaxwaitmsec);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDatasourcename();

	/*! \brief Set 
	 */
	void setDatasourcename(ConfigNodePropertyString datasourcename);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getDatasourcesvcproperties();

	/*! \brief Set 
	 */
	void setDatasourcesvcproperties(ConfigNodePropertyArray datasourcesvcproperties);


    private:
    ConfigNodePropertyString jdbcdriverclass;
    ConfigNodePropertyString jdbcconnectionuri;
    ConfigNodePropertyString jdbcusername;
    ConfigNodePropertyString jdbcpassword;
    ConfigNodePropertyString jdbcvalidationquery;
    ConfigNodePropertyBoolean defaultreadonly;
    ConfigNodePropertyBoolean defaultautocommit;
    ConfigNodePropertyInteger poolsize;
    ConfigNodePropertyInteger poolmaxwaitmsec;
    ConfigNodePropertyString datasourcename;
    ConfigNodePropertyArray datasourcesvcproperties;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties_H_ */
