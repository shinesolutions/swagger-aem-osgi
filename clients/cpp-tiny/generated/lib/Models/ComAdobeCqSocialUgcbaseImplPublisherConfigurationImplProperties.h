
/*
 * ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties();
    ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getIsPrimaryPublisher();

	/*! \brief Set 
	 */
	void setIsPrimaryPublisher(ConfigNodePropertyBoolean isPrimaryPublisher);


    private:
    ConfigNodePropertyBoolean isPrimaryPublisher;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties_H_ */
