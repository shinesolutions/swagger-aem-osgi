/*
 * ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties.h
 *
 * 
 */

#ifndef _ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties_H_
#define _ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
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

class ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties();
	ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqanalyticstestandtargetsegmentimporterenabled();

	/*! \brief Set 
	 */
	void setCqanalyticstestandtargetsegmentimporterenabled(ConfigNodePropertyBoolean  cqanalyticstestandtargetsegmentimporterenabled);

private:
	ConfigNodePropertyBoolean cqanalyticstestandtargetsegmentimporterenabled;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties_H_ */
