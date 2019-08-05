/*
 * ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties_H_
#define _ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties_H_


#include <string>
#include "ConfigNodePropertyString.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties();
	ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getPatterntime();

	/*! \brief Set 
	 */
	void setPatterntime(ConfigNodePropertyString  patterntime);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPatternnewline();

	/*! \brief Set 
	 */
	void setPatternnewline(ConfigNodePropertyString  patternnewline);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPatterndayOfMonth();

	/*! \brief Set 
	 */
	void setPatterndayOfMonth(ConfigNodePropertyString  patterndayOfMonth);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPatternmonth();

	/*! \brief Set 
	 */
	void setPatternmonth(ConfigNodePropertyString  patternmonth);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPatternyear();

	/*! \brief Set 
	 */
	void setPatternyear(ConfigNodePropertyString  patternyear);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPatterndate();

	/*! \brief Set 
	 */
	void setPatterndate(ConfigNodePropertyString  patterndate);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPatterndateTime();

	/*! \brief Set 
	 */
	void setPatterndateTime(ConfigNodePropertyString  patterndateTime);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPatternemail();

	/*! \brief Set 
	 */
	void setPatternemail(ConfigNodePropertyString  patternemail);

private:
	ConfigNodePropertyString patterntime;
	ConfigNodePropertyString patternnewline;
	ConfigNodePropertyString patterndayOfMonth;
	ConfigNodePropertyString patternmonth;
	ConfigNodePropertyString patternyear;
	ConfigNodePropertyString patterndate;
	ConfigNodePropertyString patterndateTime;
	ConfigNodePropertyString patternemail;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties_H_ */
