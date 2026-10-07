
/*
 * ComDayCqContentsyncImplContentSyncManagerImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqContentsyncImplContentSyncManagerImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqContentsyncImplContentSyncManagerImplProperties_H_


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

class ComDayCqContentsyncImplContentSyncManagerImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqContentsyncImplContentSyncManagerImplProperties();
    ComDayCqContentsyncImplContentSyncManagerImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqContentsyncImplContentSyncManagerImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getContentsyncfallbackauthorizable();

	/*! \brief Set 
	 */
	void setContentsyncfallbackauthorizable(ConfigNodePropertyString contentsyncfallbackauthorizable);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getContentsyncfallbackupdateuser();

	/*! \brief Set 
	 */
	void setContentsyncfallbackupdateuser(ConfigNodePropertyString contentsyncfallbackupdateuser);


    private:
    ConfigNodePropertyString contentsyncfallbackauthorizable;
    ConfigNodePropertyString contentsyncfallbackupdateuser;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqContentsyncImplContentSyncManagerImplProperties_H_ */
