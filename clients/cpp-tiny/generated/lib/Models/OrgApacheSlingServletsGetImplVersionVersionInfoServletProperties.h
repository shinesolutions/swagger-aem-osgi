
/*
 * OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties();
    OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getSlingservletselectors();

	/*! \brief Set 
	 */
	void setSlingservletselectors(ConfigNodePropertyArray slingservletselectors);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEcmaSuport();

	/*! \brief Set 
	 */
	void setEcmaSuport(ConfigNodePropertyBoolean ecmaSuport);


    private:
    ConfigNodePropertyArray slingservletselectors;
    ConfigNodePropertyBoolean ecmaSuport;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties_H_ */
