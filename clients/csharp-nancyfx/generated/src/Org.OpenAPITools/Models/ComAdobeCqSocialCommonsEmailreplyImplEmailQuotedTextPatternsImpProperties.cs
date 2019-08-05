using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties
    /// </summary>
    public sealed class ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties:  IEquatable<ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties>
    { 
        /// <summary>
        /// PatternTime
        /// </summary>
        public ConfigNodePropertyString PatternTime { get; private set; }

        /// <summary>
        /// PatternNewline
        /// </summary>
        public ConfigNodePropertyString PatternNewline { get; private set; }

        /// <summary>
        /// PatternDayOfMonth
        /// </summary>
        public ConfigNodePropertyString PatternDayOfMonth { get; private set; }

        /// <summary>
        /// PatternMonth
        /// </summary>
        public ConfigNodePropertyString PatternMonth { get; private set; }

        /// <summary>
        /// PatternYear
        /// </summary>
        public ConfigNodePropertyString PatternYear { get; private set; }

        /// <summary>
        /// PatternDate
        /// </summary>
        public ConfigNodePropertyString PatternDate { get; private set; }

        /// <summary>
        /// PatternDateTime
        /// </summary>
        public ConfigNodePropertyString PatternDateTime { get; private set; }

        /// <summary>
        /// PatternEmail
        /// </summary>
        public ConfigNodePropertyString PatternEmail { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties()
        {
        }

        private ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties(ConfigNodePropertyString PatternTime, ConfigNodePropertyString PatternNewline, ConfigNodePropertyString PatternDayOfMonth, ConfigNodePropertyString PatternMonth, ConfigNodePropertyString PatternYear, ConfigNodePropertyString PatternDate, ConfigNodePropertyString PatternDateTime, ConfigNodePropertyString PatternEmail)
        {
            
            this.PatternTime = PatternTime;
            
            this.PatternNewline = PatternNewline;
            
            this.PatternDayOfMonth = PatternDayOfMonth;
            
            this.PatternMonth = PatternMonth;
            
            this.PatternYear = PatternYear;
            
            this.PatternDate = PatternDate;
            
            this.PatternDateTime = PatternDateTime;
            
            this.PatternEmail = PatternEmail;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpPropertiesBuilder</returns>
        public static ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpPropertiesBuilder</returns>
        public ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpPropertiesBuilder With()
        {
            return Builder()
                .PatternTime(PatternTime)
                .PatternNewline(PatternNewline)
                .PatternDayOfMonth(PatternDayOfMonth)
                .PatternMonth(PatternMonth)
                .PatternYear(PatternYear)
                .PatternDate(PatternDate)
                .PatternDateTime(PatternDateTime)
                .PatternEmail(PatternEmail);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties left, ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties left, ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpPropertiesBuilder
        {
            private ConfigNodePropertyString _PatternTime;
            private ConfigNodePropertyString _PatternNewline;
            private ConfigNodePropertyString _PatternDayOfMonth;
            private ConfigNodePropertyString _PatternMonth;
            private ConfigNodePropertyString _PatternYear;
            private ConfigNodePropertyString _PatternDate;
            private ConfigNodePropertyString _PatternDateTime;
            private ConfigNodePropertyString _PatternEmail;

            internal ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties.PatternTime property.
            /// </summary>
            /// <param name="value">PatternTime</param>
            public ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpPropertiesBuilder PatternTime(ConfigNodePropertyString value)
            {
                _PatternTime = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties.PatternNewline property.
            /// </summary>
            /// <param name="value">PatternNewline</param>
            public ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpPropertiesBuilder PatternNewline(ConfigNodePropertyString value)
            {
                _PatternNewline = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties.PatternDayOfMonth property.
            /// </summary>
            /// <param name="value">PatternDayOfMonth</param>
            public ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpPropertiesBuilder PatternDayOfMonth(ConfigNodePropertyString value)
            {
                _PatternDayOfMonth = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties.PatternMonth property.
            /// </summary>
            /// <param name="value">PatternMonth</param>
            public ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpPropertiesBuilder PatternMonth(ConfigNodePropertyString value)
            {
                _PatternMonth = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties.PatternYear property.
            /// </summary>
            /// <param name="value">PatternYear</param>
            public ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpPropertiesBuilder PatternYear(ConfigNodePropertyString value)
            {
                _PatternYear = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties.PatternDate property.
            /// </summary>
            /// <param name="value">PatternDate</param>
            public ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpPropertiesBuilder PatternDate(ConfigNodePropertyString value)
            {
                _PatternDate = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties.PatternDateTime property.
            /// </summary>
            /// <param name="value">PatternDateTime</param>
            public ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpPropertiesBuilder PatternDateTime(ConfigNodePropertyString value)
            {
                _PatternDateTime = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties.PatternEmail property.
            /// </summary>
            /// <param name="value">PatternEmail</param>
            public ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpPropertiesBuilder PatternEmail(ConfigNodePropertyString value)
            {
                _PatternEmail = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties</returns>
            public ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties(
                    PatternTime: _PatternTime,
                    PatternNewline: _PatternNewline,
                    PatternDayOfMonth: _PatternDayOfMonth,
                    PatternMonth: _PatternMonth,
                    PatternYear: _PatternYear,
                    PatternDate: _PatternDate,
                    PatternDateTime: _PatternDateTime,
                    PatternEmail: _PatternEmail
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}