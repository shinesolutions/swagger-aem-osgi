using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties
    /// </summary>
    public sealed class ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties:  IEquatable<ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties>
    { 
        /// <summary>
        /// DefaultTimeout
        /// </summary>
        public ConfigNodePropertyInteger DefaultTimeout { get; private set; }

        /// <summary>
        /// MaxTimeout
        /// </summary>
        public ConfigNodePropertyInteger MaxTimeout { get; private set; }

        /// <summary>
        /// DefaultPeriod
        /// </summary>
        public ConfigNodePropertyInteger DefaultPeriod { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties()
        {
        }

        private ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties(ConfigNodePropertyInteger DefaultTimeout, ConfigNodePropertyInteger MaxTimeout, ConfigNodePropertyInteger DefaultPeriod)
        {
            
            this.DefaultTimeout = DefaultTimeout;
            
            this.MaxTimeout = MaxTimeout;
            
            this.DefaultPeriod = DefaultPeriod;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerPropertiesBuilder</returns>
        public static ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerPropertiesBuilder</returns>
        public ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerPropertiesBuilder With()
        {
            return Builder()
                .DefaultTimeout(DefaultTimeout)
                .MaxTimeout(MaxTimeout)
                .DefaultPeriod(DefaultPeriod);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties left, ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties left, ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties.
        /// </summary>
        public sealed class ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerPropertiesBuilder
        {
            private ConfigNodePropertyInteger _DefaultTimeout;
            private ConfigNodePropertyInteger _MaxTimeout;
            private ConfigNodePropertyInteger _DefaultPeriod;

            internal ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties.DefaultTimeout property.
            /// </summary>
            /// <param name="value">DefaultTimeout</param>
            public ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerPropertiesBuilder DefaultTimeout(ConfigNodePropertyInteger value)
            {
                _DefaultTimeout = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties.MaxTimeout property.
            /// </summary>
            /// <param name="value">MaxTimeout</param>
            public ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerPropertiesBuilder MaxTimeout(ConfigNodePropertyInteger value)
            {
                _MaxTimeout = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties.DefaultPeriod property.
            /// </summary>
            /// <param name="value">DefaultPeriod</param>
            public ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerPropertiesBuilder DefaultPeriod(ConfigNodePropertyInteger value)
            {
                _DefaultPeriod = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties</returns>
            public ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties Build()
            {
                Validate();
                return new ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties(
                    DefaultTimeout: _DefaultTimeout,
                    MaxTimeout: _MaxTimeout,
                    DefaultPeriod: _DefaultPeriod
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}