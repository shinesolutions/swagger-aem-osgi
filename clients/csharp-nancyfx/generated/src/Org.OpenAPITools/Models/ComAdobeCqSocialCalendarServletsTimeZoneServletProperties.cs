using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialCalendarServletsTimeZoneServletProperties
    /// </summary>
    public sealed class ComAdobeCqSocialCalendarServletsTimeZoneServletProperties:  IEquatable<ComAdobeCqSocialCalendarServletsTimeZoneServletProperties>
    { 
        /// <summary>
        /// TimezonesExpirytime
        /// </summary>
        public ConfigNodePropertyInteger TimezonesExpirytime { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialCalendarServletsTimeZoneServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialCalendarServletsTimeZoneServletProperties()
        {
        }

        private ComAdobeCqSocialCalendarServletsTimeZoneServletProperties(ConfigNodePropertyInteger TimezonesExpirytime)
        {
            
            this.TimezonesExpirytime = TimezonesExpirytime;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialCalendarServletsTimeZoneServletProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCalendarServletsTimeZoneServletPropertiesBuilder</returns>
        public static ComAdobeCqSocialCalendarServletsTimeZoneServletPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialCalendarServletsTimeZoneServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialCalendarServletsTimeZoneServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCalendarServletsTimeZoneServletPropertiesBuilder</returns>
        public ComAdobeCqSocialCalendarServletsTimeZoneServletPropertiesBuilder With()
        {
            return Builder()
                .TimezonesExpirytime(TimezonesExpirytime);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialCalendarServletsTimeZoneServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialCalendarServletsTimeZoneServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCalendarServletsTimeZoneServletProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialCalendarServletsTimeZoneServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialCalendarServletsTimeZoneServletProperties left, ComAdobeCqSocialCalendarServletsTimeZoneServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialCalendarServletsTimeZoneServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCalendarServletsTimeZoneServletProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialCalendarServletsTimeZoneServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialCalendarServletsTimeZoneServletProperties left, ComAdobeCqSocialCalendarServletsTimeZoneServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialCalendarServletsTimeZoneServletProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialCalendarServletsTimeZoneServletPropertiesBuilder
        {
            private ConfigNodePropertyInteger _TimezonesExpirytime;

            internal ComAdobeCqSocialCalendarServletsTimeZoneServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCalendarServletsTimeZoneServletProperties.TimezonesExpirytime property.
            /// </summary>
            /// <param name="value">TimezonesExpirytime</param>
            public ComAdobeCqSocialCalendarServletsTimeZoneServletPropertiesBuilder TimezonesExpirytime(ConfigNodePropertyInteger value)
            {
                _TimezonesExpirytime = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialCalendarServletsTimeZoneServletProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialCalendarServletsTimeZoneServletProperties</returns>
            public ComAdobeCqSocialCalendarServletsTimeZoneServletProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialCalendarServletsTimeZoneServletProperties(
                    TimezonesExpirytime: _TimezonesExpirytime
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}