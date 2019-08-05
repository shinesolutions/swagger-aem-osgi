using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplServletHealthCheckServletProperties
    /// </summary>
    public sealed class ComDayCqDamCoreImplServletHealthCheckServletProperties:  IEquatable<ComDayCqDamCoreImplServletHealthCheckServletProperties>
    { 
        /// <summary>
        /// CqDamSyncWorkflowId
        /// </summary>
        public ConfigNodePropertyString CqDamSyncWorkflowId { get; private set; }

        /// <summary>
        /// CqDamSyncFolderTypes
        /// </summary>
        public ConfigNodePropertyArray CqDamSyncFolderTypes { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplServletHealthCheckServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplServletHealthCheckServletProperties()
        {
        }

        private ComDayCqDamCoreImplServletHealthCheckServletProperties(ConfigNodePropertyString CqDamSyncWorkflowId, ConfigNodePropertyArray CqDamSyncFolderTypes)
        {
            
            this.CqDamSyncWorkflowId = CqDamSyncWorkflowId;
            
            this.CqDamSyncFolderTypes = CqDamSyncFolderTypes;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplServletHealthCheckServletProperties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletHealthCheckServletPropertiesBuilder</returns>
        public static ComDayCqDamCoreImplServletHealthCheckServletPropertiesBuilder Builder()
        {
            return new ComDayCqDamCoreImplServletHealthCheckServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplServletHealthCheckServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletHealthCheckServletPropertiesBuilder</returns>
        public ComDayCqDamCoreImplServletHealthCheckServletPropertiesBuilder With()
        {
            return Builder()
                .CqDamSyncWorkflowId(CqDamSyncWorkflowId)
                .CqDamSyncFolderTypes(CqDamSyncFolderTypes);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamCoreImplServletHealthCheckServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplServletHealthCheckServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletHealthCheckServletProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletHealthCheckServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplServletHealthCheckServletProperties left, ComDayCqDamCoreImplServletHealthCheckServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplServletHealthCheckServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletHealthCheckServletProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletHealthCheckServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplServletHealthCheckServletProperties left, ComDayCqDamCoreImplServletHealthCheckServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplServletHealthCheckServletProperties.
        /// </summary>
        public sealed class ComDayCqDamCoreImplServletHealthCheckServletPropertiesBuilder
        {
            private ConfigNodePropertyString _CqDamSyncWorkflowId;
            private ConfigNodePropertyArray _CqDamSyncFolderTypes;

            internal ComDayCqDamCoreImplServletHealthCheckServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletHealthCheckServletProperties.CqDamSyncWorkflowId property.
            /// </summary>
            /// <param name="value">CqDamSyncWorkflowId</param>
            public ComDayCqDamCoreImplServletHealthCheckServletPropertiesBuilder CqDamSyncWorkflowId(ConfigNodePropertyString value)
            {
                _CqDamSyncWorkflowId = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletHealthCheckServletProperties.CqDamSyncFolderTypes property.
            /// </summary>
            /// <param name="value">CqDamSyncFolderTypes</param>
            public ComDayCqDamCoreImplServletHealthCheckServletPropertiesBuilder CqDamSyncFolderTypes(ConfigNodePropertyArray value)
            {
                _CqDamSyncFolderTypes = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplServletHealthCheckServletProperties.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplServletHealthCheckServletProperties</returns>
            public ComDayCqDamCoreImplServletHealthCheckServletProperties Build()
            {
                Validate();
                return new ComDayCqDamCoreImplServletHealthCheckServletProperties(
                    CqDamSyncWorkflowId: _CqDamSyncWorkflowId,
                    CqDamSyncFolderTypes: _CqDamSyncFolderTypes
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}