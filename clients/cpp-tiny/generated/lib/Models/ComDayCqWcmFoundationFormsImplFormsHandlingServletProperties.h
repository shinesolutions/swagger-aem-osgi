
/*
 * ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties_H_


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

class ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties();
    ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getNamewhitelist();

	/*! \brief Set 
	 */
	void setNamewhitelist(ConfigNodePropertyString namewhitelist);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getAllowexpressions();

	/*! \brief Set 
	 */
	void setAllowexpressions(ConfigNodePropertyBoolean allowexpressions);


    private:
    ConfigNodePropertyString namewhitelist;
    ConfigNodePropertyBoolean allowexpressions;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties_H_ */
