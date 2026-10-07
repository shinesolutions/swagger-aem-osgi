
/*
 * OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties_H_


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

class OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties();
    OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getReferences();

	/*! \brief Set 
	 */
	void setReferences(ConfigNodePropertyArray references);


    private:
    ConfigNodePropertyArray references;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties_H_ */
