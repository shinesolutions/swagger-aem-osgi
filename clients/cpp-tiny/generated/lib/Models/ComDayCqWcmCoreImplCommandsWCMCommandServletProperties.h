
/*
 * ComDayCqWcmCoreImplCommandsWCMCommandServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmCoreImplCommandsWCMCommandServletProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmCoreImplCommandsWCMCommandServletProperties_H_


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

class ComDayCqWcmCoreImplCommandsWCMCommandServletProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmCoreImplCommandsWCMCommandServletProperties();
    ComDayCqWcmCoreImplCommandsWCMCommandServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmCoreImplCommandsWCMCommandServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getWcmcommandservletdeleteWhitelist();

	/*! \brief Set 
	 */
	void setWcmcommandservletdeleteWhitelist(ConfigNodePropertyArray wcmcommandservletdelete_whitelist);


    private:
    ConfigNodePropertyArray wcmcommandservletdelete_whitelist;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmCoreImplCommandsWCMCommandServletProperties_H_ */
