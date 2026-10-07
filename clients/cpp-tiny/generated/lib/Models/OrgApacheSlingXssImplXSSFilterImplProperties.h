
/*
 * OrgApacheSlingXssImplXSSFilterImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingXssImplXSSFilterImplProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingXssImplXSSFilterImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingXssImplXSSFilterImplProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingXssImplXSSFilterImplProperties();
    OrgApacheSlingXssImplXSSFilterImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingXssImplXSSFilterImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getPolicyPath();

	/*! \brief Set 
	 */
	void setPolicyPath(ConfigNodePropertyString policyPath);


    private:
    ConfigNodePropertyString policyPath;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingXssImplXSSFilterImplProperties_H_ */
