
/*
 * ComDayCqAuthImplCugCugSupportImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqAuthImplCugCugSupportImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqAuthImplCugCugSupportImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqAuthImplCugCugSupportImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqAuthImplCugCugSupportImplProperties();
    ComDayCqAuthImplCugCugSupportImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqAuthImplCugCugSupportImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCugexemptedprincipals();

	/*! \brief Set 
	 */
	void setCugexemptedprincipals(ConfigNodePropertyArray cugexemptedprincipals);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCugenabled();

	/*! \brief Set 
	 */
	void setCugenabled(ConfigNodePropertyBoolean cugenabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCugprincipalsregex();

	/*! \brief Set 
	 */
	void setCugprincipalsregex(ConfigNodePropertyString cugprincipalsregex);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCugprincipalsreplacement();

	/*! \brief Set 
	 */
	void setCugprincipalsreplacement(ConfigNodePropertyString cugprincipalsreplacement);


    private:
    ConfigNodePropertyArray cugexemptedprincipals;
    ConfigNodePropertyBoolean cugenabled;
    ConfigNodePropertyString cugprincipalsregex;
    ConfigNodePropertyString cugprincipalsreplacement;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqAuthImplCugCugSupportImplProperties_H_ */
