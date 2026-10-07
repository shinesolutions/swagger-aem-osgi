
/*
 * ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties_H_


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

class ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties();
    ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getAdaptsupportedwidths();

	/*! \brief Set 
	 */
	void setAdaptsupportedwidths(ConfigNodePropertyArray adaptsupportedwidths);


    private:
    ConfigNodePropertyArray adaptsupportedwidths;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties_H_ */
