
/*
 * ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties();
    ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getSchedulerexpression();

	/*! \brief Set 
	 */
	void setSchedulerexpression(ConfigNodePropertyString schedulerexpression);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getJobpurgethreshold();

	/*! \brief Set 
	 */
	void setJobpurgethreshold(ConfigNodePropertyInteger jobpurgethreshold);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getJobpurgemaxjobs();

	/*! \brief Set 
	 */
	void setJobpurgemaxjobs(ConfigNodePropertyInteger jobpurgemaxjobs);


    private:
    ConfigNodePropertyString schedulerexpression;
    ConfigNodePropertyInteger jobpurgethreshold;
    ConfigNodePropertyInteger jobpurgemaxjobs;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties_H_ */
