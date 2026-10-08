
/*
 * ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties();
    ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqsocialcontentfragmentsservicesenabled();

	/*! \brief Set 
	 */
	void setCqsocialcontentfragmentsservicesenabled(ConfigNodePropertyBoolean cqsocialcontentfragmentsservicesenabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqsocialcontentfragmentsserviceswaitTimeSeconds();

	/*! \brief Set 
	 */
	void setCqsocialcontentfragmentsserviceswaitTimeSeconds(ConfigNodePropertyInteger cqsocialcontentfragmentsserviceswaitTimeSeconds);


    private:
    ConfigNodePropertyBoolean cqsocialcontentfragmentsservicesenabled;
    ConfigNodePropertyInteger cqsocialcontentfragmentsserviceswaitTimeSeconds;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties_H_ */
