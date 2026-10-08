
/*
 * ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties_H_


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

class ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties();
    ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getPatterntime();

	/*! \brief Set 
	 */
	void setPatterntime(ConfigNodePropertyString patterntime);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPatternnewline();

	/*! \brief Set 
	 */
	void setPatternnewline(ConfigNodePropertyString patternnewline);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPatterndayOfMonth();

	/*! \brief Set 
	 */
	void setPatterndayOfMonth(ConfigNodePropertyString patterndayOfMonth);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPatternmonth();

	/*! \brief Set 
	 */
	void setPatternmonth(ConfigNodePropertyString patternmonth);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPatternyear();

	/*! \brief Set 
	 */
	void setPatternyear(ConfigNodePropertyString patternyear);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPatterndate();

	/*! \brief Set 
	 */
	void setPatterndate(ConfigNodePropertyString patterndate);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPatterndateTime();

	/*! \brief Set 
	 */
	void setPatterndateTime(ConfigNodePropertyString patterndateTime);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPatternemail();

	/*! \brief Set 
	 */
	void setPatternemail(ConfigNodePropertyString patternemail);


    private:
    ConfigNodePropertyString patterntime;
    ConfigNodePropertyString patternnewline;
    ConfigNodePropertyString patterndayOfMonth;
    ConfigNodePropertyString patternmonth;
    ConfigNodePropertyString patternyear;
    ConfigNodePropertyString patterndate;
    ConfigNodePropertyString patterndateTime;
    ConfigNodePropertyString patternemail;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties_H_ */
