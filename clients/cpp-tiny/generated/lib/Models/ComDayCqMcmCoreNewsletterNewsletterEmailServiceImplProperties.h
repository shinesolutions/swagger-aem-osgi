
/*
 * ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties_H_


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

class ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties();
    ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getFromaddress();

	/*! \brief Set 
	 */
	void setFromaddress(ConfigNodePropertyString fromaddress);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSenderhost();

	/*! \brief Set 
	 */
	void setSenderhost(ConfigNodePropertyString senderhost);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getMaxbouncecount();

	/*! \brief Set 
	 */
	void setMaxbouncecount(ConfigNodePropertyString maxbouncecount);


    private:
    ConfigNodePropertyString fromaddress;
    ConfigNodePropertyString senderhost;
    ConfigNodePropertyString maxbouncecount;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties_H_ */
