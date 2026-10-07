
/*
 * ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties_H_


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

class ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties();
    ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getLegacyCloudUGCPathMapping();

	/*! \brief Set 
	 */
	void setLegacyCloudUGCPathMapping(ConfigNodePropertyBoolean legacyCloudUGCPathMapping);


    private:
    ConfigNodePropertyBoolean legacyCloudUGCPathMapping;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties_H_ */
