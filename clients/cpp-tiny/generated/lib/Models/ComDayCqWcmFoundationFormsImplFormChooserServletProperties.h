
/*
 * ComDayCqWcmFoundationFormsImplFormChooserServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmFoundationFormsImplFormChooserServletProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmFoundationFormsImplFormChooserServletProperties_H_


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

class ComDayCqWcmFoundationFormsImplFormChooserServletProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmFoundationFormsImplFormChooserServletProperties();
    ComDayCqWcmFoundationFormsImplFormChooserServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmFoundationFormsImplFormChooserServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getServicename();

	/*! \brief Set 
	 */
	void setServicename(ConfigNodePropertyString servicename);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingservletresourceTypes();

	/*! \brief Set 
	 */
	void setSlingservletresourceTypes(ConfigNodePropertyString slingservletresourceTypes);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingservletselectors();

	/*! \brief Set 
	 */
	void setSlingservletselectors(ConfigNodePropertyString slingservletselectors);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getSlingservletmethods();

	/*! \brief Set 
	 */
	void setSlingservletmethods(ConfigNodePropertyArray slingservletmethods);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getFormsformchooserservletadvansesearchrequire();

	/*! \brief Set 
	 */
	void setFormsformchooserservletadvansesearchrequire(ConfigNodePropertyBoolean formsformchooserservletadvansesearchrequire);


    private:
    ConfigNodePropertyString servicename;
    ConfigNodePropertyString slingservletresourceTypes;
    ConfigNodePropertyString slingservletselectors;
    ConfigNodePropertyArray slingservletmethods;
    ConfigNodePropertyBoolean formsformchooserservletadvansesearchrequire;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmFoundationFormsImplFormChooserServletProperties_H_ */
