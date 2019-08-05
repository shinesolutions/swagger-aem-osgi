/*
 * ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties_H_
#define _ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties();
	ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getHctags();

	/*! \brief Set 
	 */
	void setHctags(ConfigNodePropertyArray  hctags);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getIgnoredbundles();

	/*! \brief Set 
	 */
	void setIgnoredbundles(ConfigNodePropertyArray  ignoredbundles);

private:
	ConfigNodePropertyArray hctags;
	ConfigNodePropertyArray ignoredbundles;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties_H_ */
