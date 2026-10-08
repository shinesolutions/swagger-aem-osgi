
/*
 * ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties_H_


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

class ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties();
    ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties();


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


    private:
    ConfigNodePropertyArray fieldWhitelist;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties_H_ */
