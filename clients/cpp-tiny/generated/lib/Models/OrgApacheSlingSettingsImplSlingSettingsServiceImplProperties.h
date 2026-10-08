
/*
 * OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties_H_


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

class OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties();
    OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingname();

	/*! \brief Set 
	 */
	void setSlingname(ConfigNodePropertyString slingname);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingdescription();

	/*! \brief Set 
	 */
	void setSlingdescription(ConfigNodePropertyString slingdescription);


    private:
    ConfigNodePropertyString slingname;
    ConfigNodePropertyString slingdescription;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties_H_ */
