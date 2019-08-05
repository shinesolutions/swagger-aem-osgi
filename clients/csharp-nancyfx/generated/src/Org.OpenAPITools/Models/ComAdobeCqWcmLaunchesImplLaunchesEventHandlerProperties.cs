using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties
    /// </summary>
    public sealed class ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties:  IEquatable<ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties>
    { 
        /// <summary>
        /// EventFilter
        /// </summary>
        public ConfigNodePropertyString EventFilter { get; private set; }

        /// <summary>
        /// LaunchesEventhandlerThreadpoolMaxsize
        /// </summary>
        public ConfigNodePropertyInteger LaunchesEventhandlerThreadpoolMaxsize { get; private set; }

        /// <summary>
        /// LaunchesEventhandlerThreadpoolPriority
        /// </summary>
        public ConfigNodePropertyDropDown LaunchesEventhandlerThreadpoolPriority { get; private set; }

        /// <summary>
        /// LaunchesEventhandlerUpdatelastmodification
        /// </summary>
        public ConfigNodePropertyBoolean LaunchesEventhandlerUpdatelastmodification { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties()
        {
        }

        private ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties(ConfigNodePropertyString EventFilter, ConfigNodePropertyInteger LaunchesEventhandlerThreadpoolMaxsize, ConfigNodePropertyDropDown LaunchesEventhandlerThreadpoolPriority, ConfigNodePropertyBoolean LaunchesEventhandlerUpdatelastmodification)
        {
            
            this.EventFilter = EventFilter;
            
            this.LaunchesEventhandlerThreadpoolMaxsize = LaunchesEventhandlerThreadpoolMaxsize;
            
            this.LaunchesEventhandlerThreadpoolPriority = LaunchesEventhandlerThreadpoolPriority;
            
            this.LaunchesEventhandlerUpdatelastmodification = LaunchesEventhandlerUpdatelastmodification;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties.
        /// </summary>
        /// <returns>ComAdobeCqWcmLaunchesImplLaunchesEventHandlerPropertiesBuilder</returns>
        public static ComAdobeCqWcmLaunchesImplLaunchesEventHandlerPropertiesBuilder Builder()
        {
            return new ComAdobeCqWcmLaunchesImplLaunchesEventHandlerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqWcmLaunchesImplLaunchesEventHandlerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqWcmLaunchesImplLaunchesEventHandlerPropertiesBuilder</returns>
        public ComAdobeCqWcmLaunchesImplLaunchesEventHandlerPropertiesBuilder With()
        {
            return Builder()
                .EventFilter(EventFilter)
                .LaunchesEventhandlerThreadpoolMaxsize(LaunchesEventhandlerThreadpoolMaxsize)
                .LaunchesEventhandlerThreadpoolPriority(LaunchesEventhandlerThreadpoolPriority)
                .LaunchesEventhandlerUpdatelastmodification(LaunchesEventhandlerUpdatelastmodification);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties</param>
        /// <param name="right">Compared (ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties left, ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties</param>
        /// <param name="right">Compared (ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties left, ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties.
        /// </summary>
        public sealed class ComAdobeCqWcmLaunchesImplLaunchesEventHandlerPropertiesBuilder
        {
            private ConfigNodePropertyString _EventFilter;
            private ConfigNodePropertyInteger _LaunchesEventhandlerThreadpoolMaxsize;
            private ConfigNodePropertyDropDown _LaunchesEventhandlerThreadpoolPriority;
            private ConfigNodePropertyBoolean _LaunchesEventhandlerUpdatelastmodification;

            internal ComAdobeCqWcmLaunchesImplLaunchesEventHandlerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties.EventFilter property.
            /// </summary>
            /// <param name="value">EventFilter</param>
            public ComAdobeCqWcmLaunchesImplLaunchesEventHandlerPropertiesBuilder EventFilter(ConfigNodePropertyString value)
            {
                _EventFilter = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties.LaunchesEventhandlerThreadpoolMaxsize property.
            /// </summary>
            /// <param name="value">LaunchesEventhandlerThreadpoolMaxsize</param>
            public ComAdobeCqWcmLaunchesImplLaunchesEventHandlerPropertiesBuilder LaunchesEventhandlerThreadpoolMaxsize(ConfigNodePropertyInteger value)
            {
                _LaunchesEventhandlerThreadpoolMaxsize = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties.LaunchesEventhandlerThreadpoolPriority property.
            /// </summary>
            /// <param name="value">LaunchesEventhandlerThreadpoolPriority</param>
            public ComAdobeCqWcmLaunchesImplLaunchesEventHandlerPropertiesBuilder LaunchesEventhandlerThreadpoolPriority(ConfigNodePropertyDropDown value)
            {
                _LaunchesEventhandlerThreadpoolPriority = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties.LaunchesEventhandlerUpdatelastmodification property.
            /// </summary>
            /// <param name="value">LaunchesEventhandlerUpdatelastmodification</param>
            public ComAdobeCqWcmLaunchesImplLaunchesEventHandlerPropertiesBuilder LaunchesEventhandlerUpdatelastmodification(ConfigNodePropertyBoolean value)
            {
                _LaunchesEventhandlerUpdatelastmodification = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties.
            /// </summary>
            /// <returns>ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties</returns>
            public ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties Build()
            {
                Validate();
                return new ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties(
                    EventFilter: _EventFilter,
                    LaunchesEventhandlerThreadpoolMaxsize: _LaunchesEventhandlerThreadpoolMaxsize,
                    LaunchesEventhandlerThreadpoolPriority: _LaunchesEventhandlerThreadpoolPriority,
                    LaunchesEventhandlerUpdatelastmodification: _LaunchesEventhandlerUpdatelastmodification
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}