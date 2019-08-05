using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialGroupImplGroupServiceImplProperties
    /// </summary>
    public sealed class ComAdobeCqSocialGroupImplGroupServiceImplProperties:  IEquatable<ComAdobeCqSocialGroupImplGroupServiceImplProperties>
    { 
        /// <summary>
        /// MaxWaitTime
        /// </summary>
        public ConfigNodePropertyInteger MaxWaitTime { get; private set; }

        /// <summary>
        /// MinWaitBetweenRetries
        /// </summary>
        public ConfigNodePropertyInteger MinWaitBetweenRetries { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialGroupImplGroupServiceImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialGroupImplGroupServiceImplProperties()
        {
        }

        private ComAdobeCqSocialGroupImplGroupServiceImplProperties(ConfigNodePropertyInteger MaxWaitTime, ConfigNodePropertyInteger MinWaitBetweenRetries)
        {
            
            this.MaxWaitTime = MaxWaitTime;
            
            this.MinWaitBetweenRetries = MinWaitBetweenRetries;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialGroupImplGroupServiceImplProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialGroupImplGroupServiceImplPropertiesBuilder</returns>
        public static ComAdobeCqSocialGroupImplGroupServiceImplPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialGroupImplGroupServiceImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialGroupImplGroupServiceImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialGroupImplGroupServiceImplPropertiesBuilder</returns>
        public ComAdobeCqSocialGroupImplGroupServiceImplPropertiesBuilder With()
        {
            return Builder()
                .MaxWaitTime(MaxWaitTime)
                .MinWaitBetweenRetries(MinWaitBetweenRetries);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialGroupImplGroupServiceImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialGroupImplGroupServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialGroupImplGroupServiceImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialGroupImplGroupServiceImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialGroupImplGroupServiceImplProperties left, ComAdobeCqSocialGroupImplGroupServiceImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialGroupImplGroupServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialGroupImplGroupServiceImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialGroupImplGroupServiceImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialGroupImplGroupServiceImplProperties left, ComAdobeCqSocialGroupImplGroupServiceImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialGroupImplGroupServiceImplProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialGroupImplGroupServiceImplPropertiesBuilder
        {
            private ConfigNodePropertyInteger _MaxWaitTime;
            private ConfigNodePropertyInteger _MinWaitBetweenRetries;

            internal ComAdobeCqSocialGroupImplGroupServiceImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialGroupImplGroupServiceImplProperties.MaxWaitTime property.
            /// </summary>
            /// <param name="value">MaxWaitTime</param>
            public ComAdobeCqSocialGroupImplGroupServiceImplPropertiesBuilder MaxWaitTime(ConfigNodePropertyInteger value)
            {
                _MaxWaitTime = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialGroupImplGroupServiceImplProperties.MinWaitBetweenRetries property.
            /// </summary>
            /// <param name="value">MinWaitBetweenRetries</param>
            public ComAdobeCqSocialGroupImplGroupServiceImplPropertiesBuilder MinWaitBetweenRetries(ConfigNodePropertyInteger value)
            {
                _MinWaitBetweenRetries = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialGroupImplGroupServiceImplProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialGroupImplGroupServiceImplProperties</returns>
            public ComAdobeCqSocialGroupImplGroupServiceImplProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialGroupImplGroupServiceImplProperties(
                    MaxWaitTime: _MaxWaitTime,
                    MinWaitBetweenRetries: _MinWaitBetweenRetries
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}