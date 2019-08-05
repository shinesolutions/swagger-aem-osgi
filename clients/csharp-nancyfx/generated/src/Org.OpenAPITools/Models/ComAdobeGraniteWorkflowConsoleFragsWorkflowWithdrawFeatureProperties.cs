using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties
    /// </summary>
    public sealed class ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties:  IEquatable<ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties>
    { 
        /// <summary>
        /// Enabled
        /// </summary>
        public ConfigNodePropertyBoolean Enabled { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties()
        {
        }

        private ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties(ConfigNodePropertyBoolean Enabled)
        {
            
            this.Enabled = Enabled;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeaturePropertiesBuilder</returns>
        public static ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeaturePropertiesBuilder Builder()
        {
            return new ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeaturePropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeaturePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeaturePropertiesBuilder</returns>
        public ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeaturePropertiesBuilder With()
        {
            return Builder()
                .Enabled(Enabled);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties left, ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties left, ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties.
        /// </summary>
        public sealed class ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeaturePropertiesBuilder
        {
            private ConfigNodePropertyBoolean _Enabled;

            internal ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeaturePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties.Enabled property.
            /// </summary>
            /// <param name="value">Enabled</param>
            public ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeaturePropertiesBuilder Enabled(ConfigNodePropertyBoolean value)
            {
                _Enabled = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties</returns>
            public ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties Build()
            {
                Validate();
                return new ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties(
                    Enabled: _Enabled
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}