/*
 * ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties.h
 *
 * 
 */

#ifndef _ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties_H_
#define _ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyInteger.h"
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

class ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties();
	ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getAllowedpaths();

	/*! \brief Set 
	 */
	void setAllowedpaths(ConfigNodePropertyArray  allowedpaths);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqanalyticssaintexporterpagesize();

	/*! \brief Set 
	 */
	void setCqanalyticssaintexporterpagesize(ConfigNodePropertyInteger  cqanalyticssaintexporterpagesize);

private:
	ConfigNodePropertyArray allowedpaths;
	ConfigNodePropertyInteger cqanalyticssaintexporterpagesize;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties_H_ */
