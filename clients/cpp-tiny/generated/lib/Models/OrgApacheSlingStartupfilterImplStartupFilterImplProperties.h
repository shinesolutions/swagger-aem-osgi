
/*
 * OrgApacheSlingStartupfilterImplStartupFilterImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingStartupfilterImplStartupFilterImplProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingStartupfilterImplStartupFilterImplProperties_H_


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

class OrgApacheSlingStartupfilterImplStartupFilterImplProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingStartupfilterImplStartupFilterImplProperties();
    OrgApacheSlingStartupfilterImplStartupFilterImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingStartupfilterImplStartupFilterImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getActivebydefault();

	/*! \brief Set 
	 */
	void setActivebydefault(ConfigNodePropertyBoolean activebydefault);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDefaultmessage();

	/*! \brief Set 
	 */
	void setDefaultmessage(ConfigNodePropertyString defaultmessage);


    private:
    ConfigNodePropertyBoolean activebydefault;
    ConfigNodePropertyString defaultmessage;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingStartupfilterImplStartupFilterImplProperties_H_ */
