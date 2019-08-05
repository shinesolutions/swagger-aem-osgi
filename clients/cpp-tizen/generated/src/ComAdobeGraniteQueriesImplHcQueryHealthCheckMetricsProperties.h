/*
 * ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties_H_
#define _ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties_H_


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

class ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties();
	ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getGetPeriod();

	/*! \brief Set 
	 */
	void setGetPeriod(ConfigNodePropertyInteger  getPeriod);

private:
	ConfigNodePropertyInteger getPeriod;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties_H_ */
