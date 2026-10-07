
/*
 * ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties_H_


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

class ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties();
    ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnableScheduledPostsSearch();

	/*! \brief Set 
	 */
	void setEnableScheduledPostsSearch(ConfigNodePropertyBoolean enableScheduledPostsSearch);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getNumberOfMinutes();

	/*! \brief Set 
	 */
	void setNumberOfMinutes(ConfigNodePropertyInteger numberOfMinutes);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxSearchLimit();

	/*! \brief Set 
	 */
	void setMaxSearchLimit(ConfigNodePropertyInteger maxSearchLimit);


    private:
    ConfigNodePropertyBoolean enableScheduledPostsSearch;
    ConfigNodePropertyInteger numberOfMinutes;
    ConfigNodePropertyInteger maxSearchLimit;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties_H_ */
