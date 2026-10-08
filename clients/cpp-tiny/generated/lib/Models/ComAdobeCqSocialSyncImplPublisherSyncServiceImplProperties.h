
/*
 * ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties();
    ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getActiveRunModes();

	/*! \brief Set 
	 */
	void setActiveRunModes(ConfigNodePropertyArray activeRunModes);


    private:
    ConfigNodePropertyArray activeRunModes;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties_H_ */
