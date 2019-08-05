/*
 * ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties_H_
#define _ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties_H_


#include <string>
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

class ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties();
	ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getSchedulerexpression();

	/*! \brief Set 
	 */
	void setSchedulerexpression(ConfigNodePropertyString  schedulerexpression);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getJobpurgethreshold();

	/*! \brief Set 
	 */
	void setJobpurgethreshold(ConfigNodePropertyInteger  jobpurgethreshold);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getJobpurgemaxjobs();

	/*! \brief Set 
	 */
	void setJobpurgemaxjobs(ConfigNodePropertyInteger  jobpurgemaxjobs);

private:
	ConfigNodePropertyString schedulerexpression;
	ConfigNodePropertyInteger jobpurgethreshold;
	ConfigNodePropertyInteger jobpurgemaxjobs;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties_H_ */
