using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties
    /// </summary>
    public sealed class ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties:  IEquatable<ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties>
    { 
        /// <summary>
        /// AdapterCondition
        /// </summary>
        public ConfigNodePropertyString AdapterCondition { get; private set; }

        /// <summary>
        /// TaskmanagerAdmingroups
        /// </summary>
        public ConfigNodePropertyArray TaskmanagerAdmingroups { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties()
        {
        }

        private ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties(ConfigNodePropertyString AdapterCondition, ConfigNodePropertyArray TaskmanagerAdmingroups)
        {
            
            this.AdapterCondition = AdapterCondition;
            
            this.TaskmanagerAdmingroups = TaskmanagerAdmingroups;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorPropertiesBuilder</returns>
        public static ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorPropertiesBuilder</returns>
        public ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorPropertiesBuilder With()
        {
            return Builder()
                .AdapterCondition(AdapterCondition)
                .TaskmanagerAdmingroups(TaskmanagerAdmingroups);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties left, ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties left, ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties.
        /// </summary>
        public sealed class ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorPropertiesBuilder
        {
            private ConfigNodePropertyString _AdapterCondition;
            private ConfigNodePropertyArray _TaskmanagerAdmingroups;

            internal ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties.AdapterCondition property.
            /// </summary>
            /// <param name="value">AdapterCondition</param>
            public ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorPropertiesBuilder AdapterCondition(ConfigNodePropertyString value)
            {
                _AdapterCondition = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties.TaskmanagerAdmingroups property.
            /// </summary>
            /// <param name="value">TaskmanagerAdmingroups</param>
            public ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorPropertiesBuilder TaskmanagerAdmingroups(ConfigNodePropertyArray value)
            {
                _TaskmanagerAdmingroups = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties</returns>
            public ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties Build()
            {
                Validate();
                return new ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties(
                    AdapterCondition: _AdapterCondition,
                    TaskmanagerAdmingroups: _TaskmanagerAdmingroups
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}