/*
 * OrgApacheSlingCommonsMetricsInternalLogReporterProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingCommonsMetricsInternalLogReporterProperties_H_
#define _OrgApacheSlingCommonsMetricsInternalLogReporterProperties_H_


#include <string>
#include "ConfigNodePropertyDropDown.h"
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

class OrgApacheSlingCommonsMetricsInternalLogReporterProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingCommonsMetricsInternalLogReporterProperties();
	OrgApacheSlingCommonsMetricsInternalLogReporterProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingCommonsMetricsInternalLogReporterProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getPeriod();

	/*! \brief Set 
	 */
	void setPeriod(ConfigNodePropertyInteger  period);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getTimeUnit();

	/*! \brief Set 
	 */
	void setTimeUnit(ConfigNodePropertyDropDown  timeUnit);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getLevel();

	/*! \brief Set 
	 */
	void setLevel(ConfigNodePropertyDropDown  level);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getLoggerName();

	/*! \brief Set 
	 */
	void setLoggerName(ConfigNodePropertyString  loggerName);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPrefix();

	/*! \brief Set 
	 */
	void setPrefix(ConfigNodePropertyString  prefix);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPattern();

	/*! \brief Set 
	 */
	void setPattern(ConfigNodePropertyString  pattern);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getRegistryName();

	/*! \brief Set 
	 */
	void setRegistryName(ConfigNodePropertyString  registryName);

private:
	ConfigNodePropertyInteger period;
	ConfigNodePropertyDropDown timeUnit;
	ConfigNodePropertyDropDown level;
	ConfigNodePropertyString loggerName;
	ConfigNodePropertyString prefix;
	ConfigNodePropertyString pattern;
	ConfigNodePropertyString registryName;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingCommonsMetricsInternalLogReporterProperties_H_ */
