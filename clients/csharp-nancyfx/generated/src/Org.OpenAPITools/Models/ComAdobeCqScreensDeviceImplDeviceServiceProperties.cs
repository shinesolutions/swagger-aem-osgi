using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqScreensDeviceImplDeviceServiceProperties
    /// </summary>
    public sealed class ComAdobeCqScreensDeviceImplDeviceServiceProperties:  IEquatable<ComAdobeCqScreensDeviceImplDeviceServiceProperties>
    { 
        /// <summary>
        /// ComAdobeAemScreensPlayerPingfrequency
        /// </summary>
        public ConfigNodePropertyInteger ComAdobeAemScreensPlayerPingfrequency { get; private set; }

        /// <summary>
        /// ComAdobeAemScreensDevicePaswordSpecialchars
        /// </summary>
        public ConfigNodePropertyString ComAdobeAemScreensDevicePaswordSpecialchars { get; private set; }

        /// <summary>
        /// ComAdobeAemScreensDevicePaswordMinlowercasechars
        /// </summary>
        public ConfigNodePropertyInteger ComAdobeAemScreensDevicePaswordMinlowercasechars { get; private set; }

        /// <summary>
        /// ComAdobeAemScreensDevicePaswordMinuppercasechars
        /// </summary>
        public ConfigNodePropertyInteger ComAdobeAemScreensDevicePaswordMinuppercasechars { get; private set; }

        /// <summary>
        /// ComAdobeAemScreensDevicePaswordMinnumberchars
        /// </summary>
        public ConfigNodePropertyInteger ComAdobeAemScreensDevicePaswordMinnumberchars { get; private set; }

        /// <summary>
        /// ComAdobeAemScreensDevicePaswordMinspecialchars
        /// </summary>
        public ConfigNodePropertyInteger ComAdobeAemScreensDevicePaswordMinspecialchars { get; private set; }

        /// <summary>
        /// ComAdobeAemScreensDevicePaswordMinlength
        /// </summary>
        public ConfigNodePropertyInteger ComAdobeAemScreensDevicePaswordMinlength { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqScreensDeviceImplDeviceServiceProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqScreensDeviceImplDeviceServiceProperties()
        {
        }

        private ComAdobeCqScreensDeviceImplDeviceServiceProperties(ConfigNodePropertyInteger ComAdobeAemScreensPlayerPingfrequency, ConfigNodePropertyString ComAdobeAemScreensDevicePaswordSpecialchars, ConfigNodePropertyInteger ComAdobeAemScreensDevicePaswordMinlowercasechars, ConfigNodePropertyInteger ComAdobeAemScreensDevicePaswordMinuppercasechars, ConfigNodePropertyInteger ComAdobeAemScreensDevicePaswordMinnumberchars, ConfigNodePropertyInteger ComAdobeAemScreensDevicePaswordMinspecialchars, ConfigNodePropertyInteger ComAdobeAemScreensDevicePaswordMinlength)
        {
            
            this.ComAdobeAemScreensPlayerPingfrequency = ComAdobeAemScreensPlayerPingfrequency;
            
            this.ComAdobeAemScreensDevicePaswordSpecialchars = ComAdobeAemScreensDevicePaswordSpecialchars;
            
            this.ComAdobeAemScreensDevicePaswordMinlowercasechars = ComAdobeAemScreensDevicePaswordMinlowercasechars;
            
            this.ComAdobeAemScreensDevicePaswordMinuppercasechars = ComAdobeAemScreensDevicePaswordMinuppercasechars;
            
            this.ComAdobeAemScreensDevicePaswordMinnumberchars = ComAdobeAemScreensDevicePaswordMinnumberchars;
            
            this.ComAdobeAemScreensDevicePaswordMinspecialchars = ComAdobeAemScreensDevicePaswordMinspecialchars;
            
            this.ComAdobeAemScreensDevicePaswordMinlength = ComAdobeAemScreensDevicePaswordMinlength;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqScreensDeviceImplDeviceServiceProperties.
        /// </summary>
        /// <returns>ComAdobeCqScreensDeviceImplDeviceServicePropertiesBuilder</returns>
        public static ComAdobeCqScreensDeviceImplDeviceServicePropertiesBuilder Builder()
        {
            return new ComAdobeCqScreensDeviceImplDeviceServicePropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqScreensDeviceImplDeviceServicePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqScreensDeviceImplDeviceServicePropertiesBuilder</returns>
        public ComAdobeCqScreensDeviceImplDeviceServicePropertiesBuilder With()
        {
            return Builder()
                .ComAdobeAemScreensPlayerPingfrequency(ComAdobeAemScreensPlayerPingfrequency)
                .ComAdobeAemScreensDevicePaswordSpecialchars(ComAdobeAemScreensDevicePaswordSpecialchars)
                .ComAdobeAemScreensDevicePaswordMinlowercasechars(ComAdobeAemScreensDevicePaswordMinlowercasechars)
                .ComAdobeAemScreensDevicePaswordMinuppercasechars(ComAdobeAemScreensDevicePaswordMinuppercasechars)
                .ComAdobeAemScreensDevicePaswordMinnumberchars(ComAdobeAemScreensDevicePaswordMinnumberchars)
                .ComAdobeAemScreensDevicePaswordMinspecialchars(ComAdobeAemScreensDevicePaswordMinspecialchars)
                .ComAdobeAemScreensDevicePaswordMinlength(ComAdobeAemScreensDevicePaswordMinlength);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqScreensDeviceImplDeviceServiceProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqScreensDeviceImplDeviceServiceProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqScreensDeviceImplDeviceServiceProperties</param>
        /// <param name="right">Compared (ComAdobeCqScreensDeviceImplDeviceServiceProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqScreensDeviceImplDeviceServiceProperties left, ComAdobeCqScreensDeviceImplDeviceServiceProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqScreensDeviceImplDeviceServiceProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqScreensDeviceImplDeviceServiceProperties</param>
        /// <param name="right">Compared (ComAdobeCqScreensDeviceImplDeviceServiceProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqScreensDeviceImplDeviceServiceProperties left, ComAdobeCqScreensDeviceImplDeviceServiceProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqScreensDeviceImplDeviceServiceProperties.
        /// </summary>
        public sealed class ComAdobeCqScreensDeviceImplDeviceServicePropertiesBuilder
        {
            private ConfigNodePropertyInteger _ComAdobeAemScreensPlayerPingfrequency;
            private ConfigNodePropertyString _ComAdobeAemScreensDevicePaswordSpecialchars;
            private ConfigNodePropertyInteger _ComAdobeAemScreensDevicePaswordMinlowercasechars;
            private ConfigNodePropertyInteger _ComAdobeAemScreensDevicePaswordMinuppercasechars;
            private ConfigNodePropertyInteger _ComAdobeAemScreensDevicePaswordMinnumberchars;
            private ConfigNodePropertyInteger _ComAdobeAemScreensDevicePaswordMinspecialchars;
            private ConfigNodePropertyInteger _ComAdobeAemScreensDevicePaswordMinlength;

            internal ComAdobeCqScreensDeviceImplDeviceServicePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensDeviceImplDeviceServiceProperties.ComAdobeAemScreensPlayerPingfrequency property.
            /// </summary>
            /// <param name="value">ComAdobeAemScreensPlayerPingfrequency</param>
            public ComAdobeCqScreensDeviceImplDeviceServicePropertiesBuilder ComAdobeAemScreensPlayerPingfrequency(ConfigNodePropertyInteger value)
            {
                _ComAdobeAemScreensPlayerPingfrequency = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensDeviceImplDeviceServiceProperties.ComAdobeAemScreensDevicePaswordSpecialchars property.
            /// </summary>
            /// <param name="value">ComAdobeAemScreensDevicePaswordSpecialchars</param>
            public ComAdobeCqScreensDeviceImplDeviceServicePropertiesBuilder ComAdobeAemScreensDevicePaswordSpecialchars(ConfigNodePropertyString value)
            {
                _ComAdobeAemScreensDevicePaswordSpecialchars = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensDeviceImplDeviceServiceProperties.ComAdobeAemScreensDevicePaswordMinlowercasechars property.
            /// </summary>
            /// <param name="value">ComAdobeAemScreensDevicePaswordMinlowercasechars</param>
            public ComAdobeCqScreensDeviceImplDeviceServicePropertiesBuilder ComAdobeAemScreensDevicePaswordMinlowercasechars(ConfigNodePropertyInteger value)
            {
                _ComAdobeAemScreensDevicePaswordMinlowercasechars = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensDeviceImplDeviceServiceProperties.ComAdobeAemScreensDevicePaswordMinuppercasechars property.
            /// </summary>
            /// <param name="value">ComAdobeAemScreensDevicePaswordMinuppercasechars</param>
            public ComAdobeCqScreensDeviceImplDeviceServicePropertiesBuilder ComAdobeAemScreensDevicePaswordMinuppercasechars(ConfigNodePropertyInteger value)
            {
                _ComAdobeAemScreensDevicePaswordMinuppercasechars = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensDeviceImplDeviceServiceProperties.ComAdobeAemScreensDevicePaswordMinnumberchars property.
            /// </summary>
            /// <param name="value">ComAdobeAemScreensDevicePaswordMinnumberchars</param>
            public ComAdobeCqScreensDeviceImplDeviceServicePropertiesBuilder ComAdobeAemScreensDevicePaswordMinnumberchars(ConfigNodePropertyInteger value)
            {
                _ComAdobeAemScreensDevicePaswordMinnumberchars = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensDeviceImplDeviceServiceProperties.ComAdobeAemScreensDevicePaswordMinspecialchars property.
            /// </summary>
            /// <param name="value">ComAdobeAemScreensDevicePaswordMinspecialchars</param>
            public ComAdobeCqScreensDeviceImplDeviceServicePropertiesBuilder ComAdobeAemScreensDevicePaswordMinspecialchars(ConfigNodePropertyInteger value)
            {
                _ComAdobeAemScreensDevicePaswordMinspecialchars = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensDeviceImplDeviceServiceProperties.ComAdobeAemScreensDevicePaswordMinlength property.
            /// </summary>
            /// <param name="value">ComAdobeAemScreensDevicePaswordMinlength</param>
            public ComAdobeCqScreensDeviceImplDeviceServicePropertiesBuilder ComAdobeAemScreensDevicePaswordMinlength(ConfigNodePropertyInteger value)
            {
                _ComAdobeAemScreensDevicePaswordMinlength = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqScreensDeviceImplDeviceServiceProperties.
            /// </summary>
            /// <returns>ComAdobeCqScreensDeviceImplDeviceServiceProperties</returns>
            public ComAdobeCqScreensDeviceImplDeviceServiceProperties Build()
            {
                Validate();
                return new ComAdobeCqScreensDeviceImplDeviceServiceProperties(
                    ComAdobeAemScreensPlayerPingfrequency: _ComAdobeAemScreensPlayerPingfrequency,
                    ComAdobeAemScreensDevicePaswordSpecialchars: _ComAdobeAemScreensDevicePaswordSpecialchars,
                    ComAdobeAemScreensDevicePaswordMinlowercasechars: _ComAdobeAemScreensDevicePaswordMinlowercasechars,
                    ComAdobeAemScreensDevicePaswordMinuppercasechars: _ComAdobeAemScreensDevicePaswordMinuppercasechars,
                    ComAdobeAemScreensDevicePaswordMinnumberchars: _ComAdobeAemScreensDevicePaswordMinnumberchars,
                    ComAdobeAemScreensDevicePaswordMinspecialchars: _ComAdobeAemScreensDevicePaswordMinspecialchars,
                    ComAdobeAemScreensDevicePaswordMinlength: _ComAdobeAemScreensDevicePaswordMinlength
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}