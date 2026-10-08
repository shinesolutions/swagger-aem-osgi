
/*
 * ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo();
    ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo();


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
	ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties properties);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties properties;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo_H_ */
