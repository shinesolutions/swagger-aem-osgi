
/*
 * ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties_H_


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

class ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties();
    ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getFieldWhitelist();

	/*! \brief Set 
	 */
	void setFieldWhitelist(ConfigNodePropertyArray fieldWhitelist);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getAttachmentTypeBlacklist();

	/*! \brief Set 
	 */
	void setAttachmentTypeBlacklist(ConfigNodePropertyArray attachmentTypeBlacklist);


    private:
    ConfigNodePropertyArray fieldWhitelist;
    ConfigNodePropertyArray attachmentTypeBlacklist;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties_H_ */
