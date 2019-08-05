using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties
    /// </summary>
    public sealed class ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties:  IEquatable<ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties>
    { 
        /// <summary>
        /// AdapterCondition
        /// </summary>
        public ConfigNodePropertyString AdapterCondition { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties()
        {
        }

        private ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties(ConfigNodePropertyString AdapterCondition)
        {
            
            this.AdapterCondition = AdapterCondition;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryPropertiesBuilder</returns>
        public static ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryPropertiesBuilder</returns>
        public ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryPropertiesBuilder With()
        {
            return Builder()
                .AdapterCondition(AdapterCondition);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties left, ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties left, ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties.
        /// </summary>
        public sealed class ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryPropertiesBuilder
        {
            private ConfigNodePropertyString _AdapterCondition;

            internal ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties.AdapterCondition property.
            /// </summary>
            /// <param name="value">AdapterCondition</param>
            public ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryPropertiesBuilder AdapterCondition(ConfigNodePropertyString value)
            {
                _AdapterCondition = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties</returns>
            public ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties Build()
            {
                Validate();
                return new ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties(
                    AdapterCondition: _AdapterCondition
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}