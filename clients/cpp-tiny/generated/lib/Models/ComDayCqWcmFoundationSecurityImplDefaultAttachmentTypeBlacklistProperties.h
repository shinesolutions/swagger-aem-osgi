
/*
 * ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties_H_


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

class ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties();
    ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties();


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

#endif /* TINY_CPP_CLIENT_ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties_H_ */
