
/*
 * ComDayCqDamCoreImplServletResourceCollectionServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamCoreImplServletResourceCollectionServletProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamCoreImplServletResourceCollectionServletProperties_H_


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

class ComDayCqDamCoreImplServletResourceCollectionServletProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamCoreImplServletResourceCollectionServletProperties();
    ComDayCqDamCoreImplServletResourceCollectionServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamCoreImplServletResourceCollectionServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getSlingservletresourceTypes();

	/*! \brief Set 
	 */
	void setSlingservletresourceTypes(ConfigNodePropertyArray slingservletresourceTypes);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingservletmethods();

	/*! \brief Set 
	 */
	void setSlingservletmethods(ConfigNodePropertyString slingservletmethods);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingservletselectors();

	/*! \brief Set 
	 */
	void setSlingservletselectors(ConfigNodePropertyString slingservletselectors);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDownloadconfig();

	/*! \brief Set 
	 */
	void setDownloadconfig(ConfigNodePropertyString downloadconfig);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getViewselector();

	/*! \brief Set 
	 */
	void setViewselector(ConfigNodePropertyString viewselector);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getSendEmail();

	/*! \brief Set 
	 */
	void setSendEmail(ConfigNodePropertyBoolean send_email);


    private:
    ConfigNodePropertyArray slingservletresourceTypes;
    ConfigNodePropertyString slingservletmethods;
    ConfigNodePropertyString slingservletselectors;
    ConfigNodePropertyString downloadconfig;
    ConfigNodePropertyString viewselector;
    ConfigNodePropertyBoolean send_email;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamCoreImplServletResourceCollectionServletProperties_H_ */
