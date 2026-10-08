
/*
 * OrgApacheSlingResourcemergerPickerOverridingProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingResourcemergerPickerOverridingProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingResourcemergerPickerOverridingProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingResourcemergerPickerOverridingProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingResourcemergerPickerOverridingProperties();
    OrgApacheSlingResourcemergerPickerOverridingProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingResourcemergerPickerOverridingProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getMergeroot();

	/*! \brief Set 
	 */
	void setMergeroot(ConfigNodePropertyString mergeroot);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getMergereadOnly();

	/*! \brief Set 
	 */
	void setMergereadOnly(ConfigNodePropertyBoolean mergereadOnly);


    private:
    ConfigNodePropertyString mergeroot;
    ConfigNodePropertyBoolean mergereadOnly;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingResourcemergerPickerOverridingProperties_H_ */
