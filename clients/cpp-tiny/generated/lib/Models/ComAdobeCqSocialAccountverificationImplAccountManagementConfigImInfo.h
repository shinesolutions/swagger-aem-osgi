
/*
 * ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo();
    ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo();


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
	ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties properties);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties properties;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo_H_ */
