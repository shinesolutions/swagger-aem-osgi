
/*
 * OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties_H_


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

class OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties();
    OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getUsers();

	/*! \brief Set 
	 */
	void setUsers(ConfigNodePropertyArray users);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getGroups();

	/*! \brief Set 
	 */
	void setGroups(ConfigNodePropertyArray groups);


    private:
    ConfigNodePropertyArray users;
    ConfigNodePropertyArray groups;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties_H_ */
