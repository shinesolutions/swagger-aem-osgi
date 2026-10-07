
/*
 * ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo();
    ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getPid();

	/*! \brief Set 
	 */
	void setPid(std::string pid);
	/*! \brief Get 
	 */
	std::string getTitle();

	/*! \brief Set 
	 */
	void setTitle(std::string title);
	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string description);
	/*! \brief Get 
	 */
	ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties properties);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties properties;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo_H_ */
