/*
 * ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.h
 *
 * 
 */

#ifndef _ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties_H_
#define _ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties();
	ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getJdbcdriverclass();

	/*! \brief Set 
	 */
	void setJdbcdriverclass(ConfigNodePropertyString  jdbcdriverclass);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getJdbcconnectionuri();

	/*! \brief Set 
	 */
	void setJdbcconnectionuri(ConfigNodePropertyString  jdbcconnectionuri);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getJdbcusername();

	/*! \brief Set 
	 */
	void setJdbcusername(ConfigNodePropertyString  jdbcusername);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getJdbcpassword();

	/*! \brief Set 
	 */
	void setJdbcpassword(ConfigNodePropertyString  jdbcpassword);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getJdbcvalidationquery();

	/*! \brief Set 
	 */
	void setJdbcvalidationquery(ConfigNodePropertyString  jdbcvalidationquery);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getDefaultreadonly();

	/*! \brief Set 
	 */
	void setDefaultreadonly(ConfigNodePropertyBoolean  defaultreadonly);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getDefaultautocommit();

	/*! \brief Set 
	 */
	void setDefaultautocommit(ConfigNodePropertyBoolean  defaultautocommit);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getPoolsize();

	/*! \brief Set 
	 */
	void setPoolsize(ConfigNodePropertyInteger  poolsize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getPoolmaxwaitmsec();

	/*! \brief Set 
	 */
	void setPoolmaxwaitmsec(ConfigNodePropertyInteger  poolmaxwaitmsec);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDatasourcename();

	/*! \brief Set 
	 */
	void setDatasourcename(ConfigNodePropertyString  datasourcename);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getDatasourcesvcproperties();

	/*! \brief Set 
	 */
	void setDatasourcesvcproperties(ConfigNodePropertyArray  datasourcesvcproperties);

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
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties_H_ */
