
/*
 * ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties();
    ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getEveryoneLimit();

	/*! \brief Set 
	 */
	void setEveryoneLimit(ConfigNodePropertyInteger everyoneLimit);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getPriority();

	/*! \brief Set 
	 */
	void setPriority(ConfigNodePropertyInteger priority);


    private:
    ConfigNodePropertyInteger everyoneLimit;
    ConfigNodePropertyInteger priority;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties_H_ */
