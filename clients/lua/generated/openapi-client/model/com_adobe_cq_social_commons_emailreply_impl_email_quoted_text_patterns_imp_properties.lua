--[[
  Adobe Experience Manager OSGI config (AEM) API
 
  Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 
  OpenAPI spec version: 1.0.0-pre.0
  Contact: opensource@shinesolutions.com
  Generated by: https://openapi-generator.tech
]]

-- com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties class
local com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties = {}
local com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties_mt = {
	__name = "com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties";
	__index = com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties;
}

local function cast_com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties(t)
	return setmetatable(t, com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties_mt)
end

local function new_com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties(pattern_time, pattern_newline, pattern_day_of_month, pattern_month, pattern_year, pattern_date, pattern_date_time, pattern_email)
	return cast_com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties({
		["pattern.time"] = pattern_time;
		["pattern.newline"] = pattern_newline;
		["pattern.dayOfMonth"] = pattern_day_of_month;
		["pattern.month"] = pattern_month;
		["pattern.year"] = pattern_year;
		["pattern.date"] = pattern_date;
		["pattern.dateTime"] = pattern_date_time;
		["pattern.email"] = pattern_email;
	})
end

return {
	cast = cast_com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties;
	new = new_com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties;
}