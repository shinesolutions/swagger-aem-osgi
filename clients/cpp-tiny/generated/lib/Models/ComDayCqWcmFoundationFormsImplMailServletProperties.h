
/*
 * ComDayCqWcmFoundationFormsImplMailServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmFoundationFormsImplMailServletProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmFoundationFormsImplMailServletProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqWcmFoundationFormsImplMailServletProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmFoundationFormsImplMailServletProperties();
    ComDayCqWcmFoundationFormsImplMailServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmFoundationFormsImplMailServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
	ConfigNodePropertyArray getResourcewhitelist();

	/*! \brief Set 
	 */
	void setResourcewhitelist(ConfigNodePropertyArray resourcewhitelist);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getResourceblacklist();

	/*! \brief Set 
	 */
	void setResourceblacklist(ConfigNodePropertyString resourceblacklist);


    private:
    ConfigNodePropertyString slingservletresourceTypes;
    ConfigNodePropertyString slingservletselectors;
    ConfigNodePropertyArray resourcewhitelist;
    ConfigNodePropertyString resourceblacklist;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmFoundationFormsImplMailServletProperties_H_ */
