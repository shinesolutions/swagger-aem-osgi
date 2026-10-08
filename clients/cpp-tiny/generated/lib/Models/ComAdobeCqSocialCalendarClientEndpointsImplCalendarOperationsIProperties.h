
/*
 * ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties();
    ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxRetry();

	/*! \brief Set 
	 */
	void setMaxRetry(ConfigNodePropertyInteger maxRetry);
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
    ConfigNodePropertyInteger maxRetry;
    ConfigNodePropertyArray fieldWhitelist;
    ConfigNodePropertyArray attachmentTypeBlacklist;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties_H_ */
