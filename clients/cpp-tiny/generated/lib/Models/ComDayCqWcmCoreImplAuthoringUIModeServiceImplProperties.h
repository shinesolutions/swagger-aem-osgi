
/*
 * ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties_H_


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

class ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties();
    ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getAuthoringUIModeServicedefault();

	/*! \brief Set 
	 */
	void setAuthoringUIModeServicedefault(ConfigNodePropertyString authoringUIModeServicedefault);


    private:
    ConfigNodePropertyString authoringUIModeServicedefault;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties_H_ */
