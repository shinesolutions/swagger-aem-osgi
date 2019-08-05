using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties
    /// </summary>
    public sealed class ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties:  IEquatable<ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties>
    { 
        /// <summary>
        /// Operation
        /// </summary>
        public ConfigNodePropertyString Operation { get; private set; }

        /// <summary>
        /// OperationIcon
        /// </summary>
        public ConfigNodePropertyString OperationIcon { get; private set; }

        /// <summary>
        /// TopicName
        /// </summary>
        public ConfigNodePropertyString TopicName { get; private set; }

        /// <summary>
        /// EmailEnabled
        /// </summary>
        public ConfigNodePropertyBoolean EmailEnabled { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties()
        {
        }

        private ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties(ConfigNodePropertyString Operation, ConfigNodePropertyString OperationIcon, ConfigNodePropertyString TopicName, ConfigNodePropertyBoolean EmailEnabled)
        {
            
            this.Operation = Operation;
            
            this.OperationIcon = OperationIcon;
            
            this.TopicName = TopicName;
            
            this.EmailEnabled = EmailEnabled;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigPropertiesBuilder</returns>
        public static ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigPropertiesBuilder Builder()
        {
            return new ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigPropertiesBuilder</returns>
        public ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigPropertiesBuilder With()
        {
            return Builder()
                .Operation(Operation)
                .OperationIcon(OperationIcon)
                .TopicName(TopicName)
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

        public bool Equals(ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties left, ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties left, ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties.
        /// </summary>
        public sealed class ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigPropertiesBuilder
        {
            private ConfigNodePropertyString _Operation;
            private ConfigNodePropertyString _OperationIcon;
            private ConfigNodePropertyString _TopicName;
            private ConfigNodePropertyBoolean _EmailEnabled;

            internal ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties.Operation property.
            /// </summary>
            /// <param name="value">Operation</param>
            public ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigPropertiesBuilder Operation(ConfigNodePropertyString value)
            {
                _Operation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties.OperationIcon property.
            /// </summary>
            /// <param name="value">OperationIcon</param>
            public ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigPropertiesBuilder OperationIcon(ConfigNodePropertyString value)
            {
                _OperationIcon = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties.TopicName property.
            /// </summary>
            /// <param name="value">TopicName</param>
            public ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigPropertiesBuilder TopicName(ConfigNodePropertyString value)
            {
                _TopicName = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties.EmailEnabled property.
            /// </summary>
            /// <param name="value">EmailEnabled</param>
            public ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigPropertiesBuilder EmailEnabled(ConfigNodePropertyBoolean value)
            {
                _EmailEnabled = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties</returns>
            public ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties Build()
            {
                Validate();
                return new ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties(
                    Operation: _Operation,
                    OperationIcon: _OperationIcon,
                    TopicName: _TopicName,
                    EmailEnabled: _EmailEnabled
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}