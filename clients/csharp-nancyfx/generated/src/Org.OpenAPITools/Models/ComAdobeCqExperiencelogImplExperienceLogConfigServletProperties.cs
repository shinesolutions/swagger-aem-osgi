using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties
    /// </summary>
    public sealed class ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties:  IEquatable<ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties>
    { 
        /// <summary>
        /// Enabled
        /// </summary>
        public ConfigNodePropertyBoolean Enabled { get; private set; }

        /// <summary>
        /// DisabledForGroups
        /// </summary>
        public ConfigNodePropertyArray DisabledForGroups { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties()
        {
        }

        private ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties(ConfigNodePropertyBoolean Enabled, ConfigNodePropertyArray DisabledForGroups)
        {
            
            this.Enabled = Enabled;
            
            this.DisabledForGroups = DisabledForGroups;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties.
        /// </summary>
        /// <returns>ComAdobeCqExperiencelogImplExperienceLogConfigServletPropertiesBuilder</returns>
        public static ComAdobeCqExperiencelogImplExperienceLogConfigServletPropertiesBuilder Builder()
        {
            return new ComAdobeCqExperiencelogImplExperienceLogConfigServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqExperiencelogImplExperienceLogConfigServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqExperiencelogImplExperienceLogConfigServletPropertiesBuilder</returns>
        public ComAdobeCqExperiencelogImplExperienceLogConfigServletPropertiesBuilder With()
        {
            return Builder()
                .Enabled(Enabled)
                .DisabledForGroups(DisabledForGroups);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties</param>
        /// <param name="right">Compared (ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties left, ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties</param>
        /// <param name="right">Compared (ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties left, ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties.
        /// </summary>
        public sealed class ComAdobeCqExperiencelogImplExperienceLogConfigServletPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _Enabled;
            private ConfigNodePropertyArray _DisabledForGroups;

            internal ComAdobeCqExperiencelogImplExperienceLogConfigServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties.Enabled property.
            /// </summary>
            /// <param name="value">Enabled</param>
            public ComAdobeCqExperiencelogImplExperienceLogConfigServletPropertiesBuilder Enabled(ConfigNodePropertyBoolean value)
            {
                _Enabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties.DisabledForGroups property.
            /// </summary>
            /// <param name="value">DisabledForGroups</param>
            public ComAdobeCqExperiencelogImplExperienceLogConfigServletPropertiesBuilder DisabledForGroups(ConfigNodePropertyArray value)
            {
                _DisabledForGroups = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties.
            /// </summary>
            /// <returns>ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties</returns>
            public ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties Build()
            {
                Validate();
                return new ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties(
                    Enabled: _Enabled,
                    DisabledForGroups: _DisabledForGroups
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}