using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties
    /// </summary>
    public sealed class ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties:  IEquatable<ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties>
    { 
        /// <summary>
        /// DeviceRegistrationTimeout
        /// </summary>
        public ConfigNodePropertyInteger DeviceRegistrationTimeout { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties()
        {
        }

        private ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties(ConfigNodePropertyInteger DeviceRegistrationTimeout)
        {
            
            this.DeviceRegistrationTimeout = DeviceRegistrationTimeout;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties.
        /// </summary>
        /// <returns>ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplPropertiesBuilder</returns>
        public static ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplPropertiesBuilder Builder()
        {
            return new ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplPropertiesBuilder</returns>
        public ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplPropertiesBuilder With()
        {
            return Builder()
                .DeviceRegistrationTimeout(DeviceRegistrationTimeout);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties left, ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties left, ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties.
        /// </summary>
        public sealed class ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplPropertiesBuilder
        {
            private ConfigNodePropertyInteger _DeviceRegistrationTimeout;

            internal ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties.DeviceRegistrationTimeout property.
            /// </summary>
            /// <param name="value">DeviceRegistrationTimeout</param>
            public ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplPropertiesBuilder DeviceRegistrationTimeout(ConfigNodePropertyInteger value)
            {
                _DeviceRegistrationTimeout = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties.
            /// </summary>
            /// <returns>ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties</returns>
            public ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties Build()
            {
                Validate();
                return new ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties(
                    DeviceRegistrationTimeout: _DeviceRegistrationTimeout
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}