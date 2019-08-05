/*
 * ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties_H_
#define _ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties_H_


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

class ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties();
	ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties();

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
	ConfigNodePropertyInteger getMaxqueuedjobs();

	/*! \brief Set 
	 */
	void setMaxqueuedjobs(ConfigNodePropertyInteger  maxqueuedjobs);

private:
	ConfigNodePropertyArray hctags;
	ConfigNodePropertyInteger maxqueuedjobs;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties_H_ */
