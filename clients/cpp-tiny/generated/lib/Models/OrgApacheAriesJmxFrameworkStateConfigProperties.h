
/*
 * OrgApacheAriesJmxFrameworkStateConfigProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheAriesJmxFrameworkStateConfigProperties_H_
#define TINY_CPP_CLIENT_OrgApacheAriesJmxFrameworkStateConfigProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheAriesJmxFrameworkStateConfigProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheAriesJmxFrameworkStateConfigProperties();
    OrgApacheAriesJmxFrameworkStateConfigProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheAriesJmxFrameworkStateConfigProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getAttributeChangeNotificationEnabled();

	/*! \brief Set 
	 */
	void setAttributeChangeNotificationEnabled(ConfigNodePropertyBoolean attributeChangeNotificationEnabled);


    private:
    ConfigNodePropertyBoolean attributeChangeNotificationEnabled;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheAriesJmxFrameworkStateConfigProperties_H_ */
