
/*
 * OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties();
    OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getDatasources();

	/*! \brief Set 
	 */
	void setDatasources(ConfigNodePropertyArray datasources);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getStep();

	/*! \brief Set 
	 */
	void setStep(ConfigNodePropertyInteger step);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getArchives();

	/*! \brief Set 
	 */
	void setArchives(ConfigNodePropertyArray archives);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPath();

	/*! \brief Set 
	 */
	void setPath(ConfigNodePropertyString path);


    private:
    ConfigNodePropertyArray datasources;
    ConfigNodePropertyInteger step;
    ConfigNodePropertyArray archives;
    ConfigNodePropertyString path;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties_H_ */
