
/*
 * OrgApacheSlingServletsPostImplSlingPostServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingServletsPostImplSlingPostServletProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingServletsPostImplSlingPostServletProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingServletsPostImplSlingPostServletProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingServletsPostImplSlingPostServletProperties();
    OrgApacheSlingServletsPostImplSlingPostServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingServletsPostImplSlingPostServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getServletpostdateFormats();

	/*! \brief Set 
	 */
	void setServletpostdateFormats(ConfigNodePropertyArray servletpostdateFormats);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getServletpostnodeNameHints();

	/*! \brief Set 
	 */
	void setServletpostnodeNameHints(ConfigNodePropertyArray servletpostnodeNameHints);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getServletpostnodeNameMaxLength();

	/*! \brief Set 
	 */
	void setServletpostnodeNameMaxLength(ConfigNodePropertyInteger servletpostnodeNameMaxLength);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getServletpostcheckinNewVersionableNodes();

	/*! \brief Set 
	 */
	void setServletpostcheckinNewVersionableNodes(ConfigNodePropertyBoolean servletpostcheckinNewVersionableNodes);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getServletpostautoCheckout();

	/*! \brief Set 
	 */
	void setServletpostautoCheckout(ConfigNodePropertyBoolean servletpostautoCheckout);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getServletpostautoCheckin();

	/*! \brief Set 
	 */
	void setServletpostautoCheckin(ConfigNodePropertyBoolean servletpostautoCheckin);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getServletpostignorePattern();

	/*! \brief Set 
	 */
	void setServletpostignorePattern(ConfigNodePropertyString servletpostignorePattern);


    private:
    ConfigNodePropertyArray servletpostdateFormats;
    ConfigNodePropertyArray servletpostnodeNameHints;
    ConfigNodePropertyInteger servletpostnodeNameMaxLength;
    ConfigNodePropertyBoolean servletpostcheckinNewVersionableNodes;
    ConfigNodePropertyBoolean servletpostautoCheckout;
    ConfigNodePropertyBoolean servletpostautoCheckin;
    ConfigNodePropertyString servletpostignorePattern;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingServletsPostImplSlingPostServletProperties_H_ */
