
/*
 * ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties();
    ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnable();

	/*! \brief Set 
	 */
	void setEnable(ConfigNodePropertyBoolean enable);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getUGCLimit();

	/*! \brief Set 
	 */
	void setUGCLimit(ConfigNodePropertyInteger uGCLimit);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getUgcLimitDuration();

	/*! \brief Set 
	 */
	void setUgcLimitDuration(ConfigNodePropertyInteger ugcLimitDuration);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getDomains();

	/*! \brief Set 
	 */
	void setDomains(ConfigNodePropertyArray domains);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getToList();

	/*! \brief Set 
	 */
	void setToList(ConfigNodePropertyArray toList);


    private:
    ConfigNodePropertyBoolean enable;
    ConfigNodePropertyInteger uGCLimit;
    ConfigNodePropertyInteger ugcLimitDuration;
    ConfigNodePropertyArray domains;
    ConfigNodePropertyArray toList;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties_H_ */
