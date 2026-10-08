
/*
 * ComDayCqWcmFoundationImplPageImpressionsTrackerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmFoundationImplPageImpressionsTrackerProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmFoundationImplPageImpressionsTrackerProperties_H_


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

class ComDayCqWcmFoundationImplPageImpressionsTrackerProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmFoundationImplPageImpressionsTrackerProperties();
    ComDayCqWcmFoundationImplPageImpressionsTrackerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmFoundationImplPageImpressionsTrackerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingauthrequirements();

	/*! \brief Set 
	 */
	void setSlingauthrequirements(ConfigNodePropertyString slingauthrequirements);


    private:
    ConfigNodePropertyString slingauthrequirements;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmFoundationImplPageImpressionsTrackerProperties_H_ */
