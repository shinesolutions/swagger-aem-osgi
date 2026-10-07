
/*
 * ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties();
    ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getEventtopics();

	/*! \brief Set 
	 */
	void setEventtopics(ConfigNodePropertyString eventtopics);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getEventfilter();

	/*! \brief Set 
	 */
	void setEventfilter(ConfigNodePropertyString eventfilter);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getVerbs();

	/*! \brief Set 
	 */
	void setVerbs(ConfigNodePropertyArray verbs);


    private:
    ConfigNodePropertyString eventtopics;
    ConfigNodePropertyString eventfilter;
    ConfigNodePropertyArray verbs;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties_H_ */
