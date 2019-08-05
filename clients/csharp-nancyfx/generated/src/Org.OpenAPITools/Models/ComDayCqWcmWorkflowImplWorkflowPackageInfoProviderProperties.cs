using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties
    /// </summary>
    public sealed class ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties:  IEquatable<ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties>
    { 
        /// <summary>
        /// WorkflowpackageinfoproviderFilter
        /// </summary>
        public ConfigNodePropertyArray WorkflowpackageinfoproviderFilter { get; private set; }

        /// <summary>
        /// WorkflowpackageinfoproviderFilterRootpath
        /// </summary>
        public ConfigNodePropertyString WorkflowpackageinfoproviderFilterRootpath { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties()
        {
        }

        private ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties(ConfigNodePropertyArray WorkflowpackageinfoproviderFilter, ConfigNodePropertyString WorkflowpackageinfoproviderFilterRootpath)
        {
            
            this.WorkflowpackageinfoproviderFilter = WorkflowpackageinfoproviderFilter;
            
            this.WorkflowpackageinfoproviderFilterRootpath = WorkflowpackageinfoproviderFilterRootpath;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties.
        /// </summary>
        /// <returns>ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderPropertiesBuilder</returns>
        public static ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderPropertiesBuilder Builder()
        {
            return new ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderPropertiesBuilder</returns>
        public ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderPropertiesBuilder With()
        {
            return Builder()
                .WorkflowpackageinfoproviderFilter(WorkflowpackageinfoproviderFilter)
                .WorkflowpackageinfoproviderFilterRootpath(WorkflowpackageinfoproviderFilterRootpath);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties</param>
        /// <param name="right">Compared (ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties left, ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties</param>
        /// <param name="right">Compared (ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties left, ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties.
        /// </summary>
        public sealed class ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderPropertiesBuilder
        {
            private ConfigNodePropertyArray _WorkflowpackageinfoproviderFilter;
            private ConfigNodePropertyString _WorkflowpackageinfoproviderFilterRootpath;

            internal ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties.WorkflowpackageinfoproviderFilter property.
            /// </summary>
            /// <param name="value">WorkflowpackageinfoproviderFilter</param>
            public ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderPropertiesBuilder WorkflowpackageinfoproviderFilter(ConfigNodePropertyArray value)
            {
                _WorkflowpackageinfoproviderFilter = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties.WorkflowpackageinfoproviderFilterRootpath property.
            /// </summary>
            /// <param name="value">WorkflowpackageinfoproviderFilterRootpath</param>
            public ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderPropertiesBuilder WorkflowpackageinfoproviderFilterRootpath(ConfigNodePropertyString value)
            {
                _WorkflowpackageinfoproviderFilterRootpath = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties.
            /// </summary>
            /// <returns>ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties</returns>
            public ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties Build()
            {
                Validate();
                return new ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties(
                    WorkflowpackageinfoproviderFilter: _WorkflowpackageinfoproviderFilter,
                    WorkflowpackageinfoproviderFilterRootpath: _WorkflowpackageinfoproviderFilterRootpath
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}