/*
 * ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties.h
 *
 * 
 */

#ifndef _ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties_H_
#define _ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties_H_


#include <string>
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

class ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties();
	ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getReportfetchattempts();

	/*! \brief Set 
	 */
	void setReportfetchattempts(ConfigNodePropertyInteger  reportfetchattempts);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getReportfetchdelay();

	/*! \brief Set 
	 */
	void setReportfetchdelay(ConfigNodePropertyInteger  reportfetchdelay);

private:
	ConfigNodePropertyInteger reportfetchattempts;
	ConfigNodePropertyInteger reportfetchdelay;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties_H_ */
