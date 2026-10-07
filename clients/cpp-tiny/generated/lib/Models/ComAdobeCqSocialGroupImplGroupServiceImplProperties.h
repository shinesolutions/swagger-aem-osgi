
/*
 * ComAdobeCqSocialGroupImplGroupServiceImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialGroupImplGroupServiceImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialGroupImplGroupServiceImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqSocialGroupImplGroupServiceImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialGroupImplGroupServiceImplProperties();
    ComAdobeCqSocialGroupImplGroupServiceImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialGroupImplGroupServiceImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxWaitTime();

	/*! \brief Set 
	 */
	void setMaxWaitTime(ConfigNodePropertyInteger maxWaitTime);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMinWaitBetweenRetries();

	/*! \brief Set 
	 */
	void setMinWaitBetweenRetries(ConfigNodePropertyInteger minWaitBetweenRetries);


    private:
    ConfigNodePropertyInteger maxWaitTime;
    ConfigNodePropertyInteger minWaitBetweenRetries;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialGroupImplGroupServiceImplProperties_H_ */
