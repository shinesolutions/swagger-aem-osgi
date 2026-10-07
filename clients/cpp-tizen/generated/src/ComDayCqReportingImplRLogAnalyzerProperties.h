/*
 * ComDayCqReportingImplRLogAnalyzerProperties.h
 *
 * 
 */

#ifndef _ComDayCqReportingImplRLogAnalyzerProperties_H_
#define _ComDayCqReportingImplRLogAnalyzerProperties_H_


#include <string>
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

class ComDayCqReportingImplRLogAnalyzerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqReportingImplRLogAnalyzerProperties();
	ComDayCqReportingImplRLogAnalyzerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqReportingImplRLogAnalyzerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getRequestlogoutput();

	/*! \brief Set 
	 */
	void setRequestlogoutput(ConfigNodePropertyString  requestlogoutput);

private:
	ConfigNodePropertyString requestlogoutput;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqReportingImplRLogAnalyzerProperties_H_ */
