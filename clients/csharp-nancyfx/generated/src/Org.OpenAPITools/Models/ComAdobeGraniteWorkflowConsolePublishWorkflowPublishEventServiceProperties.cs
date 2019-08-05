using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties
    /// </summary>
    public sealed class ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties:  IEquatable<ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties>
    { 
        /// <summary>
        /// GraniteWorkflowWorkflowPublishEventServiceEnabled
        /// </summary>
        public ConfigNodePropertyBoolean GraniteWorkflowWorkflowPublishEventServiceEnabled { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties()
        {
        }

        private ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties(ConfigNodePropertyBoolean GraniteWorkflowWorkflowPublishEventServiceEnabled)
        {
            
            this.GraniteWorkflowWorkflowPublishEventServiceEnabled = GraniteWorkflowWorkflowPublishEventServiceEnabled;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServicePropertiesBuilder</returns>
        public static ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServicePropertiesBuilder Builder()
        {
            return new ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServicePropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServicePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServicePropertiesBuilder</returns>
        public ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServicePropertiesBuilder With()
        {
            return Builder()
                .GraniteWorkflowWorkflowPublishEventServiceEnabled(GraniteWorkflowWorkflowPublishEventServiceEnabled);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties left, ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties left, ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties.
        /// </summary>
        public sealed class ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServicePropertiesBuilder
        {
            private ConfigNodePropertyBoolean _GraniteWorkflowWorkflowPublishEventServiceEnabled;

            internal ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServicePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties.GraniteWorkflowWorkflowPublishEventServiceEnabled property.
            /// </summary>
            /// <param name="value">GraniteWorkflowWorkflowPublishEventServiceEnabled</param>
            public ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServicePropertiesBuilder GraniteWorkflowWorkflowPublishEventServiceEnabled(ConfigNodePropertyBoolean value)
            {
                _GraniteWorkflowWorkflowPublishEventServiceEnabled = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties</returns>
            public ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties Build()
            {
                Validate();
                return new ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties(
                    GraniteWorkflowWorkflowPublishEventServiceEnabled: _GraniteWorkflowWorkflowPublishEventServiceEnabled
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}