/*
 * OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties_H_
#define _OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties();
	OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getDatasources();

	/*! \brief Set 
	 */
	void setDatasources(ConfigNodePropertyArray  datasources);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getStep();

	/*! \brief Set 
	 */
	void setStep(ConfigNodePropertyInteger  step);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getArchives();

	/*! \brief Set 
	 */
	void setArchives(ConfigNodePropertyArray  archives);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPath();

	/*! \brief Set 
	 */
	void setPath(ConfigNodePropertyString  path);

private:
	ConfigNodePropertyArray datasources;
	ConfigNodePropertyInteger step;
	ConfigNodePropertyArray archives;
	ConfigNodePropertyString path;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties_H_ */
