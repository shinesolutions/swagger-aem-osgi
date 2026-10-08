
/*
 * ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties_H_


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

class ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties();
    ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getDefaultattachmenttypeblacklist();

	/*! \brief Set 
	 */
	void setDefaultattachmenttypeblacklist(ConfigNodePropertyArray defaultattachmenttypeblacklist);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getBaselineattachmenttypeblacklist();

	/*! \brief Set 
	 */
	void setBaselineattachmenttypeblacklist(ConfigNodePropertyArray baselineattachmenttypeblacklist);


    private:
    ConfigNodePropertyArray defaultattachmenttypeblacklist;
    ConfigNodePropertyArray baselineattachmenttypeblacklist;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties_H_ */
