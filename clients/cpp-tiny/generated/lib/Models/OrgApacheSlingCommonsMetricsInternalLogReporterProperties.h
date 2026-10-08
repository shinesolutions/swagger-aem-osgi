
/*
 * OrgApacheSlingCommonsMetricsInternalLogReporterProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingCommonsMetricsInternalLogReporterProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingCommonsMetricsInternalLogReporterProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingCommonsMetricsInternalLogReporterProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingCommonsMetricsInternalLogReporterProperties();
    OrgApacheSlingCommonsMetricsInternalLogReporterProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingCommonsMetricsInternalLogReporterProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getPeriod();

	/*! \brief Set 
	 */
	void setPeriod(ConfigNodePropertyInteger period);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getTimeUnit();

	/*! \brief Set 
	 */
	void setTimeUnit(ConfigNodePropertyDropDown timeUnit);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getLevel();

	/*! \brief Set 
	 */
	void setLevel(ConfigNodePropertyDropDown level);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getLoggerName();

	/*! \brief Set 
	 */
	void setLoggerName(ConfigNodePropertyString loggerName);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPrefix();

	/*! \brief Set 
	 */
	void setPrefix(ConfigNodePropertyString prefix);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPattern();

	/*! \brief Set 
	 */
	void setPattern(ConfigNodePropertyString pattern);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getRegistryName();

	/*! \brief Set 
	 */
	void setRegistryName(ConfigNodePropertyString registryName);


    private:
    ConfigNodePropertyInteger period;
    ConfigNodePropertyDropDown timeUnit;
    ConfigNodePropertyDropDown level;
    ConfigNodePropertyString loggerName;
    ConfigNodePropertyString prefix;
    ConfigNodePropertyString pattern;
    ConfigNodePropertyString registryName;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingCommonsMetricsInternalLogReporterProperties_H_ */
