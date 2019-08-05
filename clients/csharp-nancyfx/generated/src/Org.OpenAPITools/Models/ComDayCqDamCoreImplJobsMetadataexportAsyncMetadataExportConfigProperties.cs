using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties
    /// </summary>
    public sealed class ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties:  IEquatable<ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties>
    { 
        /// <summary>
        /// Operation
        /// </summary>
        public ConfigNodePropertyString Operation { get; private set; }

        /// <summary>
        /// EmailEnabled
        /// </summary>
        public ConfigNodePropertyBoolean EmailEnabled { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties()
        {
        }

        private ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties(ConfigNodePropertyString Operation, ConfigNodePropertyBoolean EmailEnabled)
        {
            
            this.Operation = Operation;
            
            this.EmailEnabled = EmailEnabled;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigPropertiesBuilder</returns>
        public static ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigPropertiesBuilder Builder()
        {
            return new ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigPropertiesBuilder</returns>
        public ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigPropertiesBuilder With()
        {
            return Builder()
                .Operation(Operation)
                .EmailEnabled(EmailEnabled);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties left, ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties left, ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties.
        /// </summary>
        public sealed class ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigPropertiesBuilder
        {
            private ConfigNodePropertyString _Operation;
            private ConfigNodePropertyBoolean _EmailEnabled;

            internal ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties.Operation property.
            /// </summary>
            /// <param name="value">Operation</param>
            public ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigPropertiesBuilder Operation(ConfigNodePropertyString value)
            {
                _Operation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties.EmailEnabled property.
            /// </summary>
            /// <param name="value">EmailEnabled</param>
            public ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigPropertiesBuilder EmailEnabled(ConfigNodePropertyBoolean value)
            {
                _EmailEnabled = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties</returns>
            public ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties Build()
            {
                Validate();
                return new ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties(
                    Operation: _Operation,
                    EmailEnabled: _EmailEnabled
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}