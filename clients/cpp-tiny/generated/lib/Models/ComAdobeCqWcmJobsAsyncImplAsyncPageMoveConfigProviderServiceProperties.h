
/*
 * ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties();
    ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getThreshold();

	/*! \brief Set 
	 */
	void setThreshold(ConfigNodePropertyInteger threshold);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getJobTopicName();

	/*! \brief Set 
	 */
	void setJobTopicName(ConfigNodePropertyString jobTopicName);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEmailEnabled();

	/*! \brief Set 
	 */
	void setEmailEnabled(ConfigNodePropertyBoolean emailEnabled);


    private:
    ConfigNodePropertyInteger threshold;
    ConfigNodePropertyString jobTopicName;
    ConfigNodePropertyBoolean emailEnabled;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties_H_ */
