
/*
 * ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties();
    ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getAutomoderationsequence();

	/*! \brief Set 
	 */
	void setAutomoderationsequence(ConfigNodePropertyArray automoderationsequence);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getAutomoderationonfailurestop();

	/*! \brief Set 
	 */
	void setAutomoderationonfailurestop(ConfigNodePropertyBoolean automoderationonfailurestop);


    private:
    ConfigNodePropertyArray automoderationsequence;
    ConfigNodePropertyBoolean automoderationonfailurestop;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties_H_ */
